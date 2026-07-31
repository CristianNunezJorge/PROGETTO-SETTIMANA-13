package entities;

import priority.Priorità;

public class TaskRicorrente extends Task {

    private int frequenzaGiorni;
    private int volteCompleta;

    public TaskRicorrente(int idParam, String titoloParam, int durataParam, Priorità prioritaParam, int frequenzaGiorniParam, int volteCompletaParam) {
        super(idParam, titoloParam, durataParam, prioritaParam);
        this.frequenzaGiorni = frequenzaGiorniParam;
        this.volteCompleta = volteCompletaParam;
    }

    // METODO COMPLATA CHE ALLA TASK COMPLETATA ---true--- INCREMENTA LE VOLTECOMPLETATE E RITORNA DI NUOVO ---false---
    // E COSI RICOMINCIA IL CICLO

    @Override
    public void completa() {
        completata = true;
        volteCompleta ++;
        completata = false;
    }

    public int getFrequenzaGiorni() {
        return frequenzaGiorni;
    }
    public int getVolteCompleta() {
        return volteCompleta;
    }

    @Override
    public String toString() {
        return "TaskRicorrente{" +
                "frequenzaGiorni=" + frequenzaGiorni +
                ", volteCompleta=" + volteCompleta +
                "} " + super.toString();
    }
}