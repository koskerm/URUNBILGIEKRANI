
/**
 * Write a description of class Sipariş_ödeme here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KontrolorSipariş_ödeme
{       
     private GUISipariş_ödeme guiSiparişödeme;
    private  DBModelSipariş_ödeme m_modelSiparişödeme;
    
    private int siparisID;
    private int urunID;
    private int musteriID; 
    private double siparisMiktari; 
    private double odenecekTutar;
    private String siparisTarihi;
    private String siparisDurumu;
    private String teslimAdresi ;
    
    
    
   
        public KontrolorSipariş_ödeme()
    {
       guiSiparişödeme = new GUISipariş_ödeme();
      
      
    }
    public KontrolorSipariş_ödeme(int p_musteriID)
    {
        musteriID=p_musteriID;
    }
    
    public KontrolorSipariş_ödeme(int p_siparisID,double p_odenecekTutar)
    {
        siparisID=p_siparisID;
        odenecekTutar=p_odenecekTutar;
    }
    public KontrolorSipariş_ödeme(int p_cep_telefonu,String p_ad)
    {
                
    }
    
protected void MüşteriBilgileriKayit (String p_urunBilgisi)
    {
       // KontrolorÜrünBilgisi GUI'den Bilgiyi Alıp İşlemler Yapıyor!
        System.out.println( "ad"  + "adli bilgi aydedilmiştir!");
    
    }
    
}
