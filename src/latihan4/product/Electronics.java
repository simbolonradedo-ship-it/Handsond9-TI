package latihan4.product;

public class Electronics extends Product {
    private String warranty; // misal "2 years"
    private int powerConsumption; // watt

    public Electronics(String id, String nama, double harga, int stok, String warranty, int powerConsumption) {
        super(id, nama, harga, stok);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Elektronik ===");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Garansi: " + warranty);
        System.out.println("Daya: " + powerConsumption + "W");
        System.out.println();
    }
}
