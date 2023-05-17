/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class rumah {
    
    private String blok;
    private String posisi;
    private String luas;
    private int harga;
    private String status;
    
    public rumah(String blok, String posisi, String luas, int harga, String status){
        setBlokRumah(blok);
        setPosisiRumah(posisi);
        setLuasRumah(luas);
        setHargaRumah(harga);
        setStatusRumah(status);
    }
    
    //method set
    public void setBlokRumah(String blok){
        this.blok = blok;
    }
    public void setPosisiRumah(String posisi){
        this.posisi = posisi;
    }
    public void setLuasRumah(String luas){
        this.luas = luas;
    }
    public void setHargaRumah(int harga){
        this.harga = harga;
    }
    public void setStatusRumah(String status){
        this.status = status;
    }
    
    //method get
    public String getBlokRumah(){
        return blok;
    }
    public String getPosisiRumah(){
        return posisi;
    }
    public String getLuasRumah(){
        return luas;
    }
    public int getHargaRumah(){
        return harga;
    }
    public String getStatusRumah(){
        return status;
    }
}
