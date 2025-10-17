// TODO: Define custom exception InvalidAgeException extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public class Exercise {
    
    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }

        System.out.println("Access granted");
    }
    
    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        try {
            checkAge(16);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught: "+ e.getMessage());
        }
        try {
            checkAge(21);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }

}

