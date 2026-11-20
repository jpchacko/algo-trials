package repeated.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedString {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> all = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        String sub="";
        for(int i=0;i<=s.length()-10;i++){
            sub = s.substring(i,i+10);

            if(!all.add(sub)){
                repeated.add(sub);
            }
        }

        return new ArrayList(repeated);
    }

    public static void main(String[] args) {
        System.out.println(new RepeatedString().findRepeatedDnaSequences("aacctttgaaccttggttcaaccttggttggaaccttggtt"));
    }
}