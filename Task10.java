import java.util.Scanner;
public class Task10{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
      for (int k=1;k<=n-i;k++){
        System.out.print(" ");
      }
      for (int j=1;j<=2*i-1;j++){
        if (i==1 || i==n){
          System.out.print(j);
        }
        else {
          if (j==1 || j==2*i-1){
            System.out.print(j);
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