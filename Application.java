//Application.java file
// Creating a method
// that prints a message
public class Method {
  
    // Method to print message
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        Method m = new Method();
        m.printMessage();  // Calling the method
    }
}
 feature202

//feature202 changes added
public class Main {
    public static void main(String[] args) {
        // Calculate for 2
        System.out.println(2 * 2);
        System.out.println(2 * 2 * 2);
        
        // Calculate for 3
        System.out.println(3 * 3);
        System.out.println(3 * 3 * 3);
        
        // Calculate for 4
        System.out.println(4 * 4);
        System.out.println(4 * 4 * 4);
    }
}
//feature 202 ended 
 
//feature 201 changes
public class Main {
    public static void main(String[] args) {
        int totalUsers = 100;
        int usersWithoutSubmission = 20;
        int usersWithWrongSubmissions = 30;
        
        int[] result = calculateRatings(totalUsers, usersWithoutSubmission, usersWithWrongSubmissions);
        
        System.out.println("Users who will get a rating: " + result[0]);
        System.out.println("Users who will get a rating > 1000: " + result[1]);
    }

    public static int[] calculateRatings(int total, int noSubmission, int wrongSubmission) {
        int usersWithRating = total - noSubmission;
        int usersAbove1000 = usersWithRating - wrongSubmission;
        
        return new int[]{usersWithRating, usersAbove1000};
    }
}
//end feature 201 changes
  main
