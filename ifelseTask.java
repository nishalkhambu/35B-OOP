public class ifelseTask {
    public static void main(String[] args) {
        int science = 35;
    int english = 55;
    int math = 89;

    int total = science + english + math;
    int average = total/3;

    if(science<35 || english<35 || math<35){
        System.out.println("Fail");
    }
    else if(average < 60){
        System.out.println("Third Division");
    }
    else if(average < 70){
        System.out.println("Second Division");
    }
    else if(average < 80){
        System.out.println("Third Division");
    }
    else if(average < 0 || average > 100){
        System.out.println("Distinction");
    }else{
        System.out.println("Invalid");
    }
}
}

        

    
    

