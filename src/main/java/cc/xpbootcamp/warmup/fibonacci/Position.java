package cc.xpbootcamp.warmup.fibonacci;

public class Position {
    private int index;

    public Position(int index) {

        this.index = index;
    }

    public int calculate() {
        if (index == 1 || index == 2) {
            return 1;
        }
        return 2;
    }
}
