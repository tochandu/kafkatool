package com.tech;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PubController implements Initializable {

    @FXML
    private Button submitid;
    @FXML
    private TextField brokerid;
    @FXML
    private TextField topicnameid;
    @FXML
    private TextArea puboutputID;
    @FXML
    private TextArea mssgid;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        submitid.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(brokerid.getText());
                System.out.println(topicnameid.getText());
                System.out.println(mssgid.getText());

                puboutputID.setText("adbsadhsadbasdkaasbdaldbasbdasbdasbdfdbfdsjhgsdlvbd  sdcjhsdbfsdc dscsd fswd f ewfsdfdsfwefjwdfsdhsd  sfsdf sjdfw");
            }
        });
    }

}