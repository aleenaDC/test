import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Are you hungry?");
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter YES or NO ");
        String str= scan.nextLine(); //reads string.
        if (str.equalsIgnoreCase("yes")){
            System.out.println("eat breakfast");
        }
        else
            System.out.println("study");
    }

}
