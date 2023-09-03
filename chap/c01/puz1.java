class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        //while(x < 3){
        while (x < 4) { //corrected
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            /* 
            if (x < 1) {
                System.out.print("oise");
                //I don't fill this line
            }
            */
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            /*
            if (x > 1) {
                System.out.print(" oyster");
            }
            */
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x = x + 1;
        }
    }
}