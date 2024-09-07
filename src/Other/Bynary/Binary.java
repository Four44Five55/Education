package Other.Bynary;
/*Во многих примерах в интернете можно встретить запись int m = (l + r) / 2;, вместо int mid = l + (r - l) / 2;.
И у меня в заметке тоже была такая запись, пока один из читателей не обратил на это внимание.
Но использование второго варианта является лучшей практикой, так как это помогает избежать переполнения,
когда размер массива велик.
Например, если l = 2147483647 и r = 2147483647, сумма l и r будет равна 4294967294, что превышает максимальное значение,
 которое может удерживать int, вызывая переполнение.
С другой стороны, если вы используете mid = l + (r - l) / 2; это будет работать, как и ожидалось,
потому что вычитание будет сделано первым, а результат будет равен нулю, поэтому деление будет равно нулю,
 а сложение вернет значение l*/
public class Binary {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 4, 10};
        int valueToFind = 3;

        System.out.printf("Index = %d%n", binarySearch(values, valueToFind, 0, values.length - 1));
    }

    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
