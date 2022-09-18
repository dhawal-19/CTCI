public class OneAway {

    public static void main(String[] args) {
        System.out.println(OneAway.solution("abc", "dbc"));
        System.out.println(OneAway.solution("dabc", "ab"));
        System.out.println(OneAway.solution("abc", "ddabc"));


    }

    public static boolean solution(String a, String b) {
        int lena = a.length();
        int lenb = b.length();

        if (Math.abs(lena - lenb) > 1)
            return false;

        if (lena == lenb) {
            int i = 0, j = 0, diff = 0;
            while (i < lena && j < lenb) {
                if (a.charAt(i) != b.charAt(j)) {
                    if (diff != 0)
                        return false;
                    diff = 1;
                }
                i += 1;
                j += 1;
            }
        } else {
            boolean flag = lena > lenb;
            int i = 0, j = 0, diff = 0;
            while (i < lena && j < lenb) {
                if (a.charAt(i) != b.charAt(j)) {
                    if (diff != 0)
                        return false;
                    diff = 1;
                    if (flag) {
                        i += 1;
                    } else {
                        j += 1;
                    }
                } else {
                    i += 1;
                    j += 1;
                }
            }
        }
        return true;
    }

}
