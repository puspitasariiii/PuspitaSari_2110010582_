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
public class datarumah {
     private ArrayList<String> blok;
    private ArrayList<String> posisi;
    private ArrayList<String> luas;
    private ArrayList<Integer> harga;
    private ArrayList<String> status;
    
public datarumah(){
   blok = new ArrayList<String>();
   posisi = new ArrayList<String>();
   luas = new ArrayList<String>();
   harga = new ArrayList<Integer>();
   status = new ArrayList<String>();
 }; //konstruktor

public void Insertblok(String isi){
     this.blok.add(isi);
 }
    
    public ArrayList<String> getRecordblok(){
     return this.blok;
 }
    public void Insertposisi(String isi){
     this.posisi.add(isi);
 }
    
    public ArrayList<String> getRecordposisi(){
     return this.posisi;
 }
    
    public void Insertluas(String isi){
     this.luas.add(isi);
 }
    
    public ArrayList<String> getRecordluas(){
     return this.luas;
 }
    
    public void Insertharga(Integer isi){
     this.harga.add(isi);
 }
    
    public ArrayList<Integer> getRecordharga(){
     return this.harga;
 }
    
    public void Insertstatus(String isi){
     this.status.add(isi);
 }
    
    public ArrayList<String> getRecordstatus(){
     return this.status;
 }
    
}
