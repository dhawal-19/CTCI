// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
// cannot use additional data structures?
public class IsUnique{
    public static void main(String[] args) {
        String a = "dhawal";
        String b = "dhawl";
        System.out.println(IsUnique.solution(a));
        System.out.println(IsUnique.solution(b));

    }

    public static boolean solution(String questionString){
        int [] alphabets = new int[26];
        for(char c:questionString.toCharArray()){
            if(alphabets[c - 'a'] != 0){
                return false;
            }
            alphabets[c - 'a']++;
        }
        return true;
    }
}