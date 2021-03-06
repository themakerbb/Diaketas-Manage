
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 ** DESCRIPCION :
 *      Barra de navigacion generica
 *
 * @author raphaelcolleau
 */
public class BarraDeNavegacion extends javax.swing.JPanel {

    ActionListener listener;

    public static String TO_VISTA_INICIAL = "toMain";
    public static String TO_NIVEL1 = "toNivel1";
    public static String TO_NIVEL2 = "toNivel2";

    /**
     * Creates new form BarraDeNavegacion
     */
    public BarraDeNavegacion() {
        initComponents();
        senalaNivel1.setVisible(false);
        labelNivel1.setVisible(false);
        senalaNivel2.setVisible(false);
        labelNivel2.setVisible(false);
        senalaNivel3.setVisible(false);
        labelNivel3.setVisible(false);
    }

    // anadir el listener de un controlador para recibir los eventos
    public void setListener(ActionListener listener) {
        this.listener = listener;
    }

    // indicar un texto de la vista
    public void setTextLabelNivel1 (String text) {
        labelNivel1.setText(text);
        labelNivel1.setVisible(true);
        senalaNivel1.setVisible(true);
    }

    // indicar un texto del panel
    public void setTextLabelNivel2 (String text) {
        labelNivel2.setText(text);
        labelNivel2.setVisible(true);
        senalaNivel2.setVisible(true);
    }

    public void setTextLabelNivel3 (String text) {
        labelNivel3.setText(text);
        labelNivel3.setVisible(true);
        senalaNivel3.setVisible(true);
    }
    public String getTextLebelNivel2(){
        return labelNivel2.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navToMain = new javax.swing.JButton();
        senalaNivel1 = new javax.swing.JLabel();
        labelNivel1 = new javax.swing.JLabel();
        senalaNivel2 = new javax.swing.JLabel();
        labelNivel2 = new javax.swing.JLabel();
        senalaNivel3 = new javax.swing.JLabel();
        labelNivel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 50));
        setMinimumSize(new java.awt.Dimension(1000, 50));
        setPreferredSize(new java.awt.Dimension(1000, 50));

        navToMain.setForeground(new java.awt.Color(0, 0, 255));
        navToMain.setText("DIAKETAS");
        navToMain.setActionCommand("navToMainFromVoluntarios");
        navToMain.setBorderPainted(false);
        navToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navToMainActionPerformed(evt);
            }
        });

        senalaNivel1.setForeground(new java.awt.Color(153, 153, 153));
        senalaNivel1.setText(">");

        labelNivel1.setText("Voluntario");
        labelNivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNivel1MouseClicked(evt);
            }
        });

        senalaNivel2.setForeground(new java.awt.Color(153, 153, 153));
        senalaNivel2.setText(">");

        labelNivel2.setText("Colaboraciones");
        labelNivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNivel2MouseClicked(evt);
            }
        });

        senalaNivel3.setForeground(new java.awt.Color(153, 153, 153));
        senalaNivel3.setText(">");

        labelNivel3.setText("Añadir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(navToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senalaNivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNivel1)
                        .addGap(32, 32, 32)
                        .addComponent(senalaNivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNivel2)
                        .addGap(27, 27, 27)
                        .addComponent(senalaNivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNivel3)
                        .addGap(0, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senalaNivel1)
                    .addComponent(labelNivel1)
                    .addComponent(senalaNivel2)
                    .addComponent(labelNivel2)
                    .addComponent(senalaNivel3)
                    .addComponent(labelNivel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void navToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navToMainActionPerformed
        senalaNivel1.setVisible(false);
        labelNivel1.setVisible(false);
        senalaNivel2.setVisible(false);
        labelNivel2.setVisible(false);
        senalaNivel3.setVisible(false);
        labelNivel3.setVisible(false);

        // manda un event al controlador para cambiar de panel
        ActionEvent event = new ActionEvent(this, 0, TO_VISTA_INICIAL);
        listener.actionPerformed(event);
    }//GEN-LAST:event_navToMainActionPerformed

    private void labelNivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNivel1MouseClicked

        senalaNivel2.setVisible(false);
        labelNivel2.setVisible(false);
        senalaNivel3.setVisible(false);
        labelNivel3.setVisible(false);

        // manda un event al controlador para cambiar de panel
        ActionEvent event = new ActionEvent(this, 0, TO_NIVEL1);
        listener.actionPerformed(event);
    }//GEN-LAST:event_labelNivel1MouseClicked

    private void labelNivel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNivel2MouseClicked
        senalaNivel3.setVisible(false);
        labelNivel3.setVisible(false);

        // manda un event al controlador para cambiar de panel
        ActionEvent event = new ActionEvent(this, 0, TO_NIVEL2);
        listener.actionPerformed(event);
    }//GEN-LAST:event_labelNivel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNivel1;
    private javax.swing.JLabel labelNivel2;
    private javax.swing.JLabel labelNivel3;
    private javax.swing.JButton navToMain;
    private javax.swing.JLabel senalaNivel1;
    private javax.swing.JLabel senalaNivel2;
    private javax.swing.JLabel senalaNivel3;
    // End of variables declaration//GEN-END:variables
}
