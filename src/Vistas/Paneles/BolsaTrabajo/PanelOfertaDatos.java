
package Vistas.Paneles.BolsaTrabajo;

import javax.swing.*;

public class PanelOfertaDatos extends javax.swing.JPanel {

	/**
		* Creates new form PanelBeneficiarioBuscar
		*/
	public PanelOfertaDatos() {
		initComponents();
	}

	/* Botones del panel */
	public JButton getBTGuardarSector(){
		return BTGuardarSector;
	}

	public JButton getBTEliminarSector(){
		return BTEliminarSector;
	}

	public JButton getBTGuardar(){
		return BTGuardar;
	}

	public JButton getBTLimpiar(){
        return BTLimpiar;
    }

	public JButton getBTModificar(){
		return BTModificar;
	}

	public JButton getBTGuardarCambios(){
		return BTGuardarCambios;
	}

	public JButton getBTEliminar(){
		return BTEliminar;
	}

	/* Campos del panel */
	public String getTextoCIF(){
		return textCIF.getText();
	}
	public JTextField getTextCIF(){
		return textCIF;
	}
	public void setTextoCIF(String texto){
		textCIF.setText(texto);
	}

	public String getTextoSector(){
		return cbSector.getSelectedItem().toString();
	}
	public JComboBox getcbSector(){
		return cbSector;
	}
	public void setTextoSector(String texto){
		cbSector.setSelectedItem(texto);
	}

	public String getTextoNuevoSector(){
		return textNuevoSector.getText();
	}
	public JTextField getTextNuevoSector(){
		return textNuevoSector;
	}
	public void setTextoNuevoSector(String texto){
		textNuevoSector.setText(texto);
	}

	public String getTextoDescripcionOferta(){
		return taDescripcionOferta.getText();
	}
	public JTextArea gettaDescripcionOferta(){
		return taDescripcionOferta;
	}
	public void setTextoDescripcionOferta(String texto){
		taDescripcionOferta.setText(texto);
	}

	public String getTextoNPuestos(){
		return textNPuestos.getText();
	}
	public JTextField gettextNPuestos(){
		return textNPuestos;
	}
	public void setTextoNPuestos(String texto){
		textNPuestos.setText(texto);
	}

	public String getTextoTipoContrato(){
		return cbTipoContrato.getSelectedItem().toString();
	}
	public JComboBox getcbTipoContrato(){
		return cbTipoContrato;
	}
	public void getTextoTipoContrato(String texto){
		cbTipoContrato.setSelectedItem(texto);
	}

	public String getTextoDuracionContrato(){
		return textDuracionContrato.getText();
	}
	public JTextField gettextDuracionContrato(){
		return textDuracionContrato;
	}
	public void setTextoDuracionContrato(String texto){
		textDuracionContrato.setText(texto);
	}

	public String getTextoCualificacion(){
		return taCualificacion.getText();
	}
	public JTextArea gettaCualificacion(){
		return taCualificacion;
	}
	public void setTextoCualificacion(String texto){
        taCualificacion.setText(texto);
    }

