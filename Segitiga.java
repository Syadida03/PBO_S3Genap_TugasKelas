package P8_PBOEncapsulation;

public class Segitiga extends BangunDatar{
    private float alas;
    private float tinggi;
    private float sisiMiring;
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    
    public void setSisiMiring(float sisiMiring){
        this.sisiMiring = sisiMiring;
    }
    
    public float getAlas(){
        return alas;
    }
    
    public float getTinggi(){
        return tinggi;
    }
    
    public float getSisiMiring(){
        return sisiMiring;
    }
    
    @Override
    public float luas(){
        return 0.5f * alas * tinggi;
    }
    
    @Override
    public float keliling(){
        return alas * tinggi * sisiMiring;
    }
    
}