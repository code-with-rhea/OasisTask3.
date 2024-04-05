// import java.sql.*;
// import java.util.Scanner;
// import java.util.Random;

// public class Task1 {
//     private static final int min = 1000;
//     private static final int max = 9999;

//     public  static class user  {
//          private String username;
//          private String password;

//          Scanner sc = new Scanner(System.in);

//          public user(){
//         }

//         public String getUsername() {
//             System.out.println("Enter Username :");
//             username = sc.nextLine();
//             return username;
//         }
//         public String getPassword() {
//             System.out.println("Enter Password :");
//             password = sc.nextLine();
//             return password;
//         }
         
//     }
    
//     public static class PanRecord {
//         private int pnrNumber;
//         private String passengerName;
//         private String trainNumber;
//         private String classType;
//         private String journeyDate;
//         private String from;
//         private String to;

//         Scanner sc = new Scanner(System.in);

//         public int getpnrNumber(){
//             Random random = new Random();
//             pnrNumber = random.nextInt(max) + min;
//             return pnrNumber;
//         }

//         public String getPassengerName(){
//             System.out.println("Enter the passenger name :");
//             passengerName = sc.nextLine();
//             return passengerName;
//         }
        
//         public String gettrainNumber(){
//             System.out.println("Enter the train number :");
//             trainNumber = sc.nextLine();
//             return trainNumber;
//         }

//         public String getclassType(){
//             System.out.println("Enter the class type :");
//             classType = sc.nextLine();
//             return classType;
//         }

//         public String getjourneyDate(){
//             System.out.println("Enter the journey date as 'YYYY-MM-DD' format :");
//             journeyDate = sc.nextLine();
//             return journeyDate;
//         }

        
//         public String getfrom(){
//             System.out.println("Enter the starting place  :");
//             from = sc.nextLine();
//             return from;
//         }

        
//         public String getto(){
//             System.out.println("Enter the destination place :");
//             to = sc.nextLine();
//             return to;
//         }
//     }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         user u1 = new user();
//         String username = u1.getUsername();
//         String password = u1.getPassword();

//         String url = "jdbc:mysql://localhost : 3306"

//     }
    
// }
