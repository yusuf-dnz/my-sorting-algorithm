public class MySorter {
    public static void main(String[] args) {
        int index = 0;
        int[] numbers;
        numbers = new int[]{10, 7, 25, 4, 15, 31, 18, 9, 12, 5, 28, 14, 22, 8, 17, 3, 19, 11, 6, 30};
        int array_length = numbers.length;

        while (index < array_length) {
            int bigger = 0;
            int temp = 0;

            for (int k : numbers) {
                System.out.print(k + " ");
            }
            System.out.println();

            for (int i = 0; i < array_length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) break;
                if (i + 1 == array_length - 1) {
                    System.out.println("numbers sorted");
                    System.exit(0);
                }
            }

            for (int number : numbers) {
                if (numbers[index] > number) bigger++;
            }
            if (index != bigger) {
                temp = numbers[bigger];
                numbers[bigger] = numbers[index];
                numbers[index] = temp;
            } else index++;
        }
    }
}
