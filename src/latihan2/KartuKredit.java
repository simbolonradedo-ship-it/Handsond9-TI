package latihan2;

public class KartuKredit implements Pembayaran {
    private String nomorKartu;

    public KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Credit Card payment: Rp " + jumlah);
        System.out.println("Payment successful via Credit Card");
    }
}
