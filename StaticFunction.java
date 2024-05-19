public class StaticFunction {
    public static int multiply(int a, int b){
        int multiplication = a*b;
        return multiplication;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "coke";
        }
        if (menu == 2){
            return "water";
        }
        if (menu == 3){
            return "frooti";

        }
        return "Invalid Menu";
    }
    public static void main(String[] args) {
        /*if the function is static and in same class
         * no need to make object simply call */
        int multiplyReturn = multiply(10,2);
        System.out.println("Result is "+ multiplyReturn);

        String iGet = vendingMachine(1);
        System.out.println("I get" + iGet);

        /*task1
         * create a function checkEligible
         * takes 2 parameter,string name, int age
         * return string
         * if age is less than 0,more than 200 return "Hello name, invalid age"
         * if age is less than 18 return "sorry name ,you are not eligible"
         * else return "congratulation name, you are eligible"
         */

         def checkEligible(name, age):
    if age < 0 or age > 200:
        return f"Hello {name}, invalid age"
    elif age < 18:
        return f"Sorry {name}, you are not eligible"
    else:
        return f"Congratulations {name}, you are eligible"


         }

         /*task2
          * create a function make square that takes double
          return double of square value
          */

    }
    
}
