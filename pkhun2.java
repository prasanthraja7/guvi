package com.java2novice.algos;
 
import java.util.ArrayList;
import java.util.List;
 
public class dublicateno {
 
    public int finddublicateno(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
                numbers.add(22);
        duplicateno dn = new dublicateno();
        System.out.println("Duplicate Number: "+dn.findduplicateno(numbers));
    }
}
