
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) { // Заполняем коллекцию
            arrayList.add(i);
        }
        for (int k = 1; k < 6; k++) {
            arrayList.add(k);
        }
        System.out.println("Коллекция до оптимизации: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            System.out.print(' ');
        }
        System.out.println("Размер коллекции до оптимизации: " + arrayList.size());

        set.addAll(arrayList);
        System.out.println("Размер коллекции после оптимизации: " + set.size());
        // Размер уменьшился так как в коллекции Set не может быть неуникальных значений.
    }
}
