package org.example;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapExample {
    @Test
    public void test() {
        Map<Character,String> bijectionPattern = new HashMap();
        bijectionPattern.put('a',"dog");
        assertEquals( "dog", bijectionPattern.get('a'));
    }
    @Test
    public void mapEntry() {
        Map<String,String> bijectionPattern = new HashMap();
        bijectionPattern.put("a","dog");
        Map.Entry<String, String> next = bijectionPattern.entrySet().iterator().next();
        assertEquals( "dog", next.getValue());
        assertEquals("a", next.getKey());
    }
    @Test
    public void mapGet() {
        Map<String,String> bijectionPattern = new HashMap();
        bijectionPattern.put("a","dog");
        String result = bijectionPattern.get("a");

        assertEquals("dog", result);
    }
}
