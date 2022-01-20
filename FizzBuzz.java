public class FizzBuzz {
    public static void main(String[] args) {

        String str = "";

        if (args.length < 0) {
            System.out.println("error");
        } else {
            str = args[0];

            int num = Integer.parseInt(str);

            for (int i = 1; i <= num; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("Fizzbuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
