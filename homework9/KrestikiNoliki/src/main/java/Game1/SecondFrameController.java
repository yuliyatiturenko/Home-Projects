package Game1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class SecondFrameController {

    @FXML
    private TextField name1;
    @FXML
    private PasswordField password1;


    String player2Name;

    char player2Type;
    static Player playerSecond;
    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }

    public void startGame(ActionEvent actionEvent) throws IOException {
        boolean isRegPlayer = false;
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Players");
        List<Players> players = query.getResultList();
        for (Players pl : players) {
            if ((pl.getLogin().equals(name1.getText())) && (pl.getPassword().equals(password1.getText()))) {
                isRegPlayer = true;

            }
        }
        if (isRegPlayer) {
            player2Name = name1.getText();
            char str = FirstFrameController.returnPlayerFirstType();
            if (str == 'X') {
                player2Type = 'O';
            } else if (str == 'O') {
                player2Type = 'X';
            }

            playerSecond = new Human(player2Name, player2Type);
            if (FirstFrameController.returnPlayerFirst().getName().equals(playerSecond.getName())) {
                JOptionPane.showMessageDialog(null, " Two equals plaeyrs");
                session.close();

            }

            transaction.commit();
            session.close();
            application.startGame();

        } else {
            JOptionPane.showMessageDialog(null, "Player with this login and password  not found. Try again." +
                    " Or press Registration.");
        }


    }

    public static Player returnPlayerSecond() {
        return playerSecond;
    }

    public void cancelGame(ActionEvent actionEvent) {
        application.primaryStage.close();
    }

    public void RegistrationAction(ActionEvent actionEvent) throws Exception {
        application.gotoProfileFrame();
    }
}
