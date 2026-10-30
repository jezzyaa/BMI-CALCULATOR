package controller;

import model.BmiCalc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BmiController {

    @FXML private TextArea txtHasil;
    @FXML private TextField txtNama;
    @FXML private TextField txtBerat;
    @FXML private TextField txtTinggi;
    @FXML private Button btnBoys;
    @FXML private Button btnGurls; // Disamakan pakai 'u' sesuai FXML kamu

    private String selectedGender = "GIRLS";

    // Style CSS saat tombol aktif vs redup
 // Tambahkan -fx-font-family: 'Lucida Handwriting'; di semua variabel style tombol
    private final String BOYS_ACTIVE = "-fx-background-color: #253A82; -fx-text-fill: #f5f1aa; -fx-border-color: #ffffff; -fx-border-width: 2px; -fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12px; -fx-font-weight: bold;";
    private final String BOYS_INACTIVE = "-fx-background-color: #6c7ca8; -fx-text-fill: #dddddd; -fx-border-color: transparent; -fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12px;";

    private final String GIRLS_ACTIVE = "-fx-background-color: #991e5a; -fx-text-fill: #f5f1aa; -fx-border-color: #ffffff; -fx-border-width: 2px; -fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12px; -fx-font-weight: bold;";
    private final String GIRLS_INACTIVE = "-fx-background-color: #b86b93; -fx-text-fill: #dddddd; -fx-border-color: transparent; -fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12px;";

    @FXML
    public void initialize() {
        updateGenderButtons();
    }

    @FXML
    private void handleSelectBoys(ActionEvent event) {
        selectedGender = "BOYS";
        updateGenderButtons();
    }

    @FXML
    private void handleSelectGirls(ActionEvent event) {
        selectedGender = "GIRLS";
        updateGenderButtons();
    }

    private void updateGenderButtons() {
        if ("BOYS".equalsIgnoreCase(selectedGender)) {
            btnBoys.setStyle(BOYS_ACTIVE);
            btnGurls.setStyle(GIRLS_INACTIVE);
        } else {
            btnBoys.setStyle(BOYS_INACTIVE);
            btnGurls.setStyle(GIRLS_ACTIVE);
        }
    }

    @FXML
    private void handleCalculate(ActionEvent event) {
        try {
            String nama = txtNama.getText().trim();
            if (nama.isEmpty()) {
                txtHasil.setText("hi sweetie!\nplease enter your name first ✨");
                return;
            }

            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText());

            BmiCalc calc = new BmiCalc(nama, selectedGender, berat, tinggi);
            double skor = calc.hitungBMI();

            String sapaan = selectedGender.equalsIgnoreCase("GIRLS") ? "hi gurls!" : "hi boys!";

            String hasilTeks = String.format(
                "%s\n%s your weight is %.1f\nits %s!\n%s",
                sapaan,
                calc.getNama(),
                skor,
                calc.getKategoriStatus(),
                calc.getPesanMotivasi()
            );

            txtHasil.setText(hasilTeks);

        } catch (NumberFormatException e) {
            txtHasil.setText("oops!\nplease enter valid numbers for weight & height!");
        } catch (IllegalArgumentException e) {
            txtHasil.setText("error!\n" + e.getMessage());
        }
    }
}