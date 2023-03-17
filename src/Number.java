//Class Product
class Number {
    //Method Multiply : Multiplication of two numbers of type int
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    //Method Multiply : Multiplication of two number of type double
    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    //Method Multiply : Multiplication of Three number of type double and int
    public double multiply(int n1, int n2, double n3) {
        return n1 * n2 * n3;
    }


}

class Main {
    public static void main(String[] args) {
        //Print in the console
        Number obj = new Number();
        System.out.println("Multiplication of two number of type int : " + obj.multiply(10, 5));
        System.out.println("Multiplication of two number of type double : " + obj.multiply(13.12, 4.11));
        System.out.println("Multiplication of two number of type double : " + obj.multiply(120, 23, 43.22));
    }
}