public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixValue = 10;
        System.out.println("prefix will update here"+ ++prefixValue);
        System.out.println("It will remain the same"+ ++prefixValue);
        /*prefix is when you put operator in the left side of value/var */

        int PrefixPostfix  = 20;
        System.out.println("postfix will not update here"+ ++postfixValue++);
        System.out.println("It will update here"+ ++postfixValue);

    }
    
}
