package entities;

import exceptions.DuplicatoNonConsentito;

import java.util.ArrayList;

public class TaskManeger {

    //ATTRIBUTO

    private ArrayList<Task> tasks;

    // COSTRUTTORE

     public TaskManeger (ArrayList<Task> tasksParam) {
        this.tasks = tasksParam;
     }

     // ---addTask-- E L' INIZIO DEL CONTROLLO CHE NON PERMETTE DI INSERIRE PIU TASK CON LO STESSO ID

     public void addTask(Task task) throws DuplicatoNonConsentito {



     }

}
