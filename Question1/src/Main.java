public class Main {
    public static void main(String[] args){

        int a = 20, b = 10;
        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        boolean gt = a > b;
        boolean gtAtg = a > b && b > 0;
        System.out.println("Addition: "+ String.valueOf(addition));
        System.out.println("Subtraction: " + String.valueOf(subtraction));
        System.out.println("Multiplication: "+ String.valueOf(multiplication));
        System.out.println("Division: "+ String.valueOf(division));
        System.out.println("Is a greater than b? "+ String.valueOf(gt));
        System.out.println("Is a > b and b > 0? "+ String.valueOf(gtAtg));
    }
}