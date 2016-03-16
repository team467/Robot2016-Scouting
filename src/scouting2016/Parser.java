package scouting2016;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import scouting2016.MainFrame.QueryContainer;



/**
 *
 * @author Adam Frick
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
    
    
     
     
    void tableParse(javax.swing.JTable introTable, boolean searchQuery, 
            QueryContainer queryContainer) throws FileNotFoundException
    { 
        // needs to be split apart
        // use universal check if file name is malformed
        
        int introRowCount = 0;
        boolean abort = false;
        DefaultTableModel introModel = (DefaultTableModel) introTable.getModel();
        String queryResult = null;
        String query = "";
        ArrayList<String> teamList = new ArrayList<>();
        int totalSheets = 0;
        ArrayList<ArrayList<String>> scoreList = new ArrayList<>();
        ArrayList<ArrayList<String>> wonList = new ArrayList<>();
        ArrayList<ArrayList<String>> queryList = new ArrayList<>();
        
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
            
            int 
            colQuerySize = 0,
            colQueryValue = 0,
            colQueryIndex = 0;
        
            for (int i = 0; i < teamList.size(); ++i)
            {
                // adds dimensions to 2d ArrayList
                scoreList.add(new ArrayList());
                wonList.add(new ArrayList());
                queryList.add(new ArrayList());
                totalSheets = 0;
                
                
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
                                totalSheets++;
                                query = "Score: ";
                                queryResult = queryFind(file, null, query, false);
                                scoreList.get(i).add(queryResult);
                                query = "Won: ";
                                queryResult = queryFind(file, null, query, false);
                                wonList.get(i).add(queryResult);
                                
                                if (searchQuery) {
                                    query = queryContainer.queryHeader + ": ";
                                    queryResult = queryFind(file, null, query, false);
                                    
                                    if (queryContainer.queryIndex != 2)
                                    {
                                        if (queryContainer.queryString.equals(queryResult))
                                            queryList.get(i).add(queryResult);
                                    }
                                    else
                                        {
                                            if ((Integer.valueOf(queryContainer.queryString) <= 
                                                    Integer.valueOf(queryResult) )
                                                    && 
                                                    (Integer.valueOf(queryContainer.queryStringAlt) >=
                                                    Integer.valueOf(queryResult)) )
                                                queryList.get(i).add(queryResult);
                                        }
                                }
                        
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
                
                scoreList = colQueryParser(scoreList, i, 0);
                scoreList = colQueryParser(scoreList, i, 1);
                wonList = colQueryParser(wonList, i , 2);
           
                if (!searchQuery) 
                {
                    introModel.addRow(new Object[]{Integer.valueOf(teamList.get(i)), 
                    /*Max Score*/    Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-2)),
                    /*Mean Score*/   Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-1)),
                    /*Win Rate*/     Integer.valueOf(wonList.get(i).get(wonList.get(i).size()-1))});
                }
                else
                {   
                    // finds # of occurances of search
                    queryList = colQueryParser(queryList, i, 3);
                    
                    // adds divisor (total sheets) for a specific team from query
                    queryList.get(i).add(queryList.get(i).size(), 
                            queryList.get(i).get(queryList.get(i).size()-1).concat(String.valueOf(totalSheets)));
                    
                    introModel.addRow(new Object[]{Integer.valueOf(teamList.get(i)), 
                    /*Max Score*/    Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-2)),
                    /*Mean Score*/   Integer.valueOf(scoreList.get(i).get(scoreList.get(i).size()-1)),
                    /*Win Rate*/     Integer.valueOf(wonList.get(i).get(wonList.get(i).size()-1)),
                    /*Query*/        queryList.get(i).get(queryList.get(i).size()-1)
                    });
                }
                
            }
                     
        }
       
        else
        {
            System.out.println("No files in directory");
        }         
    }
    
    ArrayList<ArrayList<String>> colQueryParser(ArrayList<ArrayList<String>> colQuerier, int i, int id) {
        int colQueryValue = 0;
        int colQueryIndex;
        int colQuerySize = colQuerier.get(i).size();
        
        /*
        id 1: max score
        id 2: average score
        id 3: win rate
        id 4: query (search)
         */
        
        for (colQueryIndex = 0; colQueryIndex < colQuerySize; colQueryIndex++)
                {
                    switch (id) {
                        
                        case 0:
                            if (Integer.parseInt(colQuerier.get(i).get(colQueryIndex)) > colQueryValue)
                            {
                                colQueryValue = Integer.parseInt(colQuerier.get(i).get(colQueryIndex));
                            }
                        break;
                        
                        case 1:
                            if (colQueryIndex + 1 != colQuerySize)
                                colQueryValue += Integer.parseInt(colQuerier.get(i).get(colQueryIndex));
                        break;
                        
                        case 2:
                            if (colQuerier.get(i).get(colQueryIndex).equals("true"))
                            {
                                colQueryValue++;
                            }
                        break;
                        
                        case 3:
                            if (!(colQuerier.get(i).get(colQueryIndex).equals("String not found.")))
                            {
                                colQueryValue++;
                            }
                        break;
                        
                        default:
                            System.out.println("ID Error");       
                    }   
                        
                }
        
        switch (id) {
            case 0:
                colQuerier.get(i).add(String.valueOf(colQueryValue));
            break;
            
            case 1:
                if (colQueryIndex == 0)
                    colQueryIndex++;
                colQueryValue /= colQueryIndex-1;
                colQuerier.get(i).add(String.valueOf(colQueryValue));
            break;
            
            case 2:
                if (colQueryIndex == 0)
                    colQueryIndex++;
                
                colQueryValue *= 100;
                colQueryValue /= (colQueryIndex);
                colQuerier.get(i).add(String.valueOf(colQueryValue));
            break;
                
            case 3:
                
                colQuerier.get(i).add(String.valueOf(colQueryValue) + "/");
                
            break;
            
            default:
                System.out.println("ID Error");
                
        }
        
        return colQuerier;
    }
    
    void comboSet (javax.swing.JComboBox queryCombo) throws FileNotFoundException {
    
        Template template = new Template();
        Scanner scanner = new Scanner(template.templateStr);
        String fileLine;
        String[] splitFileLine;
        while (scanner.hasNextLine()) 
        {
            fileLine = scanner.nextLine();
            if (fileLine.contains(":")) 
            {
                splitFileLine = fileLine.split(":");
                if (splitFileLine[0].contains("\t")) 
                {
                    splitFileLine = splitFileLine[0].split("\t");
                    queryCombo.addItem(splitFileLine[1]);
                }
                else 
                {
                    queryCombo.addItem(splitFileLine[0]);
                }                         
            }
        }
   
   }
         
    void expandTable(int introTeam, javax.swing.JTable teamTable, boolean columnChange) 
           throws FileNotFoundException, IOException
   {
        // lots of redundancy here, needs reduction
       
        // to add reading of more data for columns,
        // just add the column whose column name
        // matches what's wanted to be added
       
        File[] files = new File("./Sheets").listFiles();
        String queryResult;
        ArrayList<String> teamQueries = new ArrayList<>();
        ArrayList<String> teamInfo = new ArrayList<>();
        DefaultTableModel teamModel = (DefaultTableModel) teamTable.getModel();
        TableColumnModel teamColumnModel = teamTable.getColumnModel();

        teamModel.setRowCount(0);
        
        for (int i = 0; i < teamColumnModel.getColumnCount(); i++)
            {
                
                teamQueries.add(teamColumnModel.getColumn(i).getHeaderValue().toString());
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
                        for (String teamQuery: teamQueries)
                        {
                            queryResult = queryFind(file, null, teamQuery, false);
                            teamInfo.add(queryResult);
                        }
                        
                        String[] teamInfoArr = new String[teamInfo.size()];
                        teamInfoArr = teamInfo.toArray(teamInfoArr);    
                      
                        teamModel.addRow((Object[])teamInfoArr);
                        
                        
                        // makes sheets correctly sortable by numbers
                        // by converting the strings to integers
                        for (int i = 0; i < teamInfo.size(); i++) {
                            
                            try 
                            {
                                teamModel.setValueAt(Integer.valueOf(teamInfoArr[i]),
                                        teamModel.getRowCount()-1, i);
                            }
                          
                            catch (Exception e) 
                            {
                                // catches if not an integer (supposed to happen for non-integers)
                            }
                        }
                        
                        teamInfo.clear();
                    }    
            }
        }
   }
    
         
        

    private ArrayList teamListGen(File[] files )
    {           
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
    
      String queryFind(File file, String templateString, String query, 
              boolean typeFind) throws FileNotFoundException
    {
        Scanner scanner;
        if (typeFind == false)
            scanner = new Scanner(file);
        else
            scanner = new Scanner(templateString);
        
        while (scanner.hasNextLine()) 
        {
            String fileLine = scanner.nextLine();
            if(fileLine.contains(query)) 
                try 
                {
                    if (typeFind == false)
                        return fileLine.split(query)[1];
                    else
                        return fileLine.split(query + ":")[1];        
                }
                catch (Exception e) 
                {
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
