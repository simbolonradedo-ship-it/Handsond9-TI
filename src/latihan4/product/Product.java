package latihan4.product;

public abstract class Product {
    protected String id;
    protected String nama;
    protected double harga;
    protected int stok;

    public Product(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public abstract void displayDetails();

    public double getPrice() {
        return harga;
    }

    public String getName() {
        return nama;
    }

    public boolean isAvailable() {
        return stok > 0;
    }

    public void updateStock(int jumlah) {
        this.stok += jumlah;
    }

    public int getStock() {
        return stok;
    }

    public String getId() {
        return id;
    }
}
