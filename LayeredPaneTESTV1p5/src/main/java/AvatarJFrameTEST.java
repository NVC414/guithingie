
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

public class AvatarJFrameTEST extends javax.swing.JFrame {
    
    private ImageIcon originalFustaLabel;

    public AvatarJFrameTEST()
    {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        backgroundBodyLabel = new javax.swing.JLabel();
        palarieLabel = new javax.swing.JLabel();
        parLabel = new javax.swing.JLabel();
        fataLabel = new javax.swing.JLabel();
        accesoriLabel = new javax.swing.JLabel();
        bluzaLabel = new javax.swing.JLabel();
        fustaLabel = new javax.swing.JLabel();
        pantaloniLabel = new javax.swing.JLabel();
        pantofiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(292, 292, 292)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new java.awt.CardLayout());
        jLayeredPane1.add(backgroundBodyLabel, "card2");
        ImageIcon scaledImageBody = scaleImage("Sorse\\Corp.png", 1000, 700);
        backgroundBodyLabel.setIcon(scaledImageBody);

        palarieLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(palarieLabel, 1);
        jLayeredPane1.add(palarieLabel, "card7");
        ImageIcon palarieLabelImage=scaleImage("Resources\\avatar+10culori\\palarie\\palarie_alb.png",1000,700)

        parLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(parLabel, 2);
        jLayeredPane1.add(parLabel, "card5");

        fataLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(fataLabel, 3);
        jLayeredPane1.add(fataLabel, "card6");

        accesoriLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(accesoriLabel, 4);
        jLayeredPane1.add(accesoriLabel, "card8");

        bluzaLabel.setVisible(true);
        bluzaLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(bluzaLabel, 5);
        jLayeredPane1.add(bluzaLabel, "card3");
        ImageIcon bluzaLabelIcon = scaleImage("Sorse\\bluza_alb.png", 1000, 700);
        bluzaLabel.setIcon(bluzaLabelIcon);

        fustaLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(fustaLabel, 6);
        jLayeredPane1.add(fustaLabel, "card4");
        ImageIcon fustaLabelIcon = scaleImage("Sorse\\fusta_alb.png", 1000, 700);
        fustaLabel.setIcon(fustaLabelIcon);

        pantaloniLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(pantaloniLabel, 7);
        jLayeredPane1.add(pantaloniLabel, "card9");

        pantofiLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        jLayeredPane1.setLayer(pantofiLabel, 8);
        jLayeredPane1.add(pantofiLabel, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
       bluzaLabel.setVisible(!bluzaLabel.isVisible());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        fustaLabel.setVisible(!fustaLabel.isVisible());
    }//GEN-LAST:event_jButton2ActionPerformed

    public static ImageIcon scaleImage(String imagePath, int maxWidth, int maxHeight)
    {
        ImageReader imageReader = new ImageReader(imagePath);
        BufferedImage image = imageReader.getImage();

        double scale = Math.min((double) maxWidth / image.getWidth(), (double) maxHeight / image.getHeight());
        int scaledWidth = (int) (image.getWidth() * scale);
        int scaledHeight = (int) (image.getHeight() * scale);

        Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AvatarJFrameTEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accesoriLabel;
    private javax.swing.JLabel backgroundBodyLabel;
    private javax.swing.JLabel bluzaLabel;
    private javax.swing.JLabel fataLabel;
    private javax.swing.JLabel fustaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel palarieLabel;
    private javax.swing.JLabel pantaloniLabel;
    private javax.swing.JLabel pantofiLabel;
    private javax.swing.JLabel parLabel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
