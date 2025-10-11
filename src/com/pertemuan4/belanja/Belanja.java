package com.pertemuan4.belanja;

import java.util.ArrayList;
import java.util.Scanner;

public class Belanja {
  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarBelanja = new ArrayList<>();

        System.out.println("=== Program Belanja ===");
        System.out.println("Ketik nama barangnya, kalau udh selesai ketik selesai");

        while (true) {
          System.out.print("Masukan nama barang: ");
          String barang = scanner.nextLine();
          if (barang.equalsIgnoreCase("selesai")) {
            break;
          }
          daftarBelanja.add(barang);
        }

        System.out.println("\n === Daftar Belanja ===");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i+1) + "." + daftarBelanja.get(i));
        }
    }
}