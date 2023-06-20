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
public class pemesanan {
    
    private ArrayList <String> tanggal;
    
    public pemesanan(){
        tanggal = new ArrayList<String>();
    }
    
    //method set get tanggal
    public void insertTanggal(String isi){
    this.tanggal.add(isi);
    }
    
    public ArrayList<String> getTanggal(){
    return this.tanggal;
    }
    
}
