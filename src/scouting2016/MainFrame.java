 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// pending: remove individual scoring code 

package scouting2016;

import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws FileNotFoundException {
        
    try   
    {
        // sets look and feel to windows
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());

    } 
    
    catch(Exception e)
        
    {
        // the user must be aware!
        // look and feel may be unsupported by platform
        JOptionPane.showMessageDialog(null,
        "The Scouting UI cannot be properly initialized. \n"
                + "The program will execute, but it may not "
                + "appear or function as intended.",
        "Error",
        JOptionPane.ERROR_MESSAGE);
    }
            
        // initializes functionality
        initComponents();       
        
        nameParse();
        
        windowSet();
        
        //makes window visible to user
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        mainMatchForm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        introTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(832, 652));

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Scouter Name", "Team #", "Match #", "Grand Total Points", "Overall Performance", "Driving System", "Driving System Functionality", "Mover System", "Mover System Functionality", "Foul Points", "Additional Comments", "Autonomous Points", "Teleoperation Points", "Coopertition Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        //height 400

        mainMatchForm.setFont(new java.awt.Font("Segoe UI", 0, 96)); // NOI18N
        mainMatchForm.setText("New Match Form");
        mainMatchForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMatchFormActionPerformed(evt);
            }
        });

        introTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Team #", "Highest Score", "Mean Score", "Win Rate"
            }
        ));
        jScrollPane2.setViewportView(introTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mainMatchForm, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMatchForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainMatchFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMatchFormActionPerformed

        FormMatch match = new FormMatch();
        
    }//GEN-LAST:event_mainMatchFormActionPerformed

    
    private String[] nameParse() throws FileNotFoundException
    { 
        File[] files = new File("./Sheets").listFiles();
        String[] splittedString = null;
        int tempInt = 0;
        
        if (files != null)
        {
            // goes through all files and searches for scout sheets
            for (File file:files) 
            {   
                String splitString = file.getName();
                if (!file.isDirectory() && splitString.startsWith("ScoutSheet")) 
                {
                    {
                        System.out.println("Scouting Sheet: " + file.getName());   
                        splittedString = splitString.split("-");
                        
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
                    }
                }
                tempInt = 0;
            }
       
        }
        else
        {
            System.out.println("No files in directory");
        }        
        
        // used for data table
        return splittedString;
    }
    
    
    private void windowSet() {
 
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
    
        // sets window to center of screen
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }
    
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable introTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainMatchForm;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable mainTable;
    // End of variables declaration//GEN-END:variables
}
