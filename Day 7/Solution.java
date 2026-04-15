class Solution{
    public String evenWords(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && s.charAt(i)!=' ' && s.charAt(i-1)==' ')
            {
                start=i;
            }
            else if(s.charAt(i)==' ' && i>0 && s.charAt(i-1)!=' ')
            {
                end=i;
                count=0;
                for(int j=start;j<end;j++){
                    count++;
                }
                if(count%2==0)
                {
                    sb.append(s.substring(start,end));
                }
            }
        }
        // Handle last word if string doesn't end with space
        if(s.length()>0 && s.charAt(s.length()-1)!=' '){
            end=s.length();
            count=end-start;
            if(count%2==0){
                sb.append(s.substring(start,end));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Leetcode is cool";
        String result = sol.evenWords(s);
        System.out.println(result);
    }
}