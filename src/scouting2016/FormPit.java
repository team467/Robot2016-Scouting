package scouting2016;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Adam Frick
 */
public class FormPit extends javax.swing.JFrame {

    public FormPit() {
        
    try   
    {
        // sets look and feel
        UIManager.setLookAndFeel
            ("javax.swing.plaf.metal.MetalLookAndFeel");
    } 
    catch(Exception e)  
    {
        System.out.println("Unable to set look and feel");
    }  
        initComponents();

        // sets window to center of screen
        Parser parse = new Parser();
        parse.windowSet(this);
        
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
        telePanel = new javax.swing.JPanel();
        teleLabel1 = new javax.swing.JLabel();
        teleLabel2 = new javax.swing.JLabel();
        teleLabel3 = new javax.swing.JLabel();
        teleLabel4 = new javax.swing.JLabel();
        teleLabel5 = new javax.swing.JLabel();
        teleLabel6 = new javax.swing.JLabel();
        teleLabel7 = new javax.swing.JLabel();
        teleLabel8 = new javax.swing.JLabel();
        teleLabel9 = new javax.swing.JLabel();
        teleLabel10 = new javax.swing.JLabel();
        teleText1 = new javax.swing.JTextField();
        teleLabel11 = new javax.swing.JLabel();
        teleText2 = new javax.swing.JTextField();
        teleText3 = new javax.swing.JTextField();
        teleText4 = new javax.swing.JTextField();
        teleText5 = new javax.swing.JTextField();
        teleText6 = new javax.swing.JTextField();
        teleText7 = new javax.swing.JTextField();
        teleText8 = new javax.swing.JTextField();
        teleText9 = new javax.swing.JTextField();
        teleText10 = new javax.swing.JTextField();
        teleText11 = new javax.swing.JTextField();
        autoPanel = new javax.swing.JPanel();
        autoLabel1 = new javax.swing.JLabel();
        autoLabel2 = new javax.swing.JLabel();
        autoLabel3 = new javax.swing.JLabel();
        autoText1 = new javax.swing.JTextField();
        autoText2 = new javax.swing.JTextField();
        autoText3 = new javax.swing.JTextField();
        pitSave = new javax.swing.JButton();
        optionsNick = new java.awt.TextField();
        optionsNickLabel = new javax.swing.JLabel();
        optionsTeam = new java.awt.TextField();
        optionsTeamLabel = new javax.swing.JLabel();
        optionsScouter = new java.awt.TextField();
        optionsScouterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pit Sheet");

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        telePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Teleoperation"));

        teleLabel1.setText("Ideal position in team: Defender, Breacher, Shooter, etc?");

        teleLabel2.setText("What can your human player do? (Bowl, spy)");

        teleLabel3.setText("What goals do you shoot for? (High / Low)");

        teleLabel4.setText("Plans for boulders? (Shoot, pass, other?)");

        teleLabel5.setText("Which defenses can you cross alone?");

        teleLabel6.setText("Do you help allies cross any defenses? (Yes / No)");

        teleLabel7.setText("What defenses can this robot most easily breach? (Preference) ");

        teleLabel8.setText("What defenses are the hardest for this robot to breach?");

        teleLabel9.setText("Can you challenge the enemy castle? (Challenge / Climb)");

        teleLabel10.setText("What ally would best compliment your robot?");

        teleText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText1ActionPerformed(evt);
            }
        });

        teleLabel11.setText("Additional Comments:");

        teleText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText2ActionPerformed(evt);
            }
        });

        teleText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText3ActionPerformed(evt);
            }
        });

        teleText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText4ActionPerformed(evt);
            }
        });

        teleText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText5ActionPerformed(evt);
            }
        });

        teleText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText6ActionPerformed(evt);
            }
        });

        teleText7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText7ActionPerformed(evt);
            }
        });

        teleText8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText8ActionPerformed(evt);
            }
        });

        teleText9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText9ActionPerformed(evt);
            }
        });

        teleText10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText10ActionPerformed(evt);
            }
        });

        teleText11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telePanelLayout = new javax.swing.GroupLayout(telePanel);
        telePanel.setLayout(telePanelLayout);
        telePanelLayout.setHorizontalGroup(
            telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telePanelLayout.createSequentialGroup()
                        .addComponent(teleLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telePanelLayout.createSequentialGroup()
                        .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleLabel10)
                            .addComponent(teleLabel9)
                            .addComponent(teleLabel8)
                            .addComponent(teleLabel6)
                            .addComponent(teleLabel5)
                            .addComponent(teleLabel7)
                            .addComponent(teleLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teleText10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleText9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telePanelLayout.createSequentialGroup()
                        .addComponent(teleLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teleText4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telePanelLayout.createSequentialGroup()
                        .addComponent(teleLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teleText2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telePanelLayout.createSequentialGroup()
                        .addComponent(teleLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teleText3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        telePanelLayout.setVerticalGroup(
            telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel1))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel2))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel3))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel4))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel5))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel6))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel7))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel8))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel9))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel10))
                .addGap(0, 0, 0)
                .addGroup(telePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleText11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleLabel11))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        autoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Autonomous"));
        autoPanel.setPreferredSize(new java.awt.Dimension(380, 125));

        autoLabel1.setText("Can the robot reach defenses in autonomous? Which ones?");

        autoLabel2.setText("Can the robot cross defenses in autonomous? Which ones?");

        autoLabel3.setText("Can the robot shoot in autonomous? Which goals?");

        autoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoText1ActionPerformed(evt);
            }
        });

        autoText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoText2ActionPerformed(evt);
            }
        });

        autoText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoText3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout autoPanelLayout = new javax.swing.GroupLayout(autoPanel);
        autoPanel.setLayout(autoPanelLayout);
        autoPanelLayout.setHorizontalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autoPanelLayout.createSequentialGroup()
                        .addComponent(autoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(autoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(autoPanelLayout.createSequentialGroup()
                        .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoLabel2)
                            .addComponent(autoLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autoText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        autoPanelLayout.setVerticalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoLabel1))
                .addGap(0, 0, 0)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoLabel2))
                .addGap(0, 0, 0)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pitSave.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        pitSave.setText("Save");
        pitSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pitSaveActionPerformed(evt);
            }
        });

        optionsNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                optionsNickKeyReleased(evt);
            }
        });

        optionsNickLabel.setText("Team name");

        optionsTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsTeamActionPerformed(evt);
            }
        });
        optionsTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                optionsTeamKeyReleased(evt);
            }
        });

        optionsTeamLabel.setText("Team #");

        optionsScouter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                optionsScouterKeyReleased(evt);
            }
        });

        optionsScouterLabel.setText("Scouter name");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(autoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(pitSave)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(optionsScouterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsScouter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsTeamLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsNickLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsNick, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionsScouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionsScouterLabel)
                    .addComponent(optionsTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionsTeamLabel)
                    .addComponent(optionsNickLabel)
                    .addComponent(optionsNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(autoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pitSave)
                .addContainerGap(48, Short.MAX_VALUE))
        );

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

    private void optionsTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsTeamActionPerformed
        optionsChanged();
    }//GEN-LAST:event_optionsTeamActionPerformed

    private void optionsTeamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optionsTeamKeyReleased
        optionsChanged();
    }//GEN-LAST:event_optionsTeamKeyReleased

    private void optionsNickKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optionsNickKeyReleased
        optionsChanged();
    }//GEN-LAST:event_optionsNickKeyReleased

    private void pitSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pitSaveActionPerformed
        optionsSave();
    }//GEN-LAST:event_pitSaveActionPerformed

    private void optionsScouterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optionsScouterKeyReleased
        optionsChanged();
    }//GEN-LAST:event_optionsScouterKeyReleased

    private void autoText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoText2ActionPerformed

    }//GEN-LAST:event_autoText2ActionPerformed

    private void autoText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoText3ActionPerformed

    }//GEN-LAST:event_autoText3ActionPerformed

    private void autoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoText1ActionPerformed

    }//GEN-LAST:event_autoText1ActionPerformed

    private void teleText11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText11ActionPerformed

    }//GEN-LAST:event_teleText11ActionPerformed

    private void teleText10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText10ActionPerformed

    }//GEN-LAST:event_teleText10ActionPerformed

    private void teleText9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText9ActionPerformed

    }//GEN-LAST:event_teleText9ActionPerformed

    private void teleText8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText8ActionPerformed

    }//GEN-LAST:event_teleText8ActionPerformed

    private void teleText7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText7ActionPerformed

    }//GEN-LAST:event_teleText7ActionPerformed

    private void teleText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText6ActionPerformed

    }//GEN-LAST:event_teleText6ActionPerformed

    private void teleText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText5ActionPerformed

    }//GEN-LAST:event_teleText5ActionPerformed

    private void teleText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText4ActionPerformed

    }//GEN-LAST:event_teleText4ActionPerformed

    private void teleText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText3ActionPerformed

    }//GEN-LAST:event_teleText3ActionPerformed

    private void teleText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText2ActionPerformed

    }//GEN-LAST:event_teleText2ActionPerformed

    private void teleText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText1ActionPerformed

    }//GEN-LAST:event_teleText1ActionPerformed

    
    private void optionsChanged() 
    {
        int submitInt = 0;
            
        if ("".equals(optionsScouter.getText()))    
                submitInt++;
        else if (optionsScouter.getText().contains("-"))
            textFieldCondClear(optionsScouter);
        
        if ("".equals(optionsNick.getText()))
                submitInt++;
        else if (optionsNick.getText().contains("-"))
            textFieldCondClear(optionsNick);
        
        if ("".equals(optionsTeam.getText()))
                submitInt++;
        else if (optionsTeam.getText().contains("-"))
            textFieldCondClear(optionsTeam);
        
        pitSave.setEnabled(submitInt == 0);
    
    }
    
    private void optionsSave()
    {
        
        
    String text =
            "Pit Sheet\n\n" +
            optionsScouterLabel.getText() + ": " + optionsScouter.getText() + "\n\n" +
            optionsTeamLabel.getText() + ": " + optionsTeam.getText() + "\n\n" +
            optionsNickLabel.getText() + ": " + optionsNick.getText() + "\n\n\n\n" +
            
            "Autonomous:\n\t" +
            autoLabel1.getText() + "\n\t\t" + autoText1.getText() + "\n\n\t" +
            autoLabel2.getText() + "\n\t\t" + autoText2.getText() + "\n\n\t" +
            autoLabel3.getText() + "\n\t\t" + autoText3.getText() + "\n\n\n" +
            
            "Teleoperation\n\t" +
            teleLabel1.getText() + "\n\t\t" + teleText1.getText() + "\n\n\t" +
            teleLabel2.getText() + "\n\t\t" + teleText2.getText() + "\n\n\t" +
            teleLabel3.getText() + "\n\t\t" + teleText3.getText() + "\n\n\t" +
            teleLabel4.getText() + "\n\t\t" + teleText4.getText() + "\n\n\t" +
            teleLabel5.getText() + "\n\t\t" + teleText5.getText() + "\n\n\t" +
            teleLabel6.getText() + "\n\t\t" + teleText6.getText() + "\n\n\t" +
            teleLabel7.getText() + "\n\t\t" + teleText7.getText() + "\n\n\t" +
            teleLabel8.getText() + "\n\t\t" + teleText8.getText() + "\n\n\t" +
            teleLabel9.getText() + "\n\t\t" + teleText9.getText() + "\n\n\t" +
            teleLabel10.getText() + "\n\t\t" + teleText10.getText() + "\n\n\t" +
            teleLabel11.getText() + "\n\t\t" + teleText11.getText()
            ;    
    
        try     
        {
            // writes data sheet to file
            File scoutFile = new File("./PitSheets/PitSheet-" + optionsTeam.getText() 
                    + "-" + optionsNick.getText() + "-" + optionsScouter.getText() + ".txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(scoutFile));
            output.write(text);
            output.close();
          
            JOptionPane.showMessageDialog(null,
            "Your sheet has been saved",
            "Success",
            JOptionPane.DEFAULT_OPTION);
        }
        catch ( IOException e )
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
            "Failed to write to Pit Scouting Sheet",
            "Error",
            JOptionPane.ERROR_MESSAGE);  
        }
        
    
        
    }
    
    // clears text field if any digit is non-numerical
    private void textFieldCondClear(java.awt.TextField field) 
    {
        for (char c : field.getText().toCharArray())
            {
                if (!Character.isDigit(c))
                {
                    field.setText("");
                }
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoLabel1;
    private javax.swing.JLabel autoLabel2;
    private javax.swing.JLabel autoLabel3;
    private javax.swing.JPanel autoPanel;
    private javax.swing.JTextField autoText1;
    private javax.swing.JTextField autoText2;
    private javax.swing.JTextField autoText3;
    private javax.swing.JPanel mainPanel;
    private java.awt.TextField optionsNick;
    private javax.swing.JLabel optionsNickLabel;
    private java.awt.TextField optionsScouter;
    private javax.swing.JLabel optionsScouterLabel;
    private java.awt.TextField optionsTeam;
    private javax.swing.JLabel optionsTeamLabel;
    private javax.swing.JButton pitSave;
    private javax.swing.JLabel teleLabel1;
    private javax.swing.JLabel teleLabel10;
    private javax.swing.JLabel teleLabel11;
    private javax.swing.JLabel teleLabel2;
    private javax.swing.JLabel teleLabel3;
    private javax.swing.JLabel teleLabel4;
    private javax.swing.JLabel teleLabel5;
    private javax.swing.JLabel teleLabel6;
    private javax.swing.JLabel teleLabel7;
    private javax.swing.JLabel teleLabel8;
    private javax.swing.JLabel teleLabel9;
    private javax.swing.JPanel telePanel;
    private javax.swing.JTextField teleText1;
    private javax.swing.JTextField teleText10;
    private javax.swing.JTextField teleText11;
    private javax.swing.JTextField teleText2;
    private javax.swing.JTextField teleText3;
    private javax.swing.JTextField teleText4;
    private javax.swing.JTextField teleText5;
    private javax.swing.JTextField teleText6;
    private javax.swing.JTextField teleText7;
    private javax.swing.JTextField teleText8;
    private javax.swing.JTextField teleText9;
    // End of variables declaration//GEN-END:variables
}
