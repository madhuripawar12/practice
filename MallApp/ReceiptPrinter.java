package MallApp;

public class ReceiptPrinter {
    public static void printReceipt(Item[] items) {
        double grandTotal = 0;
        System.out.println("\t\tReceipt\t\t\n");
        System.out.println("Name\tPrice\tQuantity\tTax\t\tTotal\n");
        for (Item item : items) {
            double localTotal = item.getPrice() * item.getQuantity() + item.getTax();
            System.out.println(item.getName() + "\t" + item.getPrice() + "\t\t" + item.getQuantity() + "\t"+"\t" + item.getTax() + "\t" + localTotal);
            grandTotal = grandTotal + localTotal;

    }
        System.out.println("\n Grand Total : " + grandTotal);
    }
}
