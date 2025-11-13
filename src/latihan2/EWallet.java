package latihan2;

public class EWallet implements Pembayaran {
    private String nomorAkun;

    public EWallet(String nomorAkun) {
        this.nomorAkun = nomorAkun;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing E-Wallet payment: Rp " + jumlah);
        System.out.println("Payment successful via E-Wallet");
    }
}
