package io;

import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("/Users/wenxinzhuo/");
        f1.list();
        System.out.println("f1绝对路径" + f1.getAbsolutePath());
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.length());
        long time = f1.lastModified();
        Date date = new Date(time);
        System.out.println(date);
    }
}
