package Game1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondFrameController {

    @FXML
    private TextField name1;

    @FXML
    private TextField age1;

    String player2Name;
    int player2Age;
    char player2Type;
    static Player playerSecond;
    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }

    public void startGame(ActionEvent actionEvent) {

        player2Name = name1.getText();
        player2Age = Integer.parseInt(age1.getText());
        char str = FirstFrameController.returnPlayerFirstType();
        if (str == 'X') {
            player2Type = 'O';
        } else if (str == 'O') {
            player2Type = 'X';
        }

        playerSecond = new Human(player2Name, player2Age, player2Type);
        application.startGame();

    }

    public static Player returnPlayerSecond() {
        return playerSecond;
    }

    public void cancelGame(ActionEvent actionEvent) {
        application.primaryStage.close();
    }
}
