public class FirstNonRep {
    public static char firstchar(String str){
        char ch='n';
        for(int i=0;i<str.length();i++){
            StringBuilder sb=new StringBuilder(str);
            ch=(char)sb.charAt(i);
            sb.deleteCharAt(i);
            if(sb.toString().indexOf(ch)==-1){
                return ch;
            }
        }
        return ch;
    }
    public static void main(String[] args){
        System.out.println(firstchar("abacb"));
    }
}