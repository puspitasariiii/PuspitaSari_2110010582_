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
public class databerkas {
    private ArrayList<String> photo;
    private ArrayList<Integer> ktp;
    private ArrayList<Integer> kk;
    private ArrayList<String> skbmr;
    private ArrayList<String> npwp;
    private ArrayList<String> slipgaji; 
    
    public databerkas(){
   photo = new ArrayList<String>();
   ktp = new ArrayList<Integer>();
   kk = new ArrayList<Integer>();
   skbmr = new ArrayList<String>();
   npwp = new ArrayList<String>();
   slipgaji = new ArrayList<String>();
 }; //konstruktor
    
    public void Insertphoto(String isi){
     this.photo.add(isi);
 }
    
    public ArrayList<String> getRecordphoto(){
     return this.photo;
 }
    
    public void Insertktp(Integer isi){
     this.ktp.add(isi);
 }
    
    public ArrayList<Integer> getRecordktp(){
     return this.ktp;
 }
    
    public void Insertkk(Integer isi){
     this.kk.add(isi);
 }
    
    public ArrayList<Integer> getRecordkk(){
     return this.kk;
 }
    
    public void Insertskbmr(String isi){
     this.skbmr.add(isi);
 }
    
    public ArrayList<String> getRecordskbmr(){
     return this.skbmr;
 }
    
    public void Insertnpwp(String isi){
     this.npwp.add(isi);
 }
    
    public ArrayList<String> getRecordnpwp(){
     return this.npwp;
 }
    
    public void Insertslipgaji(String isi){
     this.slipgaji.add(isi);
 }
    
    public ArrayList<String> getRecordslipgaji(){
     return this.slipgaji;
 }
    
}
