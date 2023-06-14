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
public class datapemesanan {
   private ArrayList<String> tanggal;
    
    public datapemesanan(){
   tanggal = new ArrayList<String>();
 }; //konstruktor 
    
    public void Inserttanggal(String isi){
     this.tanggal.add(isi);
 }
    
    public ArrayList<String> getRecordtanggal(){
     return this.tanggal;
 }
    
    
}
