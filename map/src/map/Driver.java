package map;

import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = MapUtils.createMap();
		MapUtils.sortMapByValue(map);
	}

}
