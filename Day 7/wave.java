public class Wave {
    public static String waveForm(String str){
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        char[] charArray=new char[str.length()];
        //using stringbuilder
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sb.append(str.charAt(i));
            }
            else{
                sb1.append(str.charAt(i));
            }
        }
        //using char array
        int a=0;
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                charArray[a]=str.charAt(i);
                a++;
            }
        }
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                charArray[a]=str.charAt(i);
                a++;
            }
        }
        System.out.println(new String(charArray));
        return sb.toString() + sb1.toString();
    }
    public static void main(String[] args){
        String str="VIRATKOHLI";
        System.out.println(waveForm(str));
    }
}