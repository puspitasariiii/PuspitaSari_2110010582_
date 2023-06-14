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
public class datapembeli {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> telpon;
    private ArrayList<String> pekerjaan;
    private ArrayList<String> jeniskelamin;
    private ArrayList<String> status;
    
    public datapembeli(){
   nama = new ArrayList<String>();
   alamat = new ArrayList<String>();
   telpon = new ArrayList<String>();
   pekerjaan = new ArrayList<String>();
   jeniskelamin = new ArrayList<String>();
   status = new ArrayList<String>();
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
    
     public void Insertpekerjaan(String isi){
     this.pekerjaan.add(isi);
 }
    
    public ArrayList<String> getRecordpekerjaan(){
     return this.pekerjaan;
 }
     public void Insertjeniskelamin(String isi){
     this.jeniskelamin.add(isi);
 }
    
    public ArrayList<String> getRecordjeniskelamin(){
     return this.jeniskelamin;
 }
    
     public void Insertstatus(String isi){
     this.status.add(isi);
 }
    
    public ArrayList<String> getRecordstatus(){
     return this.status;
 }
}
