
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Younouss boré
 */
public class Reglage extends javax.swing.JFrame {

    /**
     * Creates new form Reglage
     */
    public Reglage() {
        initComponents();
        charger_info();
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
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        acceuil_btn_deconnexion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        User_nom = new javax.swing.JLabel();
        User_prenom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User_email = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User_motdepasse = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        User_tel = new javax.swing.JLabel();
        unlabelss = new javax.swing.JLabel();
        User_adresse = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        User_passeport = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        User_genre = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_afficher = new javax.swing.JButton();
        reglage_btn_modifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(254, 184, 184));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel7.setText("SWEET TRAVEL");
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });

        acceuil_btn_deconnexion.setBackground(new java.awt.Color(250, 27, 33));
        acceuil_btn_deconnexion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        acceuil_btn_deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        acceuil_btn_deconnexion.setText("Deconnection");
        acceuil_btn_deconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceuil_btn_deconnexionMouseClicked(evt);
            }
        });
        acceuil_btn_deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil_btn_deconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(acceuil_btn_deconnexion)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acceuil_btn_deconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Vos informations", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nom:");

        User_nom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_nom.setText("Nom:");

        User_prenom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_prenom.setText("Nom:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Prenom:");

        User_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_email.setText("Nom:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("email:");

        User_motdepasse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_motdepasse.setText("************");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Mot de passe:");

        User_tel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_tel.setText("Nom:");

        unlabelss.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unlabelss.setText("Tel:");

        User_adresse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_adresse.setText("Nom:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Adresse:");

        User_passeport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_passeport.setText("Nom:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Numero passe port:");

        User_genre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        User_genre.setText("Nom:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Genre:");

        btn_afficher.setText("Afficher");
        btn_afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_afficherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_genre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_passeport))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_adresse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(unlabelss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_tel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_motdepasse)
                        .addGap(18, 18, 18)
                        .addComponent(btn_afficher))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_email))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_prenom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(User_nom)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(User_nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(User_prenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(User_email))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(User_motdepasse)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btn_afficher, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unlabelss)
                    .addComponent(User_tel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(User_adresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(User_passeport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(User_genre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reglage_btn_modifier.setText("MODIFIER");
        reglage_btn_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reglage_btn_modifierMouseClicked(evt);
            }
        });
        reglage_btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglage_btn_modifierActionPerformed(evt);
            }
        });
        reglage_btn_modifier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reglage_btn_modifierKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reglage_btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reglage_btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7KeyPressed

    private void acceuil_btn_deconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceuil_btn_deconnexionMouseClicked
        // TODO add your handling code here:
        //On decharge les donnees
        Info_user.idclient="";
        Info_user.iduser="";
        Info_user.nom="";
        Info_user.prenom="";
        Info_user.email="";
        Info_user.motdepasse="";
        Info_user.tel="";
        Info_user.adresse="";
        Info_user.passeport="";
        Info_user.genre="";
        Info_user.idcontact="";
        //on charge la connexion
        Connexion.main(null);
        //on ferme la pagee d'acceuil
        this.dispose();
    }//GEN-LAST:event_acceuil_btn_deconnexionMouseClicked

    private void acceuil_btn_deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil_btn_deconnexionActionPerformed
        // TODO add your handling code here:
        Info_user.idclient="";
        Info_user.nom="";
    }//GEN-LAST:event_acceuil_btn_deconnexionActionPerformed
    private void charger_info(){
        User_nom.setText(Info_user.nom);
        User_prenom.setText(Info_user.prenom);
        User_email.setText(Info_user.email);
        User_tel.setText(Info_user.tel);
        User_adresse.setText(Info_user.adresse);
        User_passeport.setText(Info_user.passeport);
        User_genre.setText(Info_user.genre);    
    }
    int i=0;
    private void affichermotdepasse(){
        
        if(i==0){
            User_motdepasse.setText(Info_user.motdepasse);
            btn_afficher.setText("Masquer");
            i=1;
        }
        else{
            User_motdepasse.setText("**********");
            btn_afficher.setText("Afficher");
            i=0;
        }
    }
    private void reglage_btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglage_btn_modifierActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_reglage_btn_modifierActionPerformed

    private void btn_afficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_afficherActionPerformed
        // TODO add your handling code here:
        affichermotdepasse();
    }//GEN-LAST:event_btn_afficherActionPerformed

    private void reglage_btn_modifierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reglage_btn_modifierKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_reglage_btn_modifierKeyPressed

    private void reglage_btn_modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reglage_btn_modifierMouseClicked
        // TODO add your handling code here:
        Reglage_modification.main(null);
        
    }//GEN-LAST:event_reglage_btn_modifierMouseClicked

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
            java.util.logging.Logger.getLogger(Reglage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reglage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reglage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reglage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reglage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel User_adresse;
    private javax.swing.JLabel User_email;
    private javax.swing.JLabel User_genre;
    private javax.swing.JLabel User_motdepasse;
    private javax.swing.JLabel User_nom;
    private javax.swing.JLabel User_passeport;
    private javax.swing.JLabel User_prenom;
    private javax.swing.JLabel User_tel;
    private javax.swing.JButton acceuil_btn_deconnexion;
    private javax.swing.JButton btn_afficher;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton reglage_btn_modifier;
    private javax.swing.JLabel unlabelss;
    // End of variables declaration//GEN-END:variables
}
