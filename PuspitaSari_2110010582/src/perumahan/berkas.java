/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class berkas {
    
    private String photo;
    private String ktp;
    private String kk;
    private String skbmr;
    private String npwp;
    private String slipGaji;
    
    public berkas(String photo, String ktp, String kk, String skbmr, String npwp, String slipGaji){
        setPhoto(photo);
        setFotokopiKTP(ktp);
        setFotokopiKK(kk);
        setSKBMR(skbmr);
        setFotokopiNPWP(npwp);
        setSlipGaji(slipGaji);
    }
    
    //method set
    public void setPhoto(String photo){
        this.photo = photo;
    }
    public void setFotokopiKTP(String ktp){
        this.ktp = ktp;
    }
    public void setFotokopiKK(String kk){
        this.kk = kk;
    }
    public void setSKBMR(String skbmr){
        this.skbmr = skbmr;
    }
    public void setFotokopiNPWP(String npwp){
        this.npwp = npwp;
    }
    public void setSlipGaji(String slipGaji){
        this.slipGaji = slipGaji;
    }
    
    //method get
    public String getPhoto(){
        return photo;
    }
    public String getFotokopiKTP(){
        return ktp;
    }
    public String getFotokopiKK(){
        return kk;
    }
    public String getSKBMR(){
        return skbmr;
    }
    public String getFotokopiNPWP(){
        return npwp;
    }
    public String getSlipGaji(){
        return slipGaji;
    }
    
}
