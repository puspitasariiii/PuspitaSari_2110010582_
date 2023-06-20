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
public class rumah {
    
    private ArrayList <String> blok;
    private ArrayList <String> posisi;
    private ArrayList <String> luas;
    private ArrayList <Integer> harga;
    private ArrayList <String> status;
    
    public rumah(){
        blok = new ArrayList<String>();
        posisi = new ArrayList<String>();
        luas = new ArrayList<String>();
        harga = new ArrayList<Integer>();
        status = new ArrayList<String>();
    }
    
    //method set get blok
    public void insertBlok (String isi){
    this.blok.add(isi);
    }
    
    public ArrayList <String> getBlok(){
    return this.blok;
    }
    
    //method set get posisi
    public void insertPosisi (String isi){
    this.posisi.add(isi);
    }
    
    public ArrayList <String> getPosisi(){
    return this.posisi;
    }
    
    //method set get luas
    public void insertLuas (String isi){
    this.luas.add(isi);
    }
    
    public ArrayList <String> getLuas(){
    return this.luas;
    }
    
    //method set get harga
    public void insertHarga (int isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getHarga(){
    return this.harga;
    }
    
    //method set get status
    public void insertStatus (String isi){
    this.status.add(isi);
    }
    
    public ArrayList <String> getStatus(){
    return this.status;
    }
    
}
