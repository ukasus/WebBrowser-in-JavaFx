package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.EventListener;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    String htLink = "http://";
    @FXML
    Button backbutton;

    @FXML
    TextField addressBar;

    String adrsLink;
    String currenturl;

    @FXML
    WebView web;

    WebEngine engine;
    WebHistory history;

    public void go(ActionEvent actionEvent){
        adrsLink = addressBar.getText().toString();
        engine.load(htLink+adrsLink);
    }

    public void back(ActionEvent event)
    {
        history.go(-1);
    }
    public void forward(ActionEvent event){
        history.go(1);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = web.getEngine();
        history=engine.getHistory();

        engine.load(htLink+"www.google.com");
    }
}