

public class KontrolorÜrün
{
    private GUIÜrün guiUrun;
    private  DBModelUrun m_modelUrun;

    
    private int urunID;
    private String barkod;
    private String urun_adi;
    private String urun_grubu;
    private String urun_uretici_markasi; 
    private String tedarikci;
    private String satis_birimi; 
    private double birim_fiyati; 
    private int stok_miktari;
    private String bulundugu_sube_kodu ;
    
    public KontrolorÜrün()
    {
        guiUrun = new GUIÜrün(this);
      
      m_modelUrun = new DBModelUrun("Ülker");
      
    }
    
    public int geturunID()
    {
        return urunID;
    }
    public int geturunID(String p_barkod)
    {
        return urunID;
    }
    public int geturunID(double p_birim_fiyati,String p_urun_grubu)
    {
        return urunID;
    }
    
    protected void ÜrünBilgileriKayit (String p_urunBilgisi)
    {
       // KontrolorÜrünBilgisi GUI'den Bilgiyi Alıp İşlemler Yapıyor!
        System.out.println( p_urunBilgisi  + " adli bilgi aydedilmiştir!");
        m_modelUrun.veriKaydet (p_urunBilgisi);
    }
        
}
