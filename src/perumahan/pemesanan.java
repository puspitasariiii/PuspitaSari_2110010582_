/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class pemesanan {
    
    private String tanggal;
    
    public pemesanan(String tanggal){
        setTanggalPemesanan(tanggal);
    }
    
    //method set
    public void setTanggalPemesanan(String tanggal){
        this.tanggal = tanggal;
    }
    
    //method get
    public String getTanggalPemesanan(){
        return tanggal;
    }
    
}
