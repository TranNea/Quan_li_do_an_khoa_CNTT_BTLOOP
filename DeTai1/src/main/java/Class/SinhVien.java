/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public class SinhVien {
    private String mssv;
    private String tenSV;
    private String khoaHoc;
    private String gioiTinh;
    private String namSinh;
    private String nganh;
    
    public static final Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String mssv, String tenSV, String gioiTinh, String namSinh, String nganh, String khoaHoc) {
        this.mssv = mssv;
        this.tenSV = tenSV;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.nganh = nganh;
    }
    
    public void hienThi() {
        System.out.printf("MSSV: %s\n", this.mssv);
        System.out.printf("Ho ten: %s\n", this.tenSV);
        System.out.printf("Gioi tinh: %s\n", this.gioiTinh);
        System.out.printf("Nam sinh: %s\n", this.namSinh);
        System.out.printf("Nganh: %s\n", this.nganh);
        System.out.printf("Khoa hoc: %s\n", this.khoaHoc);
        System.out.println();
    }
    
    public boolean isKhoangTrang(String id){
        if(id != null){
            for(int i = 0; i < id.length(); i++){
                if(Character.isWhitespace(id.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void nhapSV() {
        do {
            System.out.print("Nhap MSSV: ");
            this.mssv = sc.nextLine();
            if(isKhoangTrang(mssv) == false || this.mssv.equals("-1")) System.out.println("Nhap sai dinh dang MSSV. Moi nhap lai!");
        }while (this.mssv.equals("-1")||this.mssv.equals("")||isKhoangTrang(mssv) == false);
        System.out.print("Nhap ho ten sinh vien: ");
        this.tenSV = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = sc.nextLine();
        System.out.print("Nganh: ");
        this.nganh = sc.nextLine();
        System.out.print("Khoa hoc: ");
        this.khoaHoc = sc.nextLine();
    }
    
    /**
     * @return the mssv
     */
    public String getMssv() {
        return mssv;
    }

    /**
     * @param mssv the mssv to set
     */
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    /**
     * @return the tenSV
     */
    public String getTenSV() {
        return tenSV;
    }

    /**
     * @param tenSV the tenSV to set
     */
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    /**
     * @return the khoaHoc
     */
    public String getKhoaHoc() {
        return khoaHoc;
    }

    /**
     * @param khoaHoc the khoaHoc to set
     */
    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the namSinh
     */
    public String getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the nganh
     */
    public String getNganh() {
        return nganh;
    }

    /**
     * @param nganh the nganh to set
     */
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    Object getMaBC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setMaBC(String maBC) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
