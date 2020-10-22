import java.util.Scanner;

public class Experiment_8 {
    static String userName;
    static String emailId;
    static String mobileNumber;
    static String password ;

    public static void userData(){
        //int count = 0 ;
        String regex = "[A-Z a-z _ 0-9]+";
        Scanner sai = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        userName = sai.nextLine();
        if(userName.length()>0) {
            if(userName.matches(regex)) {
                System.out.println("Valid User Name");
                //count++;
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
                //count++;
            }
            else
                System.out.println("Invalid emailId Please re enter");
        }
        else
            System.out.println("emailId should have atleast 10 character ");

        System.out.println("Enter Your Mobile Number");
        mobileNumber = sai.next();
        String regex3 = "[0-9]+";
        /*String s = mobileNumber.toString();
        int count = s.length();*/
        if(mobileNumber.length()==10){
            if(mobileNumber.matches(regex3)){
                System.out.println("vaild Number");
                //count++;
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
                //count++;
            }
            else
                System.out.println("Invalid password Please re enter");
        }
        else
            System.out.println("password should have atleast 8 character ");

        /*if(count!=4)
            System.out.println("please re-enter invalid data");
        else
            System.out.println("Thank you");*/
    }

    public static void main(String []args){
        userData();
    }
}
