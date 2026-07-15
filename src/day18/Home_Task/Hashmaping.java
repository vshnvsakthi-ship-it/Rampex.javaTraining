package day18.Home_Task;

import java.util.*;

public class Hashmaping {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Senthilkumar",90);
        hm.put("Vaishnavi",98);
        hm.put("Sakthi",85);
        hm.put("Rathiga",90);

        int min=1000;
        String name="";
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            if(e.getValue()<min){
                min=e.getValue();
                name=e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);
    }
}