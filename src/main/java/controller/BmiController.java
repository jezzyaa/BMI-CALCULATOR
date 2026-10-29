/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.fxml.FXML;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.scene.control.ComboBox;
import model.BmiCalculating;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BmiController {

    // Menghubungkan ID komponen dari FXML
    @FXML    private TextField tfNama;

    @FXML    private TextField tfBerat;

    @FXML    private TextField tfTinggi;

    @FXML    private Label lblHasil;

    // Handler yang dipanggil saat tombol Hitung diklik
    @FXML
    private void Calculating() {
        try {
            String nama = tfNama.getText().trim();
            if (nama.isEmpty()) {
                lblHasil.setText("Status: Nama tidak boleh kosong!");
                return;
            }

            // Konversi teks input ke double
            double berat = Double.parseDouble(tfBerat.getText());
            double tinggi = Double.parseDouble(tfTinggi.getText());

            // Instansiasi objek Model
            BmiCalculating kal = new BmiCalculating(nama, berat, tinggi);

            // Tampilkan hasil kalkulasi ke GUI
            lblHasil.setText(String.format("Halo %s,\nNilai BMI: %.2f\nKategori: %s",
                    kal.getNama(),
                    kal.HitungBMI(),
                    kal.getKategori()
                )
            );

        } catch (NumberFormatException e) {
            lblHasil.setText("Status: Berat dan tinggi harus berupa angka yang valid!");
        } catch (IllegalArgumentException e) {
            lblHasil.setText("Status: " + e.getMessage());
        }
    }
}