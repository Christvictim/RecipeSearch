/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class RecipeSearchAboutBox extends JDialog {
    
    public RecipeSearchAboutBox(JFrame parent){
        super(parent);
        initComponents();
    }
    
    private void initComponents(){
        add(new AboutPanel());
        pack();
    }
    
    private class AboutPanel extends javax.swing.JPanel {

    /**
     * Creates new form AboutPanel
     */
    public AboutPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        titelLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        appVersionLabel = new javax.swing.JLabel();
        developerLabel = new javax.swing.JLabel();
        appDeveloperLabel = new javax.swing.JLabel();
        appHomepageLabel = new javax.swing.JLabel();
        homepageLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        java.util.ResourceBundle aboutBundle = java.util.ResourceBundle.getBundle("recipesearch/resources/RecipeSearchAboutBox"); // NOI18N
        java.util.ResourceBundle appBundle = java.util.ResourceBundle.getBundle("recipesearch/resources/RecipeSearch"); // NOI18N
      
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/about.png"))); // NOI18N

        titelLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titelLabel.setText(aboutBundle.getString("titleLabel.text"));

        descLabel.setText(aboutBundle.getString("appDescLabel.text"));

        versionLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        versionLabel.setText(aboutBundle.getString("versionLabel.text"));
        appVersionLabel.setText(appBundle.getString("Application.version"));

        developerLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        developerLabel.setText(aboutBundle.getString("developerLabel.text"));
        appDeveloperLabel.setText(appBundle.getString("Application.developer"));

        homepageLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        homepageLabel.setText(aboutBundle.getString("homepageLabel.text"));
        appHomepageLabel.setText(appBundle.getString("Application.homepage"));
        
        closeButton.setText(aboutBundle.getString("closeAboutBox.Action.text"));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        
        setTitle(aboutBundle.getString("title.text"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(versionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(developerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(homepageLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appVersionLabel)
                            .addComponent(appDeveloperLabel)
                            .addComponent(appHomepageLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titelLabel)
                            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(titelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionLabel)
                    .addComponent(appVersionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developerLabel)
                    .addComponent(appDeveloperLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homepageLabel)
                    .addComponent(appHomepageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dispose();
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JLabel appDeveloperLabel;
    private javax.swing.JLabel appHomepageLabel;
    private javax.swing.JLabel appVersionLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel developerLabel;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel titelLabel;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration                   
}
}
