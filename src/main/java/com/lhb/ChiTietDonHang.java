package com.lhb;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class ChiTietDonHang {
    private final HangHoa hangHoa;
    private final int soLuong;


    public double tinhThanhTien() {
        Double thueNhapKhau;
        if (hangHoa instanceof Ruou) {
            thueNhapKhau = Optional.ofNullable(((Ruou) hangHoa).getLoaiRuou().getThueNhapKhau()).orElse(0.0);
        } else if (hangHoa instanceof Bia) {
            thueNhapKhau = Optional.ofNullable(((Bia) hangHoa).getLoaiBia().getThueNhapKhau()).orElse(0.0);
        } else {
            thueNhapKhau = 0.0;
        }

        Double thanhTien = hangHoa.getDonGiaBan() * soLuong;
        Double vat = hangHoa.getDonGiaBan() * HangHoa.VAT * soLuong;
        Double tienThueNhapKhau = hangHoa.getDonGiaNhap() * thueNhapKhau * soLuong;
        return thanhTien + vat + tienThueNhapKhau;
    }
}
