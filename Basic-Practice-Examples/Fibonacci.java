//program to find the fibonacci of the number
class Fibonacci {
  public static void main(String[] args) {

    int i = 1, n = 10, n1 = 0, n2 = 1;

    while (i <= n) {
      System.out.print(n1+"  ");

      int n3 =n1 + n2;
      n1 = n2;
      n2 = n3;
      i++;
    }
  }
}
