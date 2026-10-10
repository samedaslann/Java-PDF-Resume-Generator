package com.example; 

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

// Erişim Düzenleyici (Access Modifier): 'public' olduğu için Main sınıfından erişilebilir.
public class PdfManager {

    // Kapsülleme (Encapsulation): 'private' yapıldı, dışarıdan doğrudan değiştirilemez.
    private String dosyaAdi;

    // Sınıfın Kurucu Metodu (Constructor).
    public PdfManager(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public void ozgecmisOlustur() {
        // Document sınıfından bir 'nesne' (object) yaratıyoruz.
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(dosyaAdi));
            document.open();

            Font baslikFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20, BaseColor.BLACK);
            Paragraph baslik = new Paragraph("SAMED ASLAN - OZGECMIS", baslikFont);
            baslik.setAlignment(Element.ALIGN_CENTER);
            document.add(baslik);
            document.add(new Paragraph(" ")); 

            try {
                // Image nesnesi yaratılıyor
                Image profilFoto = Image.getInstance("profil.jpg");
                profilFoto.scaleAbsolute(100, 100);
                profilFoto.setAlignment(Element.ALIGN_CENTER);
                document.add(profilFoto);
            } catch (Exception e) {
                document.add(new Paragraph("(Fotograf bulunamadi!)"));
            }
            document.add(new Paragraph(" "));

            document.add(new Paragraph("E-posta: samed.aslan2107@gmail.com"));
            document.add(new Paragraph("Egitim: Kirklareli Universitesi - Yazilim Muhendisligi"));
            document.add(new Paragraph(" "));
            
            Font altBaslikFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLUE);
            document.add(new Paragraph("IS DENEYIMLERI", altBaslikFont));
            document.add(new Paragraph(" "));

            document.add(new Paragraph("1. Huawei Student Developers - Etkinlik Yoneticisi (2025 - 2026)"));
            document.add(new Paragraph("Ogrenci gelistiriciler icin egitim kamplari ve teknoloji atolyeleri duzenledim."));
            document.add(new Paragraph(" "));

            document.add(new Paragraph("2. TEDxKirklareliUniversity - Lisans Sahibi ve Organizator (2024 - 2025)"));
            document.add(new Paragraph("'Sinirlari Asmak' temali resmi TEDx etkinliginin saha operasyonlarini yonettim."));
            document.add(new Paragraph(" "));

            document.add(new Paragraph("3. CyberTech A.S. - Junior Backend Developer (2023 - 2024)"));
            document.add(new Paragraph("C ve Java dillerini kullanarak sistemler gelistirdim."));

            document.close();
            System.out.println("PDF basariyla olusturuldu!");

        } catch (Exception e) {
            System.out.println("Hata! PDF olusturulamadi.");
            e.printStackTrace();
        }
    }
}