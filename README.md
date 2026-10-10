Java PDF Resume Generator

Bu proje, Java programlama dili ve nesne yönelimli programlama (OOP) prensipleri kullanılarak geliştirilmiş, dinamik bir PDF özgeçmiş oluşturucu uygulamasıdır. Proje, konsol üzerinden çalışmakta olup, özgeçmiş içeriğini doğrudan bir PDF dosyası olarak dışa aktarmaktadır.

Kullanılan Teknolojiler ve Bileşenler

Java: Uygulamanın temel dili olarak kullanılmıştır. Nesne yönelimli yapısı sayesinde kod modüler ve sürdürülebilir hale getirilmiştir.

iTextPDF (v5.5.13): Java ekosisteminde PDF dökümanları oluşturmak ve düzenlemek için kullanılan açık kaynaklı kütüphanedir. Görsel yerleşimi (Image) ve metin formatlamaları (Paragraph, Font) için tercih edilmiştir.

Maven: Bağımlılık yönetimi (dependency management) için kullanılarak iText kütüphanesinin projeye sorunsuz entegre edilmesini sağlamıştır.

Mimari Yapı ve OOP Kullanımı

Proje, "Separation of Concerns" (Sorumlulukların Ayrılığı) prensibine uygun tasarlanmıştır:

Main.java: Uygulamanın giriş noktasıdır. Sadece PdfManager nesnesinin üretimini (yaşam döngüsünün başlatılması) ve PDF oluşturma sürecinin tetiklenmesini yönetir.

PdfManager.java: PDF oluşturma işleminin tüm iş mantığını (Business Logic) barındırır. Dosya I/O işlemleri, görsel yerleşimleri ve erişim düzenleyiciler (private/public) kullanılarak veri gizliliği bu sınıf içerisinde kapsüllenmiştir (Encapsulation).

Kurulum ve Çalıştırma

Projeyi bilgisayarınıza klonlayın.

Projenin ana dizininde profil.jpg adında bir fotoğraf olduğundan emin olun.

IDE (VS Code, IntelliJ vb.) üzerinden Maven bağımlılıklarını güncelleyip Main.java dosyasını çalıştırın.

Program çalıştığında proje dizininde PDF formatındaki özgeçmiş otomatik olarak üretilecektir.
