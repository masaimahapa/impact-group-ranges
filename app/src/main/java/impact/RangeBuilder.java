package impact;
import java.util.*;
public class RangeBuilder{

    static ArrayList<String> createRanges(int[] numbers){

        ArrayList<String> rangeList = new ArrayList<String>();
        int rangeStart = numbers[0];
        int currentNum=0;

        for(int i=1; i<numbers.length; i++){

            currentNum = numbers[i];
            int previousNum = numbers[i-1];

            if(currentNum-1 != previousNum){
                rangeList.add(new Range(rangeStart, previousNum).toString());
                rangeStart= currentNum;
            }
        }

        rangeList.add(new Range(rangeStart, currentNum).toString());

        return rangeList;
    }
}