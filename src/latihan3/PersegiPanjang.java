package latihan3;

public class PersegiPanjang extends Bentuk {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: Persegi Panjang");
        System.out.printf("Luas Persegi Panjang (%.1f x %.1f): %.2f%n", panjang, lebar, hitungLuas());
        System.out.printf("Keliling: %.2f%n", hitungKeliling());
    }
}
