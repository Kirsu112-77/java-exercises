public class primenumber {
    public static void main(String[] args) {
        int count= 0;
        int number = 1;

        // how to get 1 to 100
        while(number <= 100){
            //  how to count the factors of all numbers?
            int factor=0;

            for (int divider = 1; divider <= number; divider++) {
                if (number % divider == 0) {
                    factor = factor + 1;

                }
            }
            // how determine a prime?? -> if a numbers has only 2 factor then its prime
            if(factor == 2){
                System.out.println(number + " is a prime number.");
                count = count + 1;

            }

            number = number + 1;

        }
        System.out.println(" The total  number of prime numbers between 1 and 100 is: " + count);
    }

}
}
