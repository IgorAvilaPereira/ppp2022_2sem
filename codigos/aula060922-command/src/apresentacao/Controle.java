/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apresentacao;

import negocio.NoCommand;
import negocio.HomeTheatherCommand;
import negocio.ArCondicionado;
import negocio.ArCondicionadoCommand;
import negocio.Command;
import negocio.HomeTheather;
import negocio.MacroTvArCondicionadoCommand;
import negocio.Tv;
import negocio.TvCommand;

/**
 *
 * @author iapereira
 */
public class Controle extends javax.swing.JFrame {

    private Command[] slots;

    /**
     * Creates new form Controle
     */
    public Controle() {
        initComponents();
        this.buttonGroup1.add(checkboxTV1);
        this.buttonGroup1.add(checkboxAr1);
        this.buttonGroup1.add(checkboxHome1);

        this.buttonGroup2.add(checkboxTV2);
        this.buttonGroup2.add(checkboxAr2);
        this.buttonGroup2.add(checkboxHome2);

        this.buttonGroup3.add(checkboxTV3);
        this.buttonGroup3.add(checkboxAr3);
        this.buttonGroup3.add(checkboxHome3);

        this.slots = new Command[4];
        
        for (int i = 0; i < this.slots.length; i++) {
            this.slots[i] = new NoCommand();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoOffSlot1 = new javax.swing.JButton();
        botaoOnSlot1 = new javax.swing.JButton();
        botaoOnSlot2 = new javax.swing.JButton();
        botaoOffSlot2 = new javax.swing.JButton();
        botaoOnSlot3 = new javax.swing.JButton();
        botaoOffSlot3 = new javax.swing.JButton();
        checkboxTV1 = new javax.swing.JCheckBox();
        checkboxAr1 = new javax.swing.JCheckBox();
        checkboxHome1 = new javax.swing.JCheckBox();
        checkboxHome2 = new javax.swing.JCheckBox();
        checkboxAr2 = new javax.swing.JCheckBox();
        checkboxTV2 = new javax.swing.JCheckBox();
        checkboxHome3 = new javax.swing.JCheckBox();
        checkboxAr3 = new javax.swing.JCheckBox();
        checkboxTV3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        botaoOnSlot4 = new javax.swing.JButton();
        botaoOffSlot4 = new javax.swing.JButton();
        checkboxTV4 = new javax.swing.JCheckBox();
        checkboxAr4 = new javax.swing.JCheckBox();
        checkboxHome4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1)");

        jLabel2.setText("2)");

        jLabel3.setText("3)");

        botaoOffSlot1.setText("Off");
        botaoOffSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOffSlot1ActionPerformed(evt);
            }
        });

        botaoOnSlot1.setText("On");
        botaoOnSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOnSlot1ActionPerformed(evt);
            }
        });

        botaoOnSlot2.setText("On");
        botaoOnSlot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOnSlot2ActionPerformed(evt);
            }
        });

        botaoOffSlot2.setText("Off");
        botaoOffSlot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOffSlot2ActionPerformed(evt);
            }
        });

        botaoOnSlot3.setText("On");
        botaoOnSlot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOnSlot3ActionPerformed(evt);
            }
        });

        botaoOffSlot3.setText("Off");
        botaoOffSlot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOffSlot3ActionPerformed(evt);
            }
        });

        checkboxTV1.setText("Tv");
        checkboxTV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxTV1ActionPerformed(evt);
            }
        });

        checkboxAr1.setText("Ar-Condicionado");
        checkboxAr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAr1ActionPerformed(evt);
            }
        });

        checkboxHome1.setText("HomeTheather");
        checkboxHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxHome1ActionPerformed(evt);
            }
        });

        checkboxHome2.setText("HomeTheather");
        checkboxHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxHome2ActionPerformed(evt);
            }
        });

        checkboxAr2.setText("Ar-Condicionado");
        checkboxAr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAr2ActionPerformed(evt);
            }
        });

        checkboxTV2.setText("Tv");
        checkboxTV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxTV2ActionPerformed(evt);
            }
        });

        checkboxHome3.setText("HomeTheather");
        checkboxHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxHome3ActionPerformed(evt);
            }
        });

        checkboxAr3.setText("Ar-Condicionado");
        checkboxAr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAr3ActionPerformed(evt);
            }
        });

        checkboxTV3.setText("Tv");
        checkboxTV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxTV3ActionPerformed(evt);
            }
        });

        jLabel4.setText("4)");

        botaoOnSlot4.setText("On");
        botaoOnSlot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOnSlot4ActionPerformed(evt);
            }
        });

        botaoOffSlot4.setText("Off");
        botaoOffSlot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOffSlot4ActionPerformed(evt);
            }
        });

        checkboxTV4.setText("Tv");
        checkboxTV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxTV4ActionPerformed(evt);
            }
        });

        checkboxAr4.setText("Ar-Condicionado");
        checkboxAr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAr4ActionPerformed(evt);
            }
        });

        checkboxHome4.setText("HomeTheather");
        checkboxHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxHome4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoOnSlot3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoOffSlot3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxTV3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxAr3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkboxHome3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoOnSlot2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoOffSlot2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxTV2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxAr2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkboxHome2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoOnSlot1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoOffSlot1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxTV1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxAr1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkboxHome1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoOnSlot4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoOffSlot4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxTV4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxAr4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkboxHome4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botaoOnSlot1)
                    .addComponent(botaoOffSlot1)
                    .addComponent(checkboxTV1)
                    .addComponent(checkboxAr1)
                    .addComponent(checkboxHome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkboxTV2)
                        .addComponent(checkboxAr2)
                        .addComponent(checkboxHome2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(botaoOnSlot2)
                        .addComponent(botaoOffSlot2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkboxTV3)
                        .addComponent(checkboxAr3)
                        .addComponent(checkboxHome3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoOnSlot3)
                        .addComponent(botaoOffSlot3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkboxTV4)
                        .addComponent(checkboxAr4)
                        .addComponent(checkboxHome4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoOnSlot4)
                        .addComponent(botaoOffSlot4)))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxTV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxTV1ActionPerformed

        this.slots[0] = new TvCommand(new Tv());
