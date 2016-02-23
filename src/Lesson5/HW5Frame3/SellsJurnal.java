package Lesson5.HW5Frame3;


public class SellsJurnal {
    Transaction[][] trJurnal = new Transaction[31][30];
    private int day;
    private int purchaseNumber;

    public SellsJurnal() {
        day = 0;
        purchaseNumber = 0;
    }

    public void newTransaction(Transaction tr){
         trJurnal[day][purchaseNumber] = tr;
        purchaseNumber++;
    }

    public void newDay(){
        day++;
        purchaseNumber = 0;
    }
     public void sellThisDay(){
         System.out.println(day);
         for(int i=0; trJurnal[day][i] != null; i++ ){
             System.out.println("Name Client: " + trJurnal[day][i].getClient().getName() + ", buy car brand: " +
                 trJurnal[day][i].getCar().getBrand() + ", price: " + trJurnal[day][i].getCar().getPrice() +
                 ", amount: " + trJurnal[day][i].getNumber());
         }
     }

     public void allSellCarsWeek() {
         for (int i = 1; i < 8; i++) {
             System.out.println((i) + " day sell: " + this.sellCarsInDay(trJurnal[i]) + " cars; ");

         }
     }
    private int sellCarsInDay(Transaction[] tr){
        int size = 0;
        for (int i = 0; tr[i] != null; i++){
            size +=  tr[i].getNumber();
        }
        return size;
    }

}
