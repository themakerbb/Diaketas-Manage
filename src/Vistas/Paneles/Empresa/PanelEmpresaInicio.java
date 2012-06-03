/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Empresa;

import java.awt.event.ActionListener;

/**
 *
 * @author Alberto
 */
public class PanelEmpresaInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelEmpresaInicio
     */
    public PanelEmpresaInicio() {
        initComponents();
    }
    
    public void anadirListenerbtBuscarEmpresa(ActionListener listener){
        btBuscarEmpresa.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevaEmpresa(ActionListener listener){
        btNuevaEmpresa.addActionListener(listener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevaEmpresa = new javax.swing.JButton();
        btBuscarEmpresa = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btNuevaEmpresa.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevaEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/usu.png"))); // NOI18N
        btNuevaEmpresa.setText("NUEVA EMPRESA");
        btNuevaEmpresa.setActionCommand("contabilidad");
        btNuevaEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevaEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btBuscarEmpresa.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btBuscarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lupa.png"))); // NOI18N
        btBuscarEmpresa.setText("BUSCAR");
        btBuscarEmpresa.setActionCommand("buscarVoluntario");
        btBuscarEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscarEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btNuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(btBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNuevaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEmpresa;
    private javax.swing.JButton btNuevaEmpresa;
    // End of variables declaration//GEN-END:variables
}
