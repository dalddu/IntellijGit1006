package Collection;

import java.util.HashMap;

public class AlphabetCnt {

    public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s1 = "abbccddeeffgghijklllmmmnnn".toUpperCase();
        //String을 한글자씩 출력할 수 있어야 한다.
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);

        }
        for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);

            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet) {
                //여기에서만 개수를 센다
                //소문자는 대문자로

                int value = alphabetMap.get(c);
                value += 1;
                alphabetMap.put(c, alphabetMap.get(c) + 1);

                }
            }
        System.out.println(alphabetMap);

            System.out.println(s1.charAt(i));
//            System.out.println(s1.charAt(0));
//            System.out.println(s1.charAt(2));
//            System.out.println(s1.charAt(s1.length()-1));
        }



    }
}
