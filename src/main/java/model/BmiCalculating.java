/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pamikade
 */
public class BmiCalculating {
    
    private String nama;
    private double beratBadan; // dalam kg
    private double tinggiBadan; // dalam cm

    // Constructor dengan validasi invariants
    public BmiCalculating(String nama, double beratBadan, double tinggiBadan) {
        if (beratBadan <= 0 || tinggiBadan <= 0) {
            throw new IllegalArgumentException("Berat dan tinggi badan harus lebih besar dari 0!");
        }
        this.nama = nama;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double HitungBMI() {
        double tinggiMeter = tinggiBadan / 100.0;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    public String getKategori() {
        double bmi = HitungBMI();
        if (bmi < 18.5) {
            return "Kurus (Underweight)";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }

    public String getNama() {
        return nama;
    }
}