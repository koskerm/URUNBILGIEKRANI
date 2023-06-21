
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
  
public class GUIMüşteri
{
    private JFrame pencere; // program penceresi
    private JPanel p_Panel;  // Swing bileşenleri için
    //private Container bilesenKonteyneri; // pencereinin konteyneri
  
    private JTextField t_musteriID,t_ad,t_urunID,t_krediKartNumarasi,t_cep_telefonu;
    private JLabel     l_musteriID,l_ad,l_urunID,l_rediKartNumarasi,l_cep_telefon;
   // private JComboBox  c_Cinsiyet;
    private JButton    b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorÜrün kontrolor;
     public GUIMüşteri(KontrolorMüşteri p_kontrolor)
    {
     
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      //menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }
    
    public GUIMüşteri()
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
      
      l_musteriID       = new JLabel ("Müşteri ID :"); 
      t_musteriID    = new JTextField (10);
      l_ad    = new JLabel ("Müşteri Adı :"); 
      t_ad    = new JTextField (10);
      l_urunID  = new JLabel ("Urun ID:"); 
      t_urunID  = new JTextField (10);   
      l_rediKartNumarasi = new JLabel ("Numara "); 
      t_krediKartNumarasi = new JTextField (10);   

      // Panel üstüne ekleniyor
      p_Panel.add(l_musteriID);
      p_Panel.add(t_musteriID);
      p_Panel.add(l_urunID );
      p_Panel.add(t_urunID);
      p_Panel.add(l_rediKartNumarasi);
      p_Panel.add(t_krediKartNumarasi);
      //p_Panel.add(t_cep_telefonu);
      //p_Panel.add(t_cep_telefonu);
      p_Panel.add(b_Kaydet);
      
      p_Pencere.add( p_Panel);
    }
    
    private void menuBarHazirla (JFrame p_Pencere )
    {
        // Ana menü bar
        JMenuBar menuBar = new JMenuBar();
        // Ürün bilgileri alt menüsü
        JMenu m_MüşteriBilgiMenusu = new JMenu("Müşteri Bilgileri");
        JMenuItem mi_k1,mi_k2, mi_k3 ;
        mi_k1 =new JMenuItem("Müşteri Bilgileri");  
        mi_k2 =new JMenuItem("Kredi Kartı Bilgileri");  
        mi_k3 =new JMenuItem("Cep Telefonu Bilgileri");  
        m_MüşteriBilgiMenusu.add(mi_k1);
        m_MüşteriBilgiMenusu.add(mi_k2);
        m_MüşteriBilgiMenusu.add(mi_k3);
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
        menuBar.add(m_MüşteriBilgiMenusu);
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
              // KontrollorMüşteri Nesnesine Bilgi Veriliyor!
             
          }
        }
    
    }
}
// GUI class


