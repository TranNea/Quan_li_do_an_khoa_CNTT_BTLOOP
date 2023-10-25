/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tlhn.detai1;

import Class.BaoCao;
import Class.DanhSachSinhVien;
import Class.DoAnNganh;
import Class.GiangVien;
import Class.HoiDongBaoVe;
import Class.KhoaLuan;
import Class.QuanLyBaoCao;
import Class.SinhVien;
import Class.ThucTap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tranlehoainhan
 */
public class DeTai1 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        QuanLyBaoCao dsbc = new QuanLyBaoCao();
        HoiDongBaoVe dsgv = new HoiDongBaoVe();

        SinhVien sv1 = new SinhVien ("2151050296", "Tran Le Hoai Nhan", "Nu", "2003", "CNTT", "K21");
        SinhVien sv2 = new SinhVien ("2151053046", "Nguyen Dang Huy Phu", "Nam", "2003", "CNTT", "K21");
        SinhVien sv3 = new SinhVien ("2252050333", "Nguyen Van A", "Nam", "2003", "CNTT", "K21");
        SinhVien sv4 = new SinhVien ("2335423234", "Le Thi B", "Nu", "2003", "CNTT", "K21");

        dssv.addSV(sv1);
        dssv.addSV(sv2);
        dssv.addSV(sv3);
        dssv.addSV(sv4);
