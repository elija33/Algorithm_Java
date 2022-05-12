public class AlgorithmTwo{
    public static int findMaximumNumber(int a, int b, int c) {
        int maximumnumber = a;
        if(c > maximumnumber){
            return c;
        }
        if(b > maximumnumber){
            return b;
        }
        return maximumnumber;
    }

    public static void main(String[] args) {
        System.out.println(findMaximumNumber(3, 4, 9));
        System.out.println(findMaximumNumber(3, 15, 8));
        System.out.println(findMaximumNumber(5, 10, 8));
        System.out.println(findMaximumNumber(3, 2, 8));
        System.out.println(findMaximumNumber(7, 1, 8));
        System.out.println(findMaximumNumber(11, 14, 5));
    }
    
}