package Game1;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String player1;
    private String player2;
    private Date date;
    private String result;

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }


    public String getPlayer1() {
        return player1;
    }


    public String getPlayer2() {
        return player2;
    }


    public Date getDate() {
        return date;
    }

    public String getResult() {
        return result;
    }


}
