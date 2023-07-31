package Part1.ObjectsAndClasses.Arithmetic;

public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumNum(){
        int sum = a + b;
        System.out.println("Sum of two numbers: " + sum);
    }

    public void multiplyNum(){
        int multiplication = a * b;
        System.out.println("multiplication of two numbers: " + multiplication);
    }

    public void maxNum(){
        if (a>b){
            System.out.println("Maximum number is a: " + a);
        }
        else System.out.println("Maximum number is b: " + b);
    }

    public void minNum(){
        if (a<b){
            System.out.println("Minimum number is a: " + a);
        }
        else System.out.println("Minimum number is b: " + b);
    }
}
