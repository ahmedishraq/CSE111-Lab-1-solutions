import java.util.Scanner;
public class Task9{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int k=1;k<=n-i;k++){
        System.out.print(" ");
      }
      for (int j=1;j<=i;j++){
        if (i==1 || i==n){
          System.out.print(n+j-i);
        }
        else {
          if (j==1 || j==i){
            System.out.print(n+j-i);
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}