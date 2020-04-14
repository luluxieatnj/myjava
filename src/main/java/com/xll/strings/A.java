package com.xll.strings;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class A {
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        BASE64Encoder base64encoder = new BASE64Encoder();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes("UTF-8"));
        gzip.close();
        return base64encoder.encode(out.toByteArray());
    }

    /**
     * @return uncompressed string
     * @throws IOException
     */
    public static String uncompress(String srcStr) throws IOException {

        if (srcStr == null || srcStr.length() == 0) {
            return srcStr;
        }

        BASE64Decoder base64decoder = new BASE64Decoder();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] bytes = base64decoder.decodeBuffer(srcStr);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        GZIPInputStream gunzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        return out.toString("UTF-8");
    }
}