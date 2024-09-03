package com.lhb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ruou extends HangHoa {
    public static final DonViTinh DON_VI_TINH = DonViTinh.CHAI;
    private LoaiRuou loaiRuou;

    @Override
    public String getLoai() {
        return loaiRuou.name();
    }

    @Override
    public DonViTinh getDonViTinh() {
        return DON_VI_TINH;
    }
}
