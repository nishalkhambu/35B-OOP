public class IfElse {
    public static void main(String[] args) {
        /* If statement */
        if (true){
            System.out.println("True statement");
        }
        /*If takes boolean expression inside()*/
        int num1 = 10, num2=20;
        if (num1 == num2){
            System.out.println("Equal");

        }else{
            System.out.println("Not found");
        }
        /*note that else is optional */
if (num1 > num2){
    System.out.println("1st is greater");

}  else if (num1< num2){
 System.out.println("2nd is greater");
}
 else if (num1==num2){
    System.out.println("They are equal");
 }else{
    System.out.println("The number are not any of above");
 }
 if (num1==num2){
    System.out.println("1st IF and then nested ");
 }

 






    }
    
}