//        this.checkboxAr1.setEnabled(false);
//        this.checkboxHome1.setEnabled(false);
    }//GEN-LAST:event_checkboxTV1ActionPerformed

    private void checkboxAr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAr1ActionPerformed
        // TODO add your handling code here:

        this.slots[0] = new ArCondicionadoCommand(new ArCondicionado());
//        this.checkboxTV1.setEnabled(false);
//        this.checkboxHome1.setEnabled(false);
    }//GEN-LAST:event_checkboxAr1ActionPerformed

    private void checkboxTV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxTV2ActionPerformed
        // TODO add your handling code here:

        this.slots[1] = new TvCommand(new Tv());
//        this.checkboxAr2.setEnabled(false);
//        this.checkboxHome2.setEnabled(false);
    }//GEN-LAST:event_checkboxTV2ActionPerformed

    private void checkboxAr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAr2ActionPerformed
        // TODO add your handling code here:

        this.slots[1] = new ArCondicionadoCommand(new ArCondicionado());
//        this.checkboxTV2.setEnabled(false);
//        this.checkboxHome2.setEnabled(false);
    }//GEN-LAST:event_checkboxAr2ActionPerformed

    private void checkboxTV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxTV3ActionPerformed
        // TODO add your handling code here:

        this.slots[2] = new TvCommand(new Tv());
//        this.checkboxAr3.setEnabled(false);
//        this.checkboxHome3.setEnabled(false);
    }//GEN-LAST:event_checkboxTV3ActionPerformed

    private void checkboxAr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAr3ActionPerformed
        // TODO add your handling code here:

        this.slots[2] = new ArCondicionadoCommand(new ArCondicionado());
