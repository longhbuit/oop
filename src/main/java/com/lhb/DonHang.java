package com.lhb;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
public class DonHang {
    private final List<ChiTietDonHang> chiTietDonHangs = new ArrayList<>();
    private final KhachHang khachHang;
    private final String maDonHang;
    private final Date ngayBan;

    public void themChiTietDonHang(ChiTietDonHang chiTietDonHang) {
        chiTietDonHangs.add(chiTietDonHang);
    }

    public Double tinhTongTien() {
        return chiTietDonHangs.stream().mapToDouble(ChiTietDonHang::tinhThanhTien).sum();
    }

    public Double tinhChietKhau() {
        return khachHang.getLoaiKhachHang().getChietKhau() * tinhTongTien();
    }
}
