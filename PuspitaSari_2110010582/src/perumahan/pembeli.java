/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class pembeli {
    
    private String nama;
    private String alamat;
    private String telpon;
    private String pekerjaan;
    private String jenisKelamin;
    private String status;
    
    public pembeli(String nama, String alamat, String telpon, String pekerjaan, String jenisKelamin, String status){
        setNamaPembeli(nama);
        setAlamatPembeli(alamat);
        setTelponPembeli(telpon);
        setPekerjaanPembeli(pekerjaan);
        setJenisKelamin(jenisKelamin);
        setStatusPembeli(status);
    }
    
    //method set
    public void setNamaPembeli(String nama){
        this.nama = nama;
    }
    public void setAlamatPembeli(String alamat){
        this.alamat = alamat;
    }
    public void setTelponPembeli(String telpon){
        this.telpon = telpon;
    }
    public void setPekerjaanPembeli(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setStatusPembeli(String status){
        this.status = status;
    }
    
    //method set
    public String getNamaPembeli(){
        return nama;
    }
    public String getAlamatPembeli(){
        return alamat;
    }
    public String getTelponPembeli(){
        return telpon;
    }
    public String getPekerjaanPembeli(){
        return pekerjaan;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public String getStatusPembeli(){
        return status;
    }
    
}
