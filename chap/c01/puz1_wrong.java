/**
 * This code can run and produce the required output.
 * Though, I have 1 line not to fill.
 */
class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while(x < 3){
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x < 1) {
                System.out.print("oise");
                //I don't fill this line.
            }
            if (x == 1){
                System.out.print("noys");
            }
            if (x > 1) {
                System.out.print(" oyster");
            }
            System.out.println();
            x = x + 1;
        }
    }
}