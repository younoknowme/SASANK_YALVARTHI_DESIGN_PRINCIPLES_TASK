public class Divide implements Calculator {
    public void calculate(long a, long b){
        if(b==0) {
            System.out.println("Division by zero is not Supported");
        }
        else{
            System.out.println("The Division of "+a+" by "+b+" is = "+(a/b));
        }
    }
}
