package com.lhb;

public enum LoaiBia {
    HEINEKEN(0.1D), TIGER(0.1D), SAIGON(null), HUDA(null);

    private final Double thueNhapKhau;

    LoaiBia(Double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    public Double getThueNhapKhau() {
        return thueNhapKhau;
    }
}
