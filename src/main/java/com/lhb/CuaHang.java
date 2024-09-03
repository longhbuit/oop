package com.lhb;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

@NoArgsConstructor
public class CuaHang {
    private final List<HangHoa> hangHoas = new ArrayList<>();
    private final List<DonHang> donHangs = new ArrayList<>();
    private final List<KhachHang> khachHangs = new ArrayList<>();

    public void themHangHoa(HangHoa hangHoa) {
        hangHoas.add(hangHoa);
    }

    public void themDonHang(DonHang donHang) {
        donHangs.add(donHang);
    }

    public void themKhachHang(KhachHang khachHang) {
        khachHangs.add(khachHang);
    }

    public KhachHang timKhachHangMuaRuouNhieuNhat() {
        return donHangs.stream()
                .flatMap(donHang -> donHang.getChiTietDonHangs().stream()
                        .filter(chiTietDonHang -> chiTietDonHang.getHangHoa() instanceof Ruou)
                        .map(chiTietDonHang -> Pair.of(donHang.getKhachHang(), chiTietDonHang.getSoLuong())))
                .collect(Collectors.groupingBy(Pair::getLeft, Collectors.summingInt(Pair::getRight)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public KhachHang timKhachHangMuaBiaNhieuNhat() {
        return donHangs.stream()
                .flatMap(donHang -> donHang.getChiTietDonHangs().stream()
                        .filter(chiTietDonHang -> chiTietDonHang.getHangHoa() instanceof Bia)
                        .map(chiTietDonHang -> Pair.of(donHang.getKhachHang(), chiTietDonHang.getSoLuong())))
                .collect(Collectors.groupingBy(Pair::getLeft, Collectors.summingInt(Pair::getRight)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public Ruou timRuouBanChayNhat() {
        return donHangs.stream()
                .flatMap(donHang -> donHang.getChiTietDonHangs().stream()
                        .filter(chiTietDonHang -> chiTietDonHang.getHangHoa() instanceof Ruou)
                        .map(chiTietDonHang -> Pair.of((Ruou) chiTietDonHang.getHangHoa(), chiTietDonHang.getSoLuong())))
                .collect(Collectors.groupingBy(Pair::getLeft, Collectors.summingInt(Pair::getRight)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public Bia timBiaBanChayNhat() {
        return donHangs.stream()
                .flatMap(donHang -> donHang.getChiTietDonHangs().stream()
                        .filter(chiTietDonHang -> chiTietDonHang.getHangHoa() instanceof Bia)
                        .map(chiTietDonHang -> Pair.of((Bia) chiTietDonHang.getHangHoa(), chiTietDonHang.getSoLuong())))
                .collect(Collectors.groupingBy(Pair::getLeft, Collectors.summingInt(Pair::getRight)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
}
