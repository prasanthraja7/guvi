public class UniqueKey{
Public static void main(String args[])
{
Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
Set<Integer> uniqueKeys = new TreeSet<Integer>();
uniqueKeys.addAll(Arrays.asList(numbers));
System.out.println("uniqueKeys: " + uniqueKeys);
}}
 
