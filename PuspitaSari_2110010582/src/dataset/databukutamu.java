/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class databukutamu {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telpon;
    
public databukutamu(){
   nama = new ArrayList<String>();
   alamat = new ArrayList<String>();
   telpon = new ArrayList<String>();
 }; //konstruktor
 
 public void Insertnama(String isi){
     this.nama.add(isi);
 }
    
    public ArrayList<String> getRecordnama(){
     return this.nama;
 }
    
    public void Insertalamat(String isi){
     this.alamat.add(isi);
 }
    
    public ArrayList<String> getRecordalamat(){
     return this.alamat;
 }
    
    public void Inserttelpon(String isi){
     this.telpon.add(isi);
 }
    
    public ArrayList<String> getRecordtelpon(){
     return this.telpon;
 }
    
}
