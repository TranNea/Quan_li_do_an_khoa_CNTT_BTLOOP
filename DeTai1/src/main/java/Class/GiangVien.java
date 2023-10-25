/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public class GiangVien {
    private String maGV;
    private String tenGV;
    private String hocHam;
    private String hocVi;
    private String nhiemVu;
    private double diem;
    private Date ngayLamViec;
    
    private int required = 1;
    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    String[] vaiTro = new String[]{"Chu tich (*)","Thu ki (*)","Phan bien","Uy vien"};

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, String hocHam, String hocVi, String nhiemVu) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
    }

    public void nhapGV() {
        System.out.print("Nhap ma giang vien: ");
        this.maGV = sc.nextLine();
        System.out.print("Nhap ten giang vien: ");
        this.tenGV = sc.nextLine();
        System.out.print("Nhap hoc vi: ");
        this.hocVi = sc.nextLine();
        System.out.print("Nhap hoc ham: ");
        this.hocHam = sc.nextLine();
        
        nhiemVuHD(sc);
    }
    
    public void nhiemVuHD(Scanner sc){
        int dem;
        do {
            System.out.print("Chon nhiem vu (* : bat buoc co trong hoi dong): ");
            for (int i = 0; i < vaiTro.length; i++) {
                System.out.print(i + " " + vaiTro[i] + "\t");
            }
           dem = sc.nextInt();
           sc.nextLine();
        }while (dem < 0 || dem >= vaiTro.length);
        
        this.nhiemVu = vaiTro[dem];
    }
    
    public void xuatGiangVien() {
        System.out.printf("Ma giang vien: %s\n", this.maGV);
        System.out.printf("Ho ten: %s\n", this.tenGV);
        System.out.printf("Hoc vi: %s\n", this.hocVi);
        System.out.printf("Hoc ham: %s\n", this.hocHam);
        System.out.printf("Nhiem vu trong hoi dong: %s\n", this.nhiemVu);
        System.out.println();
    }
    
//    private HoiDongBaoVe dsDiemHD = new HoiDongBaoVe();
//    protected ArrayList<GiangVien> diemGV = (ArrayList<GiangVien>) dsDiemHD.getHoiDong();
    
//    public void chamDiem(){
//        diemGV.forEach(e -> {
//            System.out.print("Nhap diem thanh vien " + e.getNhiemVu() + ": ");
//            e.setDiem(sc.nextDouble());
//        });
//    }
//    
//    public double dtb (){
//        return diemGV.stream().mapToDouble(GiangVien::getDiem).average().getAsDouble();
//    }
//    
//    public void xuatDiem(){
//        diemGV.forEach(e -> {
//            System.out.print("Diem thanh vien " + e.getNhiemVu() + ": " + e.getDiem());
//        });
//    }

    /**
     * @return the maGV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maGV to set
     */
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    /**
     * @return the tenGV
     */
    public String getTenGV() {
        return tenGV;
    }

    /**
     * @param tenGV the tenGV to set
     */
    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the nhiemVu
     */
    public String getNhiemVu() {
        return nhiemVu;
    }

    /**
     * @param nhiemVu the nhiemVu to set
     */
    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the vaiTro
     */
    public String[] getVaiTro() {
        return vaiTro;
    }

    /**
     * @param vaiTro the vaiTro to set
     */
    public void setVaiTro(String[] vaiTro) {
        this.vaiTro = vaiTro;
    }

    /**
     * @return the required
     */
    public int getRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(int required) {
        this.required = required;
    }

//    /**
//     * @return the dsDiemHD
//     */
//    public HoiDongBaoVe getDsDiemHD() {
//        return dsDiemHD;
//    }
//
//    /**
//     * @param dsDiemHD the dsDiemHD to set
//     */
//    public void setDsDiemHD(HoiDongBaoVe dsDiemHD) {
//        this.dsDiemHD = dsDiemHD;
//    }
}
