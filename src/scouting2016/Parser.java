/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scouting2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adam
 */
public class Parser {
    
     String[] splitString(String split)  
    {  // takes scouting filename and returns its info
        String[] splittedString = null;
        int tempInt = 0;
        splittedString = split.split("-");
        // iterates through each piece of file name (separated by -)
        for (String string : splittedString)
            {
                // System.out.println(string);
                if (string.endsWith(".sav"))
                {
                    splittedString[tempInt] = string.split(".sav")[0];
                    // System.out.println("Changed to " + splittedString[tempInt]);
                } 
                tempInt++;
            }
        return splittedString;
    }
    
    
     
     
         String[] tableParse(javax.swing.JTable introTable) throws FileNotFoundException
    { 
        // needs to be split apart
        // check if file name is malformed before reading from it
        
        int introRowCount = 0;
        DefaultTableModel introModel = (DefaultTableModel) introTable.getModel();
        String queryResult = null;
        String query = "";
        ArrayList<String> teamList = new ArrayList<>();
        ArrayList<ArrayList<String>> scoreList = new ArrayList<>();
        ArrayList<ArrayList<String>> wonList = new ArrayList<>();
        
        introRowCount = introTable.getRowCount();
        for (int i = 0; i < introRowCount; ++i)
        {
            ((DefaultTableModel) introTable.getModel()).removeRow(0);           
        }
        
        
        File[] files = new File("./Sheets").listFiles();
        String[] splittedString = null;
        
        
        if (files != null)
        {
            
            teamList = teamListGen(files);
            
        int tempSize = 0;
        int tempValue = 0;
        int tempIndex = 0;
        
        for (int i = 0; i < teamList.size(); i++)
            {
                // adds dimensions to 2d ArrayList
                scoreList.add(new ArrayList());
                wonList.add(new ArrayList());
                
                System.out.println("Team: " + teamList.get(i));
                
                for (File file:files)
                {
                    Scanner scanner = new Scanner(file);
                    String wholeString = file.getName();
                    if (!file.isDirectory() && wholeString.startsWith("ScoutSheet")
                            && wholeString.contains(teamList.get(i))) 
                    {
                        //System.out.println("Team! " + teamList.get(0).get(i));
                        //System.out.println("Scouting Sheet: " + file.getName());         
                        splittedString = splitString(wholeString);
                        query = "Score: ";
                        queryResult = queryFind(file, query);
                        scoreList.get(i).add(queryResult);
                        query = "Won: ";
                        queryResult = queryFind(file, query);
                        wonList.get(i).add(queryResult);
                        // queryResult OUTSIDE this loop will get the last file info
                        // for team # this will be sufficient, should be rearranged
                        
                    }
                        
                    
                }
                
                // CHECK FOR DIVISION BY ZERO!
                
                // give all these their own functions
                tempSize = scoreList.get(i).size();
    
                ///* MAXIMUM VALUE */
                for (tempIndex = 0; tempIndex < tempSize; tempIndex++)
                {
                    // I'm pretty sure there's a much more concise way to do this
                    if (Integer.parseInt(scoreList.get(i).get(tempIndex)) > tempValue)
                        tempValue = Integer.parseInt(scoreList.get(i).get(tempIndex));
                }

                scoreList.get(i).add(String.valueOf(tempValue));
                tempValue = 0;
                ///* MAXIMUM VALUE */
                
                
                ///* AVERAGE VALUE */
                for (tempIndex = 0; tempIndex < tempSize; tempIndex++)
                {
                    //System.out.println("Value:::::::::::::::::" + avgScoreList.get(i).get(tempIndex));
                    tempValue += Integer.parseInt(scoreList.get(i).get(tempIndex));
                }
                if (tempIndex == 0)
                    tempIndex++;
                tempValue /= tempIndex;
                
                scoreList.get(i).add(String.valueOf(tempValue));
                tempValue = 0;
                ///*AVERAGE VALUE*/
                
                // redundant, but fun
                tempSize = wonList.get(i).size();
                
                ///*WIN RATE*/
                for (tempIndex = 0; tempIndex < tempSize; tempIndex++)
                {
                    if (wonList.get(i).get(tempIndex).equals("true"))
                    {
                        tempValue += 1;
                    }
                }
                if (tempIndex == 0)
                    tempIndex++;
                
                tempValue *= 100;
                tempValue /= tempIndex;
                wonList.get(i).add(String.valueOf(tempValue));
                tempValue = 0;
                ///*WIN RATE*/
                
                introModel.addRow(new Object[]{splittedString[1], 
                /*Max Score*/    scoreList.get(i).get(scoreList.get(i).size()-2),
                /*Mean Score*/   scoreList.get(i).get(scoreList.get(i).size()-1),
                /*Win Rate*/     wonList.get(i).get(wonList.get(i).size()-1) + "%"});
                
            }
              
            
          
               
        }
       
        
        else
        {
            System.out.println("No files in directory");
        }         
        
        // just in case? not used anywhere
        return splittedString;
    }
    
    
         
