package soal_objek;

public class Segitiga {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisi;
        this.sisiB = sisi;
        this.sisiC = sisi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        if (sisiA != 0 && sisiB != 0 && sisiC != 0) {
            return sisiA + sisiB + sisiC;
        } else {
            return alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
        }
    }
}
