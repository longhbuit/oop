package com.lhb;

public enum LoaiKhachHang {
    REGULAR(0.0D), VIP(0.05D);

    private final Double chietKhau;

    LoaiKhachHang(Double chietKhau) {
        this.chietKhau = chietKhau;
    }

    public Double getChietKhau() {
        return chietKhau;
    }
}
