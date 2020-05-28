package club.banyuan;

public class Decode {
    public static void decode(String string,int flag){
        char[] chars = string.toCharArray();
        for (int i = 0;i <string.length();i++){
            if(string.charAt(i)>=65&&string.charAt(i)<=67){
                chars[i] = (char) (string.charAt(i)+26-flag);
            }
            else if(string.charAt(i)>=97&&string.charAt(i)<=99){
                chars[i] = (char)(string.charAt(i)+26-flag);

            }
            else {
                chars[i] = (char)(string.charAt(i)-3);
            }
        }
        System.out.println(chars);
    }
}
