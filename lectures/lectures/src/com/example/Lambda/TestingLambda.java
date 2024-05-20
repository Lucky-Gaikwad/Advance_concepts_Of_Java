public class TestingLambda
    {    public static void main(String[] args) {
            System.out.println("Hello world");
            
            TestingLambda test = new TestingLambda();
            int sum = test.sum(2,5);
            test.printString("This is the best course");
    
            // toPrint -> System.out.println(toPrint);
            // (a, b) -> a + b;
            // (a, b) -> {
            //    int sum = a + b;
            //    System.out.println(sum);
            // }
        }
    
        public void printString (String toPrint) {
            System.out.println(toPrint);
        }
    
        public int sum(int a , int b) {
            int sum = a + b;
            return sum;
        }
    
    }

