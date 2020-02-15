package cc.xpbootcamp.warmup.fibonacci;

public class Position {
    private long index;

    public Position(long index) {

        this.index = index;
    }

    public long calculate() {
        long parePrevious = 1;
        long previous = 1;
        for(int i = 3; i <=index; i++ ){
            long temp = parePrevious + previous;
            parePrevious = previous;
            previous = temp;
        }
        return previous;
    }
}
