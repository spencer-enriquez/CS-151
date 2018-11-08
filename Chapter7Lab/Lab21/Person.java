import java.io.Serializable;
import java.util.*;

public class Person implements Serializable
{  
   public Person(String name) { this.name = name; }
   
   public Person(String name, String imageURL) throws java.io.IOException
   {
      this(name);
      image = javax.imageio.ImageIO.read(new java.net.URL(imageURL));
   }
   
   public void befriend(Person p) { friends.add(p); }
   public Person getFriend(int i)
   {
      return 0 <= i && i < friends.size() ? friends.get(i) : null;
   }

   public String toString()
   {
      String result = name + ", friends =";
      for (Person f : friends) result += " " + f.name;      
      return result;
   }
   
   public Person clone() throws CloneNotSupportedException
   {
      Person cloned = (Person) super.clone();
      cloned.friends = new ArrayList<>();
      for (Person f : friends) cloned.friends.add(f.clone());
      return cloned;
   }
   
   public void show()
   {
      if (image == null) javax.swing.JOptionPane.showMessageDialog(null, name);
      else javax.swing.JOptionPane.showMessageDialog(null, name, "", 1,
         new javax.swing.ImageIcon(image));         
   }


   private String name;
   private ArrayList<Person> friends = new ArrayList<>();
   private transient java.awt.image.BufferedImage image;
}