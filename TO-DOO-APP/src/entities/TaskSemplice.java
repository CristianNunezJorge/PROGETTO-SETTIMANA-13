package entities;

import priority.Priorità;

public class TaskSemplice extends Task {

    public TaskSemplice(int idParam, String titoloParam, int durataParam, Priorità prioritaParam) {
        super(idParam, titoloParam, durataParam, prioritaParam);
    }

    //METODO CHE RIDA TASK COMPLETATA ---true--- E BASTA

    @Override
    public void completa() {
        completata = true;
    }

    @Override
    public String toString() {
        return "TaskSemplice{} " + super.toString();
    }
}