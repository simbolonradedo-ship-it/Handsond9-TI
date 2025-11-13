package latihan1;

/**
 * Class abstract Hewan: mendemonstrasikan abstraction.
 * Menyediakan field nama dan method umum (makan, tidur),
 * serta method abstract bersuara() yang wajib diimplementasikan subclass.
 */
public abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();

    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }
}