   void expandTable(int introTeam, javax.swing.JTable teamTable) throws FileNotFoundException
   {
        // lots of redundancy here, will reduce later
       
        File[] files = new File("./Sheets").listFiles();
        String queryResult;
        ArrayList<String> teamQueries = new ArrayList<>();
        //String[] teamQueries = new String[] {"Match #: ", "Scouter name: ", "Score: ", "Won: "};
        ArrayList<String> teamInfo = new ArrayList<>();
        DefaultTableModel teamModel = (DefaultTableModel) teamTable.getModel();
        
        
        for (int i = 0; i < teamModel.getColumnCount(); i++)
            {
                teamQueries.add(teamModel.getColumnName(i));
                teamQueries.set(i, teamQueries.get(i) + ": ");
            }
        
        if (files != null)
        {
        
         // goes through all files and searches for scout sheets for specific team
            for (File file:files) 
            {  
                
                    String wholeString = file.getName();
                    if (!file.isDirectory() && wholeString.startsWith("ScoutSheet-" +
                            String.valueOf(introTeam)))
                    {
                        //System.out.println("Team! " + teamList.get(0).get(i));
                        //System.out.println("Scouting Sheet: " + file.getName());         
                        
                        
                        for (String teamQuery: teamQueries)
                        {
                            queryResult = queryFind(file, teamQuery);
                            System.out.println(queryResult);
                            teamInfo.add(queryResult);
                        }
                        
                        String[] teamInfoArr = new String[teamInfo.size()];
                        teamInfoArr = teamInfo.toArray(teamInfoArr);    
                
                        teamModel.addRow((Object[])teamInfoArr);
                        
                        teamInfo.clear();
                        
                        
                        
                        
                        
                    }
                        
                
                        
            
            }
        }
   }
    
         
        

    private ArrayList teamListGen(File[] files )
    {
        // alas, a mess
                
        //used to check each team #
        boolean isSame = false;
        String[] splittedString;
        
        ArrayList<String> teamList = new ArrayList<String>();
        
        for (File file:files)
            {
                String wholeString = file.getName();
                if (!file.isDirectory() && wholeString.startsWith("ScoutSheet")) 
                {
                     //System.out.println("Scouting Sheet: " + file.getName());         
                    splittedString = splitString(wholeString);
                    
                    // this always happens first
                    if (teamList.isEmpty())
                    {
                        teamList.add(splittedString[1]);
                        //System.out.println("Filled " + splittedString[1] + " to the empty space");
                    }
                    else
                    {   // iterates through each team #, checks equality, until no more sheets
                        for (int i = 0; i < teamList.size(); i++)
                        {
                            if (!(teamList.get(i).equals(splittedString[1]))) 
                            {
                                
                                //System.out.println(teamList.get(0).get(i) + " != " + splittedString[1]);
                            }
                            else
                            {
                               //System.out.println(teamList.get(0).get(i) + " == " + splittedString[1]);
                                isSame = true;
                                break;
                            } 
                        }   // then it is judgement time, whether it can be added to ArrayList
                        if (isSame == false)
                        {
                            teamList.add(splittedString[1]);
                            //System.out.println("added the " + teamList.get(0).get(teamList.size()-1));
                        }
                        else 
                        {
                            isSame = false;
                        }
                    }
                        
                }     
            }
    
        return teamList;
    }
    
    
    
    
      private String queryFind(File file, String query) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()) {
                            
        // todo: use query as a loop for each sheet stat
        String fileLine = scanner.nextLine();
        if(fileLine.contains(query)) 
            return fileLine.split(query)[1];
        }
        return "String not found.";
    }
     
    
    
}
