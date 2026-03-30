import java.util.StringTokenizer;
public class EvenLength {
    //using stringtokenizer
    public static String evenlen(String str){
        StringTokenizer token=new StringTokenizer(str," ");
        String[] words=new String[token.countTokens()];
        int index=0;
        while(token.hasMoreTokens()){
            words[index++]=token.nextToken();
        }
        StringBuilder sb=new StringBuilder();
        for(String word : words){
            if(word.length()%2==0){
                sb.append(word);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    //without stringtokenizer
    public static String evenlength(String str){
        int i=0;
        int start;
        int end;
        StringBuilder sb=new StringBuilder();
        while(i<str.length()){
            while(i<str.length() && str.charAt(i)==' '){
                i++;
            }
            start=i;
            while(i<str.length() && str.charAt(i)!=' '){
                i++;
            }
            end=i;
            if((end-start)%2==0){
                sb.append(str.substring(start,end));
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(evenlen("This is a test string"));
        System.out.println(evenlength("This is a test string"));
    }
}