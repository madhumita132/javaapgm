package java8test;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Optional class::
 * Optional is a container object used to contain not-null objects. 
 * Optional object is used to represent null with absent value. 
 * Java introduced a new class Optional in jdk8. It is a public final class and used to deal with 
 * NullPointerException
 * 
 *  In Java application. You must import java.util package to use this class. 
 * It provides methods which are used to check the presence of value for particular variable.
 * 
 * The purpose of Optional is not to replace every single null reference in your code base but rather to 
 * help you design better APIs in which, just by reading the signature of a method, 
 * users can tell whether to expect an optional value and deal with it appropriately.
 
 Advantages of Java 8 Optional:

Null checks are not required.
No more NullPointerException at run-time.
 */

class Item_Datas
{
	int id;
	String itemname;
	float price;
	public Item_Datas(int id, String itemname, float price) 
	{
		super();
		this.id = id;
		this.itemname = itemname;
		this.price = price;
	}
}

public class test5 
{
	//NON OPTIONAL METHOD
	public static Item_Datas findItems(List<Item_Datas> itemsList,String name)
{
    for(Item_Datas e:itemsList)
    {
        if(e.itemname.equalsIgnoreCase(name))
        {
        	System.out.println("Item Found!");
            return e;//returning item object
        }
    }
    return null;//NULL POINTER EXCEPTION
}

	//OPTIONAL METHOD
	public static Optional<Item_Datas> findItems1(List<Item_Datas> itemsList,String name)
    {
        for(Item_Datas e:itemsList)
        {
            if(e.itemname.equalsIgnoreCase(name))
            {
            	System.out.println("Item Found!");
                return Optional.of(e);//Returns an Optional with the specified present non-null value.
            } 
        }
        return Optional.empty();//Returns an empty Optional instance. No value is present for this Optional.
    }

	
	
	public static void main(String[] args)
	{
		List<Item_Datas> itemsobj = new ArrayList<Item_Datas>();  
		itemsobj.add(new Item_Datas(11,"Laptop",95000f));  
		itemsobj.add(new Item_Datas(22,"Bluetooth",8000f));  
		itemsobj.add(new Item_Datas(33,"Inverter",28000f));  
		itemsobj.add(new Item_Datas(44,"Harddisk",8000f));  
		itemsobj.add(new Item_Datas(55,"Speaker",9000f));

		Item_Datas em = findItems(itemsobj,"Laptop");
        System.out.println("Items name: "+em.itemname + " "+em.price);

		Optional<Item_Datas> itemopt = findItems1(itemsobj,"Laptop");
        if(itemopt.isPresent())//Return true if there is a value present, otherwise false.
        {
        	Item_Datas e = itemopt.get();//If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
            System.out.println("Item  Exists::"+e.id + " "+e.itemname + " "+e.price);
        }
        else
        {
            System.out.println("There is no item with name Laptop123!!!!!!");
        }

        /*
         * You can return default value in case there is no value in Optional using orElse method.
         */
        Optional<Item_Datas> Opt1 = findItems1(itemsobj,"Laptop4");
        Item_Datas e1 = Opt1.orElse(new Item_Datas(0,"Dummy(No value present)",0.0f));
        System.out.println("Item name Present or Not>>??: "+e1.itemname);
 
        Optional<Item_Datas> Opt2 = findItems1(itemsobj,"Laptop");
        Item_Datas e2 = Opt2.orElse(new Item_Datas(0,"Dummy(No value present)",0.0f));
        System.out.println("Item name Present or Not>>??: "+e2.itemname);
 
        /*
         * You can use orElseThrow to throw exception in case Optional is empty. 
         * It is similar to get() method but in this case, 
         * you can choose to throw any Exception rathar than NoSuchMethodException.
         */
        Optional<Item_Datas> Opt5 = findItems1(itemsobj,"Laptop");
        Item_Datas em1 = Opt5.orElseThrow(() -> new RuntimeException("Item not found"));
        System.out.println("Item name: "+em1.itemname);
        
        Optional<Item_Datas> itemopt1 = findItems1(itemsobj,"Laptop11");
        itemopt.ifPresent((e)->System.out.println("Item name: "+e.itemname+" found in list"));
        itemopt1.ifPresent((e)->System.out.println("Item name>>: "+e.itemname+" found in list"));//not executed

        
        Optional<Item_Datas> op2= Optional.ofNullable(null);
        System.out.println("Item name: " + op2);
      
        Optional<String> optional1 = Optional.of("LAptop123");
        Optional<Optional<String>> optional2 = Optional.of(optional1);
        
        System.out.println("Item name : " + optional2);
        
        Optional<String> output = optional2.flatMap(value -> value.map(String::toUpperCase));
        
        System.out.println("output value : " + output);
        
        Optional<String> nullOptional = Optional.ofNullable(null);
        Optional<String> output1 = nullOptional.flatMap(value -> Optional.of("No Value"));
        System.out.println("output : " + output1);
    
        Optional<String> output3 = optional1.flatMap(value -> {
            if (value.contains("LAptop123")) {
                return Optional.of("Yes, It is found.");
            }
            return Optional.empty();
        });
        System.out.println("output : " + output3);
        

        Optional<Optional<Optional<String>>> op4= Optional.ofNullable(optional2);
        System.out.println(op4.getClass());
        
    }
        
	}



