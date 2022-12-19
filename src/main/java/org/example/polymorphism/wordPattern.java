package org.example.polymorphism;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class wordPattern {
    public boolean wordPattern(String pattern, String s) {
    
        Map<Character,String> mapping = new HashMap();
        String [] words = s.split(" ");
        
        if (pattern.length() != words.length){
            
            return false;
        }

        Set<String> values = new HashSet<>();

            
        for (int i=0; i<pattern.length(); i++) {
            
            if (mapping.get(pattern.charAt(i)) == null) {
                
                if (!values.add(words[i])) {
                    
                    return false;
                } 
                
                mapping.put(pattern.charAt(i),words[i]);
                
            }
                  
            else if (! mapping.get(pattern.charAt(i)).equals(words[i])) {
                
                return false;
                
            }
            
            }
        
        return true;

    }
}