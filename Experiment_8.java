import java.util.Scanner;

public class Experiment_8 {
    static String userName;
    static String emailId;
    static String mobileNumber;
    static String password ;

    public static void userData(){
        String regex = "[A-Z a-z _ 0-9]+";
        Scanner sai = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        userName = sai.nextLine();
        if(userName.length()>0) {
            if(userName.matches(regex)) {
                System.out.println("Valid User Name");
            }
            else
                System.out.println("Invalid User Name Please re enter");
        }
        else
            System.out.println("User Name should have atleast 1 character ");

        System.out.println("Enter Your emailId");
        emailId = sai.nextLine();
        String regex2 = "[A-Z a-z_.@0-9]+";
        if(emailId.length()>10) {
            if(emailId.matches(regex2)) {
                System.out.println("Valid emailId");
            }
            else
                System.out.println("Invalid emailId Please re enter");
        }
        else
            System.out.println("emailId should have atleast 10 character ");

        System.out.println("Enter Your Mobile Number");
        mobileNumber = sai.next();
        String regex3 = "[0-9]+";
        if(mobileNumber.length()==10){
            if(mobileNumber.matches(regex3)){
                System.out.println("vaild Number");
            }
            else
                System.out.println("Invalid Number");
        }
        else
            System.out.println("Number should have atleast 10 digits ");


        System.out.println("Enter Your Password");
        password = sai.next();


        String regex4 = "[A-Z a-z_.@0-9!#$%]+";
        if(password.length()>8) {
            if(password.matches(regex4)) {
                System.out.println("Valid password");
            }
            else
                System.out.println("Invalid password Please re enter");
        }
        else
            System.out.println("password should have atleast 8 character ");

    }

    public static void main(String []args){
        userData();
    }
}
