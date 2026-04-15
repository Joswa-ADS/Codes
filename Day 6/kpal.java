import java.util.*;
public class kpal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        int n=str.length()-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==0){
                    System.out.print(str.charAt(i));
                }
                if((i+j==n-1 || i-j==1) && j!=0){
                    System.out.print(sb.toString().charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}