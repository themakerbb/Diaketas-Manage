/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Socio;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author Alberto
 */
public class PanelSocioBuscar extends javax.swing.JPanel {

    /**
     * Creates new form PanelSocioBuscar
     */
    public PanelSocioBuscar() {
        initComponents();
		labelError.setVisible(false);
		tableBuscarSocio.setBackground(Color.white);
		tableBuscarSocio.setForeground(Color.blue);
		cbBuscarSocio.setBackground(Color.white);
		cbBuscarSocio.setForeground(Color.black);
	}
	public void setTextLabelError (String text) {
		labelError.setText(text);
		labelError.setVisible(true);
	}

	public JButton getBtBuscarSocio(){
		return btBuscar;
	}
	
	public String getTipoBusquedaSocio(){
		return cbBuscarSocio.getSelectedItem().toString();
	}
	
	public String getValorBusquedaSocio(){
		return textBuscarSocio.getText();
	}
	public JTable getTablaBusqueda() {
        return tableBuscarSocio;
    }
	
	public JButton getBtConsultarSocio(){
		return btConsultar;
	}
	
	public JButton getBtEliminarSocio(){
		return btEliminar;
	}
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel81 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        cbBuscarSocio = new javax.swing.JComboBox();
        btConsultar = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableBuscarSocio = new javax.swing.JTable();
        textBuscarSocio = new javax.swing.JTextField();
        labelError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel81.setText("Buscar por:");

        btBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscar.png"))); // NOI18N
        btBuscar.setBorder(null);

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        cbBuscarSocio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI/NIF/Pasaporte", "Nombre", "Dirección", "Localidad", "Teléfono Fijo", "Movil", "Código Postal" }));
        cbBuscarSocio.setBorder(null);

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setBorder(null);

        tableBuscarSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Dirección", "Localidad", "Teléfono", "Movil", "Código Postal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane12.setViewportView(tableBuscarSocio);

        textBuscarSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textBuscarSocio.setSelectionColor(new java.awt.Color(102, 204, 255));

        labelError.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(373, 373, 373)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel81)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(102, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JComboBox cbBuscarSocio;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel labelError;
    private javax.swing.JTable tableBuscarSocio;
    private javax.swing.JTextField textBuscarSocio;
    // End of variables declaration//GEN-END:variables
}
