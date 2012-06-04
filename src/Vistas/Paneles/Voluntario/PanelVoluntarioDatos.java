/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Voluntario;

import Modelo.Voluntario;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author raphaelcolleau
 */
public class PanelVoluntarioDatos extends javax.swing.JPanel {

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form PanelVoluntarioDatos
     */
    public PanelVoluntarioDatos() {
        initComponents();

        labelError.setVisible(false);
    }

    public void nuevoVoluntario () {
        limpiarCampos();
        btBorrar.setVisible(true);
        btEliminar.setVisible(false);
        labelError.setVisible(false);
    }

    public void modificarVoluntario (Voluntario voluntario) {
        btBorrar.setVisible(false);
        btEliminar.setVisible(true);
        labelError.setVisible(false);
        textApellidos.setText(voluntario.getApellidos());
        textCP.setText(voluntario.getCP());
        textDomicilio.setText(voluntario.getDomicilio());
        textFechaNacimiento.setText(formatter.format(voluntario.getFechaDENacimiento()));
        textLocalidad.setText(voluntario.getLocalidad());
        textNIF.setText(voluntario.getNIF());
        textNombre.setText(voluntario.getNombre());
        textTelMovil.setText(voluntario.getTelefonoMovil());
        textTelFijo.setText(voluntario.getTelefonoFijo());
        textPassword.setText("");
    }

    public void setTextLabelError (String text) {
        labelError.setForeground(Color.red);
        labelError.setText(text);
        labelError.setVisible(true);
    }

    public void limpiarCampos () {
        labelError.setVisible(false);
        textApellidos.setText("");
        textCP.setText("");
        textDomicilio.setText("");
        textFechaNacimiento.setText("");
        textLocalidad.setText("");
        textNIF.setText("");
        textNombre.setText("");
        textTelMovil.setText("");
        textTelFijo.setText("");
        textPassword.setText("");
    }

    // getters de los campos

    public JButton getBtBorrar() {
        return btBorrar;
    }

    public JButton getBtGuardar() {
        return btGuardar;
    }

    public JButton getBtEliminar() {
        return btEliminar;
    }

    public JTextField getTextApellidos() {
        return textApellidos;
    }

    public JTextField getTextCP() {
        return textCP;
    }

    public JTextField getTextDomicilio() {
        return textDomicilio;
    }

    public JTextField getTextFechaNacimiento() {
        return textFechaNacimiento;
    }

    public JTextField getTextLocalidad() {
        return textLocalidad;
    }

    public JTextField getTextNIF() {
        return textNIF;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public JTextField getTextTelFijo() {
        return textTelFijo;
    }

    public JTextField getTextTelMovil() {
        return textTelMovil;
    }

    public JTextField getTextPassword() {
        return textPassword;
    }

    public JLabel getlApellidos() {
        return lApellidos;
    }

    public JLabel getlCP() {
        return lCP;
    }

    public JLabel getlDomicilio() {
        return lDomicilio;
    }

    public JLabel getlFechaNacimiento() {
        return lFechaNacimiento;
    }

    public JLabel getlLocalidad() {
        return lLocalidad;
    }

    public JLabel getlNIF() {
        return lNIF;
    }

    public JLabel getlNombre() {
        return lNombre;
    }

    public JLabel getlPassword() {
        return lPassword;
    }

    public JLabel getlTelFijo() {
        return lTelFijo;
    }

    public JLabel getlTelMovil() {
        return lTelMovil;
    }

    public void setColorLabels (Color c) {
        for (Component comp : this.getComponents()) {
            if (comp.getClass() == JLabel.class) {
                comp.setForeground(c);
            }
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

        lNombre = new javax.swing.JLabel();
        lNIF = new javax.swing.JLabel();
        lDomicilio = new javax.swing.JLabel();
        lLocalidad = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textNIF = new javax.swing.JTextField();
        textDomicilio = new javax.swing.JTextField();
        textLocalidad = new javax.swing.JTextField();
        lApellidos = new javax.swing.JLabel();
        lFechaNacimiento = new javax.swing.JLabel();
        lTelMovil = new javax.swing.JLabel();
        lCP = new javax.swing.JLabel();
        lTelFijo = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();
        textTelMovil = new javax.swing.JTextField();
        textCP = new javax.swing.JTextField();
        textTelFijo = new javax.swing.JTextField();
        textFechaNacimiento = new javax.swing.JFormattedTextField();
        btGuardar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();
        btEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        lNombre.setText("Nombre");

        lNIF.setText("NIF/DNI/Pasaporte");

        lDomicilio.setText("Domicilio");

        lLocalidad.setText("Localidad");

        lApellidos.setText("Apellidos");

        lFechaNacimiento.setText("Nacido el");

        lTelMovil.setText("Teléfono Movil");

        lCP.setText("Código Postal");

        lTelFijo.setText("Teléfono Fijo");

        textFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N
        btGuardar.setToolTipText("Guardar");
        btGuardar.setActionCommand("guardarDatosVoluntario");

        btBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/limpiar.png"))); // NOI18N
        btBorrar.setToolTipText("Limpiar los campos");
        btBorrar.setActionCommand("borrarDatosVoluntario");

        labelError.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setText("Error");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Datos Personales");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Datos de Acceso");

        lPassword.setText("Password");

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N
        btEliminar.setToolTipText("Eliminar el Voluntario");
        btEliminar.setActionCommand("borrarDatosVoluntario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDomicilio)
                            .addComponent(lLocalidad)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lNombre)
                                        .addComponent(lPassword))
                                    .addGap(98, 98, 98)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btGuardar)
                                            .addGap(40, 40, 40)
                                            .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                            .addComponent(btEliminar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btBorrar))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lNIF)
                                        .addComponent(lApellidos)
                                        .addComponent(lTelFijo))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textApellidos)
                                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                                .addComponent(textNIF, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textTelFijo, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lFechaNacimiento)
                                                .addComponent(lTelMovil)
                                                .addComponent(lCP))
                                            .addGap(42, 42, 42)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textCP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(textFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                                    .addComponent(textTelMovil, javax.swing.GroupLayout.Alignment.LEADING))))
                                        .addComponent(textDomicilio))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellidos)
                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFechaNacimiento)
                    .addComponent(textFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTelFijo)
                    .addComponent(lTelMovil)
                    .addComponent(textTelMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCP)
                    .addComponent(textLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPassword)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(labelError))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBorrar)
                            .addComponent(btGuardar)
                            .addComponent(btEliminar))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        btBorrar.getAccessibleContext().setAccessibleDescription("Borrar los campos\n");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lApellidos;
    private javax.swing.JLabel lCP;
    private javax.swing.JLabel lDomicilio;
    private javax.swing.JLabel lFechaNacimiento;
    private javax.swing.JLabel lLocalidad;
    private javax.swing.JLabel lNIF;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lTelFijo;
    private javax.swing.JLabel lTelMovil;
    private javax.swing.JLabel labelError;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textCP;
    private javax.swing.JTextField textDomicilio;
    private javax.swing.JFormattedTextField textFechaNacimiento;
    private javax.swing.JTextField textLocalidad;
    private javax.swing.JTextField textNIF;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textTelFijo;
    private javax.swing.JTextField textTelMovil;
    // End of variables declaration//GEN-END:variables
}
