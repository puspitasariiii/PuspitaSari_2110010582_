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
public class bukutamu {

    private ArrayList <String> nama;
    private ArrayList <String> alamat;
    private ArrayList <String> telpon;
    
    public bukutamu(){
        nama = new ArrayList <String>();
        alamat = new ArrayList <String>();
        telpon = new ArrayList <String>();
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
    
}
