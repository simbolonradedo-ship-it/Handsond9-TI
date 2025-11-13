package latihan1;

public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }
}