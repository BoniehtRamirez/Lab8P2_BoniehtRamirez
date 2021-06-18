package lab8_bonieht;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Main extends javax.swing.JFrame {

    public Main() {       
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Crear = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_carroceria = new javax.swing.JComboBox<>();
        cb_motor = new javax.swing.JComboBox<>();
        cb_hibridacion = new javax.swing.JComboBox<>();
        sp_precio = new javax.swing.JSpinner();
        sp_ensamblaje = new javax.swing.JSpinner();
        sp_pasajeros = new javax.swing.JSpinner();
        sp_puertas = new javax.swing.JSpinner();
        tf_marca = new javax.swing.JTextField();
        tf_vin = new javax.swing.JTextField();
        tf_color = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Vehiculos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Filtros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        cb_categoria = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("VIN:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Puertas:");

        jLabel4.setText("Color:");

        jLabel5.setText("Tipo de Motor:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Hibridación:");

        jLabel8.setText("Cant. Max. Pasajeros:");

        jLabel9.setText("Ensamblaje:");

        jLabel10.setText("Carroceria:");

        cb_carroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedán", "Familiar", "Hatchback", "Fastback", "SUV" }));

        cb_motor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combustión", "Electrico" }));

        cb_hibridacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Microhíbrido", "Híbrido convencional", "Híbridoenchufable", "Eléctrico" }));

        sp_precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1000.0d));

        sp_ensamblaje.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_pasajeros.setModel(new javax.swing.SpinnerNumberModel(2, 2, null, 1));

        sp_puertas.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));

        jButton4.setText("Crear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel11.setText("segundos");

        jLabel12.setText("$");

        javax.swing.GroupLayout jd_CrearLayout = new javax.swing.GroupLayout(jd_Crear.getContentPane());
        jd_Crear.getContentPane().setLayout(jd_CrearLayout);
        jd_CrearLayout.setHorizontalGroup(
            jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp_ensamblaje)
                    .addComponent(sp_pasajeros)
                    .addComponent(sp_puertas)
                    .addGroup(jd_CrearLayout.createSequentialGroup()
                        .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_color, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_marca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_carroceria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_motor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_hibridacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp_precio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_vin, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(60, 60, 60))
        );
        jd_CrearLayout.setVerticalGroup(
            jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_puertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_hibridacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sp_ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jt_Vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VIN", "Marca", "Carroceria", "Puertas", "Color", "Motor", "Hibridacion", "Pasajeros", "Ensamblaje", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_Vehiculos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD", jPanel1);

        jt_Filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VIN", "Marca", "Carroceria", "Puertas", "Color", "Motor", "Hibridacion", "Pasajeros", "Ensamblaje", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_Filtros);

        jLabel13.setText("Categoría:");

        cb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Generalista", "Premium", "Deportivo" }));

        jButton5.setText("Filtrar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FiltroCategoría", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        long VIN;
        String marca, carroceria, color, tipoMotor, tipoHibridacion;
        int numeroPuertas, cantPasajeros, tiempoEnsamblaje;
        double precio;
        
        VIN = Long.parseLong(tf_vin.getText());
        marca = tf_marca.getText();
        carroceria = (String) cb_carroceria.getSelectedItem();
        color = tf_color.getText();
        tipoMotor = (String) cb_motor.getSelectedItem();
        tipoHibridacion = (String) cb_hibridacion.getSelectedItem();
        numeroPuertas = (int) sp_puertas.getValue();
        cantPasajeros = (int) sp_pasajeros.getValue();
        tiempoEnsamblaje = (int) sp_ensamblaje.getValue();
        precio = (double) sp_precio.getValue();
        
        vehiculos.add(new Vehiculo (VIN,marca,carroceria,color,tipoMotor,tipoHibridacion,numeroPuertas,cantPasajeros,tiempoEnsamblaje,precio));
        JOptionPane.showMessageDialog(jd_Crear, "Vehiculo creado!");
        
        actualizarTablaCRUD();
        
        jd_Crear.setVisible(false);
        
        tf_vin.setText("");
        tf_marca.setText("");
        cb_carroceria.setSelectedIndex(0);
        tf_color.setText("");
        cb_motor.setSelectedIndex(0);
        cb_hibridacion.setSelectedIndex(0);
        sp_puertas.setValue(2);
        sp_pasajeros.setValue(2);
        sp_ensamblaje.setValue(0);
        sp_precio.setValue(0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_Crear.pack();
        jd_Crear.setModal(true);
        jd_Crear.setLocationRelativeTo(this);
        jd_Crear.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(jt_Vehiculos.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún vehiculo.");
        } else {
            vehiculos.remove(jt_Vehiculos.getSelectedRow());
            actualizarTablaCRUD();
            JOptionPane.showMessageDialog(this, "Vehiculo eliminado!");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        vehiculos.clear();
        DefaultTableModel model = (DefaultTableModel) jt_Vehiculos.getModel();
        for (int i = 0; i < jt_Vehiculos.getRowCount(); i++) {
            long VIN;
            String marca, carroceria, color, tipoMotor, tipoHibridacion;
            int numeroPuertas, cantPasajeros, tiempoEnsamblaje;
            double precio;
            
            VIN = (long) model.getValueAt(i, 0);
            marca = (String) model.getValueAt(i, 1);
            carroceria = (String) model.getValueAt(i, 2);
            color = (String) model.getValueAt(0, 4);
            tipoMotor = (String) model.getValueAt(0, 5);
            tipoHibridacion = (String) model.getValueAt(i, 6);
            numeroPuertas = (int) model.getValueAt(i, 3);
            cantPasajeros = (int) model.getValueAt(i, 7);
            tiempoEnsamblaje = (int) model.getValueAt(i, 8);
            precio = (double) model.getValueAt(i, 9);
            
            vehiculos.add(new Vehiculo(VIN,marca,carroceria,color,tipoMotor,tipoHibridacion,numeroPuertas,cantPasajeros,tiempoEnsamblaje,precio));
        }
        
        actualizarTablaCRUD();
        JOptionPane.showMessageDialog(this, "Modificaciones hechas!");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(cb_categoria.getSelectedIndex()==0){
            TableRowSorter filtro = new TableRowSorter(jt_Filtros.getModel());
            List<RowFilter<Object,Object>> filters = new ArrayList<>(2);
            filters.add(RowFilter.regexFilter("SEAT", 1));
            filters.add(RowFilter.regexFilter("Skoda", 1));
            filtro.setRowFilter(RowFilter.orFilter(filters));           
            jt_Filtros.setRowSorter(filtro);
        } else if(cb_categoria.getSelectedIndex()==1){
            TableRowSorter filtro = new TableRowSorter(jt_Filtros.getModel());
            List<RowFilter<Object,Object>> filters = new ArrayList<>(2);
            filters.add(RowFilter.regexFilter("Audi", 1));
            filters.add(RowFilter.regexFilter("Volkswagen", 1));
            filters.add(RowFilter.regexFilter("Bentley", 1));
            filtro.setRowFilter(RowFilter.orFilter(filters));           
            jt_Filtros.setRowSorter(filtro);
        } else {
            TableRowSorter filtro = new TableRowSorter(jt_Filtros.getModel());
            List<RowFilter<Object,Object>> filters = new ArrayList<>(2);
            filters.add(RowFilter.regexFilter("Porsche", 1));
            filters.add(RowFilter.regexFilter("Lamborghini", 1));
            filters.add(RowFilter.regexFilter("Bugatti", 1));
            filtro.setRowFilter(RowFilter.orFilter(filters));
            jt_Filtros.setRowSorter(filtro);
        }
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_carroceria;
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JComboBox<String> cb_hibridacion;
    private javax.swing.JComboBox<String> cb_motor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_Crear;
    private javax.swing.JTable jt_Filtros;
    private javax.swing.JTable jt_Vehiculos;
    private javax.swing.JSpinner sp_ensamblaje;
    private javax.swing.JSpinner sp_pasajeros;
    private javax.swing.JSpinner sp_precio;
    private javax.swing.JSpinner sp_puertas;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_vin;
    // End of variables declaration//GEN-END:variables
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public void actualizarTablaCRUD(){
        DefaultTableModel model = (DefaultTableModel) jt_Vehiculos.getModel();
        int n = model.getRowCount();
        for (int i = 0; i < n; i++) {
            model.removeRow(0);
        }
        
        for (Vehiculo v : vehiculos) {
            Object[] row = {v.getVIN(),v.getMarca(),v.getCarroceria(),v.getNumeroPuertas(),v.getColor(),v.getTipoMotor(),v.getTipoHibridacion(),v.getCantPasajeros(),v.getTiempoEnsamblaje(),v.getPrecio()};
            model.addRow(row);
        }
        
        jt_Vehiculos.setModel(model);
        jt_Filtros.setModel(model);
    }
}