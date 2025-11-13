package latihan2;

public class InterfacePractice {
    public static void main(String[] args) {
        System.out.println("=== BASIC INTERFACE USAGE ===");

        BurungTerbang elang = new BurungTerbang("Elang", 50);
        elang.lepasLandas();
        elang.terbang();
        elang.mendarat();

        System.out.println("\n=== MULTIPLE INHERITANCE ===");

        Bebek donald = new Bebek("Donald", 30);
        donald.lepasLandas();
        donald.terbang();
        donald.berenang();
        donald.menyelam();

        System.out.println("\n=== INTERFACE SEBAGAI TYPE ===");

        Terbang burung1 = new BurungTerbang("Elang", 50);
        burung1.terbang();

        Berenang ikan1 = new Ikan("Nemo");
        ikan1.berenang();

        System.out.println("\n=== REAL-WORLD EXAMPLE ===");

        PaymentProcessor processor = new PaymentProcessor();

        Pembayaran kartu = new KartuKredit("1234567890123456");
        processor.proses(kartu, 100000);

        Pembayaran ewallet = new EWallet("08123456789");
        processor.proses(ewallet, 50000);

        Pembayaran transfer = new TransferBank("9876543210");
        processor.proses(transfer, 200000);
    }
}
