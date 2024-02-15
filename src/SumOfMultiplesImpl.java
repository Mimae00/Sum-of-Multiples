package src;

public class SumOfMultiplesImpl {
    public static void sumMul(int n1, int n2) {

        if(n2 <= 0 || n1 <=0){
            throw new IllegalArgumentException("Value cannot be 0 or less than 0");
        }

        int r = 0;
        for(int i = 1; i*n1<n2; i++){
          r+=i*n1;
        }
        System.out.println(r);
    }
}


//Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
//Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
//Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
//Kata.sumMul(4, -7)  // throws IllegalArgumentException


// MY SOLUTION
//    public static long sumMul(int n, int m) {
//
//        if(m <= 0 || n <=0){
//            throw new IllegalArgumentException("Value cannot be 0 or less than 0");
//        }
//
//        List<Integer> doubleValueList = new ArrayList<>();
//        for (int i = 0; i <= m; i++) {
//            int doubleValue = (n * i);
//            doubleValueList.add(doubleValue);
//        }
//
//        for (int i = 0; i < doubleValueList.size(); i++) {
//            if (doubleValueList.get(i) > m) {
//                doubleValueList.remove(i);
//                i--;
//
//            }
//        }
//
//        System.out.println(doubleValueList);
//
//        int sum  = doubleValueList.stream()
//                .collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(sum);
//        return 0;
//    }