	public JLabel getMensajeError(){
		return labelError;
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDescripcionOferta = new javax.swing.JLabel();
        labelNPuestos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcionOferta = new javax.swing.JTextArea();
        labelTipoContrato = new javax.swing.JLabel();
        labelDuracionContrato = new javax.swing.JLabel();
        textNPuestos = new javax.swing.JTextField();
        cbTipoContrato = new javax.swing.JComboBox();
        labelMeses = new javax.swing.JLabel();
        textDuracionContrato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelCIF = new javax.swing.JLabel();
        labelSector = new javax.swing.JLabel();
        textCIF = new javax.swing.JTextField();
        BTEliminarSector = new javax.swing.JButton();
        textNuevoSector = new javax.swing.JTextField();
        BTGuardarSector = new javax.swing.JButton();
        cbSector = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCualificacion = new javax.swing.JTextArea();
        BTGuardar = new javax.swing.JButton();
        BTLimpiar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTGuardarCambios = new javax.swing.JButton();
        BTEliminar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelDescripcionOferta.setText("Descripcion del puesto ofertado");

        labelNPuestos.setText("Nº de puestos");

        taDescripcionOferta.setColumns(20);
        taDescripcionOferta.setRows(5);
        taDescripcionOferta.setText("Descripción completa del puesto de trabajo");
        taDescripcionOferta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane1.setViewportView(taDescripcionOferta);

        labelTipoContrato.setText("Tipo de contrato");

        labelDuracionContrato.setText("Duracion de contrato");

        textNPuestos.setText("Numero");

        cbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fijo", "Temporal" }));

        labelMeses.setText("Meses");

        textDuracionContrato.setText("12");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(labelDescripcionOferta)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(labelNPuestos)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(textNPuestos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(53, 53, 53)
                                .add(labelTipoContrato)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(cbTipoContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(39, 39, 39)
                                .add(labelDuracionContrato)
                                .add(18, 18, 18)
                                .add(textDuracionContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(labelMeses)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(labelDescripcionOferta)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelNPuestos)
                    .add(labelTipoContrato)
                    .add(labelDuracionContrato)
                    .add(textNPuestos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbTipoContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelMeses)
                    .add(textDuracionContrato, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCIF.setText("CIF");

        labelSector.setText("Sector");

        textCIF.setText("CIF/ NIF");

        BTEliminarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        textNuevoSector.setText("Nuevo Sector");

        BTGuardarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(labelCIF)
                .add(18, 18, 18)
                .add(textCIF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(76, 76, 76)
                .add(labelSector)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(BTEliminarSector)
                .add(68, 68, 68)
                .add(textNuevoSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(BTGuardarSector)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(BTGuardarSector)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(21, 21, 21)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(textCIF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(labelCIF)
                                .add(labelSector)
                                .add(cbSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .add(BTEliminarSector))
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(21, 21, 21)
                            .add(textNuevoSector, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel68.setForeground(java.awt.Color.red);
        jLabel68.setText("Datos Empresa");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setForeground(java.awt.Color.red);
        jLabel69.setText("Datos Oferta");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setForeground(java.awt.Color.red);
        jLabel71.setText("Cualificacion Requerida");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taCualificacion.setColumns(20);
        taCualificacion.setRows(5);
        taCualificacion.setText("Descripción completa de la cualificacion necesria");
        taCualificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane2.setViewportView(taCualificacion);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        BTLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/limpiar.png"))); // NOI18N
        BTLimpiar.setMaximumSize(new java.awt.Dimension(65, 41));
        BTLimpiar.setMinimumSize(new java.awt.Dimension(65, 41));
        BTLimpiar.setPreferredSize(new java.awt.Dimension(65, 41));

        BTModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        BTGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        BTEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        labelError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setText("Error");
        labelError.setToolTipText("");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(BTGuardar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BTModificar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BTGuardarCambios)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BTLimpiar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BTEliminar)
                        .add(309, 309, 309))))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(jLabel71))
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(jLabel69))
                    .add(layout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(jLabel68))
                    .add(layout.createSequentialGroup()
                        .add(358, 358, 358)
                        .add(labelError, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 309, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel68)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel69)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel71)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(labelError)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(BTGuardar)
                    .add(BTEliminar)
                    .add(BTGuardarCambios)
                    .add(BTLimpiar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(BTModificar))
                .add(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTEliminarSector;
    private javax.swing.JButton BTGuardar;
    private javax.swing.JButton BTGuardarCambios;
    private javax.swing.JButton BTGuardarSector;
    private javax.swing.JButton BTLimpiar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JComboBox cbSector;
    private javax.swing.JComboBox cbTipoContrato;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCIF;
    private javax.swing.JLabel labelDescripcionOferta;
    private javax.swing.JLabel labelDuracionContrato;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelMeses;
    private javax.swing.JLabel labelNPuestos;
    private javax.swing.JLabel labelSector;
    private javax.swing.JLabel labelTipoContrato;
    private javax.swing.JTextArea taCualificacion;
    private javax.swing.JTextArea taDescripcionOferta;
    private javax.swing.JTextField textCIF;
    private javax.swing.JTextField textDuracionContrato;
    private javax.swing.JTextField textNPuestos;
    private javax.swing.JTextField textNuevoSector;
    // End of variables declaration//GEN-END:variables
}
