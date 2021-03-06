/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Socio;

import java.awt.event.ActionListener;

/**
 *
 * @author Alberto
 */
public class PanelSocioInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelSocioInicio
     */
    public PanelSocioInicio() {
        initComponents();
    }
    public void anadirListenerbtBuscarSocio(ActionListener listener){
        btBuscarSocio.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevoSocio(ActionListener listener){
        btNuevoSocio.addActionListener(listener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevoSocio = new javax.swing.JButton();
        btBuscarSocio = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        btNuevoSocio.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevoSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/usu.png"))); // NOI18N
        btNuevoSocio.setText("Nuevo Socio");
        btNuevoSocio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevoSocio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btBuscarSocio.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btBuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lupa.png"))); // NOI18N
        btBuscarSocio.setText("BUSCAR");
        btBuscarSocio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscarSocio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btNuevoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(btBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscarSocio)
                    .addComponent(btNuevoSocio))
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarSocio;
    private javax.swing.JButton btNuevoSocio;
    // End of variables declaration//GEN-END:variables
}
