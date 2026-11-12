package P8_PBOEncapsulation;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println("PERSEGI");
        System.out.println("Sisi    : " + p.getSisi());
        System.out.println("Luas    : " + p.luas());
        System.out.println("Keliling: " + p.keliling()+ "\n");
        
        Lingkaran l = new Lingkaran();
        l.setJari(7);
        System.out.println("LINGKARAN");
        System.out.println("Jari    : " + l.getJari());
        System.out.println("Luas    : " + l.luas());
        System.out.println("Kaliling: " + l.keliling()+ "\n");
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(5);
        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("Luas     : " + pp.luas());
        System.out.println("Keliling : " + pp.keliling() + "\n");
        
        Segitiga s = new Segitiga();
        s.setAlas(6);
        s.setTinggi(8);
        s.setSisiMiring(10); // Sisi miring misal 10
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas     : " + s.getAlas());
        System.out.println("Tinggi   : " + s.getTinggi());
        System.out.println("Luas     : " + s.luas());
        System.out.println("Keliling : " + s.keliling());
    }
}
