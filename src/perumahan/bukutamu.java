/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class bukutamu {

    private String nama;
    private String alamat;
    private String telpon;
    
    public bukutamu(String nama, String alamat, String telpon){
        setNamaTamu(nama);
        setAlamatTamu(alamat);
        setTelponTamu(telpon);
    }
    
    //method set
    public void setNamaTamu(String nama){
        this.nama = nama;
    }
    public void setAlamatTamu(String alamat){
        this.alamat = alamat;
    }
    public void setTelponTamu(String telpon){
        this.telpon = telpon;
    }
    
    //method get
    public String getNamaTamu(){
        return nama;
    }
    public String getAlamatTamu(){
        return alamat;
    }
    public String getTelponTamu(){
        return telpon;
    }
    
}
