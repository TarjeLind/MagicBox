import java.util.Random;

public class MagicBox<T> {
    private int counts;
    private T[] items;
    private Random random = new Random();

    public MagicBox(int counts) {
        this.counts = counts;
        items = (T[]) new Object[counts];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Коробка уже заполнена! ");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null)
                throw new RuntimeException("Коробка ещё не заполнена! Осталось заполнить " + (counts - i));
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}