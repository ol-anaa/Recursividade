public class GeaterOrEqual {

    public static boolean isGeterOrEqual(int x, int y){
        if(Negativo.isNegativo(x) || Negativo.isNegativo(y))
            return x == 0 ? true :  y == 0 ? false : isGeterOrEqual(x+1, y+1);

        if (x == y)
            return true;

        return x == 0 ? false :  y == 0 ? true : isGeterOrEqual(x-1,y-1);
    }

    public static void main(String[] args) {
        System.out.println(isGeterOrEqual(1,2));
        System.out.println(isGeterOrEqual(2,1));
        System.out.println(isGeterOrEqual(1,1));
        System.out.println(isGeterOrEqual(-2,-2));
        System.out.println(isGeterOrEqual(-1,2));
        System.out.println(isGeterOrEqual(1,-2));
    }
}
