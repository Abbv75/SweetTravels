
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Younouss boré
 */

public class Connexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    public Connexion() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tf_login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        b_connecter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        text_inscription = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setText("Bienvenue chez Sweet Travel");

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tf_login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tf_login.setNextFocusableComponent(tf_pass);
        tf_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_loginActionPerformed(evt);
            }
        });
        tf_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_loginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_loginKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("Mot de passe:");

        tf_pass.setForeground(new java.awt.Color(73, 73, 73));
        tf_pass.setText("password");
        tf_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_passMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_login)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(tf_pass))
                .addContainerGap())
        );

        b_connecter.setBackground(new java.awt.Color(51, 51, 255));
        b_connecter.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 36)); // NOI18N
        b_connecter.setForeground(new java.awt.Color(255, 255, 255));
        b_connecter.setText("Connexion");
        b_connecter.setBorder(null);
        b_connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_connecterActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(214, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mot de passe oublie");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_connecter, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_connecter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setText("Vous n'avez pas encore de compte?");

        text_inscription.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        text_inscription.setForeground(new java.awt.Color(51, 51, 51));
        text_inscription.setText("Cliquez ici pour vous inscrire");
        text_inscription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        text_inscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_inscriptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                text_inscriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                text_inscriptionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_inscriptionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                text_inscriptionMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_inscription)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_inscription)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(254, 184, 184));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel7.setText("SWEET TRAVEL");
        jLabel7.setMinimumSize(new java.awt.Dimension(1589, 100));
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(254, 184, 184));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 48)); // NOI18N
        jLabel9.setText("TECHNO-LAB ISTA AP2");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Mes structures

    
    private void tf_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Motdepasse_oublier.main(null);
        /*new Motdepasse_oublier().setVisible(true);*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_passMouseClicked
        // TODO add your handling code here:
        tf_pass.setText("");
    }//GEN-LAST:event_tf_passMouseClicked

    private void b_connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_connecterActionPerformed
        // TODO add your handling code here:
        //On a recuperer les info d'entrer
        String login=tf_login.getText();
        String passe=tf_pass.getText();
        //on a copier le code de testBD pour effectuer une connection
        String urlBDD = "jdbc:mysql://localhost:3306/agencebd";
        String user = "root";
        String passwd = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(urlBDD, user, passwd);
                System.out.println("Connexion reussi");
                String requete_user="SELECT * FROM user WHERE email=? AND motdepasse=? AND role='client';";
                PreparedStatement state_user= conn.prepareStatement(requete_user);
                state_user.setString(1, login);
                state_user.setString(2, passe);
                ResultSet result_user=state_user.executeQuery();
                /*--------*/
                String requete_admin="SELECT * FROM user WHERE email=? AND motdepasse=? AND role='admin';";
                PreparedStatement state_admin= conn.prepareStatement(requete_admin);
                state_admin.setString(1, login);
                state_admin.setString(2, passe);
                ResultSet result_admin=state_admin.executeQuery();
                //On verifie les info
                if(!result_admin.wasNull() && result_admin.first()){
                    //On stock les info de l'utilsateur
                    
                    String select_info_id_client="SELECT * FROM user WHERE email=?;";
                    PreparedStatement stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, login);
                    ResultSet res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.idclient=res_info_id_client.getString("idclient");
                        Info_user.nom=res_info_id_client.getString("nom");
                        System.out.println("votre id est:"+Info_user.idclient+"\net votre nom est: "+Info_user.nom);
                        break;
                    }
                    select_info_id_client="SELECT id FROM user WHERE nom=? AND prenom=? AND email=? AND motdepasse=? AND role='admin';";
                    stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, Info_user.nom);
                    stm.setString(2, Info_user.prenom);
                    stm.setString(3, Info_user.email);
                    stm.setString(4, Info_user.motdepasse);
                    res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.iduser=res_info_id_client.getString("id");   
                        System.out.println("votre id est:"+Info_user.iduser);
                        break;
                    }
                    //on charge l'acceuil de l'admin
                    Acceuil.main(null);
                    //on ferme la pagee de connexion
                    this.dispose();
                    System.out.println(Info_user.idclient);
                    JOptionPane.showMessageDialog(this, "Bienvenue monsieur "+Info_user.nom, "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(!result_user.wasNull() && result_user.first()){
                    //On stock les info de l'utilsateur
                    
                    String select_info_id_client="SELECT * FROM user WHERE email=?;";
                    PreparedStatement stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, login);
                    ResultSet res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.idclient=res_info_id_client.getString("idclient");
                        Info_user.nom=res_info_id_client.getString("nom");
                        Info_user.prenom=res_info_id_client.getString("prenom");
                        Info_user.email=res_info_id_client.getString("email");
                        Info_user.motdepasse=res_info_id_client.getString("motdepasse");  
                        System.out.println("votre id client est:"+Info_user.idclient+"\net votre nom est: "+Info_user.nom+"\nvotre prenom est:"+Info_user.prenom+"\nVotre email est: "+Info_user.email+"Votre mot de passe est: "+Info_user.motdepasse);
                        break;
                    }
                    select_info_id_client="SELECT * FROM client WHERE id=?;";
                    stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, Info_user.idclient);
                    res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.genre=res_info_id_client.getString("genre");
                        Info_user.idcontact=res_info_id_client.getString("idcontact");
                        Info_user.passeport=res_info_id_client.getString("passport");
                        System.out.println("votre genre est:"+Info_user.genre+"\net votre passeport est: "+Info_user.passeport);
                        break;
                    }
                    select_info_id_client="SELECT * FROM contact WHERE id=?;";
                    stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, Info_user.idcontact);
                    res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.tel=res_info_id_client.getString("tel");
                        Info_user.adresse=res_info_id_client.getString("adresse");
                        System.out.println("votre tel est:"+Info_user.tel+"\net votre adresse est: "+Info_user.adresse);
                        break;
                    }
                    select_info_id_client="SELECT id FROM user WHERE nom=? AND prenom=? AND email=? AND motdepasse=? AND role='client';";
                    stm= conn.prepareStatement(select_info_id_client);
                    stm.setString(1, Info_user.nom);
                    stm.setString(2, Info_user.prenom);
                    stm.setString(3, Info_user.email);
                    stm.setString(4, Info_user.motdepasse);
                    res_info_id_client=stm.executeQuery();
                    while(res_info_id_client.next()){
                        Info_user.iduser=res_info_id_client.getString("id");   
                        System.out.println("votre id est:"+Info_user.iduser);
                        break;
                    }
                    //on charge l'acceuil de l'utilisateur
                    Acceuil_user.main(null);
                    //on ferme la pagee de connexion
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Bienvenue monsieur "+Info_user.nom, "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Mot de passe ou login incorrecte. Veuillez vous identifiez a nouveau", "Erreur de COnnection", JOptionPane.ERROR_MESSAGE);
                }
            } 
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Erreur de connexion");
            }
    }//GEN-LAST:event_b_connecterActionPerformed

    private void tf_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_loginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_loginKeyPressed

    private void tf_loginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_loginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_loginKeyTyped

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void text_inscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_inscriptionMouseClicked
        // TODO add your handling code here:
        //on charge l'inscription de l'admin
        Inscription.main(null);
        //on ferme la pagee de connexion
        this.dispose();
    }//GEN-LAST:event_text_inscriptionMouseClicked

    private void text_inscriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_inscriptionMouseEntered
        // TODO add your handling code here:
        text_inscription.setForeground(new java.awt.Color(254,184,184));
    }//GEN-LAST:event_text_inscriptionMouseEntered

    private void text_inscriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_inscriptionMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_text_inscriptionMousePressed

    private void text_inscriptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_inscriptionMouseReleased
        // TODO add your handling code here:
        text_inscription.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_text_inscriptionMouseReleased

    private void text_inscriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_inscriptionMouseExited
        // TODO add your handling code here:
        text_inscription.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_text_inscriptionMouseExited

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_connecter;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel text_inscription;
    private javax.swing.JTextField tf_login;
    private javax.swing.JPasswordField tf_pass;
    // End of variables declaration//GEN-END:variables
}
