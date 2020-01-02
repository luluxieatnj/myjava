package com.xll.test;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONWrappedObject;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonTest {

    private final ObjectMapper mapper = new ObjectMapper();


    @Test
    public void test01() throws IOException {
        Map map = new HashMap();
        map.put("name", "xielulu");
        map.put("age", 18);
        String mapStr = mapper.writeValueAsString(map);
        System.out.println(mapStr);
        System.out.println("---------------------------");


    }

}
