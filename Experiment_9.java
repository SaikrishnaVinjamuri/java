import java.util.Scanner;

class Employee {
    Scanner sai = new Scanner(System.in);
    String EmplyName,Address;
    String EmplyMailId;
    int EmplyId;
    long MobileNumber;

    public Employee(){

        /**/

        System.out.println("Enter employee address : ");
        Address = sai.nextLine();

        System.out.println("Enter employee emailId : ");
        EmplyMailId = sai.nextLine();
        System.out.println("Enter Employee name : ");
        EmplyName = sai.nextLine();
        System.out.println("Enter employee Id : ");
        EmplyId = sai.nextInt();
        System.out.println("Enter employee mobile Number : ");
        MobileNumber = sai.nextLong();
    }

    public void display(){
        System.out.println("***********PAY SLIP*************");
        System.out.println("Employee Name    :  "+EmplyName);
        System.out.println("Employee Id      :  "+EmplyId);
        System.out.println("Employee emailId :  "+EmplyMailId);
        System.out.println("Employee Address :  "+Address);
        System.out.println("Employee Mobile Number : "+MobileNumber);
    }
}

class Programmer extends Employee {

    double da,hra,pf,stf,Net_Salary,Gross_salary;
    final double basic_pay = 1_00_000;

    public Programmer(){
        /*System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sai.nextDouble();*/
        da=0.97*basic_pay;
        hra=0.1*basic_pay;
        pf=0.12*basic_pay;
        stf=0.1*basic_pay;
        Net_Salary=(basic_pay+da+hra);
        Gross_salary=(basic_pay-(pf+stf));
    }

    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class AssociateProfressor extends Employee{
    double da,hra,pf,stf,Net_Salary,Gross_salary;
    final double basic_pay1 = 18_000;
    public AssociateProfressor(){
        /*System.out.println("Enter the Basic Pay of Employee");
        basic_pay1=sai.nextDouble();*/
        da=0.97*basic_pay1;
        hra=0.1*basic_pay1;
        pf=0.12*basic_pay1;
        stf=0.1*basic_pay1;
        Net_Salary=(basic_pay1+da+hra);
        Gross_salary=(basic_pay1-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay1);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class AssistantProfressor extends Employee{
    double da,hra,pf,stf,Net_Salary,Gross_salary;
    final double basic_pay2 = 25_000;
    public AssistantProfressor(){
        /*System.out.println("Enter the Basic Pay of Employee");
        basic_pay2=sai.nextDouble();*/
        da=0.97*basic_pay2;
        hra=0.1*basic_pay2;
        pf=0.12*basic_pay2;
        stf=0.1*basic_pay2;
        Net_Salary=(basic_pay2+da+hra);
        Gross_salary=(basic_pay2-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay2);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

class Profressor extends Employee{
    double da,hra,pf,stf,Net_Salary,Gross_salary;
    final double basic_pay3 = 70_000;
    public Profressor(){
        /*System.out.println("Enter the Basic Pay of Employee");
        basic_pay=sai.nextDouble();*/
        da=0.97*basic_pay3;
        hra=0.1*basic_pay3;
        pf=0.12*basic_pay3;
        stf=0.1*basic_pay3;
        Net_Salary=(basic_pay3+da+hra);
        Gross_salary=(basic_pay3-(pf+stf));
    }
    public void payslip(){
        System.out.println("Basic pay of the Employee = "+basic_pay3);
        System.out.println("DA = "+da);
        System.out.println("HRA = "+hra);
        System.out.println("PF = "+pf);
        System.out.println("Staff Club Fund = "+stf);
        System.out.println("NET SALARY = "+Net_Salary);
        System.out.println("GROSS SALARY = "+Gross_salary);
    }
}

public class Experiment_9{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("For which Designation Do you like calculate pay slip and choose following options");
        System.out.println("1)programmer \n2)assistantprofressor \n3)associateprofressor \n4)profressor");
        //System.out.println("\n\t\tPlease type the name in small letters");
        int design = sc.nextInt();

        switch(design){

            case 1 :{
                Programmer pr=new Programmer();
                pr.display();
                pr.payslip();
                break;
            }
            case 2 :{
                AssistantProfressor asstpr=new AssistantProfressor();
                asstpr.display();
                asstpr.payslip();
                break;
            }
            case 3 :{
                AssociateProfressor asspr=new AssociateProfressor();
                asspr.display();
                asspr.payslip();
                break;
            }
            case 4 :{
                Profressor pro=new Profressor();
                pro.display();
                pro.payslip();
                break;
            }

        }

    }
}