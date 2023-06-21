
public class DBModelSipariş_ödeme extends DBAbstractModel 
{
   private String m_urun_adi = "";
    
    public DBModelSipariş_ödeme()
    {
     
    } 
    
    
  protected  void  veriTabaninaBaglan ()
  {
      System.out.println ("MySQL veri tabanına bağlanı");
      
  }
    
    public DBModelSipariş_ödeme(String p_urunAdi)
    {
      m_urun_adi = m_urun_adi;
    }
  
    
    
    public String getUrunAdi ()
    {
        // put your code here
        return m_urun_adi;
    }
    
    public void setUrunAdi (String p_Adi)
    {
        // put your code here
        m_urun_adi = p_Adi;
    }
    
    
    public void veriKaydet(String p_urunBilgisi)
    {
         System.out.println ("Ürün MySQL veri tabanına kaydedilmiştir");
      
    }    
    

    
}
