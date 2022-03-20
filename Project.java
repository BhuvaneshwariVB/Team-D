import java.util.Scanner;


public class Project {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int st;
        LoginSignup ls =new LoginSignup();
        do {
            System.out.println("1.Login");
            System.out.println("2.Signup");
            System.out.println("3.Exit");
            st=sc.nextInt();
            switch (st){
                case 1:
                System.out.println("Login Successfully");
                break;
                case 2:
                System.out.println("Sign up");
                ls.signUp();
                break;
                case 3:
                System.out.println("Exit successfully");
                break;
                default:
                System.out.println("Invalid data");
                break;
                }
                System.out.println(st);
           }
           while( st !=3 );
           for (User uu : LoginSignup.arrli) {
               System.out.println(uu.getname());
               
           }
        
       
        sc.close();


   

}
}
