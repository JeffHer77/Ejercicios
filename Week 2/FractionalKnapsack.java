import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    double getRatio() {
        return (double) value / weight;
    }
}

public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, ArrayList<Item> items) {
        double value = 0.0;

        // Ordenar los ítems por valor/peso en orden descendente
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.getRatio(), o1.getRatio());
            }
        });

        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                // Tomar el ítem completo
                value += item.value;
                capacity -= item.weight;
            } else {
                // Tomar una fracción del ítem
                value += item.value * ((double) capacity / item.weight);
                capacity = 0;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int weight = scanner.nextInt();
            items.add(new Item(value, weight));
        }

        System.out.println(getOptimalValue(capacity, items));
    }

}
