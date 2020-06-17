package club.banyuan;

public class Demo {
   String add(String digital1,String digital2){
       char[] d1 = digital1.toCharArray();
       char[] d2 = digital2.toCharArray();
       int lengthMax ;
       if(d1.length>d2.length){
           lengthMax = d1.length;
       }
       else{
           lengthMax = d2.length;
       }
       char[] newChar = new char[lengthMax+1];

       char count = '0';
       char temp = 10;
       if(d1.length==d2.length){
           for (int i = lengthMax-1; i >=0 ; i--) {
               if(d1[i]+d2[i]+count>=temp){
                   newChar[i+1] = (char) ((d1[i]+d2[i])%10+count);
                   count  = 1;

               }
               if(d1[i]+d2[i]<10){
                   newChar[i+1] = (char) (d1[i]+d2[i]+count);
               }
           }
       }
       newChar[0] = count;
       for (int i = 0; i <lengthMax+1 ; i++) {
           System.out.println(newChar[i]);
       }
       String s = newChar.toString();
       return s;
   }


    public static void main(String[] args) {
        //System.out.print(2);
        //System.out.println(3);
//        Demo demo = new Demo();
//        demo.start();
//        //ThreadA threadA = new ThreadA();
//        //threadA.start();
//        System.out.println("main is end");
        new Demo().add("123456789","987654321");

    }
}
 