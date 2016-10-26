package Game1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.io.IOException;


public class FirstFrameController {
    @FXML
    private TextField name;

    @FXML
    private TextField age;

    @FXML
    private CheckBox type1;
    @FXML
    private CheckBox type2;

    String player1Name;
    int player1Age;
    char player1Type;
    static Player playerFirst;


    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }

    public void okAction(ActionEvent actionEvent) throws IOException {
        player1Name = name.getText();
        player1Age = Integer.parseInt(age.getText());

        if (type1.isSelected()) {
            player1Type = (type1.getText().charAt(0));
        } else if (type2.isSelected()) {
            player1Type = (type2.getText().charAt(0));
        }

        playerFirst = new Human(player1Name, player1Age, player1Type);
        application.gotoSecondFrame();
    }

    public static Player returnPlayerFirst() {
        return playerFirst;
    }

    public static char returnPlayerFirstType() {
        return playerFirst.getType();
    }

    public void cancelAction(ActionEvent actionEvent) {
        application.primaryStage.close();
    }

}


