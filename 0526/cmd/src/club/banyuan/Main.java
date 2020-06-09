package club.banyuan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        if("ls".equals(args[0])){
            if(args.length == 1){
                File file = new File("./");
                String[] fileName = file.list();
                System.out.println(Arrays.toString(fileName));
            }
            if(args.length == 2){
                File file = new File(args[1]);
                String[] fileName = file.list();
                System.out.println(Arrays.toString(fileName));
            }
            if(args.length == 3 && "-l".equals(args[2])){
                File file = new File(args[1]);
                File[] fileArray = file.listFiles();
                String[] detailFile = new String[4];
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                for(File one : fileArray){
                    detailFile[0] = (one.isDirectory())?"d":"-";
                    detailFile[1] = (one.isFile())?String.format("%5d",one.length()):String.format("%5d",0);
                    detailFile[2] = dateFormat.format(new Date(one.lastModified())) + "";
                    detailFile[3] = one.getName();
                    for(String str : detailFile){
                        System.out.print(str + "     ");
                    }
                    System.out.println();
                }
            }
        }

        if("cp".equals(args[0])){
            File file1 = new File(args[1]);
            try {
                if(!file1.isFile()){
                    throw new IOException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file2 = new File(args[2],file1.getName());
            file2.createNewFile();
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = new FileInputStream(file1);
                byte[] bytes = inputStream.readAllBytes();
                outputStream = new FileOutputStream(file2);
                outputStream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if("rm".equals(args[0])){
            File file = new File(args[1]);
            delAll(file);
        }

        if("cat".equals(args[0])){
            File file = new File(args[1]);
            try {
                if(!file.isFile()){
                    throw new IOException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (InputStream inputStream = new FileInputStream(file)) {
                byte[] bytes = inputStream.readAllBytes();
                System.out.println(new String(bytes));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void delAll(File file) {
        if(file.isFile()){
            file.delete();
        }
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File one : files) {
                if(one.isFile()){
                    one.delete();
                }else {
                    delAll(one);
                }
            }
            file.delete();
        }
    }
}
