public class hw_2_algorithms {
    public static void main(String[] args) {
        System.out.println("hi");
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        countingSort(array);
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void countingSort(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array)
        {
            if (element < min)
            {
                min = element;
            }
            if (element > max)
            {
                max = element;
            }
        }
        int[] buckets = new int[max - min + 1];
        for (int element : array)
        {
            buckets[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                array[arrayIndex++] = i + min;
            }
        }
    }
}
