package Opgaver;

public class opgaver {
    public static int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static int power(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else {
            result = n * power(n, p - 1);
        }

        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else if (p % 2 == 1) {
            result = n * power2(n, p - 1);
        } else {
            result = power2(n * n, p / 2);

        }
        return result;
    }

    public static int product(int a, int b) {
        int result = 0;
        if (a == 0) {
            result = 0;
        } else {
            result = product(a - 1, b) + b;
        }
        return result;
    }
    public static int productRus(int a, int b){
        int result = 0;
        if(a==0){
            result = 0;
        }else if(a>= 1 && a % 2 == 1){
            result = productRus(a-1,b)+b;
        }else{
            result = productRus(a/2,2*b);
        }
        return result;
    }

    public static String reverse(String s){
     String result = "";
     if(s.equals("")){
         result = "";
     }else{
         result = s.substring(s.length()-1)+reverse(s.substring(0,s.length()-1));

     }
     return result;
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(power(2, 5));
        System.out.println(power2(2, 5));
        System.out.println(product(5, 5));
        System.out.println(productRus(19,3));
        System.out.println(reverse("RANSLIRPA"));
    }
}
