/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice() * item.getCounter();								//changed price change to total price * quantity
      String quantity = " (" + item.getCounter() + ")";
      return String.format("%s %s: $%.2f\n",item.toString(), quantity, item.getPrice());
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}
