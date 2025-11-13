package latihan1;

/**
 * IntroToAbstractionPractice: Kelas utama untuk mendemonstrasikan
 * dan mempraktikkan konsep Abstraction di Java.
 */
public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Demonstrasi masalah tanpa abstraksi
        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara();

        // =========================================================
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class dan subclass
        // Kita hanya bisa membuat objek dari subclass yang spesifik.

        // Buat object Kucing
        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();

        // Buat object Anjing
        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();

        // Buat object Burung
        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        // =========================================================
        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        // Latihan 3: Polymorphic array (Abstraction & Polymorphism)
        // Semua objek diperlakukan sebagai tipe 'Hewan'
        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            // Metode bersuara() dipanggil, tetapi implementasi yang berjalan
            // adalah implementasi spesifik dari tipe objek yang sebenarnya (polimorfisme)
            h.bersuara();
        }

        // =========================================================
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");

        System.out.println("1. **Menyembunyikan Detail:** Memungkinkan pengguna fokus pada 'apa' (fungsi) daripada 'bagaimana' (implementasi).");
        System.out.println("2. **Memaksakan Standar:** Menjamin semua subclass mengimplementasikan metode kunci.");
        System.out.println("3. **Fleksibilitas:** Perubahan internal pada subclass tidak merusak kode yang menggunakan superclass.");
        System.out.println("4. **Keterbacaan Kode:** Struktur yang jelas antara kontrak (abstract) dan detail (konkret).");
        System.out.println("5. **Dukungan Polimorfisme:** Memungkinkan pengelompokan objek yang berbeda di bawah tipe induk yang sama.");
    }
}