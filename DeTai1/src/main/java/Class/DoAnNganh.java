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
public class DoAnNganh extends BaoCao{
    private double tiLeDaoVan;
    
    private static final Scanner sc = new Scanner(System.in);

    public DoAnNganh() {
    }

    public DoAnNganh(String maBC, String tenBC, String link, String ngayBaoCao, String gvHD, String loaiBC, double diem, double tiLeDaoVan) throws ParseException {
        super(maBC, tenBC, link, ngayBaoCao, gvHD);
        this.setLoaiBaoCao(loaiBC);
        this.diem = diem;
        this.tiLeDaoVan = tiLeDaoVan;
    }

    @Override
    public void nhapBC() throws ParseException {
        super.nhapBC();
        nhapDiem();
        System.out.print("Nhap ti le dao van: ");
        this.tiLeDaoVan = sc.nextDouble();
        
        sc.nextLine();
        setLoaiBaoCao(loaibc[1]);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ti le dao van: %.1f\n", this.tiLeDaoVan);
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
     * @return the tiLeDaoVan
     */
    public double getTiLeDaoVan() {
        return tiLeDaoVan;
    }

    /**
     * @param tiLeDaoVan the tiLeDaoVan to set
     */
    public void setTiLeDaoVan(double tiLeDaoVan) {
        this.tiLeDaoVan = tiLeDaoVan;
    }

    /**
     * @return the sc
     */
    public static Scanner getSc() {
        return sc;
    }
}
