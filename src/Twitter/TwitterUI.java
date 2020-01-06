/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twitter;

import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 *
 * @author riswanardiansah
 */
public class TwitterUI extends javax.swing.JFrame {

    public static TwitterFactory twitterFactory;
    public static Twitter twitter;
    public static String filename= "";
    public static String statusTwitter;
    
    public TwitterUI() {
        initComponents();
        getToken();
        try {
            loadTweets();
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getToken () {
        String consumerKey = "xJaAR5mqajNGeHiznoXIkXnqz";
        String consumerSecret = "NVjKWXlbpt5oLEy5YkfIXtOHiZo3agYuljKQTwMzfJKgUsuQgq";
        String accessToken = "1202043392655388674-E5rEi5ZsheFZrj3AssLA2ZPlGWw4yS";
        String tokenSecret = "gSNOpzTLN6fAeYLZe3vnf0e3VaMmGmolMHZ08zlcfUz05";
        
        twitterFactory = new TwitterFactory();
        twitter = twitterFactory.getInstance();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        twitter.setOAuthAccessToken(new AccessToken(accessToken, tokenSecret));
    }
    
    private void loadTweets () throws TwitterException{
        for (Status status: twitter.getHomeTimeline()) {
            statusTwitter += "\n@" + status.getUser().getScreenName() + "\n" + status.getText();
            txtTimeLine.setText(statusTwitter);
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

        username = new javax.swing.JLabel();
        txtStarter = new javax.swing.JTextField();
        btnTweet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTimeLine = new javax.swing.JTextArea();
        btnMedia = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setText("@mhsunpam");

        txtStarter.setToolTipText("What do you mind?");
        txtStarter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStarterActionPerformed(evt);
            }
        });

        btnTweet.setText("Tweet !");
        btnTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweetActionPerformed(evt);
            }
        });

        txtTimeLine.setColumns(20);
        txtTimeLine.setRows(5);
        jScrollPane1.setViewportView(txtTimeLine);

        btnMedia.setText("Media");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnTweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtStarter))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(username)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStarter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTweet)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStarterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStarterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStarterActionPerformed

    private void btnTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTweetActionPerformed
    String consumerKey = "xJaAR5mqajNGeHiznoXIkXnqz";
        String consumerSecret = "NVjKWXlbpt5oLEy5YkfIXtOHiZo3agYuljKQTwMzfJKgUsuQgq";
        String accessToken = "1202043392655388674-E5rEi5ZsheFZrj3AssLA2ZPlGWw4yS";
        String tokenSecret = "gSNOpzTLN6fAeYLZe3vnf0e3VaMmGmolMHZ08zlcfUz05";
        
        twitterFactory = new TwitterFactory();
        twitter = twitterFactory.getInstance();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        twitter.setOAuthAccessToken(new AccessToken(accessToken, tokenSecret));
    Status status;
        try {
            status = twitter.updateStatus(txtStarter.getText());
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Successfully updated the status to [" + txtStarter.getText() + "].");        // TODO add your handling code here:
    }//GEN-LAST:event_btnTweetActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        getToken();
        try {
            loadTweets();// TODO add your handling code here:
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(TwitterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwitterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwitterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwitterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwitterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTweet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtStarter;
    private javax.swing.JTextArea txtTimeLine;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
