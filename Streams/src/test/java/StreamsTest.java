import org.testng.annotations.Test;


import java.util.*;

public class StreamsTest {

    @Test
    public void ArrayToArrayListAndSort() {
        Integer[] values = {8, 3, 4, 5, 7, 2, 6, 1};
        List<Integer> list = Arrays.asList(values);

        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();
        list.stream().filter(s -> s % 2 == 0).sorted().forEach(evenArray::add);
        list.stream().filter(s -> s % 2 != 0).sorted().forEach(oddArray::add);
        System.out.println("Even Numbers: " + evenArray);
        System.out.println("Odd Numbers: " + oddArray);
    }

    @Test
    public void interviewQuestion() {
        Integer[] array = {0, 1, 2, 3};
        List<Integer> input = Arrays.asList(array);
        ArrayList<String> output = new ArrayList<>();
        for (int value : input) {
            if (value == 0) {
                output.add("bang");
            } else if (value % 2 == 0) {
                output.add("fizz");
            } else {
                output.add("buzz");
            }
        }
        System.out.println("    input:  " + input + "   " + "output:  " + output);
    }


/* Map<Integer, String> map = new HashMap<>();


        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == 0) {
                map.put(input.get(i), "bang");
            } else if (input.get(i) % 2 == 0) {
                map.put(input.get(i), "fizz");
            } else {
                map.put(input.get(i), "buzz");
            }
        }
        System.out.println(map);*/


    @Test
    public void distinctSort() {

        Integer[] array1 = {3, 2, 7, 2, 7, 4, 8};
        Integer[] array2;
        //Arrays.sort(array1);
       List<Integer> l = Arrays.asList(array1);

        Collections.sort(l);

        System.out.println(l);



        array2 = array1;
//To filter only unique numbers
        for (int i = 0; i < array1.length; i++) {
            int j;
            for (j = 0; j < array2.length; j++)
                if (array1[i] == array2[j]) {
                    break;
                }
            if (i == j) {

                System.out.println(array1[i]);

            }
        }


    }


}
