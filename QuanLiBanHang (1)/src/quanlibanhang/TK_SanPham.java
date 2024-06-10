
package quanlibanhang;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public final class TK_SanPham extends javax.swing.JFrame {
    //xu li thoi gian 
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String times = time.format(formatter);
    public TK_SanPham() {
        initComponents();
        hiensanpham();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        buttonXoaSanPham = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        buttonSapHetHang = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonSapHetHan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonDaHetHan = new javax.swing.JButton();
        buttonTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mã Sản Phẩm: ");

        txtMaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonXoaSanPham.setBackground(new java.awt.Color(255, 0, 0));
        buttonXoaSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonXoaSanPham.setText("Xóa sản phẩm hoặc sp đã hết hạn");
        buttonXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaSanPhamActionPerformed(evt);
            }
        });

        tbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Số Lô", "Số Lượng", "Hạn Sử Dụng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSanPham);

        buttonSapHetHang.setBackground(new java.awt.Color(102, 102, 0));
        buttonSapHetHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonSapHetHang.setForeground(new java.awt.Color(51, 255, 204));
        buttonSapHetHang.setText("Hiển thị hàng hóa sắp hết hàng");
        buttonSapHetHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSapHetHangActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(255, 51, 51));
        buttonExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonSapHetHan.setBackground(new java.awt.Color(102, 255, 102));
        buttonSapHetHan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonSapHetHan.setForeground(new java.awt.Color(102, 153, 255));
        buttonSapHetHan.setText("Hiển thị sản phẩm sắp hết hạn");
        buttonSapHetHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSapHetHanActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thống Kê Sản Phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sp", "Số Lô", "Số lượng", "Hạn sd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        buttonDaHetHan.setBackground(new java.awt.Color(204, 0, 0));
        buttonDaHetHan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDaHetHan.setForeground(new java.awt.Color(51, 255, 204));
        buttonDaHetHan.setText("Hiển thị sản phẩm đã hết hạn");
        buttonDaHetHan.setToolTipText("hạn");
        buttonDaHetHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDaHetHanActionPerformed(evt);
            }
        });

        buttonTimKiem.setBackground(new java.awt.Color(185, 235, 248));
        buttonTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonTimKiem.setText("Tìm Kiếm");
        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonXoaSanPham)
                                .addGap(18, 18, 18)
                                .addComponent(buttonExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonTimKiem)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonSapHetHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonSapHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(buttonDaHetHan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSapHetHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSapHetHan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDaHetHan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimKiem)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonExit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonXoaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void hiensanpham(){
        Connection con ;
        Statement stmt;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql ="select sanphamhienco.maSanPham ,sanphamhienco.soLo ,sanphamhienco.soLuong ,nhaphang.hanSuDung from sanphamhienco join nhaphang on sanphamhienco.maSanPham = nhaphang.maSanPham and sanphamhienco.soLo = nhaphang.soLo";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                rs.getString("maSanPham"),
                rs.getString("soLo"),
                rs.getInt("soLuong"),
                rs.getString("hanSuDung")
                });
            }
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TK_SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        JFThongKe jf = new JFThongKe();
        jf.show();
        dispose();
    }//GEN-LAST:event_buttonExitActionPerformed
    private void buttonSapHetHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSapHetHangActionPerformed
        // TODO add your handling code here:\\
        Connection con ;
        Statement stmt;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        for (int i = tbSanPham.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select bangmoi.maSanPham , bangmoi.soLo , bangmoi.soLuong ,bangmoi.hanSuDung from(select sanphamhienco.maSanPham ,sanphamhienco.soLuong,sanphamhienco.soLo ,nhaphang.hanSuDung from sanphamhienco Join nhaphang on sanphamhienco.maSanPham = nhaphang.maSanPham and sanphamhienco.soLo = nhaphang.soLo)as bangmoi where bangmoi.soLuong < 10";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                rs.getString("maSanPham"),
                rs.getString("soLo"),
                rs.getInt("soLuong"),
                rs.getString("hanSuDung")
                });
            }
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TK_SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSapHetHangActionPerformed

    private void buttonSapHetHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSapHetHanActionPerformed
        // TODO add your handling code here:
        Connection con ;
        Statement stmt;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        
        for (int i =tbSanPham.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from(select nhaphang.maSanPham , nhaphang.soLo ,sanphamhienco.soLuong ,nhaphang.hanSuDung from nhaphang join sanphamhienco on nhaphang.maSanPham = sanphamhienco.maSanPham and nhaphang.soLo = sanphamhienco.soLo) as bangmoi where bangmoi.hanSuDung between '"+times+"' and adddate(str_to_date('"+times+"','%Y-%m-%d'),interval 10 day)";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {                
                model.addRow(new Object[]{
                rs.getString("maSanPham"),
                rs.getString("soLo"),
                rs.getInt("soLuong"),
                rs.getString("hanSuDung")
                });
            }
            con.close();
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(TK_SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSapHetHanActionPerformed

    private void buttonXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaSanPhamActionPerformed
        Connection con ;
        PreparedStatement stmt = null ;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        
        int rowSelect = tbSanPham.getSelectedRow();
        
        if (rowSelect != -1) {
            String getMaSanPham = (String) model.getValueAt(rowSelect, 0);
            String getSoLo = (String) model.getValueAt(rowSelect, 1);
            model.removeRow(rowSelect);
            try {
            con = DBConnect.getConnection();
            String sql ="delete from sanphamhienco where maSanPham ='"+getMaSanPham+"' and soLo ='"+getSoLo+"';";
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            con.close();
            stmt.close();
            JOptionPane.showMessageDialog(rootPane, "Thành công.");
        } catch (SQLException ex) {
            Logger.getLogger(TK_SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn mục muốn thực hiện!");
        }
        
    }//GEN-LAST:event_buttonXoaSanPhamActionPerformed

    private void buttonDaHetHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDaHetHanActionPerformed
        Connection con ;
        Statement stmt ;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        
        for (int i =tbSanPham.getRowCount() -1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql ="select * from(select nhaphang.maSanPham , nhaphang.soLo ,sanphamhienco.soLuong ,nhaphang.hanSuDung from nhaphang join sanphamhienco on nhaphang.maSanPham = sanphamhienco.maSanPham and nhaphang.soLo = sanphamhienco.soLo) as bangmoi where bangmoi.hanSuDung < '"+times+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                rs.getString("maSanPham"),
                rs.getString("soLo"),
                rs.getInt("soLuong"),
                rs.getString("hanSuDung")
                });
            }
            con.close();
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TK_SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDaHetHanActionPerformed

    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed
      DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
        DefaultTableModel model2 =(DefaultTableModel) table.getModel();
        for (int i = tbSanPham.getRowCount() -1; i >= 0; i--) {
            if (txtMaSanPham.getText().equals(model.getValueAt(i,0))) {
                model2.addRow(new Object[]{
                model.getValueAt(i, 0),
                model.getValueAt(i, 1),
                model.getValueAt(i, 2),
                model.getValueAt(i, 3),
                });
            }
        }
        
    }//GEN-LAST:event_buttonTimKiemActionPerformed
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
            java.util.logging.Logger.getLogger(TK_SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TK_SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TK_SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TK_SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TK_SanPham().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDaHetHan;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSapHetHan;
    private javax.swing.JButton buttonSapHetHang;
    private javax.swing.JButton buttonTimKiem;
    private javax.swing.JButton buttonXoaSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtMaSanPham;
    // End of variables declaration//GEN-END:variables
}
