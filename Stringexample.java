public class Test {
    public static void main(String[] args) {
        String s1 = "Chidambaram";
        String emailId = "hydramarv@gmail.com";
        System.out.println(s1);
        System.out.println(emailId);
        System.out.println(s1 + emailId + s3+s8);// concatenation//
        String s2 = new String("Hello All");
        System.out.println(s2);
        System.out.println(new Test());
        Test t1 = new Test();
        String s3 = "welcome";
        // creates in a seperate memory called string pool(above)...
        String s4 = new String("welcome");
        // the above two lines are not equal..
        System.out.println(s3 == s4);
        // output will be false...
        String s5 = "welcome";
        System.out.println(s3 == s5);
        // output will be true...(addresses get verified)
        System.out.println(s3.equals(s5));
        // output will be true..(value same or not)
        String s6 = "HeLlo ";
        String s7 = "hello";
        String s8 = "HELLO";
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s6.contains("l"));
        System.out.println(s6.startsWith("H"));
        System.out.println(s6.endsWith("o"));
        System.out.println(s6.length());
        String s9 = " Hello world ";// trim-spaces delete from leading and trailing faces only..
        System.out.println(s9.trim());
        System.out.println(s7.toUpperCase());
        System.out.println(s8.toLowerCase());
        System.out.println(s9.toCharArray());
    }
}
