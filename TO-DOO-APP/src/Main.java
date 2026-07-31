import entities.Task;
import entities.TaskConScadenza;
import entities.TaskRicorrente;
import entities.TaskSemplice;
import priority.Priorità;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------PROVA STAMPA TASK----------------------------------------");

        TaskSemplice taskSemplice1 = new TaskSemplice(12345, "Lavare", 2, Priorità.BASSA);
        System.out.println(taskSemplice1.toString());
        TaskConScadenza taskConScadenza1 = new TaskConScadenza(54321, "Acqua-Piante", 1, Priorità.MEDIA, LocalDate.of(2026, 8, 01));
        System.out.println(taskConScadenza1.toString());
        TaskRicorrente taskRicorrente1 = new TaskRicorrente(79876, "Pagare-Bollette",1, Priorità.ALTA,30, 0);
        System.out.println(taskRicorrente1.toString());

        System.out.println("----------------------------------------------------------------------------------------");
    }

  //  public ArrayList<Task> getTasks(){
   //     ArrayList<Task> tasks = new ArrayList<>();
   //     tasks.add(new TaskConScadenza())
   // }
 }
