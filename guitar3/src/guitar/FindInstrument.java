package guitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		Map properties=new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec clientSpec=new InstrumentSpec(properties);
		List matchingInstruments=inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty()) {
			System.out.println("你可能喜歡以下樂器");
			for(Iterator i=matchingInstruments.iterator();i.hasNext();) {
				Instrument instrument=(Instrument)i.next();
				InstrumentSpec spec=instrument.getSpec();
				System.out.println("我們有一個"+spec.getProperty("instrumentType")+"你想要的特點：");
				for(Iterator j=spec.getProperties().keySet().iterator();j.hasNext();) {
					String propertyName=(String)j.next();
					if(propertyName.equals("instrumentType"))
						continue;
					System.out.println(propertyName+":"+spec.getProperty(propertyName));
				}
				System.out.println("你可以擁有這個"+spec.getProperty("instrumentType")+" for $"+instrument.getPrice()+"\n----------------");
			}
		}else {
			System.out.println("抱歉，沒有可以提供的樂器");
		}
	}
	private static void initializeInventory(Inventory inventory) {
		Map properties=new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder",Builder.GIBSON);
		properties.put("model","CJ");
		properties.put("type",Type.ACOUSTIC);
		properties.put("numStrings",6);
		properties.put("topWood",Wood.INDIAN_ROSEWOOD);
		properties.put("backWood",Wood.MAPLE);
		inventory.addInstrument("11277", 666, new InstrumentSpec(properties));
	}
}
