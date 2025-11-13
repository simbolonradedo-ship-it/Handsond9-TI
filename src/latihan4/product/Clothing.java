package latihan4.product;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String id, String nama, double harga, int stok, String size, String material, String color) {
        super(id, nama, harga, stok);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Pakaian ===");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Ukuran: " + size);
        System.out.println("Bahan: " + material);
        System.out.println("Warna: " + color);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}
