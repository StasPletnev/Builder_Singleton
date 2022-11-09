import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoggerArrays {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Привет! Введите два числа через пробел (размер списка и верхнюю границу значений элементов в списке)");
        String numbers = scanner.nextLine();
        List<String> number = List.of(numbers.split(" "));
        List<Integer> arrayList = new ArrayList<>(Integer.parseInt(number.get(0)));
        for (int i = 0; i < Integer.parseInt(number.get(0)); i++) {
            arrayList.add((int) (Math.random() * Integer.parseInt(number.get(1))));
            logger.log(String.valueOf(arrayList.get(i)));
        }
        logger.log("Введите число по которому будет фильтроваться список: ");
        Filter filter = new Filter(Integer.parseInt(scanner.next()));
        logger.log(filter.filterOut(arrayList).toString());
        scanner.close();
    }
}
