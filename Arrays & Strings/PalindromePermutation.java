public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(PalindromePermutation.solution("abb"));
        System.out.println(PalindromePermutation.solution("abc"));

    }

    public static boolean solution(String a){
        int [] alpha = new int[26];
        for(char c:a.toCharArray()){
            int index = c - 'a';
            if(alpha[index] == 0) alpha[index]++;
            else alpha[index] --;
        }
        boolean isEvenLength = a.length() % 2 == 0;
        boolean singleFound = false;
        for(int i=0;i<26;i++){
            if(isEvenLength){
                if(alpha[i] != 0) return false;
            }
            else{
                if(alpha[i] != 0 && singleFound) return false;
                else if(alpha[i] == 1) singleFound = true;
            }
        }
        return true;
    }
}
