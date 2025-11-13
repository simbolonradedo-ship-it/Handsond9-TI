package latihan1;

public class Burung extends Hewan {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Cuit Cuit!");
    }
}