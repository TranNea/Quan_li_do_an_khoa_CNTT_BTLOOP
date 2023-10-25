/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tranlehoainhan
 */
public class QuanLyBaoCao {
    private List<BaoCao> dsbc = new ArrayList<>();
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    
    public void addBC(BaoCao bc) {
        this.dsbc.add(bc);
    }

    public void themBC() throws ParseException {
        BaoCao bc = new BaoCao() {
            @Override
            public void nhapDiem() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        bc.nhapBC();
        if(kiemTraMaBC(bc.getMaBC()) == 1) {
            this.dsbc.add(bc);
        }
        else {
            String s = "0";
            do{
                System.out.println("Ma bao cao da ton tai. Moi nhap lai!");
                bc.nhapBC();
            }while (kiemTraMaBC(s) == 0 && s != "");
            this.dsbc.add(bc);
        }
    }

    public boolean xoaBC(String id) {
        BaoCao baocao = this.dsbc.stream()
                .filter(bc -> bc.getMaBC().equals(id))
                .findFirst().orElse(null);
        if (baocao == null){
            return false;
        }
        this.dsbc.remove(baocao);
        return true;
    }
    
    public void deleteBC(BaoCao bc){
        this.dsbc.remove(bc);
    }

    public void suaBC(String id) {
        this.dsbc.forEach(bc->{
            if(bc.getMaBC().equals(id) ) {
                try {
                    bc.nhapBC();
                    bc.nhapDiem();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public void phanLoaiBC(String loaiBC) {
        dsbc.forEach(bc -> {
            if(bc.getLoaiBaoCao().equals(loaiBC)) bc.hienThi();
        });
    }

    public void sapXepTen() {
        Collections.sort(dsbc, Comparator.comparing(BaoCao::getTenBC));
    }

    public void sapXepNgay() {
        Collections.sort(dsbc, Comparator.comparing(BaoCao::getNgayBaoCao));
    }

    public void sapXepTenTheoPhanLoai() {
        Collections.sort(dsbc, Comparator.comparing(BaoCao::getLoaiBaoCao).thenComparing(BaoCao::getTenBC));
    }

    public void sapXepNgayTheoPhanLoai() {
        Collections.sort(dsbc, Comparator.comparing(BaoCao::getLoaiBaoCao).thenComparing(BaoCao::getNgayBaoCao));
    }

    public void timTheoTen(String tenBC) {
        for (BaoCao bc : dsbc) {
            if (tenBC.equalsIgnoreCase(bc.getTenBC())) {
                bc.hienThi();
            }
        }
    }

    public void timTheoNgay(String tuNgay, String denNgay) throws ParseException {
        Date start = f.parse(tuNgay);
        Date end = f.parse(denNgay);
        QuanLyBaoCao ngay = new QuanLyBaoCao();
        ngay.setDsbc(dsbc.stream().filter((bc) ->{
            if((bc.getNgayBaoCao().before(end) && bc.getNgayBaoCao().after(start))
                    || bc.getNgayBaoCao().equals(end) || bc.getNgayBaoCao().equals(start)){
                bc.hienThi();
                return true;
            }
            else return false;
        }).collect(Collectors.toCollection(ArrayList::new)));
    }
    
    public void xuatDsBaoCao() {
        this.dsbc.forEach(bc -> bc.hienThi());
    }
    
    public int kiemTraMaBC(String id) {
        for(BaoCao bc : getDsbc())
            if (bc.getMaBC().equals(id)) {
                return 0;
            }
        return 1;
    }

    /**
     * @return the dsbc
     */
    public List<BaoCao> getDsbc() {
        return dsbc;
    }

    /**
     * @param dsbc the dsbc to set
     */
    public void setDsbc(List<BaoCao> dsbc) {
        this.dsbc = dsbc;
    }
}