//        this.checkboxTV3.setEnabled(false);
//        this.checkboxHome3.setEnabled(false);
    }//GEN-LAST:event_checkboxAr3ActionPerformed

    private void botaoOnSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOnSlot1ActionPerformed
        // TODO add your handling code here:

        this.slots[0].execute();
    }//GEN-LAST:event_botaoOnSlot1ActionPerformed

    private void botaoOnSlot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOnSlot2ActionPerformed
        // TODO add your handling code here:

        this.slots[1].execute();
    }//GEN-LAST:event_botaoOnSlot2ActionPerformed

    private void botaoOnSlot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOnSlot3ActionPerformed
        // TODO add your handling code here:

        this.slots[2].execute();
    }//GEN-LAST:event_botaoOnSlot3ActionPerformed

    private void botaoOffSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOffSlot1ActionPerformed
        // TODO add your handling code here:

        this.slots[0].undo();
    }//GEN-LAST:event_botaoOffSlot1ActionPerformed

    private void botaoOffSlot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOffSlot2ActionPerformed
        // TODO add your handling code here:

        this.slots[1].undo();
    }//GEN-LAST:event_botaoOffSlot2ActionPerformed

    private void botaoOffSlot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOffSlot3ActionPerformed
        // TODO add your handling code here:

        this.slots[2].undo();
    }//GEN-LAST:event_botaoOffSlot3ActionPerformed

    private void botaoOnSlot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOnSlot4ActionPerformed
        // TODO add your handling code here:
        this.slots[3].execute();

    }//GEN-LAST:event_botaoOnSlot4ActionPerformed

    private void botaoOffSlot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOffSlot4ActionPerformed
        // TODO add your handling code here:
        this.slots[3].undo();
    }//GEN-LAST:event_botaoOffSlot4ActionPerformed

    private void checkboxTV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxTV4ActionPerformed
        // TODO add your handling code here:
        if (this.checkboxTV4.isEnabled() && !this.checkboxAr4.isEnabled()) {
            this.slots[3] = new TvCommand(new Tv());
        } else if (this.checkboxTV4.isEnabled() && this.checkboxAr4.isEnabled()) {
            this.slots[3] = new MacroTvArCondicionadoCommand(new TvCommand(new Tv()), new ArCondicionadoCommand(new ArCondicionado()));
        }
    }//GEN-LAST:event_checkboxTV4ActionPerformed

    private void checkboxAr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAr4ActionPerformed
        // TODO add your handling code here:

        if (!this.checkboxTV4.isEnabled() && this.checkboxAr4.isEnabled()) {
            this.slots[3] = new ArCondicionadoCommand(new ArCondicionado());
        } else if (this.checkboxTV4.isEnabled() && this.checkboxAr4.isEnabled()) {
            this.slots[3] = new MacroTvArCondicionadoCommand(new TvCommand(new Tv()), new ArCondicionadoCommand(new ArCondicionado()));
        }
    }//GEN-LAST:event_checkboxAr4ActionPerformed

    private void checkboxHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxHome1ActionPerformed
        // TODO add your handling code here:

        this.slots[0] = new HomeTheatherCommand(new HomeTheather());

    }//GEN-LAST:event_checkboxHome1ActionPerformed

    private void checkboxHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxHome2ActionPerformed
        // TODO add your handling code here:
        this.slots[1] = new HomeTheatherCommand(new HomeTheather());

    }//GEN-LAST:event_checkboxHome2ActionPerformed

    private void checkboxHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxHome3ActionPerformed
        // TODO add your handling code here:
        this.slots[2] = new HomeTheatherCommand(new HomeTheather());

    }//GEN-LAST:event_checkboxHome3ActionPerformed

    private void checkboxHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxHome4ActionPerformed
        // TODO add your handling code here:
        if (this.checkboxHome4.isEnabled()) {
            this.checkboxTV4.setEnabled(false);
            this.checkboxAr4.setEnabled(false);
            this.slots[3] = new HomeTheatherCommand(new HomeTheather());
        } else {
            this.checkboxHome4.setEnabled(true);
            this.checkboxTV4.setEnabled(true);
            this.checkboxAr4.setEnabled(true);
        }
    }//GEN-LAST:event_checkboxHome4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOffSlot1;
    private javax.swing.JButton botaoOffSlot2;
    private javax.swing.JButton botaoOffSlot3;
    private javax.swing.JButton botaoOffSlot4;
    private javax.swing.JButton botaoOnSlot1;
    private javax.swing.JButton botaoOnSlot2;
    private javax.swing.JButton botaoOnSlot3;
    private javax.swing.JButton botaoOnSlot4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox checkboxAr1;
    private javax.swing.JCheckBox checkboxAr2;
    private javax.swing.JCheckBox checkboxAr3;
    private javax.swing.JCheckBox checkboxAr4;
    private javax.swing.JCheckBox checkboxHome1;
    private javax.swing.JCheckBox checkboxHome2;
    private javax.swing.JCheckBox checkboxHome3;
    private javax.swing.JCheckBox checkboxHome4;
    private javax.swing.JCheckBox checkboxTV1;
    private javax.swing.JCheckBox checkboxTV2;
    private javax.swing.JCheckBox checkboxTV3;
    private javax.swing.JCheckBox checkboxTV4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