//        
//        dssv.themSV();
//        
//        dssv.xuatDsSinhVien();
          
        BaoCao bc1 = new DoAnNganh("DA01", "Do an nganh CNSH", "cnsh.ou.edu.vn", "11/01/2023", "Le Thi C", "DoAn", 7, 10.2);
        BaoCao bc2 = new DoAnNganh("DA12", "Do an nganh xay dung", "xd.ou.edu.vn", "12/01/2023", "Nguyen Thi D", "DoAn", 9, 3.2);
        BaoCao bc3 = new ThucTap("TT01", "Bao cao thuc tap cong ty bat dong san", "ktkt.ou.edu.vn", "11/01/2023", "Tran Van G", "ThucTap", 7, "Kha");
        BaoCao bc4 = new ThucTap("TT02", "Bao cao thuc tap cong ty chung khoan", "ktkt.ou.edu.vn", "12/01/2023", "Tran Van G", "ThucTap", 9, "Tot");
        BaoCao bc5 = new DoAnNganh("DA11", "Do an nganh CNTT", "it.ou.edu.vn", "11/01/2023", "Le Van S", "DoAn", 10, 1.2);
        BaoCao bc6 = new DoAnNganh("DA02", "Do an nganh dong nam a hoc", "dna.ou.edu.vn", "13/01/2023", "Nguyen Trang N", "DoAn", 5, 45.7);
        BaoCao bc7 = new KhoaLuan("KL03", "Khoa luan nganh CNTT", "it.ou.edu.vn", "11/01/2023", "Le Van S", "ThucTap", 9, 0.3, "Le Nguyen B", "Tot");
        BaoCao bc8 = new KhoaLuan("KL05", "Khoa luan nganh dong nam a hoc", "dna.ou.edu.vn", "13/01/2023", "Nguyen Trang N", "ThucTap", 6, 30.3, "Le Thi S", "Tot");
        
        dsbc.addBC(bc1);
        dsbc.addBC(bc2);
        dsbc.addBC(bc3);
        dsbc.addBC(bc4);
        dsbc.addBC(bc5);
        dsbc.addBC(bc6);
        dsbc.addBC(bc7);
        dsbc.addBC(bc8);
        
        GiangVien gv1 = new GiangVien("GV12", "Le Van T", "P.Giao su", "Thac si", "Thu ki");
        GiangVien gv2 = new GiangVien("GV11", "Le Van S", "Giao su", "Tien si", "Chu tich");
        GiangVien gv3 = new GiangVien("GV13", "Nguyen Trang N", "Giao su", "Tien si", "Uy vien");
        GiangVien gv4 = new GiangVien("GV34", "Le Nguyen B", "P.Giao su", "Thac si", "Phan bien");
        GiangVien gv5 = new GiangVien("GV76", "Le Thi S", "P.Giao su", "Thac si", "Phan bien");
        GiangVien gv6 = new GiangVien("GV15", "Le Van Trinh T", "P.Giao su", "Thac si", "Thu ki");
        GiangVien gv7 = new GiangVien("GV98", "Le Nguyen Ngoc B", "Giao su", "Tien si", "Chu tich");
        
        dsgv.addGV(gv1);
        dsgv.addGV(gv2);
        dsgv.addGV(gv3);
        dsgv.addGV(gv4);
        dsgv.addGV(gv5);
        dsgv.addGV(gv6);
        dsgv.addGV(gv7);
        
        int doituong = 0;
        do{
            do {
                System.out.println("Chon doi tuong muon thao tac:\n1. Bao cao.\n2. Thoat.");
                System.out.print("Chon (1/ 2): ");
                doituong = scanner.nextInt();
                if (doituong < 1 || doituong > 2)
                    System.out.println("Vui long chon cac doi tuong cho san.");
            } while (doituong < 1 || doituong > 2);
            if(doituong == 1) {
                dsbc.xuatDsBaoCao();
                int thaotac = 0;
                do {
                    System.out.println("---------------------------MENU---------------------------\n" + "Chon chuc nang muon su dung:\n1. Xem danh sach bao cao.\n" 
                            + "2. Them bao cao vao danh sach.\n3. Xoa bao cao ra khoi danh sach." 
                            + "\n4. Sua thong tin bao cao.\n5. Xem danh sach bao cao theo phan loai.\n" + "6. Sap xep danh sach bao cao.\n" 
                            + "7. Tim kiem bao cao.\n8. Xem thanh vien hoi dong.\n" + "----------------------------------------------------------");
                    System.out.print("Chuc nang: ");
                    thaotac = scanner.nextInt();
                    scanner.nextLine();
                    if (thaotac < 1 || thaotac > 8) System.out.println("Nhap sai chuc nang. Moi nhap lai!");
                } while (thaotac < 1 || thaotac > 8);
                switch(thaotac){
                    case 1:{
                        dsbc.xuatDsBaoCao();
                    }
                        break;
                    case 2:{
                        int c = 0;
                        do{
                            int loai = 0;
                            do {
                                System.out.print("Chon loai bao cao muon them:\n1. Bao cao do an nganh.\n2. Bao cao thuc tap. \n3. Bao cao khoa luan tot nghiep.\nChon: ");
                                loai = scanner.nextInt();
                                scanner.nextLine();
                            } while (loai < 1 || loai > 3);
                            if(loai == 1){
                                BaoCao bc = new DoAnNganh();
                                bc.nhapBC();
                                dsbc.addBC(bc);
                                System.out.println("Da them bao cao.");
                            }
                            else if(loai == 2) {
                                BaoCao bc = new ThucTap();
                                bc.nhapBC();
                                dsbc.addBC(bc);
                                System.out.println("Da them bao cao.");
                            }
                            else if(loai == 3) {
                                BaoCao bc = new KhoaLuan();
                                bc.nhapBC();
                                dsbc.addBC(bc);
                                System.out.println("Da them bao cao.");
                            }
                            do {
                                System.out.println("1. Tiep tuc.\n2. Thoat.\n Chon: ");
                                c = scanner.nextInt();
                                scanner.nextLine();
                                if (c < 1 || c > 2) System.out.println("Nhap sai. Moi nhap lai!");
                            } while (c < 1 || c > 2);
                        }while(c == 1);
                        dsbc.xuatDsBaoCao();
                    }
                        break;
                    case 3:{
                        int c = 0;
                        do{
                            System.out.print("Nhap ma bao cao muon xoa: ");
                            String id = scanner.nextLine();
                            dsbc.xoaBC(id);
                            System.out.println("Da xoa bao cao.");
                            do {
                                System.out.println("1. Tiep tuc.\n2. Thoat.");
                                c = scanner.nextInt();
                                scanner.nextLine();
                                if (c < 1 || c > 2) System.out.println("Nhap sai. Moi nhap lai!");
                            } while (c < 1 || c > 2);
                        }while(c == 1);
                        dsbc.xuatDsBaoCao();
                    }
                        break;
                    case 4: {
                        int c = 0;
                        do{
                            String id;
                            System.out.print("Nhap ma bao cao can sua: ");
                            id = scanner.nextLine();
                            dsbc.suaBC(id);
                            System.out.println("Da sua.");
                            do {
                                System.out.println("1. Tiep tuc.\n2. Thoat.");
                                c = scanner.nextInt();
                                scanner.nextLine();
                                if (c < 1 || c > 2) System.out.println("Nhap sai. Moi nhap lai!");
                            } while (c < 1 || c > 2);
                        }while(c == 1);
                        dsbc.xuatDsBaoCao();
                    }
                        break;
                    case 5: {
                        int loai = 0;
                        do {
                            System.out.print("1.Bao cao do an nganh.\n2.Bao cao thuc tap.\n3.Bao cao khoa luan tot nghiep.\nChon: ");
                            loai = scanner.nextInt();
                            scanner.nextLine();
                            if (loai < 1 || loai > 3) System.out.println("Nhap sai. Moi nhap lai!");
                        } while (loai < 1 || loai > 3);
                        if (loai == 1) {
                            dsbc.phanLoaiBC("DoAn");
                        }
                        if (loai == 2) {
                            dsbc.phanLoaiBC("ThucTap");
                        }
                        if (loai == 3) {
                            dsbc.phanLoaiBC("KhoaLuan");
                        }
                    }
                        break;
                    case 6: {
                        int sx = 0;
                        do {
                                System.out.print("1. Sap xep theo ngay bao cao.\n2. Sap xep theo ten bao cao.\n3. Sap xep bao cao theo ngay va loai bao cao.\n4. Sap xep bao cao theo ten va loai bao cao\nChon: ");
                                sx = scanner.nextInt();
                                scanner.nextLine();
                                if (sx < 1 || sx > 4) System.out.println("Nhap sai. Moi nhap lai!");
                        } while (sx < 1 || sx > 4);
                        if (sx == 1) {
                            dsbc.sapXepNgay();
                        }
                        if (sx == 2) {
                            dsbc.sapXepTen();
                        }
                        if (sx == 3) {
                            dsbc.sapXepNgayTheoPhanLoai();
                        }
                        if (sx == 4) {
                            dsbc.sapXepTenTheoPhanLoai();
                        }
                    }
                        break;
                    case 7: {
                        int tim = 0;
                        do {
                                System.out.print("1. Tim bao cao theo ten.\n2. Tim bao cao theo khoang thoi gian.\nChon: ");
                                tim = scanner.nextInt();
                                scanner.nextLine();
                                if (tim < 1 || tim > 2) System.out.println("Nhap sai. Moi nhap lai!");
                        } while (tim < 1 || tim > 2);
                        if (tim == 1) {
                            System.out.println("Nhap ten bao cao can tim kiem: ");
                            String tenBC = scanner.nextLine();
                            dsbc.timTheoTen(tenBC);
                        }
                        if (tim == 2) {
                            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                            String s, e;
                            Date d, t;
                            do {
                                    System.out.print("Nhap ngay bat dau muon tim: ");
                                    s = scanner.nextLine();
                                    d = f.parse(s);
                                    System.out.print("Nhap ngay ket thuc muon tim (>= ngay bat dau): ");
                                    e = scanner.nextLine();
                                    t = f.parse(e);
                            } while (d.compareTo(t) == 1);
                            dsbc.timTheoNgay(s, e);
                        }
                    }
                        break;
                    case 8: {
                        dsgv.xemGiangVien();
                    }
                        break;
                }            
            }
        }while(doituong != 2);
    }
}
