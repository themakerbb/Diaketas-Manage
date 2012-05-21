/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Colaborador;

import java.awt.event.ActionListener;

/**
 *
 * @author Alberto
 */
public class PanelColaboradorInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelColaboradorInicio
     */
    public PanelColaboradorInicio() {
        initComponents();
    }

        
    public void anadirListenerbtBuscarColaborador(ActionListener listener){
        btBuscarColaborador.addActionListener(listener);
    }
    
    public void anadirListenerbtNuevoColaborador(ActionListener listener){
        btNuevoColaborador.addActionListener(listener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNuevoColaborador = new javax.swing.JButton();
        btBuscarColaborador = new javax.swing.JButton();

        btNuevoColaborador.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btNuevoColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/usu.png"))); // NOI18N
        btNuevoColaborador.setText("NUEVO COLABORADOR");
        btNuevoColaborador.setActionCommand("contabilidad");
        btNuevoColaborador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevoColaborador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btBuscarColaborador.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btBuscarColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lupa.png"))); // NOI18N
        btBuscarColaborador.setText("BUSCAR");
        btBuscarColaborador.setActionCommand("buscarVoluntario");
        btBuscarColaborador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscarColaborador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(btNuevoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                    .addComponent(btBuscarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btBuscarColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNuevoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(153, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarColaborador;
    private javax.swing.JButton btNuevoColaborador;
    // End of variables declaration//GEN-END:variables
}