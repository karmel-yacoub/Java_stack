import java.util.*;

public class HashMapFunTest{
    public static void main(String []args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("hi","A band from Teignmouth");
        trackList.put("in","method returns a set of all the keys in our map");
        trackList.put("if","They insist that you be able to immediately");
        trackList.put("at","They also want to be able to see all the tracks");

        System.out.println(trackList.get("in"));

        for(String song : trackList.keySet()){
            System.out.println("song title:"+song+" "+"Lyrics:"+trackList.get(song));
        }
    }
}