
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
  
public class GUISipariş_ödeme
{
    private JFrame pencere; // program penceresi
    private JPanel p_Panel;  // Swing bileşenleri için
    //private Container bilesenKonteyneri; // pencereinin konteyneri
  
    private JTextField t_siparisID,t_odenecekTutar,t_urunID,t_teslimAdresii,t_siparisDurumu;
    private JLabel     l_siparisID,l_odenecekTutar,l_urunID,l_teslimAdresi,l_siparisDurumu;
   // private JComboBox  c_Cinsiyet;
    private JButton    b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorÜrün kontrolor;
     public GUISipariş_ödeme (KontrolorÜrün p_kontrolor)
    {
      kontrolor = p_kontrolor ;
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      //menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }
    
    public GUISipariş_ödeme()
    {
        olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      //menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true);   
    }
    
    private void pencereHazirla (JFrame p_Pencere )
    {
      // Program için görünür olmayan bir pencere oluştur
      pencere = new JFrame ("Ürün Bilgi Giriş Ekranı");
      pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pencere.setSize(700, 400);
    }
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      
      b_Kaydet    = new JButton ("KAYDET");
      b_Kaydet.addActionListener(olayDinleyici);
      
      l_siparisID       = new JLabel ("Sipariş Kodu :"); 
      t_siparisID    = new JTextField (10);
      l_odenecekTutar   = new JLabel ("Ödenecek Tutar :"); 
      t_odenecekTutar    = new JTextField (10);
      l_urunID  = new JLabel ("Ürün Kodu:"); 
      t_urunID  = new JTextField (10);   
      l_siparisDurumu = new JLabel ("Teslim Durumu:"); 
      t_siparisDurumu = new JTextField (10);   

      // Panel üstüne ekleniyor
      p_Panel.add(l_siparisID );
      p_Panel.add(t_siparisID );
      p_Panel.add(l_odenecekTutar );
      p_Panel.add(t_odenecekTutar);
      p_Panel.add(l_urunID );
      p_Panel.add(t_urunID );
      p_Panel.add(l_siparisDurumu);
      p_Panel.add(t_siparisDurumu);
      p_Panel.add(b_Kaydet);
      
      p_Pencere.add( p_Panel);
    }
    
    private void menuBarHazirla (JFrame p_Pencere )
    {
        // Ana menü bar
        JMenuBar menuBar = new JMenuBar();
        // Ürün bilgileri alt menüsü
        JMenu m_ÜrünBilgiMenusu = new JMenu("Ürün Bilgileri");
        JMenuItem mi_k1,mi_k2, mi_k3 ;
        mi_k1 =new JMenuItem("Ürün Bilgileri");  
        mi_k2 =new JMenuItem("Fiyat Bilgileri");  
        mi_k3 =new JMenuItem("Stok Bilgileri");  
        m_ÜrünBilgiMenusu.add(mi_k1);
        m_ÜrünBilgiMenusu.add(mi_k2);
        m_ÜrünBilgiMenusu.add(mi_k3);
        // Müsteri bilgileri alt menüsü
        JMenu m_MüsteriMenusu = new JMenu("Müşteri Bilgileri");
        JMenuItem mi_d1,mi_d2 ;
        mi_d1 =new JMenuItem("kredi Kart Numarasi:");  
        mi_d2 =new JMenuItem("cep telefonu");  
        m_MüsteriMenusu.add(mi_d1);
        m_MüsteriMenusu.add(mi_d2);        // Siparis Bilgileri alt menüsü
        JMenu m_SiparisMenusu = new JMenu("Sipariş Bilgileri");
        JMenuItem mi_n1,mi_n2 ;
        mi_n1 =new JMenuItem("siparis ID");  
        mi_n2 =new JMenuItem("siparisDurumu");  
        m_SiparisMenusu.add(mi_n1);
        m_SiparisMenusu.add(mi_n2);   
        menuBar.add(m_SiparisMenusu);
        menuBar.add(m_ÜrünBilgiMenusu);
        menuBar.add(m_MüsteriMenusu);
        p_Pencere.setJMenuBar(menuBar);
    }

    public String getAdi ()
    {
        return "";
    }

    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kaydet)// Eğer butona tıklanmışsa
          {
              // KontrollorÜrün Nesnesine Bilgi Veriliyor!
              kontrolor.ÜrünBilgileriKayit(t_urunID.getText());
          }
        }
    }
    
}// GUI class

    
    