public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava x =new BasicJava();
        // add();
        x.print();
        
        for(int i=1;i<=255;i+=2){
            Integer for2 = x.odd(i);
            System.out.println(for2);
        }

        int sum = 0;
        for (int i=0;i<=255;i++){
            sum += i;
            Integer for3 = x.add(sum);
            System.out.println("New number:"+i+" "+"sum:"+for3);
        }

        int[] s = {1,3,5,7,9,13};
        for (int i = 0; i <s.length; i++){
            Integer for4 = x.Iterating(s[i]);
            System.out.println(for4);
        }

        int[] f={-3, -5, -7};
        int maximum = f[0];
        for (int i = 0; i < f.length; i++){
            if (f[i] > maximum) {
                maximum = f[i];
            }
        }
        System.out.println(maximum);

        int[] d={2, 10, 3};
        int summ=0;
        for(int i=0;i<d.length;i++){
            summ+=d[i];
        }
        int avg=summ/d.length;
        Integer for6 = x.Average(avg);
        System.out.println(for6);

        x.oddarray();

        x.Greater();

        x.Square();

        x.Eliminate();

        x.MaxMinAvg();
        
        x.Shifting();

    }
}