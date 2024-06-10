
-- NAME DATABASE:quanlicuahang
-- use = "root"
-- password = "123456"

CREATE TABLE chitietdonhang (
    maDonHang VARCHAR(40) NOT NULL,
    maSanPham VARCHAR(45) NOT NULL,
    soLo VARCHAR(45) NOT NULL,
    tenSanPham VARCHAR(45) NOT NULL,
    soLuong INT NOT NULL,
    donGia DOUBLE NOT NULL,
    thanhTien DOUBLE NOT NULL
);
CREATE TABLE nhaphang (
    maPhieuNhap VARCHAR(10) NOT NULL,
    ngayNhap VARCHAR(40) NOT NULL,
    maSanPham VARCHAR(45) NOT NULL,
    soLo VARCHAR(60) NOT NULL,
    hanSuDung VARCHAR(40) NOT NULL,
    soLuong INT NOT NULL
);
CREATE TABLE quanlidonhang (
    maDonHang VARCHAR(60) NOT NULL primary key,
    ngayTaoDonHang VARCHAR(45) NOT NULL,
    tongTien DOUBLE NOT NULL
);
CREATE TABLE quanlisanpham (
    maSanPham VARCHAR(10) NOT NULL,
    tenSanPham VARCHAR(45) NOT NULL,
    donGia DOUBLE NOT NULL,
    donVi VARCHAR(45) NOT NULL
);
CREATE TABLE sanphamhienco (
    maSanPham VARCHAR(60) NOT NULL,
    soLo VARCHAR(45) NOT NULL,
    soLuong INT NOT NULL
);






