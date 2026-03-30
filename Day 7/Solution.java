class Solution{
    public String evenWords(String s) {
        StringBuilder sb=new StringBuilder();
        int init=1,count=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' '&& i>0)
            {
                start=i;
            }
            else if(s.charAt(i)==' '&& s.charAt(i-1)!=' ')
            {
                end=i;
            }
            for(int j=start;j<end;j++){
                count++;
            }
            if(count%2==0)
            {
                sb.append(s.substring(start,end));
            }
            
        }
        return sb.toString();

        public static void main(String[] args) {
            Solution sol = new Solution();
            String s = "Leetcode is cool";
            String result = sol.evenWords(s);
            System.out.println(result);
        }
    

        
    }

}