package latihan2;

public class BurungTerbang implements Terbang {
    private String nama;
    private int kecepatan;

    public BurungTerbang(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    @Override
    public void lepasLandas() {
        System.out.println(nama + " sedang lepas landas...");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " terbang di udara dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    public void mendarat() {
        System.out.println(nama + " mendarat dengan mulus");
    }
}
