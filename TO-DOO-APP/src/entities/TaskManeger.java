package entities;

import exceptions.DuplicatoNonConsentito;
import exceptions.TaskNonTrovata;
import priority.Priorità;

import java.util.ArrayList;
import java.util.List; // TRUCCO PER FARE IN MODO CHE ANCHE SENZA LA LIST IL METODO ---cercaPerPriorita--- NON DIA ERRORE

public class TaskManeger {

    //ATTRIBUTO

    private ArrayList<Task> tasks;

    // COSTRUTTORE

     public TaskManeger (ArrayList<Task> tasksParam) {
        this.tasks = tasksParam;
     }

     // ---aggiungiTask-- E L' INIZIO DEL CONTROLLO CHE NON PERMETTE DI INSERIRE PIU TASK CON LO STESSO ID

     public void aggiungiTask(Task task) throws DuplicatoNonConsentito {

         // CON LO STREAM CONTROLLO SE ESISTE GIA UNA TASK CON ID DUPLICATI
         //ANYMATCH SERVE PER RESTITUIRE ---true--- SE LO SODDISFA FA PARTIRE L' EXMESSAGE
         //IN CASO CONTRARIO AGGIUNGE LA TASK

         boolean existe = tasks.stream().anyMatch(t -> t.getId() == task.getId());
         if (existe) {
             throw new DuplicatoNonConsentito(
                     "Esiste già una Task: " + task.getId());
             } tasks.add(task);
     }

     // FA LA RICERCA DELLA TASK PER ID FILTRANDO LE TASK TENENDO SOLO QUELLA CORRETTA CON LA RICERCA
    // SE LA RICERCA INVECE NON HA UN RISULTATO STAMPA L' EXMESSAGIO

     public Task cercaPerId ( int idParam) throws TaskNonTrovata{
         return tasks.stream().filter(t -> t.getId() == idParam).findFirst().orElseThrow(() -> new TaskNonTrovata ("Task con id: " + idParam + " non trovata"));
     }

     // FA UNA RICERCA DI UNA PRIORITA SPECIFICA E RESTITUISCE UNA LISTA DI QUELLE TASK

     public List<Task> cercaPriorita (Priorità prioritaParam) {
         return tasks.stream().filter(t -> t.getPriorita() == prioritaParam).toList();
     }

     // SERVE A RIMUOVERE UNA TASK IN BASE AL SUO ID (cerca per id) E LA RIMUOVE SE ID E UGUALE

    public void rimuoviTask( int idParam)  throws TaskNonTrovata{
         Task taskrimossa = cercaPerId(idParam);
         tasks.remove(taskrimossa);
    }

    // SERVE A FARTI VEDERE UNA TASK IN BASE AL SUO ID (cerca per id) E SE ID E UGUALE STAMPA CON METODO .completa

    public void completaTask(int idParam)  throws TaskNonTrovata{
         Task task = cercaPerId(idParam);
         task.completa();
    }

    // SERVE A STAMPARE LE TASK IN BASE A QUALI SONO COMPLETATE E NON

    public void stampaStatistiche() {

         //CONTROLLA QUELLI COPMPLETATI E CONTA QUANTI SONO PER POI STAMPARLI CON --sout--

         long completati = tasks.stream().filter(Task::isCompletata).count();

         //CONTROLLA QUELLI NON COMPLETATI E CONTA QUANTI SONO PER POI STAMPARLI CON --sout--

         long nonCompletati = tasks.stream().filter(t ->  !t.isCompletata()).count();


        System.out.println("Task completati: " + completati);
        System.out.println("Task non completati: " + nonCompletati);
    }

}

