/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmgui;

import java.util.ArrayList;

/**
 *
 * @author 'Toine
 */
public class DetailsGui extends javax.swing.JFrame {

    public ArrayList currentFilm=null;
    /*
    0- id           1- titre            2- status       3-release       4- rutime       5- tagline
    6- budget       7- certification    8- voteAvg      9-voteCount     10-genre        11 acteur       12- directeur
    */
    public int nrb = 13;
    /**
     * Creates new form DetailsGui
     */
    public DetailsGui() {
        initComponents();
    }
    
    public int setAllValue(ArrayList pArrayList)
    {
        idValueLabel.setText(currentFilm.get(0).toString());
        titreValueLabel.setText(currentFilm.get(1).toString());
        statusValueLabel.setText(currentFilm.get(2).toString());
        releaseDateValueLabel.setText(currentFilm.get(3).toString());
        runtimeValueLabel.setText(currentFilm.get(4).toString());
        taglineValueLabel.setText(currentFilm.get(5).toString());
        budgetValueLabel.setText(currentFilm.get(6).toString());
        certificationValueLabel.setText(currentFilm.get(7).toString());
        voteAvgValueLabel.setText(currentFilm.get(8).toString());
        voteCountValueLabel.setText(currentFilm.get(9).toString());
        listeGenreLabel.setText(currentFilm.get(10).toString());
        listeActeursLabel.setText(currentFilm.get(11).toString());
        listeDirecteursLabel.setText(currentFilm.get(12).toString());
        return 1;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        titreLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        releaseDateLabel = new javax.swing.JLabel();
        acteurLabel = new javax.swing.JLabel();
        directeurLabel = new javax.swing.JLabel();
        listeActeursLabel = new javax.swing.JLabel();
        listeDirecteursLabel = new javax.swing.JLabel();
        idValueLabel = new javax.swing.JLabel();
        titreValueLabel = new javax.swing.JLabel();
        statusValueLabel = new javax.swing.JLabel();
        releaseDateValueLabel = new javax.swing.JLabel();
        posterPanel = new javax.swing.JPanel();
        posterLabel = new javax.swing.JLabel();
        runtimeLabel = new javax.swing.JLabel();
        taglineLabel = new javax.swing.JLabel();
        budgetLabel = new javax.swing.JLabel();
        certificationLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        voteAvgLabel = new javax.swing.JLabel();
        voteCountLabel = new javax.swing.JLabel();
        listeGenreLabel = new javax.swing.JLabel();
        runtimeValueLabel = new javax.swing.JLabel();
        taglineValueLabel = new javax.swing.JLabel();
        budgetValueLabel = new javax.swing.JLabel();
        certificationValueLabel = new javax.swing.JLabel();
        voteAvgValueLabel = new javax.swing.JLabel();
        voteCountValueLabel = new javax.swing.JLabel();
        attribuerCoteLabel = new javax.swing.JLabel();
        nomUtilisateurTF = new javax.swing.JTextField();
        voteSpinner = new javax.swing.JSpinner();
        voteButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setText("ID :");

        titreLabel.setText("Titre :");

        statusLabel.setText("Status :");

        releaseDateLabel.setText("Release date :");

        acteurLabel.setText("Acteurs :");

        directeurLabel.setText("Directeurs :");

        listeActeursLabel.setText("listeActeurs");

        listeDirecteursLabel.setText("listeDirecteurs");

        idValueLabel.setText("idValueLabel");

        titreValueLabel.setText("titreValueLabel");

        statusValueLabel.setText("statusValueLabel");

        releaseDateValueLabel.setText("releaseDateValueLabel");

        posterLabel.setText("posterLabel");

        javax.swing.GroupLayout posterPanelLayout = new javax.swing.GroupLayout(posterPanel);
        posterPanel.setLayout(posterPanelLayout);
        posterPanelLayout.setHorizontalGroup(
            posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(posterLabel)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        posterPanelLayout.setVerticalGroup(
            posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(posterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        runtimeLabel.setText("Runtime :");

        taglineLabel.setText("Tagline :");

        budgetLabel.setText("Budget :");

        certificationLabel.setText("Certification :");

        genreLabel.setText("Genre :");

        voteAvgLabel.setText("Vote Average :");

        voteCountLabel.setText("Vote Count :");

        listeGenreLabel.setText("listeGenre");

        runtimeValueLabel.setText("runtimeValueLabel");

        taglineValueLabel.setText("taglineValueLabel");

        budgetValueLabel.setText("budgetValueLabel");

        certificationValueLabel.setText("certificationValueLabel");

        voteAvgValueLabel.setText("voteAvgValueLabel");

        voteCountValueLabel.setText("voteCountValueLabel");

        attribuerCoteLabel.setText("Attribuer une cote :");

        nomUtilisateurTF.setText("nom utilisateur");

        voteSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 1.0d));

        voteButton.setText("Attribuer le vote");
        voteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voteButtonMouseClicked(evt);
            }
        });

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(directeurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acteurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(certificationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(budgetLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(taglineLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(releaseDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(runtimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(titreValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(statusValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(releaseDateValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(runtimeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(taglineValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(budgetValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(certificationValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(genreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(voteCountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(voteAvgLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(voteAvgValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(voteCountValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(27, 27, 27)
                                .addComponent(posterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listeGenreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listeActeursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listeDirecteursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(attribuerCoteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(nomUtilisateurTF)
                                    .addComponent(voteSpinner)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(voteButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idLabel)
                                    .addComponent(idValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titreLabel)
                                    .addComponent(titreValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(statusLabel)
                                    .addComponent(statusValueLabel))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(releaseDateLabel)
                                    .addComponent(releaseDateValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(runtimeLabel)
                                    .addComponent(runtimeValueLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(taglineLabel)
                                    .addComponent(taglineValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(budgetLabel)
                                    .addComponent(budgetValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(certificationLabel)
                                    .addComponent(certificationValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(voteAvgLabel)
                                    .addComponent(voteAvgValueLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(voteCountLabel)
                                    .addComponent(voteCountValueLabel)))
                            .addComponent(posterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(genreLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(attribuerCoteLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nomUtilisateurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(voteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(voteButton)))
                .addGap(18, 18, 18)
                .addComponent(listeGenreLabel)
                .addGap(18, 18, 18)
                .addComponent(acteurLabel)
                .addGap(18, 18, 18)
                .addComponent(listeActeursLabel)
                .addGap(18, 18, 18)
                .addComponent(directeurLabel)
                .addGap(18, 18, 18)
                .addComponent(listeDirecteursLabel)
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonMouseClicked

    private void voteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_voteButtonMouseClicked

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
            java.util.logging.Logger.getLogger(DetailsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acteurLabel;
    private javax.swing.JLabel attribuerCoteLabel;
    private javax.swing.JLabel budgetLabel;
    private javax.swing.JLabel budgetValueLabel;
    private javax.swing.JLabel certificationLabel;
    private javax.swing.JLabel certificationValueLabel;
    private javax.swing.JLabel directeurLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idValueLabel;
    private javax.swing.JLabel listeActeursLabel;
    private javax.swing.JLabel listeDirecteursLabel;
    private javax.swing.JLabel listeGenreLabel;
    private javax.swing.JTextField nomUtilisateurTF;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JPanel posterPanel;
    private javax.swing.JLabel releaseDateLabel;
    private javax.swing.JLabel releaseDateValueLabel;
    private javax.swing.JLabel runtimeLabel;
    private javax.swing.JLabel runtimeValueLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusValueLabel;
    private javax.swing.JLabel taglineLabel;
    private javax.swing.JLabel taglineValueLabel;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JLabel titreValueLabel;
    private javax.swing.JLabel voteAvgLabel;
    private javax.swing.JLabel voteAvgValueLabel;
    private javax.swing.JButton voteButton;
    private javax.swing.JLabel voteCountLabel;
    private javax.swing.JLabel voteCountValueLabel;
    private javax.swing.JSpinner voteSpinner;
    // End of variables declaration//GEN-END:variables
}
