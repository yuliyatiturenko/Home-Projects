package Game1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ApplGrid extends Application {
    String name;
    int age;
    char type;


    public void start(final Stage primaryStage) throws Exception {
/// первое окно ввод информации
        Label nameLabel = new Label("Enter your name");
        nameLabel.setFont(new Font(15));
        nameLabel.setPrefSize(150, 30);
        Label ageLabel = new Label("Enter your age");
        ageLabel.setFont(new Font(15));
        ageLabel.setPrefSize(150, 30);
        Label typeLabel = new Label("Enter your type");
        typeLabel.setFont(new Font(15));
        typeLabel.setPrefSize(150, 30);

        final TextField nameField = new TextField();
        final TextField ageField = new TextField();
        final TextField typeField = new TextField();

        HBox nameHBox = new HBox(nameLabel, nameField);
        nameHBox.setMargin(nameLabel, new Insets(0, 20, 20, 20));

        HBox ageHBox = new HBox(ageLabel, ageField);
        ageHBox.setMargin(ageLabel, new Insets(0, 20, 20, 20));

        HBox typeHBox = new HBox(typeLabel, typeField);
        typeHBox.setMargin(typeLabel, new Insets(0, 20, 20, 20));

        final Button buttonApply = new Button("Apply");
        buttonApply.setFont(new Font(15));

        final Button buttonStartGame = new Button("StartGame");
        buttonStartGame.setFont(new Font(15));

        final Button buttonCancel = new Button("Cancel");
        buttonCancel.setFont(new Font(15));

        final HBox buttonBox = new HBox(buttonApply, buttonStartGame, buttonCancel);
        buttonBox.setMargin(buttonApply, new Insets(0, 20, 20, 40));

        buttonBox.setMargin(buttonStartGame, new Insets(0, 20, 20, 40));
        buttonBox.setMargin(buttonCancel, new Insets(0, 20, 20, 40));
        VBox vBox = new VBox(nameHBox, ageHBox, typeHBox, buttonBox);
        final Scene scene = new Scene(vBox);
        //// кнопка выход
        buttonCancel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        /// принять информацию об игроке для дальнейшего использования в Player
        buttonApply.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                name = nameField.getText();
                age = Integer.parseInt(ageField.getText());
                type = (typeField.getText()).charAt(0);

                System.out.println(name);
                System.out.println(age);
                System.out.println(type);
            }
        });

// доска крестики нолики
//кнопка начать игру
        buttonStartGame.setOnAction(new EventHandler<ActionEvent>() {
            final Game game = new KrestikiNoliki();
            final TextArea resultOfTheGame = new TextArea("");

            public void handle(ActionEvent event) {
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
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("grid application");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch();

    }
}
