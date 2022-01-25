package java8test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;


class ItemsData1 
{
	int itemid;
	String itemname;
	float rate;
	public ItemsData1(int itemid, String itemname, float rate) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.rate = rate;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString()
	{
		return itemid + " "+itemname+ " "+rate;
	}
	public Object compareTo(ItemsData1 s1) {
		// TODO Auto-generated method stub
		return null;
	}

}
public class test2 
{
	public static void main(String[] args) 
	{
		List<ItemsData1> itemsobj = new ArrayList<ItemsData1>();  
	    
		itemsobj.add(new ItemsData1(11,"Laptop",95000f));  
		itemsobj.add(new ItemsData1(22,"Bluetooth",8000f));  
		itemsobj.add(new ItemsData1(33,"Inverter",28000f));  
		itemsobj.add(new ItemsData1(44,"Harddisk",8000f));  
		itemsobj.add(new ItemsData1(55,"Laptop",90000f));

		for(ItemsData1 o: itemsobj)
		{
			System.out.println(o);
		}
		

			//Map-Unordered collection
			//Converting into a Map  
			Map<Integer,String> Map11 =   
			    				itemsobj.stream()  
			    				.collect(Collectors.toMap(p->p.itemid, p->p.itemname));  //key,value
			      
			System.out.println(Map11);  

			 
	}
}