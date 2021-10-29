package lab1;

public class Primes {
    public static void main (String[] args) {
        for (int i=2; i<100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    //проверка на простое число
    public static boolean isPrime (int n){
        for (int i=2; i<n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}