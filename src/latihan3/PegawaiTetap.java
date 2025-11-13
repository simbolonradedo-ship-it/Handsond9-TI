package latihan3;

public class PegawaiTetap extends Pegawai {
    private double bonusTahunan;

    public PegawaiTetap(String nama, double gajiPokok, double bonusTahunan) {
        super(nama, gajiPokok);
        this.bonusTahunan = bonusTahunan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // panggil versi parent
        System.out.println("Bonus Tahunan: Rp " + bonusTahunan);
        System.out.println("Total Gaji: Rp " + (gajiPokok + bonusTahunan));
    }
}
