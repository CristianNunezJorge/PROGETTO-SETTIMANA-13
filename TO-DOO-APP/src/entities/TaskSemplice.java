package entities;

import priority.Priorità;

public class TaskSemplice extends Task {

    public TaskSemplice(int idParam, String titoloParam, int durataParam, Priorità prioritaParam) {
        super(idParam, titoloParam, durataParam, prioritaParam);
    }

    @Override
    public void completa() {
        completata = true;
    }

    @Override
    public String toString() {
        return "TaskSemplice{} " + super.toString();
    }
}
