/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public class HoiDongBaoVe {
    private List<GiangVien> hoiDong = new ArrayList<> ();
    private List<KhoaLuan> dsKL = new ArrayList<> ();
    private String ngayLamViec;

    private int min = 3;
    private int max = 5;
    
    public static final Scanner sc = new Scanner(System.in);

    public void themTV(){
        GiangVien gv = new GiangVien();
        gv.nhapGV();
        this.hoiDong.add(gv);
    }
    
    public void addGV(GiangVien gv) {
        this.getHoiDong().add(gv);
    }
    
    public void xemGiangVien() {
        this.getHoiDong().forEach(gv -> gv.xuatGiangVien());
    }
    
    public boolean isSoLuong(){
        if(hoiDong.stream().count() < min || hoiDong.stream().count() > max)
            return false;
        return true;
    }
    
    public void deleteGV(GiangVien gv){
        this.hoiDong.remove(gv);
    }
    
//    public boolean isThanhVienBatBuoc(){
//        int a = -1;
//        int dem = 0;
//        for (GiangVien gv : this.hoiDong){
//            dem = gv.getRequired();
//            for (int i = 0; i < gv.getRequired(); i++){   
//                if(gv.getNhiemVu() == gv.vaiTro[i])
//                    a++;
//            }
//        }
//        if(a == dem)
//            return true;
//        else
//            return false;
//    }
//    
//    public double diemTB(){
//         return hoiDong.stream().mapToDouble(GiangVien::getDiem).average().getAsDouble();
//    }

    /**
     * @return the ngayLamViec
     */
    public String getNgayLamViec() {
        return ngayLamViec;
    }

    /**
     * @param ngayLamViec the ngayLamViec to set
     */
    public void setNgayLamViec(String ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    /**
     * @return the hoiDong
     */
    public List<GiangVien> getHoiDong() {
        return hoiDong;
    }

    /**
     * @param hoiDong the hoiDong to set
     */
    public void setHoiDong(List<GiangVien> hoiDong) {
        this.hoiDong = hoiDong;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the dsKL
     */
    public List<KhoaLuan> getDsKL() {
        return dsKL;
    }

    /**
     * @param dsKL the dsKL to set
     */
    public void setDsKL(List<KhoaLuan> dsKL) {
        this.dsKL = dsKL;
    }
}
