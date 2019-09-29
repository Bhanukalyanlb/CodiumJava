public class Pattern {
   public static void main(String[] args) {
   int n = 5;
   int i,j;
   for(i = 1; i <= n; i++)
   {
      for(j = n-1; j >= i; j--)
      {
      System.out.print(" ");
      }
         System.out.print("*");
      //inner loop
      for(j = 1; j < (i-1) * 2; j++)
      {
         System.out.print(" ");
        }
      if(i > 1)
      {
         System.out.print("*");
      }
      System.out.print("\n");
      }
   }
}
