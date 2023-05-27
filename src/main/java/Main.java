import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] countdown  = {"one","two","three"};
        String[] names = {"Sjaak", "Sjimmy", "Sjonny"};

        // implementeer de countdown met een array three...two...one... boom!
        System.out.println(countdown[2]);
        System.out.println(countdown[1]);
        System.out.println(countdown[0]);
        System.out.println("boom!");

        // implementeer een for loop die alle namen in de array "names" print. Houd er rekening mee dat de array een andere length kan hebben dan 3.
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // implementeer een for loop die de twee arrays combineerd. De output moet zijn:
        // oneSjaak
        // twoSjimmy
        // threeSjonny

        for(int i =0; i < countdown.length && i < names.length; i++) {
            System.out.println(countdown[i] + names[i]);
        }

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Seat");
        cars.add("Peugeot");
        cars.add("Volkswagen");
        cars.add("Nissan");
        cars.add("Renault");

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

            if (cars.get(i).equals("Renault")) {
                System.out.println(cars.get(i));
            }
        }

        cars.remove("Nissan");
        System.out.println(cars);

    }
}
