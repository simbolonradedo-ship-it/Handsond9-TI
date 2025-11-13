package latihan3;

public class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        // Asumsikan segitiga siku-siku
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: Segitiga");
        System.out.printf("Luas Segitiga (alas: %.1f, tinggi: %.1f): %.2f%n", alas, tinggi, hitungLuas());
        System.out.printf("Keliling: %.2f%n", hitungKeliling());
    }
}
