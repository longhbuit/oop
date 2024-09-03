package com.lhb;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bia extends HangHoa {
    public static final DonViTinh DON_VI_TINH = DonViTinh.CHAI;
    private LoaiBia loaiBia;
    private Date ngayHetHan;
    private Boolean isDaBan;

    @Override
    public String getLoai() {
        return loaiBia.name();
    }

    @Override
    public DonViTinh getDonViTinh() {
        return DON_VI_TINH;
    }
}
