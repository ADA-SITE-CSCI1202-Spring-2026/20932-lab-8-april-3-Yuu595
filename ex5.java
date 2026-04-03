import java.util.HashMap;
import java.util.Map;

public class ex5 {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();

        students.put("Nazim", 3.9);
        students.put("Nuray", 3.9);
        students.put("Gunel", 2.8);
        students.put("Farid", 3.4);
        students.put("Jala", 3.2);

        double max = 0;
        double sum = 0;

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
            sum += entry.getValue();
        }

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        double average = sum / students.size();
        System.out.println(average);

        int count = 0;

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() < average) {
                count++;
            }
        }

        System.out.println(count);
    }
}