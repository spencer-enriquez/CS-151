import java.util.AbstractList;
import java.util.Comparator;

public class Pair<T extends Comparable<? super T>>
{
   public Pair() { first = null; second = null; }
   public Pair(T first, T second) { this.first = first;  this.second = second; }

   public T get(int n) { return n == 0 ? first : n == 1 ? second : null; }

   public void set(int n, T t) 
   {
      if (n == 0) first = t;
      else if (n == 1) second = t; 
   }
   
   public void copyFrom (Pair<? extends T> other) {
	   this.first = other.get(0);
	   this.second = other.get(1);
   }
   
   public void copyTo (Pair<? super T> other) {
	   other.first = this.first;
	   other.second = this.second;
   }
   
   public T min(Comparator<? super T> comp)
   {
      if (comp.compare(first, second) < 0) 
         return first; 
      else 
         return second;
   }
   
   public T min() 
   {
      if (first.compareTo(second) < 0)
         return first;
      else
         return second;
   }

   private T first;
   private T second;
}