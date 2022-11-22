package BasicJava.Evalution2;

public class PrbSix {
    public static void main(String[] args) {
        String str = "abacd";
        int i = 3;
        System.out.println(subStr(str,i));

    }

    static String subStr(String s , int i){
        return (s.substring(0 , i+1));
    }
}
