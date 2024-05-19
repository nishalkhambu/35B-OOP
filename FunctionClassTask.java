public class FunctionClassTask {

    /*Make a function is equal
     * that makes two double value and return boolean
     * return if the values are equal or not */

     boolean isEqual(double num1, double num2){
        boolean equal = num1 == num2;
        return equal;
     }
    public static void main(String[] args) {

        FunctionClassTask f=new FunctionClassTask();
        boolean a=f.isEqual(11, 11);
        System.out.println(a);

    }
    
}
