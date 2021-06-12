public class StringManipulator{
    public String trimAndConcat(String x ,String y){
        String str1= x.trim();
        String str2 = y.trim();
        String str3 = str1.concat(str2);
        return str3;

    }

    public Integer getIndexOrNull(String a, char b){
        int x= a.indexOf(b);
        if(x==-1){
            return null;
        }
        else {
            return x;
        }
    }

    public Integer getIndexOrNull(String k, String g){
        int z= k.indexOf(g);
        if (z==-1){
            return null;
        }
        else return z;
    }

    public String concatSubstring(String c, int a, int b, String d){
        String str4 = c.substring(a,b);
        String str5 = str4.concat(d);
        return str5;
    }
}


