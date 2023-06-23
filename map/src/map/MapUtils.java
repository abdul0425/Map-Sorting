package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapUtils {

//	Map creation
	static Map<Integer, String> createMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ram Pothineni");
		map.put(2, "Ram Charan");
		map.put(3, "Allu Arjun");
		map.put(4, "Prabhas");
		map.put(5, "Jr NTR");
		map.put(6, "Ravi Teja");
		map.put(7, "Mahesh Babu");
		map.put(8, "Pawan Kalyan");
		map.put(9, "Sai Dharam Tej");
		map.put(10, "Jayam Ravi");
		map.put(11, "Arun Vijay");
		map.put(12, "Kalyan Ram");

		return map;
	}

//	Map sorting by it's value
	static void sortMapByValue(Map<Integer, String> map) {
		List<Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());
		Comparator<Entry<Integer, String>> comp = new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		};

		Collections.sort(entryList, comp);
//		to print map
		for (Entry<Integer, String> entry : entryList) {
			System.out.println(entry.getKey() + "  :  " + entry.getValue());
		}
	}
}
