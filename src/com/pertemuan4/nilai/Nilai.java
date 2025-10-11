package com.pertemuan4.nilai;

import java.util.Scanner;

public class Nilai {
  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Nilai ===");

        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();

        double[] nilai = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
          System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + ": ");
          nilai[i] = scanner.nextInt();
        }

        //total nilai
        double totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
          totalNilai += nilai[i];
        }

        double average = totalNilai / jumlah;

        System.out.println("\n=== NILAI MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
          System.out.println("Mahasiswa ke - " + (i+1) + ": " + nilai[i]);
        }
        System.out.println("average: " + average);
    }
}