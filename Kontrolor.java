
/**
 * Write a description of class Kontrolor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kontrolor
{
    private KontrolorÜrün m_urun_adi;
    private Kullanıcı m_kullanıcı; 
    private KontrolorSipariş_ödeme m_siparisödeme;
    private KontrolorMüşteri m_musteri;
    public Kontrolor()
    {
        m_urun_adi=new KontrolorÜrün();
        m_kullanıcı=new Kullanıcı();
        m_siparisödeme=new KontrolorSipariş_ödeme();
        m_musteri=new KontrolorMüşteri();
    }

    
}
