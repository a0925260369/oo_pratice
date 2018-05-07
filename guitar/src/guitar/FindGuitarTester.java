package guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new Inventory();
		initalizeInventory(inventory);
		//Guitar whatErinLikes=new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.CEDAR,Wood.MAPLE);
		GuitarSpec whatErinLikes= new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,6,Wood.CEDAR,Wood.MAPLE);
		List matchungGuitars=inventory.search(whatErinLikes);
		if(!matchungGuitars.isEmpty()) {
			System.out.println("你可能喜歡以下這些吉他");
			for(Iterator i=matchungGuitars.iterator();i.hasNext();) {
				Guitar guitar=(Guitar)i.next();
				GuitarSpec spec=guitar.getSpec();
				System.out.println("我們有"+spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+"吉他：\n  "+spec.getNumStrings()+"弦"+spec.getBackWood()+"背後和旁邊\n"+spec.getTopWood()+"頂部\n 你可以擁有這個只要"+guitar.getPrice());	
			}
		}
		else {
			System.out.println("不好意思我們沒有辦法提供給您吉他");
		}
	}
	private static void initalizeInventory(Inventory inventory) {
		inventory.addGuitars("1", 100, Builder.FENDER, "Stratocastor", Type.ELECTRIC,6,Wood.CEDAR, Wood.MAPLE);
	}
}
