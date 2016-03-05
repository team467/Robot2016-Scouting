package scouting2016;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
 * @author Adam
 */

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() throws FileNotFoundException {
        
    try   
    {
        // sets look and feely
        UIManager.setLookAndFeel
            ("javax.swing.plaf.metal.MetalLookAndFeel");

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
        
        Parser parse = new Parser();
        
        parse.tableParse(introTable);
        
        windowSet();
        
        folderCreate();
        
        //makes window visible to user
        setVisible(true);
        
        //todo: if "Sheets" folder doesn't exist, create it
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
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
        introViewMatch = new javax.swing.JButton();
        introRefresh = new javax.swing.JButton();
        introOpen = new javax.swing.JButton();
        mainPitForm = new javax.swing.JButton();
        introViewPit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scouting 2016");
        setMinimumSize(new java.awt.Dimension(828, 652));
        setPreferredSize(new java.awt.Dimension(820, 624));

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

        mainMatchForm.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        mainMatchForm.setText("New Match Form");
        mainMatchForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMatchFormActionPerformed(evt);
            }
        });

        introTable.setAutoCreateRowSorter(true);
        introTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team #", "Highest Score", "Mean Score", "Win Rate (%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(introTable);

        introViewMatch.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        introViewMatch.setText("View Scouting Sheets");
        introViewMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introViewMatchActionPerformed(evt);
            }
        });

        introRefresh.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        introRefresh.setText("Refresh");
        introRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introRefreshActionPerformed(evt);
            }
        });

        introOpen.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        introOpen.setText("Open Team Sheet");
        introOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introOpenActionPerformed(evt);
            }
        });

        mainPitForm.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        mainPitForm.setText("New Pit Form");
        mainPitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPitFormActionPerformed(evt);
            }
        });

        introViewPit.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        introViewPit.setText("View Pit Sheets");
        introViewPit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introViewPitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mainMatchForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPitForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(introViewMatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(introViewPit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(introRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(introOpen)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMatchForm)
                    .addComponent(introViewMatch)
                    .addComponent(introRefresh)
                    .addComponent(introOpen)
                    .addComponent(mainPitForm)
                    .addComponent(introViewPit))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        FormMatch matchSheet = new FormMatch();
        
    }//GEN-LAST:event_mainMatchFormActionPerformed

    private void introViewMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introViewMatchActionPerformed
        Desktop desktop = Desktop.getDesktop();
        try {
            File dirOpen = new File("./Sheets");
            desktop.open(dirOpen);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,
            "Error opening default file explorer.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_introViewMatchActionPerformed

    private void introRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introRefreshActionPerformed
        try
        {
            System.out.println("REFRESHING");
            
            Parser parse = new Parser();
            
            parse.tableParse(introTable);
        }
        catch (FileNotFoundException e)
        {
            
        }
    }//GEN-LAST:event_introRefreshActionPerformed

    private void introOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introOpenActionPerformed
        
        int selRow = introTable.getSelectedRow();
        
        if (selRow != -1)   
        {
            try 
            {
                TeamFrame teamSelected = new TeamFrame(Integer.parseInt(introTable.getValueAt(selRow, 0).toString()));    
            } 
            catch (FileNotFoundException ex) 
            {
                System.out.println("Error (FNFE)");
            } 
            catch (IOException ex) {
                System.out.println("Error (IOE)");
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,
            "You haven't selected a team.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_introOpenActionPerformed

    private void mainPitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPitFormActionPerformed
        FormPit pitSheet = new FormPit();
    }//GEN-LAST:event_mainPitFormActionPerformed

    private void introViewPitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introViewPitActionPerformed
       Desktop desktop = Desktop.getDesktop();
        try {
            File dirOpen = new File("./PitSheets");
            desktop.open(dirOpen);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,
            "Error opening default file explorer.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_introViewPitActionPerformed


    private void folderCreate()
    {
        String defaultPath = "./Sheets";
        
        try
        {
        
            if (!(new File("./Sheets").exists()))
            {
                new File("./Sheets").mkdir();
            }
            
            if (!(new File("./PitSheets").exists()))
            {
                new File("./PitSheets").mkdir();
            }
        }
        
        catch (Exception e)
        {
            System.out.println("Error creating folder");
        }
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
    
    public static void main(String args[]) {
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton introOpen;
    private javax.swing.JButton introRefresh;
    private javax.swing.JTable introTable;
    private javax.swing.JButton introViewMatch;
    private javax.swing.JButton introViewPit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainMatchForm;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton mainPitForm;
    private javax.swing.JTable mainTable;
    // End of variables declaration//GEN-END:variables
}
