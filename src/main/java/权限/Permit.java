package 权限;

import java.util.HashMap;
import java.util.Map;

public class Permit {
	/**全局权限列表，key=role.id,value=[权限key,权限value]*/
	public static Map<Integer,Map<String,String>> pMap=new HashMap<Integer, Map<String,String>>();
	public void init(){
		pMap.clear();
		//超管
	

	}
}
