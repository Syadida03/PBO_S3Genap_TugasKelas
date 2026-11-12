package P8_PBOEncapsulation;

public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;
    
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    public float getPanjang(){
        return panjang;
    }
    public float getLebar(){
        return lebar;
    }
    
    @Override
    public float luas(){
        return panjang * lebar;
    }
    
    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
}
