

public class KontrolorMüşteri

{
    private GUIMüşteri guiMusteri;
    private  DBModelMüşteri m_modelMusteri;
    
    private int musteriID;
    private String ad;
    private String soyad;
    private int krediKartNumarasi;
    private String cinsiyet;
    private int cep_telefonu;
    private String eposta;
    private String adresi;
    private String musteriKriptoluSifre ;
    private String modelUrun;
     
    public KontrolorMüşteri()
    {
       guiMusteri = new GUIMüşteri(this);
      
      
    }
    public KontrolorMüşteri(int p_musteriID)
    {
        musteriID=p_musteriID;
    }
    
    public KontrolorMüşteri(String p_ad,int p_cep_telefonu)
    {
        ad=p_ad;
        cep_telefonu=p_cep_telefonu;
    }
    public KontrolorMüşteri(int p_cep_telefonu,String p_ad)
    {
        cep_telefonu=p_cep_telefonu;
        ad=p_ad;
        
    }
    
protected void MüşteriBilgileriKayit (String p_urunBilgisi)
    {
       // KontrolorÜrünBilgisi GUI'den Bilgiyi Alıp İşlemler Yapıyor!
        System.out.println( "ad"  + "adli bilgi aydedilmiştir!");
    
    }
    
}
