package com.lhb;

public enum LoaiRuou {
    CHIVAS_REGAL(0.1D), JOHNNIE_WALKER(0.1D), HENNESSY(0.1D), MACALLAN(0.1D), NEP(null), CAN(null);

    private final Double thueNhapKhau;

    LoaiRuou(Double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    public Double getThueNhapKhau() {
        return thueNhapKhau;
    }
}
