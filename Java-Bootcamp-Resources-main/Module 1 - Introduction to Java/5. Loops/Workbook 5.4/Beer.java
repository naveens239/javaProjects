public class Beer {
    public static void main(String[] args) {
       sing(99);

    }
    /**
     * Function name -- sing. <------
     * @param i (int)
     *
     *
     * Inside the function:
     *  1. print:
     *    <i> bottles of beer on the wall, <i> bottles of beer!
     *    take one down, pass it around <i-1>, bottles of beer on the wall!
     */
    public static void sing(int start){
        for (int i=start; i>=1; i--){
            System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer!");
            System.out.println(i+"take one down, pass it around "+(i-1)+", bottles of beer on the wall!");
        }
       
    }
}
