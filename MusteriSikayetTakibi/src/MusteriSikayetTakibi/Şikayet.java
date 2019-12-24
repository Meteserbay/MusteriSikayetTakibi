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
public class Şikayet extends Musteri{
    private String sikayet;
    
    ArrayList sikayetler=new ArrayList();
    ArrayList sikayetIds=new ArrayList();
    
    public Şikayet(String ad, String soyad, int dogumyili, int sirasi,String sikayet){
        super(ad,soyad,dogumyili,sirasi);
        this.sikayet=sikayet;
    }
    
    public Şikayet(){
        System.out.println("Şikayet Oluşturuldu.");
        
    }
    
    @Override
    public void musteriSil(String ismi,String soyismi){
        for(int i=0;i<müsteriIDs.size();i++){
            if(ismi==müsteriAdlari.get(i)&&soyismi==müsteriSoyadlari.get(i)){
                sikayetler.remove(i);
                sikayetIds.remove(i);
            }

        }
    }
    
    public void sikayetEkle(String ad,String soyad,String sikayet){
        for(int i=0;i<müsteriIDs.size();i++){
            if(ad==müsteriAdlari.get(i)&&soyad==müsteriSoyadlari.get(i)){
                sikayetler.add(i,sikayet);
                sikayetIds.add(i,i);
            }
        }
    }
    
    public void sikayetSil(String ad,String soyad){
        for(int i=0;i<müsteriIDs.size();i++){
            if(ad==müsteriAdlari.get(i)&&soyad==müsteriSoyadlari.get(i)){
                sikayetler.remove(i);
                sikayetIds.remove(i);
            }
        }
    }
    
    public void goruntuleSikayet(String ad,String soyad){
        super.musteriGoster();
        for(int i=0;i<super.müsteriIDs.size();i++){
            if(ad==super.müsteriAdlari.get(i)&&soyad==super.müsteriSoyadlari.get(i)){
                System.out.println(ad+" "+soyad+" isimli müşterinin şikayeti:"+sikayetler.get(i));
            }
        }
    }
}
