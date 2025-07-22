import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperationQueue<Integer> intQueue = new OperationQueue<>(Integer.class);

        intQueue.addOperation(10); //bunu fixledim
        intQueue.addOperation(20); //bunda halen hata var
        intQueue.addOperation("NotAnInteger"); // exception fırlatılmalı

        intQueue.executeAll(); // 30
/*
        OperationQueue<String> strQueue = new OperationQueue<>(String.class);
        strQueue.addOperation("Merhaba ");
        strQueue.addOperation("Dünya!");

        strQueue.executeAll(); // Merhaba Dünya!
*/
    }
}
