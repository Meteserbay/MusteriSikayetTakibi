/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musteritakipsistemi;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Meteserbay
 */
public class MusteriTakipSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Musteri m1=new Musteri();
        Fatura f1=new Fatura();
        Şikayet s1=new Şikayet();
        Scanner girdi=new Scanner(System.in);
        int secim = menu();
        
        while(secim<9){
            switch(secim){
                case 0:
                    int sayac=0;      
                    System.out.println("Müşteri eklemeyi seçtiniz...");
                    System.out.println("Müşteri bilgileri...");
                    System.out.println("Müşteri ismi:");
                    String isim=girdi.next();
                    System.out.println("Müşteri soyadı:");
                    String soyad=girdi.next();
                    System.out.println("Müşteri doğum yılı:");
                    int dogumYili=girdi.nextInt();
                    m1.müsteriEkle(isim,soyad,dogumYili,sayac);
                    m1.diziyeEkleme();   
                    System.out.println("Fatura bilgileri...");
                    System.out.println("Kullanım Saati:");
                    int saat=girdi.nextInt();
                    System.out.println("Gecikme süresi:");
                    int gecikme=girdi.nextInt();
                    System.out.println("Son ödeme tarihi(YIL):");
                    int sonodeme=girdi.nextInt();
                    f1.faturaEkle(saat,sonodeme,gecikme,sayac);
                    f1.faturadiziyeEkleme();
                    
                    sayac+=1;
                    secim=menu();
                    break;
                    /*m1.müsteriAdlari.add(isim);
                    m1.müsteriSoyadlari.add(soyad);
                    m1.müsteridogumYillari.add(dogumYili);
                    m1.müsteriIDs.add(sayac);*/
                    
                case 1:
                    
                    System.out.println("Müşteri silmeyi seçtiniz...");
                    System.out.println("Silmeyi seçtiniz...");
                    System.out.println("Silinecek müşteri ismi:");
                    String silinecekisim=girdi.next();
                    System.out.println("Silinecek müşteri soyadı:");
                    String silineceksoyad=girdi.next();
                    f1.musteriSil(silinecekisim,silineceksoyad);
                    s1.musteriSil(silinecekisim,silineceksoyad);
                    m1.musteriSil(silinecekisim,silineceksoyad);
                    secim=menu();
                    break;
                    
                case 2: 
                    System.out.println("Müşteri fatura görüntülemeyi seçtiniz...");
                    System.out.println("Faturası gösterilecek müşterinin ismi:");
                    String gosterisim=girdi.next();
                    System.out.println("Faturası gösterilecek müşterinini soyadı:");
                    String gostersoyad=girdi.next();
                    f1.faturaGoster(gosterisim,gostersoyad);
                    secim=menu();
                    break;
                    
                case 3:
                    System.out.println("Müşterileri listelemeyi seçtiniz...");
                    f1.musteriGoster();
                    secim=menu();
                    break;
                case 4:
                    System.out.println("Müşterileri düzenlemeyi seçtiniz...");
                    System.out.println("Düzenlenecek müşteri ismi:");
                    String duzenleisim=girdi.next();
                    System.out.println("Düzenlenecek müşteri soyadı:");
                    String duzenlesoyad=girdi.next();              
                    System.out.println("Düzenlenecek müşteri yeni ismi:");
                    String yeniisim=girdi.next();
                    System.out.println("Düzenlenecek müşteri yeni soyadı:");
                    String yenisoyad=girdi.next();
                    System.out.println("Düzenlenecek müşteri yeni doğum tarihi:");
                    int yenidogumtarihi=girdi.nextInt();
                    System.out.println("Yeni fatura:");
                    int yenifatura=girdi.nextInt();
                    f1.musteriDuzenle(duzenleisim,duzenlesoyad,yeniisim,yenisoyad,yenidogumtarihi);
                    secim=menu();
                    break;
                case 5:
                    System.out.println("Müşteri şikayet görüntülemeyi seçtiniz...");
                    System.out.println("Şikayeti görüntülenecek müşteri ismi:");
                    String sikayetisim=girdi.next();
                    System.out.println("Şikayeti görüntülenecek müşteri soyadı:");
                    String sikayetsoyad=girdi.next();
                    s1.goruntuleSikayet(sikayetisim,sikayetsoyad);
                    secim=menu();
                    break;
                case 6:
                    System.out.println("Şikayet eklenecek müşteri ismi:");
                    String eklesikayetisim=girdi.next();
                    System.out.println("Şikayet eklenecek müşteri soyadı:");
                    String eklesikayetsoyad=girdi.next();
                    System.out.println("Şikayet giriniz:");
                    String sikayet=girdi.next();
                    s1.sikayetEkle(eklesikayetisim, eklesikayetsoyad, sikayet);
                    secim=menu();
                    break;
                case 7:
                    System.out.println("Şikayet eklenecek müşteri ismi:");
                    String silsikayetisim=girdi.next();
                    System.out.println("Şikayet eklenecek müşteri soyadı:");
                    String silsikayetsoyad=girdi.next();
                    s1.sikayetSil(silsikayetisim, silsikayetsoyad);
                    secim=menu();
                    break;
                case 8:
                    System.out.println("Çıkış...");
                    secim=10;
                    break;
            }
            
        }
        menu();
    }
    
    public static int menu(){
        Scanner girdi=new Scanner(System.in);
        System.out.println("[0]  ----  Müşteri Eklemek için/Fatura eklemek için");
        System.out.println("[1]  ----  Müşteri Silmek için");
        System.out.println("[2]  ----  Müşteri Fatura görüntülemek için");
        System.out.println("[3]  ----  Müşterileri listelemek için");
        System.out.println("[4]  ----  Müşterileri düzenlemek için");
        System.out.println("[5]  ----  Müşteri şikayet görüntülemek için");
        System.out.println("[6]  ----  Müşteri şikayet eklemek için");
        System.out.println("[7]  ----  Müşteri şikayet silmek için");
        System.out.println("[8]  ----  Çıkış...");
        System.out.print("\nSeciminiz: ");
        int secim = girdi.nextInt();
        return secim;
    }
    
    
}
