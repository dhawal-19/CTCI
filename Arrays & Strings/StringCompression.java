public class StringCompression {
    public static void main(String[] args) {
        char [] q = {'a','a','a','b','b'};
        System.out.println(StringCompression.solution(q));
    }
    public static int solution(char [] chars){
        int i=0;
        int nextFree = 0;
        while(i<chars.length){
            int j = i;
            while(j < chars.length && chars[j] == chars[i]){
                j+=1;
            }
            if(j-i > 1){
                
                String k=j-i+"";
                int x=0;
                chars[nextFree++]=chars[i];
                while(x<k.length()){
                    chars[nextFree++]=k.charAt(x++);
                }
            }
            else{
                chars[nextFree++]=chars[i];
            }
            i=j;
        }
        return nextFree;
    }
}
