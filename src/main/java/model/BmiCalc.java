package model;

public class BmiCalc{
    private String nama;
    private String gender;
    private double beratKg;
    private double tinggiCm;

    public BmiCalc (String nama, String gender, double beratKg, double tinggiCm) {
        if (beratKg <= 0 || tinggiCm <= 0) {
            throw new IllegalArgumentException("Berat & tinggi harus lebih dari 0!");
        }
        this.nama = nama;
        this.gender = gender;
        this.beratKg = beratKg;
        this.tinggiCm = tinggiCm;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggiCm / 100.0;
        return beratKg / (tinggiMeter * tinggiMeter);
    }

    // Mengembalikan status teks pendek (contoh: "underweight")
    public String getKategoriStatus() {
        double bmi = hitungBMI();
        if (bmi < 18.5) return "underweight";
        if (bmi < 25.0) return "normal weight";
        if (bmi < 30.0) return "overweight";
        return "obesity";
    }

    // Mengembalikan kata-kata motivasi Y2K sesuai kategori
    public String getPesanMotivasi() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "love yourself and be healthy! 💖";
        } else if (bmi < 25.0) {
            return "you are doing great, keep it up! ✨";
        } else if (bmi < 30.0) {
            return "stay active and glow every day! 🌸";
        } else {
            return "take care of yourself, stay healthy! 👑";
        }
    }

    public String getNama() { return nama; }
    public String getGender() { return gender; }
}