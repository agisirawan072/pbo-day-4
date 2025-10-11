package com.pertemuan4.kasir;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "== Kasir ==");

        System.out.print("Masukkan nama penbeli: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan produk: ");
        String produk = scanner.nextLine();

        System.out.print("Masukkan harga: ");
        float harga = scanner.nextFloat();

        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();

        float total = harga * jumlah;

        System.out.println("Nama: " + nama);
        System.out.println("produk: " + produk);
        System.out.println("harga: " + harga);
        System.out.println("jumlah: " + jumlah);
        System.out.println("Total harga: " + total);

    }
}
