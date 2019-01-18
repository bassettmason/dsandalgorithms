package RepeatedWord;

import java.util.HashSet;

public class RepeatedWord {


    public String firstRepeat(String stringToCheck){
        HashSet dupCheckHash = new HashSet();
        //                                                          \\w only words no punc or numbers
        String[] stringSplit = stringToCheck.toLowerCase().split("\\W+");

        for(String s: stringSplit){
            if(!dupCheckHash.contains(s)){
                dupCheckHash.add(s);
            }else{
                return s;
            }
        }
        return "no repeats";
    }
}
