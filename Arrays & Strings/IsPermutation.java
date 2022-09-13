// Check Permutation: Given two strings, write a method to decide if one is a permutation of the 
// other.
public class IsPermutation {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";
        String c = "car";
        String d = "rat";
        System.out.println(IsPermutation.solution(a, b));
        System.out.println(IsPermutation.solution(c, d));

    }
    public static boolean solution(String a,String b){
        int [] alphabets = new int[26];
        for(char c:a.toCharArray()){
            alphabets[c - 'a']++;
        }

        for(char c:b.toCharArray()){
            if(alphabets[c - 'a'] == 0) return false;
            alphabets[c - 'a']--;
        }

        for(int i=0;i <26;i++){
            if(alphabets[i] != 0) return false;
        }
        return true;
    }
}
