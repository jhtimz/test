package test.code.quality;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> slmt = new HashMap<String,Object>();
		//�����map,ɨ��msg�ڵ㴴��mapʵ���������ݣ�
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("slmt", slmt);
		//ɨ�����msg�ڵ㣬�������ݵ�map����mapȡ�����浽����ڵ�map
		Map<String,Object> normal =new HashMap<String,Object> ();
		normal.put("slmt2", map.get("slmt"));
		//ɨ�赽����������msg mapʹ�õ�������map������msg�ڵ��item������䵽��mapȥ������msg�ڵ�map����Ҳ�Ǹ�map
		Map<String,Object> slmt2 = (Map<String,Object>)map.get("slmt");
		
		slmt2.put("1", "talenttan");
		
		System.out.println(normal.get("slmt2"));
		((Map<String,Object>)map.get("slmt")).put("1", "66665");
		System.out.println(normal.get("slmt2"));
		
		/*Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("normal", value)*/
	}

}
