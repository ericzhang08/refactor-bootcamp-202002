package cc.xpbootcamp.warmup.fibonacci;

public class Position {
    private long index;

    public Position(long index) {

        this.index = index;
    }

    public long calculate() throws Exception {
        //这个检测的部分应该放在构造函数中还是放在这里
        if (index < 1 || index > 50) {
            throw new Exception("position out of range");
        }
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
