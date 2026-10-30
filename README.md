# 💖 Y2K BMI Calculator (JavaFX MVC Application)
> Aplikasi kalkulator Indeks Massa Tubuh (BMI)

---

## 📸 Tampilan Aplikasi
https://github.com/user-attachments/assets/86709be7-3c5a-47c6-9d56-d43326897008
---

## 📌 Deskripsi Proyek

**Y2K BMI Calculator** adalah aplikasi desktop interaktif yang membantu pengguna menghitung Indeks Massa Tubuh (BMI) berdasarkan input nama, gender, berat badan (kg), dan tinggi badan (cm)[cite: 5]. Aplikasi ini dirancang khusus dengan tema visual Y2K pastel (*pink/blue/yellow*), menggunakan tipe font *Lucida Handwriting*, serta elemen vektor SVG dengan gradasi kilauan bintang (*star glow gradient*).

---

## ✨ Fitur Utama

- **Pilihan Gender Dinamis**: Sakelar tombol *BOYS* dan *GIRLS* dengan efek visual CSS aktif/redup tanpa merusak gaya font.
- **Kalkulasi BMI Akurat**: Perhitungan skor BMI beserta kategori status tubuh dan pesan motivasi yang dipersonalisasi.
- **Output Multi-Baris**: Hasil kalkulasi disajikan secara komunikatif di dalam `TextArea`.
- **Validasi Input Tangguh**: Sistem penanganan error otomatis jika pengguna mengosongkan nama atau memasukkan format angka yang salah[cite: 3].

---

## 🛠️ Penerapan Konsep Model-View-Controller (MVC)[cite: 1, 3]:
   - **Model (`model.BmiCalc`)**: Menyimpan state data (nama, gender, berat, tinggi), mengisolasi rumus matematika BMI, serta menentukan kategori status tubuh[cite: 3, 4].
   - **View (`BmiCalView.fxml`)**: Mendefinisikan antarmuka visual UI berbasis XML, komponen tata letak (`VBox`, `HBox`, `AnchorPane`), elemen SVG, dan CSS styling[cite: 1, 3].
   - **Controller (`controller.BmiController`)**: Menghubungkan View dan Model, menangani event aksi tombol (`#handleCalculate`, `#handleReset`), serta mengelola dynamic styling[cite: 1].
---

## 📂 Struktur Direktori Proyek
```text
bmiCal/
├── src/
│   └── main/
│       ├── java/
│       │   ├── controller/
│       │   │   └── BmiController.java      # Controller penangan event & CSS
│       │   ├── main/
│       │   │   └── MainApp.java            # Entry point aplikasi JavaFX
│       │   └── model/
│       │       └── BmiCalc.java            # Logika bisnis & kalkulasi BMI
│       └── resources/
│           └── BmiCalView.fxml             # Tata letak UI (JavaFX FXML)
├── docs/
│   └── reflection.md                       # Log refleksi pengerjaan mandiri
├── .gitignore                              # Konfigurasi pengabaian file Git
├── pom.xml                                 # Dependensi & konfigurasi Maven
└── README.md                               # Dokumentasi proyek
