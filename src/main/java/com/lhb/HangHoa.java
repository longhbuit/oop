package com.lhb;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class HangHoa {
    public static final Double VAT = 0.1;

    private String ma;
    private String ten;
    private Date ngaySanXuat;
    private Float dungTich;
    private Double donGiaNhap;
    private Double donGiaBan;

    public abstract String getLoai();

    public abstract DonViTinh getDonViTinh();
}
