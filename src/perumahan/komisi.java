/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perumahan;

/**
 *
 * @author ASUS
 */
public class komisi {
    
    private int jumlah;
    private String status;
    
    public komisi(int jumlah, String status){
        setJumlahKomisi(jumlah);
        setStatusKomisi(status);
    }
    
    //method set
    public void setJumlahKomisi(int jumlah){
        this.jumlah = jumlah;
    }
    public void setStatusKomisi(String status){
        this.status = status;
    }
    
    //method get
    public int getJumlahKomisi(){
        return jumlah;
    }
    public String getStatusKomisi(){
        return status;
    }
    
}
