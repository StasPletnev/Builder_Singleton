import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> arrayList) {
        Logger logger = Logger.getInstance();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > f) {
                logger.log("Элемент " + arrayList.get(i) + " не подходит. Удаляю его.");
                arrayList.remove(i);
            } else {
                logger.log("Элемент " + arrayList.get(i) + " подходит.");
            }
        }
        return arrayList;
    }
}
