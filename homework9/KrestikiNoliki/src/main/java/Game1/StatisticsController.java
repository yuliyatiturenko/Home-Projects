package Game1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class StatisticsController {

    @FXML
    private TableView<Games> tableGames;
    @FXML
    private TableColumn<Games, Integer> idColumn;
    @FXML
    private TableColumn<Games, String> player1Column;
    @FXML
    private TableColumn<Games, String> player2Column;
    @FXML
    private TableColumn<Games, Date> dateColumn;
    @FXML
    private TableColumn<Games, String> resultColumn;

    private ApplGrid application;

    public void setApplication(ApplGrid application) {
        this.application = application;
    }


    public void showAction(ActionEvent actionEvent) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        ObservableList<Games> data = FXCollections.observableArrayList();
        Query query = session.createQuery("from Games");
        List<Games> games = query.getResultList();
        for (Games game : games) {
            data.add(game);
        }

        idColumn.setCellValueFactory(new PropertyValueFactory<Games, Integer>("id"));
        player1Column.setCellValueFactory(new PropertyValueFactory<Games, String>("player1"));
        player2Column.setCellValueFactory(new PropertyValueFactory<Games, String>("player2"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Games, Date>("date"));
        resultColumn.setCellValueFactory(new PropertyValueFactory<Games, String>("result"));
        tableGames.setItems(data);

        transaction.commit();

        session.close();
    }

    public void closeAction(ActionEvent actionEvent) throws IOException {
        application.startGame();
    }
}
