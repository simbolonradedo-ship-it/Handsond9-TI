package latihan1;

/**
 * Contoh tanpa abstraction: class biasa yang merepresentasikan "hewan umum".
 * Ini menunjukkan kelemahan apabila kita boleh membuat instance dari konsep yang terlalu umum.
 */
public class HewanBiasa {
    private String nama;

    public HewanBiasa(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " berkata: (suara tidak spesifik)");
    }
}