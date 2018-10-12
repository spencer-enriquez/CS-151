/**
   A line item in an invoice.
*/
public interface LineItem
{
	void incrementCounter();
	int getCounter();
   /**
      Gets the price of this line item.
      @return the price
   */
   double getPrice();
   /**
      Gets the description of this line item.
      @return the description
   */   
   String toString();
}
