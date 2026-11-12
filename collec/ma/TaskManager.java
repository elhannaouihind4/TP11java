package collec.ma;


import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {

        // Création de la liste des tâches
        List<Task> tasks = new ArrayList<>();

        // Ajouter des tâches
        tasks.add(new Task("Apprendre Java Collections"));
        tasks.add(new Task("Faire les courses"));

        // Marquer la première tâche comme terminée
        tasks.get(0).setCompleted(true);

        System.out.println("Liste des tâches :");

        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}

