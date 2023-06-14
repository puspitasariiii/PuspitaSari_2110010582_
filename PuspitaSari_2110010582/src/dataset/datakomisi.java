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
public class datakomisi {
    private ArrayList<Integer> jumlah;
    private ArrayList<String> status;
    
    public datakomisi(){
   jumlah = new ArrayList<Integer>();
   status = new ArrayList<String>();
 }; //konstruktor
    
    public void Insertjumlah(Integer isi){
     this.jumlah.add(isi);
 }
    
    public ArrayList<Integer> getRecordjumlah(){
     return this.jumlah;
 }
    
    public void Insertstatus(String isi){
     this.status.add(isi);
 }
    
    public ArrayList<String> getRecordstatus(){
     return this.status;
 }
    
}
