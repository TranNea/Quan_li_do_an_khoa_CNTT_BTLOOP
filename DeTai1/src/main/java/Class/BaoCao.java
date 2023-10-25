/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public abstract class BaoCao {
    private String maBC;
    private String tenBC;
    private String link;
    private Date ngayBaoCao;
    private String gvHD;
    private String loaiBaoCao;
    protected double diem;
    
    private List<SinhVien> sv = new ArrayList<> ();
    
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner sc = new Scanner(System.in);
    protected String[] loaibc= new String[]{"ThucTap", "DoAn", "KhoaLuan"};

    public BaoCao() {
    }

    public BaoCao(String maBC, String tenBC, String link, Date ngayBaoCao, String gvHD) {
        this.maBC = maBC;
        this.tenBC = tenBC;
        this.link = link;
        this.ngayBaoCao = ngayBaoCao;
        this.gvHD = gvHD;
    }
    
    public BaoCao(String maBC, String tenBC, String link, String ngayBaoCao, String gvHD) throws ParseException {
        this(maBC, tenBC, link, f.parse(ngayBaoCao), gvHD);
    }

    public void hienThi() {
        System.out.printf("Ma bao cao: %s\n", this.maBC);
        System.out.printf("Ten bao cao: %s\n", this.tenBC);
        System.out.printf("Link bao cao: %s\n", this.link);
        System.out.printf("Ngay bao cao: %s\n", f.format(this.ngayBaoCao));
        System.out.printf("Giang vien huong dan: %s\n", this.gvHD);
        System.out.printf("Diem bao cao: %s\n", diem);
        
        sv.forEach(h -> h.hienThi());
    }

    public void nhapBC() throws ParseException {
        do {
            System.out.print("Nhap ma bao cao: ");
            this.maBC = sc.nextLine();
            if(isKhoangTrang(maBC) == false || this.maBC.equals("-1")) System.out.println("Nhap sai dinh dang MSSV. Moi nhap lai!");
        }while (this.maBC.equals("-1")||this.maBC.equals("")||isKhoangTrang(maBC) == false);
        System.out.print("Nhap ten bao cao: ");
        this.tenBC = sc.nextLine();
        System.out.print("Nhap link truy cap den bao cao: ");
        this.link = sc.nextLine();
        System.out.print("Nhap ngay bao cao: ");
        this.ngayBaoCao = f.parse(sc.nextLine());
        System.out.print("Nhap ten giang vien huong dan: ");
        this.gvHD = sc.nextLine();
        
        nhapSVChoBC();
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
    
    public abstract void nhapDiem();
    
    public void nhapSVChoBC() {
        System.out.print("So luong sinh vien tham gia bao cao (toi da 2): ");
        int sl = sc.nextInt();
        if(sl >= 1 && sl <= 2) {
            for (int i = 1; i <= sl; i++) {
                SinhVien sv1 = new SinhVien();
                sv1.nhapSV();
                sv.add(sv1);
            }
        }
    }

    /**
     * @return the maBC
     */
    public String getMaBC() {
        return maBC;
    }

    /**
     * @param maBC the maBC to set
     */
    public void setMaBC(String maBC) {
        this.maBC = maBC;
    }

    /**
     * @return the tenBC
     */
    public String getTenBC() {
        return tenBC;
    }

    /**
     * @param tenBC the tenBC to set
     */
    public void setTenBC(String tenBC) {
        this.tenBC = tenBC;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the gvHD
     */
    public String getGvHD() {
        return gvHD;
    }

    /**
     * @param gvHD the gvHD to set
     */
    public void setGvHD(String gvHD) {
        this.gvHD = gvHD;
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
     * @return the ngayBaoCao
     */
    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    /**
     * @param ngayBaoCao the ngayBaoCao to set
     */
    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }
    
    /**
     * @return the loaibc
     */
    public String[] getLoaibc() {
        return loaibc;
    }

    /**
     * @param loaibc the loaibc to set
     */
    public void setLoaibc(String[] loaibc) {
        this.loaibc = loaibc;
    }

    /**
     * @return the loaiBaoCao
     */
    public String getLoaiBaoCao() {
        return loaiBaoCao;
    }

    /**
     * @param loaiBaoCao the loaiBaoCao to set
     */
    public void setLoaiBaoCao(String loaiBaoCao) {
        this.loaiBaoCao = loaiBaoCao;
    }

    /**
     * @return the sv
     */
    public List<SinhVien> getSv() {
        return sv;
    }

    /**
     * @param sv the sv to set
     */
    public void setSv(List<SinhVien> sv) {
        this.sv = sv;
    }
}
