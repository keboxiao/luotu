package org.buzheng.demo.esm.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class GaoDeMapUtil {

	public static String key = "692a8acaed3d7c8724b08148966a6590";

	// 将地理位置address 作为参数 通过getLngAndLatByAmap 方法获取经纬度
	public static String getLngAndLatByAmap(String address) throws Exception {

		address = address.trim();
		// 设置识别城市
		String city = "茂名市";
		String url;
		try {
			// String 类型字符串需要设置编码格式
			url = "http://restapi.amap.com/v3/geocode/geo?address=" + URLEncoder.encode(address, "UTF-8")
					+ "&output=JSON&key=" + key + "&city=" + URLEncoder.encode(city.trim(), "UTF-8");
			String result = HttpServiceUtil.insureResponseBlockGet(url);
			// 判断返回结果是否为空
			if (result == null) {
				return "-1";
			}
			JSONObject obj = JSONObject.parseObject(result);
			// 判断状态
			if (obj.get("status").toString().equals("1")) {
				// 如果没有返回经纬度

				JSONArray array = obj.getJSONArray("geocodes");

				if (array.size() > 0) {
					String str = array.getString(0);
					JSONObject locationjson = JSONObject.parseObject(str);
					str = locationjson.getString("location");
					return str;

				} else {
					System.out.println("未找到相匹配的经纬度！");
					return "-1";

				}
			} else {
				System.out.println("请求错误！");
				return "-1";
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "-1";
	}

	// 将经纬度getLng， getLat 通过getAmapByLngAndLat方法转换地址
	public static String getAmapByLngAndLat(String getLng, String getLat) throws Exception {
		String url;
		try {
			url = "http://restapi.amap.com/v3/geocode/regeo?output=JSON&location=" + getLng + "," + getLat + "&key="
					+ "692a8acaed3d7c8724b08148966a6590" + "&radius=0&extensions=base";
			// HttpDownloader httpDownloader = new HttpDownloader();
			String result = HttpServiceUtil.insureResponseBlockGet(url);
			if (result == null) {
				return "-1";
			}
			// 将获取结果转为json 数据
			JSONObject obj = JSON.parseObject(result);
			if (obj.get("status").toString().equals("1")) {
				// 如果没有返回-1

				JSONObject regeocode = obj.getJSONObject("regeocode");
				if (regeocode.size() > 0) {
					// 在regeocode中拿到 formatted_address 具体位置
					String formatted = regeocode.get("formatted_address").toString();
					return formatted;

				} else {
					System.out.println("未找到相匹配的地址！");
					return "-1";

				}
			} else {
				System.out.println("请求错误！");
				return "-1";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "-1";
	}

	// 将经纬度getLng， getLat 通过getAmapByLngAndLat方法转换地址
	public static String getAddressJsonByLngAndLat(double getLng, double getLat) {
		String url;
		try {
			url = "http://restapi.amap.com/v3/geocode/regeo?output=JSON&location=" + getLng + "," + getLat + "&key="
					+ "692a8acaed3d7c8724b08148966a6590" + "&radius=0&extensions=base";
			// HttpDownloader httpDownloader = new HttpDownloader();
			String result = HttpServiceUtil.insureResponseBlockGet(url);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
