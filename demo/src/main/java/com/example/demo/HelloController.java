package com.example.demo;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<znak, String> client;

    @FXML
    private TableColumn<znak, String> data;

    @FXML
    private TableColumn<znak, String> forma;

    @FXML
    private TableColumn<znak, String> full_name;

    @FXML
    private TableColumn<znak, String> id;

    @FXML
    private TableColumn<znak, String> nomer;

    @FXML
    private TableColumn<znak, String> organ;

    @FXML
    private TableColumn<znak, String> short_name;
    @FXML
    private TableView<znak> table;

    @FXML
            private Label lid, l_fio,l_forma,l_full_name,l_nomer,l_organ,l_short_name,l_data;
    @FXML
            void add(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("addview.fxml"));
        stage.setScene(new Scene(loader.load(), 600,400));
        Add controler = loader.getController();
        controler.setDialog(stage);
        controler.setZnaks(arrznak);
        stage.showAndWait();
        table.setItems(FXCollections.observableList(arrznak));
    }
@FXML
void delete(ActionEvent event) {
        if (table.getSelectionModel().getSelectedItem()!=null){
            arrznak.remove(table.getSelectionModel().getSelectedItem());
            table.setItems(FXCollections.observableList(arrznak));
            l_data.setText("Дата  регистрации  ");
            l_organ.setText("Орган регистрации: ");
            l_short_name.setText("Краткое название ");
            l_nomer.setText("Регистрационный №");
            l_forma.setText("Правовая форма:");
            l_full_name.setText("Полное название:");
            l_fio.setText("Клиент:");
            lid.setText("ID:");
        }
}
@FXML
        void redit (ActionEvent event) throws  IOException{
        if (table.getSelectionModel().getSelectedItem() !=null) {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("added.fxml"));
            stage.setScene(new Scene(loader.load(),600, 400 ));
            Edit conriller = loader.getController();
            conriller.setDialog(stage);
            int id = arrznak.indexOf(table.getSelectionModel().getSelectedItem());
            conriller.set(arrznak.get(id));
            stage.showAndWait();
            table.setItems(FXCollections.observableList(arrznak));
            table.refresh();
        }
}
List<znak> znaks = Arrays.asList(new znak("Сидоров Вадим Александрович", "ООО","Агросервис","123","1", "ФНС","Агро","12.06.2023"),
        new znak("Сидорик Владимир Александрович", "ЗАО","Магнит","12","2", "ФНС","Мага","1.10.2023"),
        new znak("Зенцов Сергей Сергеевич", "ИП","Золотые ручки ","44","3", "ФНС","ручки","11.01.2023"),
        new znak("Донской Валерий Сергеевич", "ООО","Сельмаш цех ","02","4", "ФНС","Сельмаш","15.11.2023"));
ArrayList<znak> arrznak = new ArrayList<>(znaks);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        client.setCellValueFactory(new PropertyValueFactory<znak,String>("client"));
        forma.setCellValueFactory(new PropertyValueFactory<znak,String>("forma"));
        full_name.setCellValueFactory(new PropertyValueFactory<znak,String>("full_name"));
        id.setCellValueFactory(new PropertyValueFactory<znak,String>("id"));
        nomer.setCellValueFactory(new PropertyValueFactory<znak,String>("nomer"));
        organ.setCellValueFactory(new PropertyValueFactory<znak,String>("organ"));
        short_name.setCellValueFactory(new PropertyValueFactory<znak,String>("short_name"));
        data.setCellValueFactory(new PropertyValueFactory<znak,String>("data"));
        table.setItems(FXCollections.observableList(arrznak));
        table.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection)->{
            if (newSelection != null){znak Selectit = table.getSelectionModel().getSelectedItem();
            lid.setText("ID:" + Selectit.id);
            l_fio.setText("Клиент: " + Selectit.client);
            l_forma.setText("Правовая форма: " + Selectit.forma);
            l_full_name.setText("Полное название: " + Selectit.full_name);
            l_nomer.setText("Регистрационный №" + Selectit.nomer);
            l_organ.setText("Орган регистрации: " + Selectit.organ);
            l_short_name.setText("Краткое название: " + Selectit.short_name);
            l_data.setText("Дата регистрации: " +Selectit.data);
            }
        });
    }
}
