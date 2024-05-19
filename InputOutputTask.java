public class InputOutputTask {
    public static void main(String[] args) {
        /*Task
         * Make a new scanner object/variable scan1
         * prompt the following
         * what is your name?-->save as string,name
         * Are you over 18?-->save as boolean.status
         * How many siblings?-->save as int,sibling
         * print the following
         * Hello,name
         * over 18?status
         * you have sibling number of sibling
         * //comment the previous scanner for ease of use
         */
         scanner scan = new scanner(System.in);
         Scanner scans = new Scanner(System.in);
         System.out.println("What is your name?");
         String wholeWStrings = scans.nextLine();
         

         System.out.println("Are you over 18?");
         boolean booleanAge = scan.nextBoolean();

         System.out.println("How many siblings?");
         int intSibling = scan.nextInt();

         System.out.println("Hello" + wholeWStrings);
         System.out.println("Over 18?" + booleanAge);
         System.out.println("You have" + "number of sibling." );

    }
    
}
