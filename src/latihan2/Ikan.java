package latihan2;

public class Ikan implements Berenang {
    private String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang di permukaan air");
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam untuk mencari makan");
    }
}
