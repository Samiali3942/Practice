

public class prime_sum {
    public static boolean isPrime(int n) { //2
        if (n <= 1) { //2<=1
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { //2<=sqrt(2)
            if (n % i == 0) { //2%2==0
                return false;
            }
        } //2<=2
        return true; //true
    }
    public static void main(String[] args) {
        int n = 10; //10
        int sum = 0; //0
        for (int i = 2; i <= n; i++) { //2<=10
            if (isPrime(i)) { //isPrime(2)
                sum += i; //sum=0+2=2
            }
        } //2<=10
        System.out.println(sum); //2
    }
}
