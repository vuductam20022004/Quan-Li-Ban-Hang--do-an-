
package quanlibanhang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
public class JFSuaDonHang extends javax.swing.JFrame {

    //xử lí thời gian.
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String thoiGian = time.format(formatter);
    public JFSuaDonHang() {
        initComponents();
        
    }
     public void addSanPham(String maSp ,String lo, String soLuong){
        Connection conn ;
        String traVeTenSanPham = null;
        String traVeDonGia = null;
        double thanhTien = 0;
        try {
            conn = DBConnect.getConnection();
            Statement stmt = conn.createStatement();
            String sql ="SELECT * FROM quanlisanpham WHERE maSanPham ='"+maSp +"'";
            
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {                
                traVeTenSanPham = rs.getString("tenSanPham");
                traVeDonGia = rs.getString("donGia");
                thanhTien = (Double.parseDouble(traVeDonGia)) * (Double.parseDouble(soLuong));
            }
            conn.close();
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
                Logger.getLogger(JFTaoDonHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        model.addRow(new Object[]{txtMaDonHang.getText() ,maSp,lo,traVeTenSanPham, soLuong ,traVeDonGia , thanhTien});

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaDonHang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        txtLoSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonXoa = new javax.swing.JButton();
        buttonChinhSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buttonUPDATE = new javax.swing.JButton();
        txtTongTien = new javax.swing.JTextField();
        buttonOK = new javax.swing.JButton();
        buttonTim = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã đơn hàng:");

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn hàng", "Mã sản phẩm", "Số lô", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSanPham);

        jLabel2.setText("Mã sản phẩm:");

        txtLoSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoSanPhamActionPerformed(evt);
            }
        });

        jLabel3.setText("Số lô:");

        jLabel4.setText("Số lượng:");

        buttonXoa.setBackground(new java.awt.Color(51, 255, 0));
        buttonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonXoa.setText("Xóa");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        buttonChinhSua.setBackground(new java.awt.Color(255, 255, 0));
        buttonChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonChinhSua.setText("Chỉnh lại");
        buttonChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChinhSuaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("TỔNG TIỀN:");

