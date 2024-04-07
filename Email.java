import java.util.Scanner;
import java.util.Random;

public class Email {
    private String firstName,lastName,email,alternativeEmail,password,department,companyName;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength;

    public Email(String firstName,String lastName,int defaultPasswordLength,String companyName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        System.out.println("EMAIL CREATED : " + this.firstName + " "+this.lastName);

        this.department = setDepartment();
        System.out.println("DEPARTMENT : "+this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("PASSWORD : " + this.password);

        email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+this.companyName+".co.uk";
        System.out.println(email);
    }
    public String setDepartment() {
        System.out.println("enter the number for the required department \n 1 for sales \n 2 for Development \n 3 for Accounting \n 0 for none");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1 ){return "Sales";}
        else if(answer ==2){return "Development";}
        else if(answer ==3){return "Accounting";}
        else {return "";}
    }

   public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
   }

    public void setEmailAddress(String alternativeEmail){
        this.email = alternativeEmail;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME : "+firstName + "  " + lastName + "  " +
                "COMPANY EMAIL  : " + email + " "+
                "PASSWORD : " +password + "  " +
                "MAILBOX CAPACITY "  + mailboxCapacity + "MB";
    }

    public String randomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUV1234567890!!£$%^&*()abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[passwordLength];
        for(int i =0;i<passwordLength;i++){
            int rand = (int) (Math.random()* passwordSet.length());
             password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}