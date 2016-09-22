package Game1;


public class ComputerPlayer extends Player {
    @Override
    public boolean isDeterminePlayer() {
        return true;
    }

    public ComputerPlayer() {
        super("AsusX756", 2016, 'O');

    }

}

