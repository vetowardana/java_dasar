/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import parent.GlobalVar;

/**
 *
 * @author me
 */
public class OlahDataGaji extends GlobalVar {
    public Scanner sc = new Scanner(System.in);
    public GlobalVar glo = new GlobalVar();
    private LinkedList data_gaji = glo.getGaji_karyawan();
    private int banyak_data = data_gaji.size();
    
    public static void main(String[] args) {
        OlahDataGaji ol = new OlahDataGaji();
        int menu = 0;
        
        do{
            ol.listGaji();
            menu = ol.menuUtama();
            
            ol.sc.skip("\r\n|[\n\r\u2028\u2029\u0085]");
            
            if (menu == 1) {
                ol.inputGaji();
            }
            else if (menu == 2) {
                ol.editGaji();
            }
            else if (menu == 3) {
                ol.removeGaji();
            }
            else if (menu == 4) {
                System.out.println("Aplikasi Diberhentikan");
            }
            else {
                System.out.println("INPUTAN MENU SALAH !!");
            }
            
            System.out.println("---------------------------------------------------");
        } while (menu == 1 || menu == 2 || menu == 3);
    }

    private void listGaji() {
        System.out.println("Data Keranjang Belanja");
        
        for (int i = 0; i < banyak_data; i++) {
            
            LinkedHashMap gaji_per_karyawan = (LinkedHashMap) data_gaji.get(i);
            
            System.out.println((i+1) + ". " + gaji_per_karyawan.get("gaji") + " Pcs " + gaji_per_karyawan.get("nama"));
        }
        
        if (banyak_data == 0) {
            System.out.println("KERANJANG MASIH KOSONG KOSONG");
        }
        
        System.out.println("-------------------------------------------------------");
    }

    private void inputGaji() {
        System.out.print("Inputkan Produk Yang Dibeli : ");
        String nama = sc.nextLine();
        
        System.out.print("Inputkan Jumlah Beli : ");
        int gaji = sc.nextInt();
        
        glo.inputGaji(nama, gaji);
        banyak_data = data_gaji.size();
    }

    private void removeGaji() {
        System.out.print("Inputkan Nomor Urut Pembelian : ");
        int urutan = sc.nextInt();
        glo.removeGaji(urutan-1);
        banyak_data = data_gaji.size();
    }

    private int menuUtama() {
        System.out.println("Pilih Menu :");
        System.out.println("1. BELI PRODUK BARU");
        System.out.println("2. UBAH JUMLAH PEMBELIAN");
        System.out.println("3. BATALKAN PEMBELIAN");        
        System.out.println("4. Exit");
        System.out.print("Input Pilihan : ");
        return sc.nextInt();
    }

    private void editGaji() {
        System.out.print("Inputkan Produk Yang Dibeli : ");
        String nama_baru = sc.nextLine();
        
        System.out.print("Inputkan Jumlah Pembelian Yang baru : ");
        int gaji_baru = sc.nextInt();
        
        System.out.print("Inputkan Nomor Urut Pembelian Yang Akan Diubah : ");
        int gaji_ke = sc.nextInt();
        
        glo.editGaji(gaji_ke-1, nama_baru, gaji_baru);
        banyak_data = data_gaji.size();
    }
}
