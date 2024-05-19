public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0]=-10;
        arr[1]=0;
        arr[2]=10;
        arr[3]=20;
        /*we need length of array first,use length */
        int arrayLength = arr.length;
        /*loop from o -(arrayLength -1), 0 -3 */
        for(int index = 0;index < arrayLength; index++){
            System.out.println(arr[index]);

        }
        // or, use condition,index <=arrayLength-1
        System.out.println("Descending loop");
        for(int index = arrayLength -1; index >=0; index--){
            System.out.println(arr[index]);
        }

        /*Loop the arr using while loop
         
         
         * Make an array of ["john","Doe","Foo","Bar"]
         * make a string "Foo"
         * Loop the array and find in which index is "Foo" on
         * print the index
         */

         int i= 0;
         while (i < arrayLength){
            System.out.println(arr[i]);
         i++;

         String[]names={"john","Doe","Foo","Bar"};

         }
         

         
         
    }
    
}
