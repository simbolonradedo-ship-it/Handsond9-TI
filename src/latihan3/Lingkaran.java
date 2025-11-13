package latihan3;

public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: Lingkaran");
        System.out.printf("Luas Lingkaran dengan radius %.1f: %.2f%n", radius, hitungLuas());
        System.out.printf("Keliling: %.2f%n", hitungKeliling());
    }
}
