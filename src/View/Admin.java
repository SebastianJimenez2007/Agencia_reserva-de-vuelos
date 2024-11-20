package View;

import Model.AdminDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import Model.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;


public class Admin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        BarraPrincipal = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        movimientoDeLaPagina = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btnagregarvielo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Origin = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        destino = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        fechaida = new com.toedter.calendar.JDateChooser();
        fechregreso = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeroasientos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        horallegada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        horaida = new javax.swing.JTextField();
        jp2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        fecha_ida1 = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jp3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        origenn = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        fecha_ida2 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraPrincipal.setBackground(new java.awt.Color(54, 90, 108));
        BarraPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOESAVIANCA");
        BarraPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 100, 20));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setText(" Return");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        BarraPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo h final.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        BarraPrincipal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 720, 40));

        panel.add(BarraPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        movimientoDeLaPagina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movimientoDeLaPaginaMouseDragged(evt);
            }
        });
        movimientoDeLaPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movimientoDeLaPaginaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movimientoDeLaPaginaLayout = new javax.swing.GroupLayout(movimientoDeLaPagina);
        movimientoDeLaPagina.setLayout(movimientoDeLaPaginaLayout);
        movimientoDeLaPaginaLayout.setHorizontalGroup(
            movimientoDeLaPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        movimientoDeLaPaginaLayout.setVerticalGroup(
            movimientoDeLaPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panel.add(movimientoDeLaPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        jPanel1.setBackground(new java.awt.Color(38, 75, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(54, 90, 108));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Add");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tab1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, 60));

        tab2.setBackground(new java.awt.Color(54, 90, 108));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modify");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 60));

        tab3.setBackground(new java.awt.Color(54, 90, 108));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliminate");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 60));

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 470));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 10));
        jp1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 680, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("Add Flights");
        jp1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 190, 50));

        btnagregarvielo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnagregarvielo.setText("Add");
        btnagregarvielo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregarvielo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarvieloMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnagregarvieloMousePressed(evt);
            }
        });
        btnagregarvielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarvieloActionPerformed(evt);
            }
        });
        jp1.add(btnagregarvielo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 100, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Origin");
        jp1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, -1));

        Origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cartagena", "Medellin", " " }));
        Origin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginActionPerformed(evt);
            }
        });
        jp1.add(Origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Destination");
        jp1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cartagena", "Medellin" }));
        destino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp1.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText(" Departure date");
        jp1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 20));
        jp1.add(fechaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, 30));

        fechregreso.setMinSelectableDate(new java.util.Date(-62135747891000L));
        fechregreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechregresoPropertyChange(evt);
            }
        });
        jp1.add(fechregreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Entry date");
        jp1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Seats available");
        jp1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 110, 20));

        numeroasientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10  ", "11  ", "12  ", "13  ", "14  ", "15  ", "16  ", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26  ", "27  ", "28  ", "29  ", "30  ", "31  ", "32  ", "33  ", "34  ", "35  ", "36  ", "37  ", "38  ", "39  ", "40  ", "41  ", "42  ", "43  ", "44  ", "45  ", "46  ", "47  ", "48  ", "49  ", "50  ", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        numeroasientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp1.add(numeroasientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, -1));

        jLabel7.setText("hora llegada. format 00:00:00");
        jp1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, 30));
        jp1.add(horallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 150, 30));

        jLabel8.setText("hora ida. format  00:00:00");
        jp1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        jp1.add(horaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 30));

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 680, 10));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Origin", "Destination", "Entry date", " Departure date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jp2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 670, 180));
        jp2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 10));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel18.setText(" Flights");
        jp2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 190, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Origin");
        jp2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "cartagena", " " }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jp2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("Destination");
        jp2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cartagena" }));
        jComboBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText(" Departure date");
        jp2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 20));
        jp2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        fecha_ida1.setMinSelectableDate(new java.util.Date(-62135747891000L));
        fecha_ida1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_ida1PropertyChange(evt);
            }
        });
        jp2.add(fecha_ida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel22.setText("Entry date");
        jp2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jButton2.setText("Modify");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 30));

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 10));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel23.setText(" Flights");
        jp3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 190, 50));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel24.setText("Origin");
        jp3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, -1));

        origenn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "cartagena", " " }));
        origenn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        origenn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origennActionPerformed(evt);
            }
        });
        jp3.add(origenn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel25.setText("Destination");
        jp3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Cartagena" }));
        jComboBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp3.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText(" Departure date");
        jp3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 20));
        jp3.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        fecha_ida2.setMinSelectableDate(new java.util.Date(-62135747891000L));
        fecha_ida2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_ida2PropertyChange(evt);
            }
        });
        jp3.add(fecha_ida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 120, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("Entry date");
        jp3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Origin", "Destination", "Entry date", " Departure date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jp3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 670, 170));

        jButton4.setText("Eliminate");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jp3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 680, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void movimientoDeLaPaginaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientoDeLaPaginaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movimientoDeLaPaginaMousePressed

    private void movimientoDeLaPaginaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientoDeLaPaginaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movimientoDeLaPaginaMouseDragged

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
    jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
        tab1.setBackground(Color.gray);
        tab2.setBackground(new Color (38,75,100));
         tab3.setBackground(new Color (38,75,100));

    }//GEN-LAST:event_tab1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jp1.setVisible(false);
        jp2.setVisible(true);
        jp3.setVisible(false);
         tab2.setBackground(Color.gray);
        tab1.setBackground(new Color (38,75,100));
         tab3.setBackground(new Color (38,75,100));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(true);
         tab3.setBackground(Color.gray);
        tab2.setBackground(new Color (38,75,100));
         tab1.setBackground(new Color (38,75,100));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void OriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OriginActionPerformed

    private void fechregresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechregresoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fechregresoPropertyChange

    private void btnagregarvieloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarvieloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarvieloMouseClicked

    private void btnagregarvieloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarvieloMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarvieloMousePressed

    private void btnagregarvieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarvieloActionPerformed
     String Org = (String) Origin.getSelectedItem();
    String Dstino = (String) destino.getSelectedItem();
    java.util.Date fechadIda = fechaida.getDate();
    java.util.Date fechaVuelta = fechregreso.getDate();
    String asientos = (String) numeroasientos.getSelectedItem();
    
    if (asientos != null && !asientos.trim().isEmpty()) {
        try {
            int asientosInt = Integer.parseInt(asientos.trim()); // Elimina los espacios antes de convertir
        // Ahora puedes usar asientosInt en tu consulta
        }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El número de asientos no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Por favor, seleccione el número de asientos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
}
    String h_ida = horaida.getText();
    String h_llegada = horallegada.getText();
    
    if (Org.equals("-------") || Dstino.equals("-------") || fechadIda == null || fechaVuelta == null || asientos.equals(" ")) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione todos los campos requeridos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        // Convertir las fechas de java.util.Date a java.sql.Date
        java.sql.Date sqlFechaIda = new java.sql.Date(fechadIda.getTime());
        java.sql.Date sqlFechaVuelta = new java.sql.Date(fechaVuelta.getTime());

        // Obtener la conexión a la base de datos
        try (Connection connection = ConexionDB.conectar()) {
            // Crear una instancia de AdminDAO con la conexión
            AdminDAO adminDAO = new AdminDAO(connection);

            // Llamar al método para agregar el vuelo
            boolean vueloAgregado = adminDAO.agregarVuelo(Org, Dstino, sqlFechaIda, sqlFechaVuelta, Integer.parseInt(asientos), h_ida, h_llegada);

            // Verificar si el vuelo fue agregado exitosamente
            if (vueloAgregado) {
                JOptionPane.showMessageDialog(this, "Vuelo agregado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al agregar el vuelo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
} 
    }//GEN-LAST:event_btnagregarvieloActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void fecha_ida1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_ida1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_ida1PropertyChange

    private void origennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origennActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origennActionPerformed

    private void fecha_ida2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_ida2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_ida2PropertyChange

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraPrincipal;
    private javax.swing.JComboBox<String> Origin;
    private javax.swing.JButton btnagregarvielo;
    private javax.swing.JComboBox<String> destino;
    private com.toedter.calendar.JDateChooser fecha_ida1;
    private com.toedter.calendar.JDateChooser fecha_ida2;
    private com.toedter.calendar.JDateChooser fechaida;
    private com.toedter.calendar.JDateChooser fechregreso;
    private javax.swing.JTextField horaida;
    private javax.swing.JTextField horallegada;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel movimientoDeLaPagina;
    private javax.swing.JComboBox<String> numeroasientos;
    private javax.swing.JComboBox<String> origenn;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    // End of variables declaration//GEN-END:variables

}
