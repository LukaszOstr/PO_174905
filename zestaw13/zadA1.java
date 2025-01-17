package zestaw13;

import java.util.*;

public class zadA1 {

    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);

        for(T item: uniqueElements){
            System.out.println(item);
        }

    }

    //zadA2

    public static <T> int countOccurrances(Collection<T> items, T element){
        int count=0;

        for(T item : items){
            if(item.equals(element)){
                count++;
            }
        }
        return count;

    }

    //ZadC1

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        return result;


    }

    //ZadD1

    public static <T> List<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2){

        List<T> result = new LinkedList<T>();

        for(T item : list1){
            if(list2.contains(item) && !result.contains(item)){
                result.add(item);
            }
        }

        return result;
    }

    //ZadE2

    public static <T> boolean hasCommonElements(HashSet<T> set1, HashSet<T> set2){

        for(T item : set1){
            if(set2.contains(item)){
                return true;
            }
        }

        return false;
    }


    //ZadK1

    public static <K,V> HashMap<V,Integer> countValueOccurrances(HashMap<K,V> map){
        HashMap<V,Integer> result = new HashMap<>();

        for(V value : map.values()){
            if(!result.containsKey(value)){
                result.put(value,1);
            }
            else{

                result.replace(value,result.get(value),result.get(value)+1);
            }


        }


        return result;
    }

    //ZadL3

    public static <K> double calculateAvarageValue(TreeMap<K, Double> map){

        double avarage = (double) 1 / map.size();

        for(double item : map.values()){
            avarage *= item;
        }

        return avarage;

    }

    //ZadF1

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> treeSet, T lowerBound, T upperBound){


        return (TreeSet<T>) treeSet.subSet(lowerBound,true,upperBound,true);


    }

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(3);
        set.add(7);
        set.add(2);
        set.add(4);
        set.add(5);

        TreeSet<Integer> set2 = findElementsInRange(set,3,5);

        System.out.println(set2);



    }


}
