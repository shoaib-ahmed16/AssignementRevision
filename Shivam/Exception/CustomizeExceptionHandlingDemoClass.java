package Exception;

class UserNameInvalidException extends Exception {
 public UserNameInvalidException(String message) {
     super(message);
 }
}


class UserPasswordInvalidException extends RuntimeException {
 public UserPasswordInvalidException(String message) {
     super(message);
 }
}

public class CustomizeExceptionHandlingDemoClass {
 public static void main(String[] args) {
     try {
         String userName = "Shivam"; 
         String userPassword = "12345"; 

         String result = validateUser(userName, userPassword);
         System.out.println(result);
     } catch (UserNameInvalidException e) {
         System.out.println("User name validation failed: " + e.getMessage());
     } catch (UserPasswordInvalidException e) {
         System.out.println("Password validation failed: " + e.getMessage());
     }
 }

 public static String validateUser(String userName, String userPassword) throws UserNameInvalidException {
     
     String validUserName = "Shivam";
     String validPassword = "12345";

     
     if (!userName.equals(validUserName)) {
         throw new UserNameInvalidException("Invalid username provided.");
     }

     
     if (!userPassword.equals(validPassword)) {
         throw new UserPasswordInvalidException("Invalid password provided.");
     }

     
     return "User validated successfully, you are logged in!";
 }
}
