/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class berkas {
    
    private ArrayList<String> photo;
    private ArrayList<String> ktp;
    private ArrayList<String> kk;
    private ArrayList<String> skbmr;
    private ArrayList<String> npwp;
    private ArrayList<String> slipGaji;
    
    public berkas(){
        photo = new ArrayList<String>();
        ktp = new ArrayList<String>();
        kk = new ArrayList<String>();
        skbmr = new ArrayList<String>();
        npwp = new ArrayList<String>();
        slipGaji = new ArrayList<String>();
    }
    
    //method set get photo
    public void insertPhoto(String isi){
    this.photo.add(isi);
    }
    
    public ArrayList <String> getPhoto(){
    return this.photo;
    }
    
    //method set get ktp
    public void insertKtp (String isi){
    this.ktp.add(isi);
    }
    
    public ArrayList <String> getKtp(){
    return this.ktp;
    }
    
    //method set get kk
    public void insertKk (String isi){
    this.kk.add(isi);
    }
    
    public ArrayList <String> getKk(){
    return this.kk;
    }
    
    //method set get skbmr
    public void insertSkbmr (String isi){
    this.skbmr.add(isi);
    }
    
    public ArrayList <String> getSkbmr(){
    return this.skbmr;
    }
    
    //method set get npwp
    public void insertNpwp (String isi){
    this.npwp.add(isi);
    }
    
    public ArrayList <String> getNpwp(){
    return this.npwp;
    }
    
    //method set get slipGaji
    public void insertSlipGaji (String isi){
    this.slipGaji.add(isi);
    }
    
    public ArrayList <String> getSlipGaji(){
    return this.slipGaji;
    }
    
}
