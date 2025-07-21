import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void newTask(Task task){
        tasks.add(task);
        System.out.println("Task is added: " + task.getTitle());
    }

    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("Task list empty!!");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).toString());
        }
    }

    public void completeTask(int index){
        if(index>=0 && index< tasks.size()){
            tasks.get(index).markAsCompleted();
            System.out.println("Task is completed: " + tasks.get(index).getTitle());
        }else{
            System.out.println("Invalid index number!!");
        }
    }

    public void deleteTask(int index){
        if(index>=0 && index< tasks.size()) {
            Task remove = tasks.remove(index);
            System.out.println("Task is removed: " + remove.getTitle());
        }else{
            System.out.println("Invalid index number!!");
        }
    }

    public void saveToFile(String filename) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (Task task : tasks){
                writer.write(task.isCompleted() + "|" +
                        task.getTitle() + "|" +
                        task.getDescription() + "|" +
                        task.getDueDate());
                writer.newLine();
            }
            System.out.println("Task is added in file!!");
        } catch (IOException e ){
            System.out.println("Writing error: " + e.getMessage());
        }
    }

    public void loadToFile(String filename) throws IOException {
        tasks.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split("\\|");
                boolean isCompleted = Boolean.parseBoolean(parts[0]);
                String title = parts[1];
                String description = parts[2];
                LocalDate dueDate = LocalDate.parse(parts[3]);

                Task task = new Task(title,description,dueDate);
                if (isCompleted) task.markAsCompleted();
                tasks.add(task);
            }
            System.out.println("Task is loaded on file!!");
        } catch (IOException e ) {
            System.out.println("Load error: " + e.getMessage());
        }
    }

    public List<Task> getTasks(){
        return tasks;
    }

}
