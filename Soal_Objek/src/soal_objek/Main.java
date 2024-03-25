package soal_objek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("alas: ");
        double alas = scanner.nextDouble();

        System.out.println("tinggi: ");
        double tinggi = scanner.nextDouble();

        System.out.println("sisi: ");
        double sisi = scanner.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi, sisi);

        
        double luas = segitiga.hitungLuas();
        double keliling = segitiga.hitungKeliling();

        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

        scanner.close();
    }
}
