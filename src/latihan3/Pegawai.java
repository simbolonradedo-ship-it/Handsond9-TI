package latihan3;

public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("Pegawai: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}
