package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Edit {
    @FXML
    private Stage dialog;
    private znak znaks;
    public void setDialog(Stage dialog) {this.dialog = dialog;}
    public void set( znak znaks){this.znaks = znaks;
    t_fio.setText(znaks.getClient());
    t_data.setText(znaks.getData());
    t_form.setText(znaks.getForma());
    t_id.setText(znaks.getId());
    t_nomer.setText(znaks.getNomer());
    t_full_name.setText(znaks.getFull_name());
    t_organ.setText(znaks.getOrgan());
    t_short_name.setText(znaks.getShort_name());
    }

    @FXML
    private TextField t_data;

    @FXML
    private TextField t_fio;

    @FXML
    private TextField t_form;

    @FXML
    private TextField t_full_name;
    @FXML
    private TextField t_id;
    @FXML
    private TextField t_nomer;
    @FXML
    private TextField t_organ;
    @FXML
    private TextField t_short_name;
    @FXML
    void rew(ActionEvent event) {
        if (!t_fio.getText().isEmpty() && !t_data.getText().isEmpty()
                && !t_form.getText().isEmpty() && !t_nomer.getText().isEmpty()
                && !t_id.getText().isEmpty() && !t_organ.getText().isEmpty()
                && !t_full_name.getText().isEmpty() && !t_short_name.getText().isEmpty()){
            znaks.setId(t_id.getText());
            znaks.setData(t_data.getText());
            znaks.setClient(t_fio.getText());
            znaks.setForma(t_form.getText());
            znaks.setNomer(t_nomer.getText());
            znaks.setOrgan(t_organ.getText());
            znaks.setShort_name(t_short_name.getText());
            znaks.setFull_name(t_full_name.getText());
            dialog.close();}
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialog);
            alert.setTitle("Ошибка ввода");
            alert.setHeaderText("Одно или несколько полей пусты");
            alert.showAndWait();
        }

    }
    @FXML
    void cancel(ActionEvent event){dialog.close();}

}
