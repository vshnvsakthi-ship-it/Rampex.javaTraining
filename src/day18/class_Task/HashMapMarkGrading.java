package day18.class_Task;

import java.util.HashMap;

class HashMapMarksGrading {
    public static void main(String[] args){
        HashMap<String,Integer> markList=new HashMap<String,Integer>();
        markList.put("sp",20);
        markList.put("Vaishnavi",19);
        markList.put("RSVS",30);
        markList.put("RSVS",35);
        System.out.println(markList.entrySet());
    }
}