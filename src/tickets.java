import java.util.Scanner;


public class tickets {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the QA Cenima Ticket purchashing:");
        System.out.println("Which day are you planning on visiting? i.e Mon, Tue, Wed, Thur, Fri or Sat");
        String day = input.nextLine();

        if (day.equals("Wed") || day.equals("Wednesday") || day.equals("wednesday")) {

            System.out.println("How many Standard tickets would you like? ");
            String standard = input.nextLine();
            int standardresult = Integer.parseInt(standard) * 6;

            System.out.println("How many OAP tickets would you like?");
            String OAP = input.nextLine();
            int OAPresult = Integer.parseInt(OAP) * 4;

            System.out.println("How many Student tickets would you like?");
            String student = input.nextLine();
            int Studentresult = Integer.parseInt(student) * 4;

            System.out.println("How many child tickets would you like?");
            String child = input.nextLine();
            int childresult = Integer.parseInt(child) * 2;

            int total = (childresult + Studentresult + OAPresult + standardresult);

            System.out.print("The total cost of tickets for this movie is £" + total);

        }else{

            System.out.println("How many Standard tickets would you like? ");
            String standard = input.nextLine();
            int standardresult = Integer.parseInt(standard) * 8;

            System.out.println("How many OAP tickets would you like?");
            String OAP = input.nextLine();
            int OAPresult = Integer.parseInt(OAP) * 6;

            System.out.println("How many Student tickets would you like?");
            String student = input.nextLine();
            int Studentresult = Integer.parseInt(student) * 6;

            System.out.println("How many child tickets would you like?");
            String child = input.nextLine();
            int childresult = Integer.parseInt(child) * 4;

            int total = (childresult + Studentresult + OAPresult + standardresult);

            System.out.print("The total cost of tickets for this movie is £" + total);


        }











    }
}