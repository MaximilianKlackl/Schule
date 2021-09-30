
public class Main {

    public static void main(String[] args) {

        DatePrinter datePrinter = new DatePrinter();
        Thread datePrinterThread = new Thread(datePrinter);
        datePrinterThread.start();

        CountPrinter countPrinter = new CountPrinter();
        Thread countPrinterThread = new Thread(countPrinter);
        countPrinterThread.start();
    }
}
