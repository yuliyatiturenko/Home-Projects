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

public class ProfileFrameController {

    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private TextField age;
    @FXML
    private TextField country;

    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }

    public void SaveAction(ActionEvent actionEvent) throws IOException {
        boolean b = true;
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Players");
        List<Players> players = query.getResultList();
        for (Players pl : players) {
            if (pl.getLogin().equals(name.getText())) {
                b = false;
            }

        }
        if (b) {
            Players player = new Players();
            player.setLogin(name.getText());
            player.setPassword(password.getText());
            player.setAge(Integer.valueOf(age.getText()));
            player.setCountry(country.getText());
            session.save(player);
            transaction.commit();
            session.close();

            if(FirstFrameController.returnPlayerFirst()==null){
                application.gotoFirstFrame();
            }else {
                application.gotoSecondFrame();
            }

        }else {
            JOptionPane.showMessageDialog(null,"Player with this login as already exist. Try another login");
        }

    }


    public void cAction(ActionEvent actionEvent) throws Exception {
        application.gotoFirstFrame();
    }
}
