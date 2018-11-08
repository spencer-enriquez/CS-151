import java.math.*;
import java.util.Comparator;

public class LabeledDecimal extends BigDecimal
{
   public LabeledDecimal(String label, String digits)
   {
      super(digits);
      this.label = label;
   }

   public String getLabel() { return label; }
   public String toString() { return label + "=" + super.toString(); }

   
   public static void main(String[] args) {
	   LabeledDecimal ld1 = new LabeledDecimal("pi", "3.14");
	   LabeledDecimal ld2 = new LabeledDecimal("sqrt(2)", "1.41");
	   Pair<LabeledDecimal> p1 = new Pair<LabeledDecimal>(ld1, ld2);
	   System.out.println(p1.min());
	}
   
   
   private String label;
}