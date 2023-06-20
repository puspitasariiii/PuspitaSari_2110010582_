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
public class pembeli {
    
    private ArrayList <String> nama;
    private ArrayList <String> alamat;
    private ArrayList <String> telpon;
    private ArrayList <String> pekerjaan;
    private ArrayList <String> jenisKelamin;
    private ArrayList <String> status;
    
    public pembeli(){
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telpon = new ArrayList<String>();
        pekerjaan = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        status = new ArrayList<String>();
    }
    
    //method set get nama
    public void insertNama (String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getNama(){
    return this.nama;
    }
    
    //method set get alamat
    public void insertAlamat (String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getAlamat(){
    return this.alamat;
    }
    
    //method set get telpon
    public void insertTelpon (String isi){
    this.telpon.add(isi);
    }
    
    public ArrayList <String> getTelpon(){
    return this.telpon;
    }
    
    //method set get pekerjaan
    public void insertPekerjaan (String isi){
    this.pekerjaan.add(isi);
    }
    
    public ArrayList <String> getPekerjaan(){
    return this.pekerjaan;
    }
    
    //method set get jenisKelamin
    public void insertJenisKelamin (String isi){
    this.jenisKelamin.add(isi);
    }
    
    public ArrayList <String> getJenisKelamin(){
    return this.jenisKelamin;
    }
    
    //method set get status
    public void insertStatus (String isi){
    this.status.add(isi);
    }
    
    public ArrayList <String> getStatus(){
    return this.status;
    }
    
}
