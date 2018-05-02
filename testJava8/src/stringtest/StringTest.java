package stringtest;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class StringTest {

	public static void main(String[] args) {
		// 标签名字大写转小写
//		方法1
		String xml = "<DATA1><SERVICENAME>LST VSRR</SERVICENAME>\n"
				+ "<IMSI>613020118735961</IMSI>\n"
				+ "<TPLTYPE>VLR_12.3</TPLTYPE>\n"
				+ "<NB1>TRUE</NB1>\n"
				+ "</DATA1>";
		String subxml = "<DATA2>";
		for(int i = 1;i < 1000;i++) {
			subxml = subxml + "<NB" + i + ">" + "TRUE?|FALSE</NB" + i + ">\n";
		}
		subxml = subxml + "</DATA2>";
		xml = xml + subxml;
		System.out.println("start time:"+System.currentTimeMillis());
		StringTest.toLowerLable(xml);
		System.out.println("end time:"+System.currentTimeMillis());
		
//		方法2
		String xml2 = "<SERVICENAME>LST VSRR</SERVICENAME>\n"
				+ "<IMSI>613020118735961</IMSI>\n"
				+ "<TPLTYPE>VLR</TPLTYPE>";
//		StringTest.convertLabelLower(xml2);
	}
	
	public static String toLowerLable(String xml) {
//		start is "<" index
		int start = 0;
//		end is ">" index
		int end = 0;
		char[] ccArr = xml.toCharArray();
		for(int i = 0;i < ccArr.length;i++) {
			if('<' == ccArr[i]) {
				start = i;
				for(int j = i;j < ccArr.length;j++) {
					if('>' == ccArr[j]) {
						end = j;
						break;
					}
				}
			}else {
				if(i > start && i < end) {
					ccArr[i] = String.valueOf(ccArr[i]).toLowerCase().charAt(0);
				}
			}
		}
		System.out.println("lower case lable:");
		System.out.println(new String(ccArr));
		return xml;
	}
	
	public static String convertLabelLower(String str){
//		String[] array1 = str.split(">[0-9a-zA-Z\\s\\|]+<");
		String[] array1 = str.split(">[\\w\\s\\|\\.\\_]+<");
		for(String arr:array1){
			str = str.replace(arr, arr.toLowerCase());
		}
		System.out.println("result:\n" + str);
		return str;
	} 

}
