public class CalculatorFactory {

     public Calculator getInstance(int x){

        if(x==1)
            return new Add();
        else if(x==2)
            return new Subtract();
        else if(x==3)
            return new Multiply();
        else
            return new Divide();

    }
}
