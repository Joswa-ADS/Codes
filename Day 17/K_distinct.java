import java.util.*;

public class K_distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> m=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char a=s.charAt(j);
                m.put(a,m.getOrDefault(a,0)+1);
                if(m.size()==k)
                    c++;
                else if(m.size()>k)
                    break;
            }
        }
        System.out.println(c);
        sc.close();
    }
}