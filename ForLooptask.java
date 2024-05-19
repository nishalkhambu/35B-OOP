public class ForLooptask {
    public static void main(String[] args) {
        /* Task
         * Make a multiplication table of 2
         * For eg :
         * 2 x 1 = 2
         * 2 x 2 = 4
         * ..
         * ..
         * 2 x 10 = 20
         * Note: Loop from 1 to 10 and multiply the index
         */
        for (int i = 0; i <=10; i++) {
            System.out.println("2 x" + i + "=" + (2*i));
        }
        /*Nested for loop
         * Using for loop inside the scope of for loop*/
        for(int outer=0; outer < 2; outer++){
            for(int inner = 3;inner < 0; inner --){
                

                System.out.println("outer Index"+ outer);
            }
            /*Task
             * Make a multiplication table like the following
             * Multiplication table of 10
             * 10 x 1=10
             * 10 x 2=20
             * ..
             * 10 x 10=100
             * ..
             * Multiplication table of 1 
             * 1 x 1=1
             * 1 x 2=2
             * ..
             * 1 x 10 =10
             */

        }   
    }
}
