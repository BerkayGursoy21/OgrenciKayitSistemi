import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anasayfa extends JFrame {
    private JButton btn_derskayitformu;
    private JButton btn_ogrencikayit;
    private JPanel JPanel;

    public anasayfa(){


        setTitle("ANASAYFA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,  300);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(JPanel);

        // DERS KAYIT BUTONU
        btn_derskayitformu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                derskayitformu dersKayitForm = new derskayitformu();
                dersKayitForm.setVisible(true);
            }
        });

        // ÖĞRENCİ KAYIT BUTONU
        btn_ogrencikayit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OgrenciKayitForm ogrenciKayitForm = new OgrenciKayitForm();
                ogrenciKayitForm.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new anasayfa();
    }
}
