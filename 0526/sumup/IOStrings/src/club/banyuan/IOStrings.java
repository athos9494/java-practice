package club.banyuan;

import java.io.*;

//1.编写一个包含两个公共静态方法的IOStrings类：
//  String [] loadArray(InputStream is,int[] n) 循环n，依次读取每个n下标的数值，根据这个数值读取is中数据，将得到的结果生成字符串，将所有的字符串组成的数组返回。 如果在n循环结束前is读取结束，则抛出RuntimeException标识读取失败
//  void saveArray（OutputStream os，String [] sa）将字符串数组sa循环写入os。
//2.编写一个公共静态方法，接收一个文件路径和整数n，文件中写入大小为n的乘法表。例如，对于n=3，该方法应 写入： 1 2 3 2 4 6 3 6 9

public class IOStrings {
    public static String [] loadArray(InputStream is,int[] n) throws IOException {
        String[] strings = new String[n.length];
        for (int i = 0; i < n.length ; i++) {
            byte[] b = new byte[n[i]];
            if(is.read(b) != -1) {
                strings[i] = new String(b);
            }else {
                if(i != n.length-1){
                    throw new RuntimeException("读取失败");
                }
            }
        }
        return strings;
    }

    public static void saveArray(OutputStream os,String [] sa){
        try(os) {
            for (String temp: sa) {
                os.write(temp.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void get(String path,int n) {
        File file = new File(path);
        if(file.exists() && file.isFile()){
            try(OutputStream outputStream = new FileOutputStream(file)) {

                for (int i = 0;i < n;i++){
                    for(int j = 0;j < n;j++){
                        String string = Integer.toString((i+1)*(j+1))+"  ";
                        outputStream.write(string.getBytes());
                        if(j == n-1){
                            outputStream.write("\n".getBytes());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            throw new IllegalArgumentException("path不正确");
        }
    }

    public static void main(String[] args) {
        get("./1.txt",3);
    }


}
