package test.code.quality;

public class Hex2Binary {

	public static void main(String[] args)  
    {  
        String hexString = "322130343135303330363030303020202030303031303334342020200000000000000130303030303030302020202020200200702004C030C09831196226820014601402906040000000000007000001155702100012376226820014601402906D4912120130246000000104996226820014601402906D1561560000000000000003000000200000000000000000000000D00000000000D0000000599625000031343030303238303933393432393735333131343034373135365E14016BCC2931982600000000000000003930317C30307C363232363832323031343630323031393436377CC8C4B8A3CAA57C7C31343631310013000000060005004234344442374632";  
        String bs = hexString2binaryString(hexString);
        StringBuffer bf = new StringBuffer();
        for(String s:bs.split("")){
        	bf.append(s).append(",");
        }
        System.out.println(bf.toString());  
    }  
  
    public static String hexString2binaryString(String hexString)  
    {  
        if (hexString == null || hexString.length() % 2 != 0)  
            return null;  
        String bString = "", tmp;  
        for (int i = 0; i < hexString.length(); i++)  
        {  
            tmp = "0000"  
                    + Integer.toBinaryString(Integer.parseInt(hexString  
                            .substring(i, i + 1), 16));  
            bString += tmp.substring(tmp.length() - 4);  
        }  
        return bString;  
    }  

}
