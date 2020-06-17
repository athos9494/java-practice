package club.banyuan;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //绝对路径
        File file = new File("/Users/edz/Desktop/demo.txt");
        System.out.println("文件是否存在："+file.exists());
        try {
            boolean isCreateSuccess = file.createNewFile();
            System.out.println("文件创建成功？"+isCreateSuccess);

            if(file.exists()){
                System.out.println("文件还是文件夹"+file.isDirectory());
                System.out.println("文件大小"+file.length());
                System.out.println("文件创建时间"+new Date(file.lastModified()).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件删除成功？"+file.delete());

        //相对路径

        File relativeFile = new File("./demo.txt");
        relativeFile.createNewFile();
        System.out.println("文件路径"+relativeFile.getAbsolutePath());
//文件路径/Users/edz/Desktop/Example/./demo.txt
        System.out.println("文件路径"+relativeFile.getCanonicalPath());


        String rootPath = "/Users/edz/filetest/uplodeFIle";
        String fileName = "test";
        File uplodeFile = new File(rootPath,fileName);
        if(!uplodeFile.getParentFile().exists()){
            uplodeFile.getParentFile().mkdirs();
        }
        uplodeFile.createNewFile();

    }
}
