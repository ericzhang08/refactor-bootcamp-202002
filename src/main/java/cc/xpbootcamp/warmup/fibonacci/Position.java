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
        int f1 = 1;
        int f2 = 1;
        for(int i = 3; i <=index; i++ ){
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }
}
