public class PairTest {
    public static void main(String[] args) {
//        String min = null;
//        String max = null;
//        String[] word = {"john","had","a","cat"};
//
//        Pair<String> mm = ArrayAlg.minmax(word);
//        System.out.println(mm.first);
//        System.out.println(mm.second);

        StringBuffer stringBuffer = new StringBuffer("i").append(" love").append(" China");
        stringBuffer.insert(1," really");
        System.out.println(stringBuffer);
    }
}
//class ArrayAlg{
//    public static Pair<String> minmax(String[] a){
//
//        if(a==null||a.length == 0) return null;
//        String min = a[0];
//        String max = a[0];
//        for(int i = 0;i < a.length; i ++){
//            if (min.compareTo(a[i])>0) min = a[i];
//            if (max.compareTo(a[i])<0) max = a[i];
//        }
//
//        return new Pair<>(min,max);
//    }
//}
//class Pair<T>{
//
//    T first;
//    T second;
//    public Pair(T min,T max){
//        this.first = min;
//        this.second = max;
//
//    }
//
//}
