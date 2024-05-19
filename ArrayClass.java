public class ArrayClass {
    public static void main(String[] args) {
        /*Array declaration */
        int[] myFirstArray;
        /*Memory alloc */
        myFirstArray = new int[5];
        /*Array Declaration anfd memory alloc */
        int[] mySecondArray = new int[3];
        /*Array declaration.\, memory alloc,and initialization */
        int[]myThirdArray = {10,20,30,40};

        //Array index --> position of element/values
        //start with zero
        mySecondArray[0]=10;
        mySecondArray[1]=20;
        mySecondArray[2]=100;
        //Access/store in new variable
        int arrayElement= mySecondArray[0];
        System.out.println("First index" + arrayElement);
        System.out.println("second index"+ mySecondArray[1]);

        /*Task1
         * Make the follwing array named animals
         * ["cat","Dog","Tiger","Snake"]
         * print "Snake"
         */

        //Method 1
         String []animals = new String[4];

         animals[0]="Cat";
         animals[1]="Dog";
         animals[2]="Tiger";
         animals[3]="Snake";
         String fourth = animals[3];
         System.out.println(fourth);

         //Method 2
         String []animals2={"Cat","Dog","Tiger","Snake"};
         System.out.println(animals2[3]);




         
    }
    
}
