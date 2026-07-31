package entities;

import priority.Priorità;

public abstract class Task {

    //ATTRIBUTI

    private int id;
    private String titolo;
    private int durata;
    private Priorità priorita;
    protected boolean completata; //ATTRIBUTO CREATO PER IL METODO ---completa---

    //COTRUTTORE( PARAMETRI)

    public Task(int idParam, String titoloParam, int durataParam, Priorità prioritaParam) {
        this.id = idParam;
        this.titolo = titoloParam;
        this.durata = durataParam;
        this.priorita = prioritaParam;
        this.completata = false;// APPENA CREATE SONO ---false---
    }

    public abstract void completa();

    // PERMETTO DI LEGGERE I CAMPI PRIVATI

    public int getId() {
        return id;
    }
    public String getTitolo() {
        return titolo;
    }
    public int getDurata() {
        return durata;
    }
    public Priorità getPriorita() {
        return priorita;
    }
    public boolean isCompletata() {  // PER CONVENZIONE I BOOLEANI SI USA "is" DAVANTI
        return completata;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", priorita=" + priorita +
                ", completata=" + completata +
                '}';
    }
}