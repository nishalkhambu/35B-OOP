public class JumpStatement {
    public static void main(String[] args) {
        /* Break and continue are jump statement*/
        for (int index = 0; index < 3; index ++){
            if( index ==1){
                break; // this will end the loop from here

            }
            System.out.println("Index" + index);
         }//break will exist scope here

         /*can be use in while/do while */
         int counter = 0 ;
         while(counter < 3){
            if(counter == 1){
                break; // exit from here
            }
            System.out.println("while counter"+ counter);
            counter ++;

         }

         /*continue will skip the current iteration
          * or will bypass all the statement below it */
          for(int index=0; index <5; index ++){
            for int outer =0 ;outer < 2 ; outer ++){
                for(int inner )
                
            }


          }

          */
        

        }
    }
    
}
