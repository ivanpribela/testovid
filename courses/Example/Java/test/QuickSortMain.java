import java.util.Arrays;
import java.util.Random;

public class QuickSortMain {

  private static int[] numbers;
  private static final int SIZE = 7;
  private static final int MAX = 20;

  public static void main(String [] args) throws Exception {
    numbers = new int[SIZE];
    Random generator = new Random();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = generator.nextInt(MAX);
    }
    QuickSort sorter = new QuickSort();
    sorter.sort(numbers);
    if (!validate(numbers)) {
      throw new Exception("Array not sorted.");
    }
  }

  private static boolean validate(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
