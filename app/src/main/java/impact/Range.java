package impact;

public class Range {

    private int start;
    private int end;

    public Range(int start, int end){
        this.start = start;
        this.end = end;
    }

    public Range(int singleNumber){
        this.start = singleNumber;
        this.end = singleNumber;
    }

    @Override
    public String toString(){
        if(start==end) {return String.format("%d",start);}
        return String.format("%d-%d",start, end);
    }
}