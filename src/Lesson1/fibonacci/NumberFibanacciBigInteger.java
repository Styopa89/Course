package Lesson1.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumberFibanacciBigInteger {
        private List<CheckPoint> checkPointList = new ArrayList<>();
        private int checkPoint = 10000;

        public NumberFibanacciBigInteger() {
           checkPointList.add(new CheckPoint(BigInteger.valueOf(0), BigInteger.valueOf(1)));
        }

        public void numberFibonachiWithTime(int number) {
            long time = System.currentTimeMillis();
            System.out.println(seachNumberFibanacci(number));
            System.out.println("Time operations : " + (System.currentTimeMillis() - time) + " ms");
        }

        private BigInteger seachNumberFibanacci(int number) {
            int cpIndex = number / checkPoint;
            int index = number%checkPoint;
            System.out.println(cpIndex + "  " + checkPointList.size());
            while (cpIndex >= checkPointList.size()){
                checkPointList.add(numberFibonacci(checkPoint, checkPointList.get(checkPointList.size()-1)));
            }
            System.out.println(cpIndex + "  " + checkPointList.size());
            return numberFibonacci(index, checkPointList.get(cpIndex)).getLast();
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


