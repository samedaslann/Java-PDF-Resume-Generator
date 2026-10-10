package com.example;

public class Main {
    public static void main(String[] args) {
        
        // Nesne Yaşam Döngüsü - Yaratılma (Creation)
        PdfManager resumeApp = new PdfManager("SamedAslan_Resume.pdf");
        
        // Nesne Yaşam Döngüsü - Kullanım (In Use)
        resumeApp.ozgecmisOlustur();
        
        // Program bittiğinde nesne Garbage Collector tarafından temizlenir (Destruction).
    }
}