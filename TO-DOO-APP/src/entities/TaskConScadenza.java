package entities;

import priority.Priorità;

import java.time.LocalDate;

public class TaskConScadenza extends Task {

    private LocalDate scadenza;

    public TaskConScadenza(int idParam, String titoloParam, int durataParam, Priorità prioritaParam, LocalDate scadenza) {
        super(idParam, titoloParam, durataParam, prioritaParam);
        this.scadenza = scadenza;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public boolean isScadenza() {
        if (LocalDate.now().isAfter(scadenza)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void completa() {
        completata = true;
    }

    @Override
    public String toString() {
        return "TaskConScadenza{" +
                "Scadenza=" + scadenza +
                "} " + super.toString();
    }
}
