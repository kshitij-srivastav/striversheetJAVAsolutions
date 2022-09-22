import java.util.*;
import java.math.BigInteger;

class Solution {
    public int numDifferentIntegers(String str) {
        Map <BigInteger,Integer> mp= new HashMap<>();
        StringTokenizer st= new StringTokenizer(extract(str));
        int size= st.countTokens(),res=0;
        String temp="";
        for(int i=0; i<size; i++){
            temp=st.nextToken();
            if(!mp.containsKey(new BigInteger(temp))) {
                res++;
                mp.put(new BigInteger(temp),i);
            }
        }
        return res;
    }
    static String extract(String str){
        return str.replaceAll("[^[0-9]]", " ").trim();
    }
}