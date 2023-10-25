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
public class DanhSachSinhVien {
    private List<SinhVien> dssv = new ArrayList<> ();
    public static final Scanner sc = new Scanner(System.in);
    
    public void addSV(SinhVien sv){
        this.getDssv().add(sv);
    }
    
    public int kiemTraMSSV(String id) {
        for(SinhVien sv : getDssv())
            if (sv.getMssv().equals(id)) {
                return 0;
            }
        return 1;
    }
    
    public void themSV() {
        SinhVien sv = new SinhVien();
        sv.nhapSV();
        if(kiemTraMSSV(sv.getMssv()) == 1) {
            this.getDssv().add(sv);
        }
        else {
            String s = "0";
            do{
                System.out.println("MSSV da ton tai. Moi nhap lai!");
                sv.nhapSV();
            }while (kiemTraMSSV(s) == 0 && s != "");
            this.getDssv().add(sv);
        }
    }
    
    public void xuatDsSinhVien(){
        this.getDssv().forEach(sv -> sv.hienThi());
    }

    /**
     * @return the dssv
     */
    public List<SinhVien> getDssv() {
        return dssv;
    }

    /**
     * @param dssv the dssv to set
     */
    public void setDssv(List<SinhVien> dssv) {
        this.dssv = dssv;
    }
}
