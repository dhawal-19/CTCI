public class IsSubstring {
    public static void main(String[] args) {
        System.out.println(IsSubstring.solution("dhawal", "ldhawa"));
        System.out.println(IsSubstring.solution("dhawal", "ldhaawa"));
    }

    public static boolean solution(String a,String b){
        String x = a+a;
        int pos = x.indexOf(b);
        return pos == -1 ? false : true;
    }
}
