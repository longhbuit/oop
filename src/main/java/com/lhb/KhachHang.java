package com.lhb;

import lombok.Data;

@Data
public class KhachHang {
    private String diaChi;
    private String email;
    private String hoTen;
    private String soDienThoai;
    private LoaiKhachHang loaiKhachHang;
}
