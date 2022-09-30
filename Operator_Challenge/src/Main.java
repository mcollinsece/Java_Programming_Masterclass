public class Main {
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;
        double var3 = (var1 + var2) * 100d;
        System.out.println("The sum of my variable is " + var3);
        double rmdr = var3 % 40.00;
        System.out.println("The remainder of my sum divided by 40.00 is " + rmdr);
        boolean rmdrBool = (rmdr == 0) ? true : false;
        if (!rmdrBool){
            System.out.println("Got some remainder");
        }


    }
}
