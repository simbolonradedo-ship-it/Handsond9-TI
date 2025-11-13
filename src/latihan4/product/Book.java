package latihan4.product;

public class Book extends Product {
    private String author;
    private int pages;
    private String isbn;

    public Book(String id, String nama, double harga, int stok, String author, int pages, String isbn) {
        super(id, nama, harga, stok);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Buku ===");
        System.out.println("ID: " + id);
        System.out.println("Judul: " + nama);
        System.out.println("Penulis: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Halaman: " + pages);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}
