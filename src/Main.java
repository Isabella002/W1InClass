public class Main {
    public static void main(String[] args) {
        double d = testMethod(-1 );
        //assert(args.length>2);

        System.out.println("Hello World.");
    }
    public static double testMethod(int x){
        assert(x > 0): "Your value must be greater than 0";
        return 3/x;
    }
}
