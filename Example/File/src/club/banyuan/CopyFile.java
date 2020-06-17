package club.banyuan;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourseFilePath = "";
        String targetFilePath = "";

        File sourseFile= new File(sourseFilePath);
        File targetFile = new File(targetFilePath);

        try (
                FileInputStream fileInputStream = new FileInputStream(sourseFile);
                FileOutputStream fileOutputStream = new FileOutputStream(targetFile)
        ){
            //if fileInputStream = 2000
//            int count = fileInputStream.read(temp);
//            //fileInputStream = 2000- 1024 = 976
//            fileOutputStream.write(temp);
//            fileOutputStream.flush();
//            //
//            count = fileInputStream.read(temp);
//            //count = 976
//            //fileInputStream = 0;
//
//            fileOutputStream.write(temp,0,count);
//            fileOutputStream.flush();


//            byte[] bytes = fileInputStream.readAllBytes();
//            fileOutputStream.write(bytes);

            //开始复制
            // 1%
            // 10%
            // 18%
            // 33%
            // 80%
            // 100%
            // 复制完成
            
            byte[] temp = new byte[1024];
            int count ;

//            do{
//                count = fileInputStream.read(temp);
//                if (count != -1){
//                    fileOutputStream.write(temp,0,count);
//                }
//            } while (count != -1);

            while ((count = fileInputStream.read(temp))!=-1){
                fileOutputStream.write(temp,0,count);
                fileOutputStream.flush();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
