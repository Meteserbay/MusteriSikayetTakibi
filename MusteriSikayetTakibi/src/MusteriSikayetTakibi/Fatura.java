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
public class Fatura extends Musteri{
    private int kullanimSaati;
    private int ucret;
    private int sonOdemeTarihiAy;
    private int gecikmeSuresiGun;
    private int faturaID;
    
    ArrayList faturaIDs=new ArrayList();
    ArrayList kullanimSaatleri=new ArrayList();
    ArrayList ücretler=new ArrayList();
    ArrayList sonOdemeTarihleriAy=new ArrayList();
    ArrayList gecikmeSureleriGun=new ArrayList();
    
    public Fatura(String ad, String soyad, int dogumyili, int sirasi,int kullanimSaati,int gecikmeSuresi,int faturaID) {
        super(ad, soyad, dogumyili, sirasi);
        this.kullanimSaati=kullanimSaati;
        this.gecikmeSuresiGun=gecikmeSuresi;
        this.faturaID=faturaID;
    }
    
    
    public Fatura(){
        System.out.println("Fatura oluşturuldu.");
    }
    
    @Override
    public void musteriGoster(){
        super.musteriGoster();
        for(int j=0;j<faturaIDs.size();j++){
            int sayac=1;
            System.out.println(sayac+"."+" müşteri:");
            System.out.println("Kullanım saati:"+kullanimSaatleri.get(j));
            System.out.println("Ücreti:"+ücretler.get(j));
            System.out.println("Son ödeme tarihi:"+sonOdemeTarihleriAy.get(j));
            System.out.println("Gecikme süresi:"+gecikmeSureleriGun.get(j));
            System.out.println("Fatura Idsi:"+faturaIDs.get(j));
        }
    }
    
    public void faturaEkle(int kullanimSaati,int sonOdemeTarihiay,int gecikmeSuresi,int faturaID){
        this.kullanimSaati=kullanimSaati;
        this.gecikmeSuresiGun=gecikmeSuresi;
        this.faturaID=faturaID;
        this.sonOdemeTarihiAy=sonOdemeTarihiay;
        ücretlendirme(kullanimSaati,gecikmeSuresi);
    }
    
    @Override
    public void musteriSil(String ismi,String soyismi){
        for(int i=0;i<müsteriIDs.size();i++){
            if(ismi==müsteriAdlari.get(i)&&soyismi==müsteriSoyadlari.get(i)){             
                faturaIDs.remove(i);
                kullanimSaatleri.remove(i);
                ücretler.remove(i);
                sonOdemeTarihleriAy.remove(i);
                gecikmeSureleriGun.remove(i);
            }

        }
    }
    
    public void faturaGoster(String isim,String soyisim){
        super.musteriGoster();
        for(int i=0;i<super.müsteriIDs.size();i++){
            if(isim==super.müsteriAdlari.get(i)&&soyisim==super.müsteriSoyadlari.get(i)){
                System.out.println(isim+" "+soyisim+" isimli müşterinin kullanım saati:"+kullanimSaatleri.get(i));
                System.out.println("\n Gecikme süresi:"+gecikmeSureleriGun.get(i));
                System.out.println("\n Fatura tutarı:"+ücretler.get(i));
            }
        }
    }
    
    
    
    public void faturadiziyeEkleme(){
        kullanimSaatleri.add(this.kullanimSaati);
        ücretler.add(this.ucret);
        gecikmeSureleriGun.add(this.gecikmeSuresiGun);
        faturaIDs.add(this.faturaID);
        sonOdemeTarihleriAy.add(this.sonOdemeTarihiAy);
    }

    public void ücretlendirme(int kullanimSaati,int gecikme){
        this.ucret=(kullanimSaati*5)+(gecikme*10);
    }
    
}