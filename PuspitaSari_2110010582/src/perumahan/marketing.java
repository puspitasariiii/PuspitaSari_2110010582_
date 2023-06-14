/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class marketing {
    
    private String nama;
    private String alamat;
    private String telpon;
    private String jenisKelamin;
    
    public marketing(String nama, String alamat, String telpon, String jenisKelamin){
        setNamaMarketing(nama);
        setAlamatMarketing(alamat);
        setTelponMarketing(telpon);
        setJenisKelamin(jenisKelamin);
    }
    
    //method set
    public void setNamaMarketing(String nama){
        this.nama = nama;
    }
    public void setAlamatMarketing(String alamat){
        this.alamat = alamat;
    }
    public void setTelponMarketing(String telpon){
        this.telpon = telpon;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    //method get
    public String getNamaMarketing(){
        return nama;
    }
    public String getAlamatMarketing(){
        return alamat;
    }
    public String getTelponMarketing(){
        return telpon;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
}
