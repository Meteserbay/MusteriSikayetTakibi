/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musteritakipsistemi;

import java.util.ArrayList;

/**
 *
 * @author Meteserbay
 */
public class Musteri {
    private String musteriAdı;
    private String musteriSoyadı;
    private int dogumYili;
    private int musteriID;
    
    ArrayList<String> müsteriAdlari=new ArrayList<String>();
    ArrayList<String> müsteriSoyadlari=new ArrayList<String>();
    ArrayList müsteridogumYillari=new ArrayList();
    ArrayList müsteriIDs=new ArrayList();
    
    public void diziyeEkleme(){
        müsteriAdlari.add(this.musteriAdı);
        müsteriSoyadlari.add(this.musteriSoyadı);
        müsteridogumYillari.add(this.dogumYili);
        müsteriIDs.add(this.musteriID);
        System.out.println("Müşteri Eklendi...");
    }
    
    public Musteri(String ad,String soyad,int dogumyili,int sirasi){
        this.musteriAdı=ad;
        this.musteriSoyadı=soyad;
        this.dogumYili=dogumyili;
        this.musteriID=sirasi;
        
    }
    
    public void müsteriEkle(String ad,String soyad,int dogumyili,int sirasi){
        this.musteriAdı=ad;
        this.musteriSoyadı=soyad;
        this.dogumYili=dogumyili;
        this.musteriID=sirasi;
        System.out.println("Müşteri Eklendi...");
    }
    
    public void musteriSil(String ismi,String soyismi){
        for(int i=0;i<müsteriIDs.size();i++){
            if(ismi==müsteriAdlari.get(i)&&soyismi==müsteriSoyadlari.get(i)){
                müsteriAdlari.remove(i);
                müsteriSoyadlari.remove(i);
                müsteridogumYillari.remove(i);
                müsteriIDs.remove(i);
            }

        }
    }
    
    public void musteriDuzenle(String isim,String soyisim,String yeniisim,String yenisoyisim,int yenidogumtarihi){
        for(int k=0;k<müsteriIDs.size();k++){
            if(isim==müsteriAdlari.get(k)&&soyisim==müsteriSoyadlari.get(k)){
                müsteriAdlari.set(k,yeniisim);
                müsteriSoyadlari.set(k,yenisoyisim);
                müsteridogumYillari.set(k,yenidogumtarihi);
            }
        }
        
    }
    
    public void musteriGoster(){
        for(int j=0;j<müsteriIDs.size();j++){
            int sayac=1;
            System.out.println(sayac+"."+" müşteri:");
            System.out.println("Adı:"+müsteriAdlari.get(j));
            System.out.println("Soyadı:"+müsteriSoyadlari.get(j));
            System.out.println("Doğum yılı:"+müsteridogumYillari.get(j));
            System.out.println("Müşteri ID:"+müsteriIDs.get(j));
        }
        
    }
    
    public Musteri(){
        System.out.println("Müşteri oluşturuldu.");
    }
    public void setMusteriAdi(String ad){
        this.musteriAdı=ad;
    }
    
    public String getMusteriAdi(){
        return musteriAdı;
    }
    
    public void setMusteriSoyadi(String soyad){
        this.musteriSoyadı=soyad;
    }
    
    public String getMusteriSoyadi(){
        return musteriSoyadı;
    }
    
    public void setDogumYili(int dogumyili){
        this.dogumYili=dogumyili;
    }
    
    public int getDogumyili(){
        return dogumYili;
    }
    
    public void setMusteriSirasi(int sirasi){
        this.musteriID=sirasi;
    }
    
    public int getMusteriSirasi(){
        return musteriID;
    }
}
