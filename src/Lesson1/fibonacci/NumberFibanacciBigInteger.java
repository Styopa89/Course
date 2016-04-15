package Lesson1.fibonacci;

import java.lang.Integer;
import java.math.BigInteger;
import java.util.*;

public class NumberFibanacciBigInteger {
        private Map<Integer,CheckPoint> checkPointCollection = new HashMap<>();
        private int checkPoint = 10000;
        private int oftenNumber = 10000;
        private Integer lastIndexCheckPoint;
        private long timer;

        public NumberFibanacciBigInteger() {
            checkPointCollection.put(1,new CheckPoint(BigInteger.valueOf(0), BigInteger.valueOf(0)));
            lastIndexCheckPoint = 2;
            checkPointCollection.put(lastIndexCheckPoint,new CheckPoint(BigInteger.valueOf(0), BigInteger.valueOf(1)));
        }

        public void numberFibonacci(){
            int number = startUI();
            timerStart();
            changeAndPrepareCollection(number);
            BigInteger result = seachNumberFibanacci(number);
            timerStop();
            printResult(result);
            numberFibonacci();

        }

        private void timerStart() {
            timer = System.currentTimeMillis();
        }

        private void timerStop() {
            timer = System.currentTimeMillis() - timer;
        }

        private int startUI(){
            System.out.println("What number Fibonacci would you like to see?");
            System.out.println("Please, write index");
            Scanner s = new Scanner(System.in);
            int index = s.nextInt();
            if (index <= 0) {
                System.out.println("You have entered incorrect index!");
                index = 1;
            }
            return index;
           }


        private BigInteger seachNumberFibanacci(Integer number) {
            if (number < oftenNumber) {
                return checkPointCollection.get(number).getLast();
            }
//            System.out.println(number + "  " + (number-(number%checkPoint)));
            return calcNumberFibonacci(number%checkPoint, checkPointCollection.get(number-(number%checkPoint))).getLast();
        }
        private void changeAndPrepareCollection(int number) {
            while (number >= lastIndexCheckPoint) {
                if (lastIndexCheckPoint < oftenNumber) {
                    CheckPoint lastCheckPoint = calcNumberFibonacci(1, checkPointCollection.get(lastIndexCheckPoint));
                    checkPointCollection.put(++lastIndexCheckPoint, lastCheckPoint);
//                    System.out.println(lastIndexCheckPoint + "   " + checkPointCollection.get(lastIndexCheckPoint).getLast());
                }   else {
                    lastIndexCheckPoint += checkPoint;
                    checkPointCollection.put(lastIndexCheckPoint, calcNumberFibonacci(checkPoint, checkPointCollection.get(lastIndexCheckPoint - checkPoint)));
//                    System.out.println(lastIndexCheckPoint + "   " + checkPointCollection.get(lastIndexCheckPoint).getLast());
                }
            }
        }

        private void printResult(BigInteger result){
            System.out.println(result);
            System.out.println("Time operations : " + timer + " ms");

        }

        private CheckPoint  calcNumberFibonacci(int i, CheckPoint cp) {
            BigInteger lastElement = cp.getLast();
            BigInteger preLastElement = cp.getPreLast();
            BigInteger result;
            for (int j = 0; j < i; j++) {
                result = lastElement.add(preLastElement);
                preLastElement = lastElement;
                lastElement = result;
            }
            return new CheckPoint(preLastElement,lastElement);
        }

    private class CheckPoint {
        private  BigInteger preLast;
        private  BigInteger last;

        public CheckPoint(BigInteger preLast, BigInteger last) {
            this.preLast = preLast;
            this.last = last;
        }

        public BigInteger getPreLast() {
            return preLast;
        }

        public BigInteger getLast() {
            return last;
        }
    }
}


