package Game1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Date;

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

    public void gotoProfileFrame() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("profile.fxml"));
        Parent root = loader.load();

        ProfileFrameController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void saveGame(String result) throws IOException {

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Games game = new Games();
        game.setPlayer1(FirstFrameController.returnPlayerFirst().getName());
        game.setPlayer2(SecondFrameController.returnPlayerSecond().getName());
        game.setDate(new Date());
        game.setResult(result);
        session.save(game);
        transaction.commit();
        session.close();

    }

    public void gotoStatistics() throws IOException {
        FXMLLoader loader =
                new FXMLLoader(this.getClass().getResource("statistics.fxml"));
        Parent root = loader.load();

        StatisticsController controller = loader.getController();
        controller.setApplication(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public void startGame() throws IOException {

        final Game game = new KrestikiNoliki();
        final TextArea resultOfTheGame = new TextArea("");
        resultOfTheGame.setPrefSize(100, 50);
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
                                    resultOfTheGame.setText("The winner is " + player1.getName());
                                    try {
                                        saveGame(player1.getName());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println(FirstFrameController.returnPlayerFirst().getName() + " " + SecondFrameController.returnPlayerSecond().getName() + " winner is " + player1.getName());
                                } else if (game.gameNoMove()) {
                                    resultOfTheGame.setText("Draw. Nobody lost");
                                    try {
                                        saveGame("Draw");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }

                            }
                        }
                    }

                });
                gridPane.add(button, i, j);
            }
        }
        final Button newGame = new Button("New Game");
        newGame.setPrefSize(100, 50);
        newGame.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    startGame();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        Button exit = new Button("Exit");
        exit.setPrefSize(100, 50);
        exit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        Button statistics = new Button("Statictics");
        statistics.setPrefSize(100, 50);
        statistics.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                try {
                    gotoStatistics();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        HBox hBox = new HBox(newGame, statistics, exit);

        VBox v1Box = new VBox(gridPane, resultOfTheGame, hBox);
        Scene scene1 = new Scene(v1Box);
        primaryStage.setScene(scene1);
    }


    public static void main(String[] args) {

        launch();

    }


}
