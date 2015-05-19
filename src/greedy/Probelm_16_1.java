package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shen on 15/5/19.
 */
public class Probelm_16_1 {

//    use the min number of coin to change n cents
//    type of coins: 25,10,5,1
    public void ques_a(int changeCent){
        int[] values = {25,10,5,1};
        int[] count = new int[4];
        for (int i=0;i<4;++i){
            while (changeCent >= values[i]){
                ++count[i];
                changeCent -= values[i];
            }
        }

        System.out.println("the best arrange: numbers of 25, 10, 5, 1 are");
        for (int i : count){
            System.out.print(i + ", ");
        }
    }



    public void ques_d(int cent, ArrayList<Integer> values){
        int[] count = new int[values.size()];

//        System.out.println("min count is " + minCount(cent, values));
        System.out.println("min count is " + minCount_dynamic(cent, values));

    }


//    using dynamic programming
    public int minCount_dynamic(int cent, List<Integer> values){
        int[] counts = new int[cent+1];
        counts[0] = 0;
        for (int i=1;i<=cent;++i){
            int min = cent+1;
            for(int j=0;j<values.size() && values.get(j)<=i ;++j){
                min = minor(i/values.get(j)+counts[i%values.get(j)] , min);
            }
            counts[i] = min;
        }

        return counts[cent];
    }

    private int minor(int a,int b){
        return a>b?b:a;
    }

//    using recursive
    public int minCount(int cent, List<Integer> values){
        if (cent == 0)
            return 0;

        int min=0;

        int size = values.size();

        if (size==1)
            return cent;
        else
            min = cent/values.get(0)+minCount(cent%values.get(0) , values.subList(1, size) );

        for (int i=1;i<size;i++){
            int tmp = cent/values.get(i)+minCount(cent%values.get(i) , values.subList(i+1, size) );
            if(min > tmp)
                min = tmp;
        }

        return min;
    }
}
