package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Add {
private Stage dialog;
private ArrayList <znak> znaks = new ArrayList<>();
public void setDialog(Stage dialog) {this.dialog = dialog;}
    public void setZnaks(ArrayList<znak> znaks) {this.znaks = znaks;}

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
    void add(ActionEvent event) {
        if (!t_fio.getText().isEmpty() && !t_data.getText().isEmpty()
                && !t_form.getText().isEmpty() && !t_nomer.getText().isEmpty()
                && !t_id.getText().isEmpty() && !t_organ.getText().isEmpty()
                && !t_full_name.getText().isEmpty() && !t_short_name.getText().isEmpty()){
            znaks.add(new znak(t_fio.getText(),t_form.getText(),t_full_name.getText(),
                    t_id.getText(),t_nomer.getText(),t_organ.getText(),t_short_name.getText(),t_data.getText()));
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
    void cancel(ActionEvent event) {
        dialog.close();

    }

}
