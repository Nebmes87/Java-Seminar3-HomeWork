// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Seminars.Seminar3.HomeWork;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Task2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Task2.class.getName());
        List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        l.removeIf(i -> i % 2 == 0); 
        System.out.println(l);
        logger.log(Level.INFO, "Done");
    }
}
