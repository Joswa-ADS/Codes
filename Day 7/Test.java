public class Test {
    public int wordCount(String s) {
        int count = 0;
        int i=0;
        while(s.charAt(i)==' '){
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)==' '){
                count++;
                while(i<s.length() && s.charAt(i)==' '){
                    i++;
                }
            }
            i++;
        }
        return count + 1;
    }
    public static void main(String[] args) {
        Test m = new Test();
        System.out.println(m.wordCount(" hi "));
    }
}