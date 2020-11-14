import java.util.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        ArrayList<String> y = new ArrayList<>();
        ArrayList<String> z = new ArrayList<>();


        Comparator<String> comparator = (o1, o2) -> {
            Integer i1 = o1.length();
            Integer i2 = o2.length();
            return i1.compareTo(i2);
        };

        addToCollection(x, 5);
        printOut(x);

        Iterator<String> iteratorA = x.iterator();
        addToCollection(y, 5);
        printOut(y);

        Iterator<String> iteratorB = y.iterator();
        Collections.reverse(y);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            z.add(iteratorA.next());
            z.add(iteratorB.next());
        }
        printOut(z);

        z.sort(comparator);
        printOut(z);

    }

    public static void addToCollection(Collection<String> collection, int quantity) {
        System.out.println("Введите 5 имен: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("Операция завершена.");

    }

    public static void printOut(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("__________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("__________________");
    }
}