        buttonUPDATE.setBackground(new java.awt.Color(0, 255, 204));
        buttonUPDATE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUPDATE.setText("UPDATE");
        buttonUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUPDATEActionPerformed(evt);
            }
        });

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTongTien.setText("..................");
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        buttonOK.setBackground(new java.awt.Color(0, 255, 0));
        buttonOK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonTim.setBackground(new java.awt.Color(204, 255, 204));
        buttonTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTim.setForeground(new java.awt.Color(255, 0, 51));
        buttonTim.setText("Tìm");
        buttonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(255, 51, 0));
        buttonExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("EXIT");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(buttonChinhSua)
                                        .addGap(0, 37, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(txtMaSanPham)
                                        .addComponent(txtLoSanPham)
                                        .addComponent(txtSoLuong))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonTim)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonExit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonUPDATE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(108, 108, 108)
                                        .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(88, 88, 88)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTim)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSanPham))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoSanPham))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOK))
                        .addGap(18, 18, 18)
                        .addComponent(buttonUPDATE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(buttonExit)
                        .addGap(93, 93, 93))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        // TODO add your handling code here:
        int rowSelect = tbSanPham.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        if (rowSelect != -1) {
            model.removeRow(rowSelect);
            txtMaSanPham.setText("");
            txtLoSanPham.setText("");
            txtSoLuong.setText("");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn mục muốn thực hiện!");
        }
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void txtLoSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoSanPhamActionPerformed

    private void buttonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimActionPerformed
        // TODO add your handling code here:
        Connection con ;
        Statement stmt;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        //xoa bang
        for (int i = tbSanPham.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        txtMaSanPham.setText("");
        txtLoSanPham.setText("");
        txtSoLuong.setText("");
        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select *  from quanlidonhang join chitietdonhang on quanlidonhang.maDonHang = chitietdonhang.maDonHang where quanlidonhang.maDonHang ='"+txtMaDonHang.getText()+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("maDonHang"),
                rs.getString("maSanPham"),
                rs.getString("soLo"),
                rs.getString("tenSanPham"),
                rs.getInt("soLuong"),
                rs.getObject("donGia"),
                rs.getObject("thanhTien"),
                });
            }
            con.close();
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
                Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTimActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();
        int rowSelect = tbSanPham.getSelectedRow();
        txtMaSanPham.setText((String) model.getValueAt(rowSelect,1));
        txtLoSanPham.setText((String) model.getValueAt(rowSelect,2));
        txtSoLuong.setText((String) model.getValueAt(rowSelect,4).toString());

    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void buttonChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChinhSuaActionPerformed
        // TODO add your handling code here:
        buttonChinhSua.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                int rowSelect = tbSanPham.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
           
                if (rowSelect != -1) {
                    model.removeRow(rowSelect);
                    String maSp = txtMaSanPham.getText();
                    String soLuong = txtSoLuong.getText();
                    String lo = txtLoSanPham.getText();
                    Statement stmt ;
                    String idSanPhamCheck = null;
                    Connection conn ;

                    //check 3 dữ liệu nhập vào bị thiếu.
                    if(maSp.equals("") || soLuong.equals("") || lo.equals("")){

                        JOptionPane.showMessageDialog(rootPane, "lỗi thiếu dữ liệu!");
                        return ;
                    }else{
                        try {
                            conn =DBConnect.getConnection();
                            stmt = conn.createStatement();
                            //viet cau lenh sql
                            String sql ="SELECT * FROM nhaphang WHERE maSanPham ='"+txtMaSanPham.getText() +"' AND soLo ='"+txtLoSanPham.getText()+"'";
                            //xử lí kết quả trả về/.
                            ResultSet rs = stmt.executeQuery(sql);
                            while (rs.next()) {                    
                                idSanPhamCheck = rs.getString("maSanPham");
                            }
                            //đóng các hoạt động kết nối với mysql.
                            rs.close();
                            conn.close();
                            stmt.close();
                            if (maSp.equals(idSanPhamCheck)) {
                                addSanPham(maSp, lo, soLuong);
                            }else{
                                JOptionPane.showMessageDialog(rootPane, "lỗi sai mã sản phẩm hoặc số lô!");
                                return ;
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(JFTaoDonHang.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    txtMaSanPham.setText(null);
                    txtSoLuong.setText(null);
                    txtLoSanPham.setText(null);
                    buttonChinhSua.removeActionListener(this);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn mục muốn thực hiện!");
                    buttonChinhSua.removeActionListener(this);
                }
            }
        });
    }//GEN-LAST:event_buttonChinhSuaActionPerformed
    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        // TODO add your handling code here:
        int countRow = tbSanPham.getRowCount();
        int countColSoLuong = 4;
        int countcolDonGia =5;
        double tong = 0;
        for (int i = 0; i < countRow; i++) {
            double soLuong = Double.parseDouble(tbSanPham.getValueAt(i, countColSoLuong).toString());
            double donGia = Double.parseDouble(tbSanPham.getValueAt(i, countcolDonGia).toString());
            tong +=soLuong * donGia;
        }
       this.txtTongTien.setText(String.valueOf(tong));
    }//GEN-LAST:event_buttonOKActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        JFTaoDonHang jf = new JFTaoDonHang();
        jf.show();
        dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUPDATEActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement stmt;
        PreparedStatement stmt1 = null;
        DefaultTableModel model = (DefaultTableModel) this.tbSanPham.getModel();

        //cộng lại hoàn trả số lượng trong cơ sở dữ liệu
        try {
            con = DBConnect.getConnection();
            String sql = "update sanphamhienco as sh join(select chitietdonhang.maDonHang,chitietdonhang.maSanPham, chitietdonhang.soLo,chitietdonhang.soLuong from quanlidonhang join chitietdonhang on chitietdonhang.maDonHang = quanlidonhang.maDonHang where quanlidonhang.maDonHang = '"+txtMaDonHang.getText()+"') as bang on sh.maSanPham = bang.maSanPham and sh.soLo = bang.soLo set sh.soLuong = sh.soLuong + bang.soLuong;";
            stmt1 = con.prepareStatement(sql);
            stmt1.executeUpdate();
            con.close();
            stmt1.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //xóa dữ liệu theo mã đơn hàng trong cơ sở dữ liệu
        try {
            con = DBConnect.getConnection();
            String sql ="delete chitietdonhang , quanlidonhang from chitietdonhang join quanlidonhang on chitietdonhang.maDonHang = quanlidonhang.maDonHang where quanlidonhang.maDonHang = '"+txtMaDonHang.getText()+"'";
            stmt1 = con.prepareStatement(sql);
            stmt1.executeUpdate();
            con.close();
            stmt1.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cập nhật lại dữ liệu bảng trên giao diện vào cơ sở dữ liệu
         //lưu dữ liệu vào database
        int rowTable = tbSanPham.getRowCount();
        Connection conn;
        Connection connn;
        
        try {
            con = DBConnect.getConnection();
            String sql ="INSERT INTO chitietdonhang (maDonHang, maSanPham, soLo, tenSanPham,soLuong ,donGia, thanhTien) VALUES (?, ?, ? ,?,?,?,?)";
            stmt1 = con.prepareStatement(sql);
            for (int i = 0; i < rowTable; i++) {
                String data1 = model.getValueAt(i, 0).toString();
                String data2 = model.getValueAt(i, 1).toString();
                String data3 = model.getValueAt(i, 2).toString();
                String data4 = model.getValueAt(i, 3).toString();
                Object data5 = model.getValueAt(i, 4);
                Object data7 = model.getValueAt(i, 5);
                Object data6 =  model.getValueAt(i, 6);

                stmt1.setString(1, data1);
                stmt1.setString(2, data2);
                stmt1.setString(3, data3);
                stmt1.setString(4, data4);
                stmt1.setObject(5, data5);
                
                stmt1.setObject(6, data7);

                stmt1.setObject(7, data6);
                stmt1.executeUpdate();
            }
            con.close();
            stmt1.close();
        }catch (SQLException ex) {
            Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        //lưu dữ liệu vào data quanlidonhang.
        try {
            con  = DBConnect.getConnection();
            String data7 = txtMaDonHang.getText();
            String data8 = thoiGian;
            Object data9 = txtTongTien.getText();
            
            String sql1 ="INSERT INTO quanlidonhang (maDonHang, ngayTaoDonHang , tongTien) VALUES (? ,? ,?)";
            stmt1 = con.prepareStatement(sql1);
            stmt1.setString(1, data7);
            stmt1.setString(2, data8);
            stmt1.setObject(3, data9);
            stmt1.executeUpdate();
            
            con.close();
            stmt1.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        //update lại số lượng hiện có trong cửa hàng.
        try {
            con = DBConnect.getConnection();
            for (int i = 0; i < rowTable; i++) {
                String data1 = model.getValueAt(i, 1).toString();
                String data2 = model.getValueAt(i, 2).toString();
                Object data3 = model.getValueAt(i, 4);
                String sql = "update sanphamhienco set soLuong = soLuong -"+data3+" where maSanPham='"+data1+"' and soLo ='"+data2+"'";
                stmt1 = con.prepareStatement(sql);
                stmt1.executeUpdate();
            }
            con.close();
            stmt1.close();
            JOptionPane.showMessageDialog(rootPane, "Successful update");
        } catch (SQLException ex) {
            Logger.getLogger(JFSuaDonHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFTaoDonHang jf = new JFTaoDonHang();
        jf.show();
        dispose();
    }//GEN-LAST:event_buttonUPDATEActionPerformed

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
            java.util.logging.Logger.getLogger(JFSuaDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSuaDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSuaDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSuaDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSuaDonHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChinhSua;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonTim;
    private javax.swing.JButton buttonUPDATE;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtLoSanPham;
    private javax.swing.JTextField txtMaDonHang;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
