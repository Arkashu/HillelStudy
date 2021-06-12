public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                String str = "Hello World";
                System.out.print(str + " ");
            }
            else if (i % 3 == 0){
               String str = "Hello";
                System.out.print(str + " ");
            }
             else if (i % 5 == 0) {
                String str = "World";
                System.out.print(str + " ");
            }
            else {

                System.out.print(i + " ");
            }
        }
    }
}
