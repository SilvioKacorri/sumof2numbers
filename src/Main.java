import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numra = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24));
        HashMap<ArrayList<Integer>, Integer> integerHashMap  = test(numra,20);
        System.out.println(integerHashMap);
        System.out.println(test(numra,10));
    }
    public static HashMap<ArrayList<Integer>,Integer> test(ArrayList<Integer> list, int j){

        HashMap<ArrayList<Integer> , Integer>  integerHashMap = new HashMap<>();

        for (Integer i : list){
            for (Integer k : list){
                if (i + k == j && list.indexOf(i) != list.indexOf(k)){
                    ArrayList<Integer> integerArrayList = new ArrayList<>();
                    integerArrayList.add(i);
                    integerArrayList.add(k);
                    integerHashMap.put(integerArrayList,j);
                }
            }
        }
        return integerHashMap;
    }
}