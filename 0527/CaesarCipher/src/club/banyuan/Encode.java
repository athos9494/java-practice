package club.banyuan;

public class Encode {

    public static char[] enCode(String string, int flag){
        char[] ch = string.toCharArray();
        for (int i = 0;i< string.length();i++){
            if (string.charAt(i)>=88&&string.charAt(i)<=90){
                ch[i]= (char) (string.charAt(i)- 26 + flag);
            }
            else if(string.charAt(i)>=120&&string.charAt(i)<=122){
                ch[i]= (char) (string.charAt(i)-26+flag);
            }
            else {
                ch[i] = (char) (string.charAt(i)+flag);
            }
        }
        System.out.println(ch);
        return ch;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("plz enter origin code:");
//        String string = scanner.nextLine();
//        enCode(string,3);
//    }
}
