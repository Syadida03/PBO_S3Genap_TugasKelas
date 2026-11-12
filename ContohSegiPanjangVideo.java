package P8_PBOEncapsulation;

public class ContohSegiPanjangVideo {
    private int panjang;
    private int lebar;
    
    //Setter
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    //Getter
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi = " + luas);
    }
}

// di file main nya
//public static void main(String[] args) {
//        
//        ContohSegiPanjangVideo p = new ContohSegiPanjangVideo();
//        p.setPanjang(8);
//        p.setLebar(5);
//        System.out.println("Panjang : " + p.getPanjang());
//        System.out.println("Lebar  : " + p.getLebar());
//        p.hitungLuas();
//    }