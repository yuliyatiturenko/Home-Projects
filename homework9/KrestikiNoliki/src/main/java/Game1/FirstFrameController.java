package Game1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
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


public class FirstFrameController {
    @FXML
    private TextField name;
    @FXML
    private CheckBox type1;
    @FXML
    private CheckBox type2;

    @FXML
    private PasswordField password;

    String player1Name;
    char player1Type;
    static Player playerFirst;


    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }

    public void okAction(ActionEvent actionEvent) throws IOException {

        boolean isRegPlayer = false;
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Players");
        List<Players> players = query.getResultList();
        for (Players pl : players) {
            if ((pl.getLogin().equals(name.getText())) && (pl.getPassword().equals(password.getText()))) {
                isRegPlayer = true;
            }
        }
        if (isRegPlayer) {
            player1Name = name.getText();

            if (type1.isSelected()) {
                player1Type = (type1.getText().charAt(0));
            } else if (type2.isSelected()) {
                player1Type = (type2.getText().charAt(0));
            }

            playerFirst = new Human(player1Name, player1Type);
            transaction.commit();

            session.close();
            if (type1.isSelected() && type2.isSelected()) {
                JOptionPane.showMessageDialog(null, "You should choose one type ");
                application.gotoFirstFrame();
            } else {
                application.gotoSecondFrame();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Player with this login and password  not found. Try again." +
                    " Or press Registration.");
        }

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

    public void RegistrationAction(ActionEvent actionEvent) throws IOException {
        application.gotoProfileFrame();
    }
}


