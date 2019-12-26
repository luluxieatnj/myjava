package com.xll.uri;

import java.net.URI;
import java.net.URISyntaxException;


/**
     利用jdk自带的URI类  解析  uri
  */
public class UriTest {
    public static void main(String[] args) throws URISyntaxException {
        String devUrl = "http://172.18.50.1:8080/nchf-convergedcharging/v1/chargingdata";
        URI uri = new URI(devUrl);

        String HOST = uri.getHost();
        int PORT = uri.getPort();
        String PATH = uri.getPath();

        System.out.println(HOST); // 172.18.50.1
        System.out.println(PORT); // 8080
        System.out.println(PATH); // /nchf-convergedcharging/v1/chargingdata
    }
}
