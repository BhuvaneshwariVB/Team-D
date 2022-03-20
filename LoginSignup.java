import java.util.ArrayList;
import java.util.Scanner;

public class LoginSignup {

    public static ArrayList<User> arrli= new ArrayList<User>();

    public void signUp()
    {
    Scanner sc=new Scanner(System.in);
     User user=new User();
     System.out.println("Enter the name :");
     user.setname(sc.nextLine());


     System.out.println("Enter the pasword :");
     user.setpassword(sc.nextLine());


     System.out.println("Enter the email");
     user.setemail(sc.nextLine());


arrli.add(user);

    }
    
}
