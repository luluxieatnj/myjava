package com.xll.base64;


import java.io.*;
import java.util.Base64;

public class Img2String {
    public static void main(String[] args) {
        // 将图片转成 String
        String imgPath = "C:/Users/xie/Desktop/003.JPG";    // 本地图片文件路径

        byte[] data = null;

        String imgStr = null;

//        BASE64Encoder encoder = new BASE64Encoder();

        Base64.Encoder encoder = Base64.getEncoder();
//        Base64.Decoder decoder = Base64.getDecoder();

        try{
            InputStream is = new FileInputStream(imgPath);
            data = new byte[is.available()];
            is.read(data);
            imgStr = encoder.encodeToString(data);
            is.close();

            System.out.println(data.length);
            System.out.println(imgStr.length());

        } catch (IOException e) {
            System.out.println("encode error");
        } finally {

        }

/*        try {
            OutputStream os = new FileOutputStream("C:/Users/xie/Desktop/copy.jpg");
            byte[] decode = decoder.decode(imgStr);
            os.write(decode);
            os.close();
        } catch (Exception e) {
            System.out.println("decode error");
        }*/



new Object();
        Runtime runtime = Runtime.getRuntime();

        runtime.gc();

        System.gc();



        try {
            Class<?> clz = Class.forName("");

            clz.getClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
