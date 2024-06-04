public class fizzbuz{
    public static void main(String[] args) {
        doFizzBuzz(100);
    }
    public static void doFizzBuzz(int number){
        IntStream.rangeClosed(1, number)
                .forEach(i->{
                            if (i % 15 == 0){
                                System.out.println("FizzBuzz");
                                return;
                            }
                            if (i % 3 == 0){
                                System.out.println("Fizz");
                                return;
                            }
                            if (i % 5 == 0){
                                System.out.println("Buzz");
                                return;
                            }
                            System.out.println(i);
                        }
                );
    }
}