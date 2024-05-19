public class VariableClass {
    /*Intance variable
      *Acess with object
      *Is not shared with other object
      */
    int instanceVariable = 120;
    /*Static variable
      * Access with Class
      * Is shared with other object
     */
    public static void main(String[] args) {
        /*Non primitive data
         type declaration*/
         byte bytevalue;
         /*Initialization */
         bytevalue=10;
         /*Declaration and Initialization */
         short shortvalue=100;
         /*Multiple Initialization */
         int intvalue1,intvalue2;
         /*Multiple Initialization */
         intvalue1=-99; intvalue2=99;
         /*Multiple Declaration and Initialization*/
         long longvalue1=-999, longvalue2=999;
         float floatvalue=1.90f; //the letter 'f' is required
         double doublevalue=28.88d; // the letter 'd ' is optional
         char charvalue='c'; //single letter in single quote
         boolean booleanvalue=false; //true/false lowercase

         /*Non primitive data type */
         /*string */
         String stringiInfo1 = "This is variable";
         /*using class */
         String stringInfo2 =new String("Class");
         /*Object use the same class as written above */
         VariableClass variableObj = new VariableClass();

         /*Illegal actions following*/
         /*byte byteValue =10;// You cannot redeclare */
         /*byteValue =20 ; //instead reassign */
         /*boolean boolVal3 = 'false';// wrong data type
         *short shortVal = 10000000;// cannot exceed min/max
         */
        /*We need to use object to acccess instance variable */
        System.out.println(variableObj.instanceVariable);
        /*We can access the static variable with class */
        System.out.println(VariableClass.staticVariable);

        /*Type casting */
        /*Implicit type casting (automatic)
         * from smaller type to larger type
         */
        int intValueConvert = 10;
        double doubleValueConvert = 19.23d;
        int doubleValueConvertedToInt = (int) doublevalue;
    }
}
