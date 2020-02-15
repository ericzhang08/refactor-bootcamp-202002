package cc.xpbootcamp.warmup.fibonacci;

public class Position {
    private int index;

    public Position(int index) {

        this.index = index;
    }

    public int calculate() {
        int parePrevious = 1;
        int previous = 1;
        for(int i = 3; i <=index; i++ ){
            int temp = parePrevious + previous;
            parePrevious = previous;
            previous = temp;
        }
        return previous;
    }
}
