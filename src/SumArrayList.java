import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumArrayList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list = addArrayList(list);
        System.out.print("Ilość elementów w liście: ");
        System.out.println(list.size());

        System.out.println("Suma wszystkich elementów listy: ");
        sumOfTheAllElements(list);

    }

    private static void sumOfTheAllElements(ArrayList<Double> list) {
        double sum = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (i == list.size() - 1)
                builder.append(list.get(i));
            else
                builder.append(list.get(i) + " + ");
        }
        System.out.println(builder + " = " + sum);
    }


    private static ArrayList<Double> addArrayList(ArrayList<Double> list) {
        String choice = null;
        System.out.print("Podaj wartość do listy: ");
        list.add(scan.nextDouble());
        scan.nextLine();
        System.out.println("Czy zakończyć program? ");
        System.out.printf("aby zakończyć wpisz - exit: ");
        choice = scan.nextLine().toLowerCase();
        if (!choice.equals("exit"))
            return addArrayList(list);
        else
        return list;
    }
}
