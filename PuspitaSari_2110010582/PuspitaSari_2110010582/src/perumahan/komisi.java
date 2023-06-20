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
public class komisi {
    
    private ArrayList<Integer> jumlah;
    private ArrayList<String> status;
    
    public komisi(){
        jumlah = new ArrayList<Integer>();
        status = new ArrayList<String>();
    }
    
    //method set get jumlah
    public void insertJumlah (Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getJumlah(){
    return this.jumlah;
    }
    
    //method set get status
    public void insertStatus (String isi){
    this.status.add(isi);
    }
    
    public ArrayList <String> getStatus(){
    return this.status;
    }
    
}
