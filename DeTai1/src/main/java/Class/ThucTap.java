/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public class ThucTap extends BaoCao{
    private String danhGia;
    private static final Scanner sc = new Scanner(System.in);

    public ThucTap() {
    }  

    public ThucTap(String maBC, String tenBC, String link, String ngayBaoCao, String gvHD, String loaiBC, double diem, String danhGia) throws ParseException {
        super(maBC, tenBC, link, ngayBaoCao, gvHD);
        this.setLoaiBaoCao(loaiBC);
        this.diem = diem;
        this.danhGia = danhGia;
    }

    @Override
    public void nhapBC() throws ParseException {
        super.nhapBC();
        nhapDiem();
        System.out.print("Nhap danh gia cua doanh nghiep: ");
        this.danhGia = sc.nextLine();
        
        setLoaiBaoCao(loaibc[0]);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Danh gia cua doanh nghiep: %s\n", this.danhGia);
        System.out.println();
    }
    
    @Override
    public void nhapDiem() {
        do{
            System.out.print("Nhap diem bao cao: ");
            this.diem = sc.nextDouble();
            sc.nextLine();
            if (this.diem < 0 || this.diem > 10) System.out.println("Nhap sai gia tri.");
        }while(this.diem < 0 || this.diem > 10);
    }

    /**
     * @return the danhGia
     */
    public String getDanhGia() {
        return danhGia;
    }

    /**
     * @param danhGia the danhGia to set
     */
    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }
}
