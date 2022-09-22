import java.util.Scanner;

/**
 * hollopattaran
 */
public class hollopattaran {

    public static void main(String[] args) {
        int n;int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

    }
}