package Interfaces;

import Clases.Cliente;
import Clases.Pelicula;
import static Interfaces.Principal.listaPeliculas;
import static Interfaces.Principal.listaClientes;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar extends javax.swing.JFrame {

    //VARIABLES
    LinkedList listaOrdenadaT;
    LinkedList listaOrdenadaR;
    LinkedList listaOrdenadaG;
    LinkedList listaIndice;
    DefaultTableModel dtm, dtm2;
    Object[] o;
    Object[] p;

    //CONSTRUCTOR
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null); //DESPLIEGA LA INTERFAZ EN EL CENTRO DE LA PANTALLA
        this.listaOrdenadaT = new LinkedList();
        this.listaOrdenadaR = new LinkedList();
        this.listaOrdenadaG = new LinkedList();
        this.listaIndice = new LinkedList();
        dtm = (DefaultTableModel) jTablaPelicula.getModel();
        dtm2 = (DefaultTableModel) jTablaCliente.getModel();
        this.o = new Object[7];
        this.p = new Object[5];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCliente = new javax.swing.JTable();
        BotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonTitulo = new javax.swing.JButton();
        jButtonRating = new javax.swing.JButton();
        jButtonGenero = new javax.swing.JButton();
        jTextCampo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaPelicula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUSCAR");

        jTablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cédula", "ID Película Alquilada", "Fecha Alquiler/Devolución"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaCliente);

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PELÍCULAS");

        jButtonTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTitulo.setText("TÍTULO");
        jButtonTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTituloActionPerformed(evt);
            }
        });

        jButtonRating.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRating.setText("RATING");
        jButtonRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRatingActionPerformed(evt);
            }
        });

        jButtonGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGenero.setText("GÉNERO");
        jButtonGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeneroActionPerformed(evt);
            }
        });

        jTablaPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Género", "Descripción", "Precio", "Rating", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablaPelicula);
        if (jTablaPelicula.getColumnModel().getColumnCount() > 0) {
            jTablaPelicula.getColumnModel().getColumn(4).setHeaderValue("Rating");
            jTablaPelicula.getColumnModel().getColumn(5).setHeaderValue("Stock");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButtonTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextCampo)
                    .addComponent(jButtonRating, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonVolver)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRating)
                    .addComponent(jButtonTitulo)
                    .addComponent(jButtonGenero))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(BotonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON VOLVER
    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed

    //BOTON TITULO
    private void jButtonTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTituloActionPerformed

        if (!"".equals(jTextCampo.getText())) {

            if (!listaPeliculas.isEmpty()) {

                //METODO PARA ORDENAR LAS PELÍCULAS SEGÚN TITULO
                Pelicula[] arrayR = new Pelicula[listaPeliculas.size()];

                for (int i = 0; i < arrayR.length; i++) {

                    arrayR[i] = (Pelicula) listaPeliculas.get(i);
                }

                for (int i = 0; i < arrayR.length; i++) {

                    for (int j = 0; j < arrayR.length; j++) {

                        if (arrayR[i].getTitulo().compareToIgnoreCase(arrayR[j].getTitulo()) < 0) {

                            Pelicula temp = arrayR[i];
                            arrayR[i] = arrayR[j];
                            arrayR[j] = temp;
                        }
                    }
                }

                String t = jTextCampo.getText();
                int x = binariaRecurTitulo(arrayR, t, 0, arrayR.length);

                o[0] = arrayR[x].getTitulo();
                o[1] = arrayR[x].getGenero();
                o[2] = arrayR[x].getDescripcion();
                o[3] = arrayR[x].getPrecio();
                o[4] = arrayR[x].getRating();
                o[5] = arrayR[x].getStock();
                dtm.addRow(o);

                for (int i = 0; i < listaClientes.size(); i++) {

                    Cliente c = (Cliente) listaClientes.get(i);

                    if (c.getID() == arrayR[x].getIndice()) {

                        p[0] = c.getNombre();
                        p[1] = c.getCi();
                        p[2] = c.getID();
                        p[3] = c.getFecha();
                        dtm2.addRow(p);
                    }
                }

            } else {

                JOptionPane.showMessageDialog(null, "No hay ninguna película registrada");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todas las casillas de datos");
        }
    }//GEN-LAST:event_jButtonTituloActionPerformed

    //BOTON RATING
    private void jButtonRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRatingActionPerformed

        if (!"".equals(jTextCampo.getText())) {

            if (!listaPeliculas.isEmpty()) {

                //METODO PARA ORDENAR LAS PELÍCULAS SEGÚN TITULO
                Pelicula[] arrayR = new Pelicula[listaPeliculas.size()];

                for (int i = 0; i < arrayR.length; i++) {

                    arrayR[i] = (Pelicula) listaPeliculas.get(i);
                }

                for (int i = 0; i < arrayR.length; i++) {

                    for (int j = 0; j < arrayR.length; j++) {

                        if (arrayR[i].getTitulo().compareToIgnoreCase(arrayR[j].getTitulo()) < 0) {

                            Pelicula temp = arrayR[i];
                            arrayR[i] = arrayR[j];
                            arrayR[j] = temp;
                        }
                    }
                }

                int t = Integer.parseInt(jTextCampo.getText());
                int x = binariaRecurRating(arrayR, t, 0, arrayR.length);

                o[0] = arrayR[x].getTitulo();
                o[1] = arrayR[x].getGenero();
                o[2] = arrayR[x].getDescripcion();
                o[3] = arrayR[x].getPrecio();
                o[4] = arrayR[x].getRating();
                o[5] = arrayR[x].getStock();
                dtm.addRow(o);

                for (int i = 0; i < listaClientes.size(); i++) {

                    Cliente c = (Cliente) listaClientes.get(i);

                    if (c.getID() == arrayR[x].getIndice()) {

                        p[0] = c.getNombre();
                        p[1] = c.getCi();
                        p[2] = c.getID();
                        p[3] = c.getFecha();
                        dtm2.addRow(p);
                    }
                }

            } else {

                JOptionPane.showMessageDialog(null, "No hay ninguna película registrada");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todas las casillas de datos");
        }
    }//GEN-LAST:event_jButtonRatingActionPerformed

    //BOTON GENERO
    private void jButtonGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeneroActionPerformed

        if (!"".equals(jTextCampo.getText())) {

            if (!listaPeliculas.isEmpty()) {

                //METODO PARA ORDENAR LAS PELÍCULAS SEGÚN GÉNERO
                Pelicula[] arrayR = new Pelicula[listaPeliculas.size()];

                for (int i = 0; i < arrayR.length; i++) {

                    arrayR[i] = (Pelicula) listaPeliculas.get(i);
                }

                for (int i = 0; i < arrayR.length; i++) {

                    for (int j = 0; j < arrayR.length; j++) {

                        if (arrayR[i].getGenero().compareToIgnoreCase(arrayR[j].getGenero()) < 0) {

                            Pelicula temp = arrayR[i];
                            arrayR[i] = arrayR[j];
                            arrayR[j] = temp;
                        }
                    }
                }

                String t = jTextCampo.getText();
                int x = binariaRecurGenero(arrayR, t, 0, arrayR.length);

                o[0] = arrayR[x].getTitulo();
                o[1] = arrayR[x].getGenero();
                o[2] = arrayR[x].getDescripcion();
                o[3] = arrayR[x].getPrecio();
                o[4] = arrayR[x].getRating();
                o[5] = arrayR[x].getStock();
                dtm.addRow(o);

                for (int i = 0; i < listaClientes.size(); i++) {

                    Cliente c = (Cliente) listaClientes.get(i);

                    if (c.getID() == arrayR[x].getIndice()) {

                        p[0] = c.getNombre();
                        p[1] = c.getCi();
                        p[2] = c.getID();
                        p[3] = c.getFecha();
                        dtm2.addRow(p);
                    }
                }

            } else {

                JOptionPane.showMessageDialog(null, "No hay ninguna película registrada");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todas las casillas de datos");
        }
    }//GEN-LAST:event_jButtonGeneroActionPerformed

    //METODO DE BUSQUEDA BINARIA PARA LOS TÍTULOS
    public static int binariaRecurTitulo(Pelicula[] arreglo, String valor, int inf, int sup) {

        int mitad = (inf + sup) / 2;

        if ((inf >= sup) && (arreglo[inf].getTitulo() == null ? valor != null : !arreglo[inf].getTitulo().equals(valor))) {

            return -1;

        } else if (arreglo[mitad].getTitulo() == null ? valor == null : arreglo[mitad].getTitulo().equals(valor)) {

            return mitad;

        } else if (arreglo[mitad].getTitulo().compareToIgnoreCase(valor) < 0) {

            return binariaRecurTitulo(arreglo, valor, mitad + 1, sup);
        }

        return binariaRecurTitulo(arreglo, valor, inf, mitad - 1);
    }

    //METODO DE BUSQUEDA BINARIA PARA LOS GÉNEROS
    public static int binariaRecurGenero(Pelicula[] arreglo, String valor, int inf, int sup) {

        int mitad = (inf + sup) / 2;

        if ((inf >= sup) && (arreglo[inf].getGenero() == null ? valor != null : !arreglo[inf].getGenero().equals(valor))) {

            return -1;

        } else if (arreglo[mitad].getGenero() == null ? valor == null : arreglo[mitad].getGenero().equals(valor)) {

            return mitad;

        } else if (arreglo[mitad].getGenero().compareToIgnoreCase(valor) < 0) {

            return binariaRecurGenero(arreglo, valor, mitad + 1, sup);
        }

        return binariaRecurGenero(arreglo, valor, inf, mitad - 1);
    }

    //METODO DE BUSQUEDA BINARIA PARA LOS RATINGS
    public static int binariaRecurRating(Pelicula[] arreglo, int valor, int inf, int sup) {

        int mitad = (inf + sup) / 2;

        if ((inf >= sup) && (arreglo[inf].getRating() != valor)) {

            return -1;

        } else if (arreglo[mitad].getRating() == valor) {

            return mitad;

        } else if (valor > arreglo[mitad].getRating()) {

            return binariaRecurRating(arreglo, valor, mitad + 1, sup);
        }
        return binariaRecurRating(arreglo, valor, inf, mitad - 1);
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton jButtonGenero;
    private javax.swing.JButton jButtonRating;
    private javax.swing.JButton jButtonTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaCliente;
    private javax.swing.JTable jTablaPelicula;
    private javax.swing.JTextField jTextCampo;
    // End of variables declaration//GEN-END:variables
}
