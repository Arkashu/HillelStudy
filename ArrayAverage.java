public class ArrayAverage {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*11) + 10);
            System.out.println(array[i]);
        }
        double average = 0;
        for (int i = 0; i < 10; i++) {
            average += array[i];
        }
        average /=10;
        System.out.println("Average = " + average);
    }
}

