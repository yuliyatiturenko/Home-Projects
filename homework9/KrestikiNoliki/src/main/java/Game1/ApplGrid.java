package Game1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplGrid extends Application {
    public Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        gotoFirstFrame();

    }

    public void gotoFirstFrame() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("firstFrame.fxml"));
        Parent root = loader.load();

        FirstFrameController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void gotoSecondFrame() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("secondFrame.fxml"));
        Parent root = loader.load();

        SecondFrameController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void startGame() {

        final Game game = new KrestikiNoliki();
        final TextArea resultOfTheGame = new TextArea("");
        GridPane gridPane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final Button button = new Button();
                button.setPrefSize(100, 100);
                button.setId(j + "" + i);
                button.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {

                        if (resultOfTheGame.getText().equals("")) {
                            if (button.getText().equals("")) {
                                String move = button.getId();
                                Player player = game.getCurrentPlayer();
                                button.setText(String.valueOf(player.getType()));
                                game.makeMove(move);
                                if (game.checkGameResult()) {
                                    Player player1 = game.getWinner();
                                    resultOfTheGame.setText("The winner is " + player1.getName() + " " + player1.getAge());
                                } else if (game.gameNoMove()) {
                                    resultOfTheGame.setText("Draw. Nobody lost");
                                }

                            }
                        }
                    }

                });
                gridPane.add(button, i, j);
            }
        }

        VBox v1Box = new VBox(gridPane, resultOfTheGame);
        Scene scene1 = new Scene(v1Box);
        primaryStage.setScene(scene1);
    }


    public static void main(String[] args) {

        launch();

    }

}
