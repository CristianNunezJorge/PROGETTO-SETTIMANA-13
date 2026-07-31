package exceptions;

public class TaskNonTrovata extends RuntimeException {
    public TaskNonTrovata(String message) {
        super(message);
    }
}
