package AppGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends javax.swing.JPanel implements ActionListener {
    
    public static void main(String[] args){
        MainPanel mp = new MainPanel();
    }
    
    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outTextArea = new javax.swing.JTextArea();
        typeOption = new javax.swing.JComboBox();
        lengthOption = new javax.swing.JComboBox();
        nKeyOption = new javax.swing.JComboBox();
        genButton = new javax.swing.JButton();
        reButton = new javax.swing.JButton();

        Label1.setText("Key length : ");

        Label2.setText("Key type   : ");

        Label3.setText("Number of key : ");

        outTextArea.setColumns(20);
        outTextArea.setRows(5);
        jScrollPane1.setViewportView(outTextArea);

        typeOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alphabet", "Number", "Alphabet & Number" }));
        typeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOptionActionPerformed(evt);
            }
        });

        lengthOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        lengthOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthOptionActionPerformed(evt);
            }
        });

        nKeyOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        nKeyOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nKeyOptionActionPerformed(evt);
            }
        });

        genButton.setText("Generate");
        genButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genButtonActionPerformed(evt);
            }
        });

        reButton.setText("Reset");
        reButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeOption, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1)
                                .addGap(4, 4, 4)
                                .addComponent(lengthOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nKeyOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genButton)
                                .addGap(6, 6, 6)
                                .addComponent(reButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lengthOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nKeyOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Label1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label2)
                            .addComponent(typeOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(genButton)
                    .addComponent(reButton))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void genButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genButtonActionPerformed

    }//GEN-LAST:event_genButtonActionPerformed

    private void lengthOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthOptionActionPerformed

    }//GEN-LAST:event_lengthOptionActionPerformed

    private void typeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOptionActionPerformed

    }//GEN-LAST:event_typeOptionActionPerformed

    private void nKeyOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nKeyOptionActionPerformed

    }//GEN-LAST:event_nKeyOptionActionPerformed

    private void reButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reButtonActionPerformed

    }//GEN-LAST:event_reButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JButton genButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox lengthOption;
    private javax.swing.JComboBox nKeyOption;
    private javax.swing.JTextArea outTextArea;
    private javax.swing.JButton reButton;
    private javax.swing.JComboBox typeOption;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent evt) {

    }

}
