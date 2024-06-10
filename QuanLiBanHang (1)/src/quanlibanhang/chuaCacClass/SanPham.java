/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlibanhang.chuaCacClass;

public class SanPham {
    public String maSp ;
    public String tenSp;
    public double giaThanh;
    public String donVi;

    public SanPham(String maSp, String tenSp, double giaThanh, String donVi) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaThanh = giaThanh;
        this.donVi = donVi;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public String getDonVi() {
        return donVi;
    }
    
    
    
}
