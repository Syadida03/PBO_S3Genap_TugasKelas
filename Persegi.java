package P8_PBOEncapsulation;

public class Persegi extends BangunDatar {
    private float sisi;
    
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi(){
        return sisi;
    }
    
    @Override
    public float luas(){
        return sisi*sisi;
    }
    
    @Override
    public float keliling(){
        return 4 * sisi;
    }   
}
