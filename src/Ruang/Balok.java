package Ruang;
import Bidang.PersegiPanjang;
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return this.luas() * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        int p;
        p = this.panjang;
        int l;
        l = this.lebar;
        int t;
        t = this.tinggi;
        return 2 * ((p * l) + (p * t) + (l * t)) ;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
}