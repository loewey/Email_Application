public class EmailTest {

    public static void main(String[] args) {
        Email test1 = new Email("john","smith",10,"Microsoft");
        test1.setPassword("steveFromMinecraft");
        test1.setEmailAddress("louisIzCool@gmail.com");
        test1.setMailboxCapacity(1000);
        System.out.println(test1.getEmail());
        System.out.println( test1.getPassword());
        System.out.println(test1.getMailboxCapacity());
        System.out.println(test1.showInfo());
    }
}


