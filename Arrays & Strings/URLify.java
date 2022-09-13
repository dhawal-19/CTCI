public class URLify {
    public static void main(String[] args) {
        String question = "   Mr   John Smith       ";
        String q2 = "Mr Dhawal Kumar Singh   ";
        System.out.println(URLify.solution(question.trim()));
        System.out.println(URLify.solution(q2.trim()));

    }

    public static String solution(String url){
        int spaces = 0;
        for(char c:url.toCharArray()){
            if(Character.isWhitespace(c)) spaces++;
        }
        int newSize = url.length() + spaces * 2;
        char [] ans = new char[newSize];
        int index = 0;
        for(int i=0; i<url.length();i++){
            if(url.charAt(i) == ' '){
                ans[index++] = '%';
                ans[index++] = '2';
                ans[index++] = '0';
            }
            else{
                ans[index++] = url.charAt(i);
            }
        }
       
        return String.valueOf(ans);
    }
}
