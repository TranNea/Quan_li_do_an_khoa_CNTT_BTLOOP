/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;

/**
 *
 * @author tranlehoainhan
 */
public class KhoaLuan extends BaoCao{
    private double tiLeDaoVan;
    private String danhGiaGV;
    private String gvPhanBien;
    
    protected HoiDongBaoVe ds = new HoiDongBaoVe();

    public KhoaLuan() {
    }

    public KhoaLuan(String maBC, String tenBC, String link, String ngayBaoCao, String gvHD, String loaiBC,  double diem, double tiLeDaoVan, String gvPhanBien, String danhGiaGV) throws ParseException {
        super(maBC, tenBC, link, ngayBaoCao, gvHD);
        this.danhGiaGV = danhGiaGV;
        this.gvPhanBien = gvPhanBien;
        this.setLoaiBaoCao(loaiBC);
        this.tiLeDaoVan = tiLeDaoVan;
    }

    @Override
    public void nhapBC() throws ParseException {
        super.nhapBC();
        nhapDiem();
        System.out.print("Nhap ti le dao van: ");
        this.tiLeDaoVan = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap ten giang vien phan bien: ");
        this.gvPhanBien = sc.nextLine();
        System.out.print("Nhap danh gia cua giang vien phan bien: ");
        this.danhGiaGV = sc.nextLine();
        
        setLoaiBaoCao(loaibc[2]);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ti le dao van: %.1f\n", this.tiLeDaoVan);
        System.out.printf("Giang vien phan bien: %s\n", this.gvPhanBien);
        System.out.printf("Danh gia: %s\n", this.danhGiaGV);
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
     * @return the danhGiaGV
     */
    public String getDanhGiaGV() {
        return danhGiaGV;
    }

    /**
     * @param danhGiaGV the danhGiaGV to set
     */
    public void setDanhGiaGV(String danhGiaGV) {
        this.danhGiaGV = danhGiaGV;
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
     * @return the gvPhanBien
     */
    public String getGvPhanBien() {
        return gvPhanBien;
    }

    /**
     * @param gvPhanBien the gvPhanBien to set
     */
    public void setGvPhanBien(String gvPhanBien) {
        this.gvPhanBien = gvPhanBien;
    }
}
