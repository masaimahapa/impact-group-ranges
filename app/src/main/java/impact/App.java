package impact;

public class App {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,7,8,9,12,13,15,16, 18};
        System.out.println(RangeBuilder.createRanges(numbers));
    }
}
