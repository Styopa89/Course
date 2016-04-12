package Lesson1.fibonacci;

import java.math.BigInteger;
import java.util.*;

public class NumberFibanacciBigInteger {
        private List<CheckPoint> checkPointList = new ArrayList<>();
        private int checkPoint = 10000;

        Map a = new TreeMap<>();


        public NumberFibanacciBigInteger() {
           checkPointList.add(new CheckPoint(BigInteger.valueOf(0), BigInteger.valueOf(1)));
        }

        public long time() {
            return System.currentTimeMillis();
        }

        public void seachNumberFibanacci() {
            int number = 1;
            long starTimer =  time();
            int cpIndex = number / checkPoint;
            int index = number%checkPoint;
            while (cpIndex >= checkPointList.size()){
                checkPointList.add(numberFibonacci(checkPoint, checkPointList.get(checkPointList.size() - 1)));
            }
            long endTimer = time() - starTimer;
            printResult(numberFibonacci(index, checkPointList.get(cpIndex)).getLast(), endTimer);

        }

        private void printResult(BigInteger last, Long timer){
            System.out.println(last + "  " + timer);

        }

        private CheckPoint  numberFibonacci(int i, CheckPoint cp) {
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


