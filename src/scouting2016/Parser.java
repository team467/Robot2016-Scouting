/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scouting2016;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
                if (string.endsWith(".txt"))
                {
                    splittedString[tempInt] = string.split(".txt")[0];
                    // System.out.println("Changed to " + splittedString[tempInt]);
                } 
                tempInt++;
            }
        return splittedString;
    }
    
    
     
     
    String[] tableParse(javax.swing.JTable introTable) throws FileNotFoundException
    { 
        // needs to be split apart
        // use universal check if file name is malformed
        
        int introRowCount = 0;
        boolean abort = false;
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
        
        for (int i = 0; i < teamList.size(); ++i)
            {
                // adds dimensions to 2d ArrayList
                scoreList.add(new ArrayList());
                wonList.add(new ArrayList());
                
                System.out.println("Team: " + teamList.get(i));
                
                for (File file:files)
                {
                    String wholeString = "";
                    if (!file.isDirectory()) {
                        Scanner scanner = new Scanner(file);
                        wholeString = file.getName();
                        if (wholeString.startsWith("ScoutSheet")) 
                        {
                            splittedString = splitString(wholeString);
                            if (splittedString[1].equals(teamList.get(i))
                                && (!wholeString.contains("--")))
                            {   
                                //System.out.println("Team! " + teamList.get(i));
                                //System.out.println("Scouting Sheet: " + file.getName());         
                                query = "Score: ";
                                queryResult = queryFind(file, query);
                                scoreList.get(i).add(queryResult);
                                //System.out.println("Score: " + scoreList.get(i).get(scoreList.get(i).size()-1));
                                query = "Won: ";
                                queryResult = queryFind(file, query);
                                wonList.get(i).add(queryResult);
                        
                            // queryResult OUTSIDE this loop will get the last file info
                            }
                    }
                    }
                        
                    else if (wholeString.contains("--"))
                    {
                        JOptionPane.showMessageDialog(null,
                        "File name: \"" + file.getName() + "\" is malformed."
                                + "\nAborting sheet collection.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        abort = true;
                    }
                    
                }
                
                if (abort == true)
                    break;
                // CHECK FOR DIVISION BY ZERO!
                
                // give all these their own functions
                tempSize = scoreList.get(i).size();
                 //System.out.println(i + ", " + scoreList.get(i).size());
                tempValue = 0;
                
                
                
                ///* MAXIMUM VALUE */
                for (tempIndex = 0; tempIndex < tempSize; tempIndex++)
                {
                    //System.out.println("Focused score: " + scoreList.get(i).get(tempIndex));
                    // I'm pretty sure there's a much more concise way to do this
                    if (Integer.parseInt(scoreList.get(i).get(tempIndex)) > tempValue)
                    {
                        tempValue = Integer.parseInt(scoreList.get(i).get(tempIndex));
                        //System.out.println("Max Score: " + tempValue);
                    }
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
                for (tempIndex = 0; tempIndex < tempSize; ++tempIndex)
                {
                    if (wonList.get(i).get(tempIndex).equals("true"))
                    {
                        tempValue++;
                    }
                }
                
                if (tempIndex == 0)
                    tempIndex++;
                
                tempValue *= 100;
                tempValue /= (tempIndex);
                wonList.get(i).add(String.valueOf(tempValue));
                tempValue = 0;
                ///*WIN RATE*/
                
                introModel.addRow(new Object[]{Integer.valueOf(teamList.get(i)), 
                /*Max Score*/    Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-2)),
                /*Mean Score*/   Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-1)),
                /*Win Rate*/     Integer.valueOf(wonList.get(i).get(wonList.get(i).size()-1))});
                
            }
              
            
          
               
        }
       
        
        else
        {
            System.out.println("No files in directory");
        }         
        
        // just in case? not used anywhere
        return splittedString;
    }
    
   void comboSet (javax.swing.JComboBox queryCombo, javax.swing.JButton queryAddColumn) 
           throws FileNotFoundException {
    
       File[] files = new File("./Sheets").listFiles();
       boolean success = false;
       
       if (files != null)
        {
              
         // goes through all files and searches for scout template
            for (File file:files) 
            {  
                    String wholeString = file.getName();
                    
                    if (!file.isDirectory() && wholeString.equals("ScoutTemplate.txt"))
                    {
                        success = true;
                        Scanner scanner = new Scanner(file);
                        String fileLine;
                        String[] splitFileLine;
                        while (scanner.hasNextLine()) {
                            fileLine = scanner.nextLine();
                            if (fileLine.contains(":")) {
                                splitFileLine = fileLine.split(":");
                                if (splitFileLine[0].contains("\t")) {
                                    splitFileLine = splitFileLine[0].split("\t");
                                    queryCombo.addItem(splitFileLine[1]);
                                }
                                else {
                                    queryCombo.addItem(splitFileLine[0]);
                                }                         
                            }
                        }
                    }
       
            }    
        }
       if (success == false) {
           JOptionPane.showMessageDialog(null,
            "Match Sheet template not found. Column adding will be disabled.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
            queryCombo.setEnabled(success);
            queryAddColumn.setEnabled(success);
       }
       
   }
         
   void expandTable(int introTeam, javax.swing.JTable teamTable) 
           throws FileNotFoundException, IOException
   {
        // lots of redundancy here, needs reduction
       
        // to add reading of more data for columns,
        // just add the column whose column name
        // matches what's wanted to be added
       
       
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
                            teamInfo.add(queryResult);
                        }
                        
                        String[] teamInfoArr = new String[teamInfo.size()];
                        teamInfoArr = teamInfo.toArray(teamInfoArr);    
                        
                        teamModel.addRow((Object[])teamInfoArr);
                        
                        
                        // makes sheets correctly sortable by numbers
                        // by converting the strings to integers
                        for (int i = 0; i < teamInfo.size(); i++) {
                            
                            try {
                                teamModel.setValueAt(Integer.valueOf(teamInfoArr[i]),
                                        teamModel.getRowCount()-1, i);
                            }
                          
                            catch (Exception e) {
                            }
                        }
                        
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
        
        ArrayList<String> teamList = new ArrayList<>();
        
        for (File file:files)
            {
                String wholeString = file.getName();
                if (!file.isDirectory() && wholeString.startsWith("ScoutSheet")
                    && (!wholeString.contains("--"))) 
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
        
        while (scanner.hasNextLine()) 
        {
            String fileLine = scanner.nextLine();
            if(fileLine.contains(query)) 
                try {
                return fileLine.split(query)[1];
                }
                catch (Exception e) {
                    return "Nothing to return";
                }
        }
        return "String not found.";
    }
     
    
      
      
        double[] windowSet() {
 
         // sets window to center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        double width = dim.getWidth();
        double height = dim.getHeight();
    
        // alerts user if screen resolution is below 1024x768 
        if (width<1024 || height<768)
        
        {
            JOptionPane.showMessageDialog(null,
            "Your screen resolution is not supported. Some "
                    + "elements may not appear or may appear incorrectly.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    
        double[] dimensions = {width, height};
        return dimensions;
        
    }
    
}
