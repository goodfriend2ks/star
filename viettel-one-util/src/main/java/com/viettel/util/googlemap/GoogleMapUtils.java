package com.viettel.util.googlemap;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.fasterxml.jackson.databind.ObjectMapper;


public class GoogleMapUtils {
	public static final String GOOGLE_MAP_API_KEY = "AIzaSyBY0Uu29d7dxH_XzCX46fahaT1p0UQnw7s";
	
	public static final String GOOGLE_MAP_API_URL = "http://maps.googleapis.com/maps/api";
	
	public static GoogleResponse convertToLatLong(String fullAddress) throws IOException {
		/*
		 * Create an java.net.URL object by passing the request URL in
		 * constructor. Here you can see I am converting the fullAddress String
		 * in UTF-8 format. You will get Exception if you don't convert your
		 * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
		 * parameter we also need to pass "sensor" parameter. sensor (required
		 * parameter) — Indicates whether or not the geocoding request comes
		 * from a device with a location sensor. This value must be either true
		 * or false.
		 */
		
		URL url = new URL(GOOGLE_MAP_API_URL + "/geocode/json?address=" + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
		// Open the Connection
		URLConnection conn = url.openConnection();
		
		InputStream in = conn.getInputStream() ;
		ObjectMapper mapper = new ObjectMapper();
		GoogleResponse response = (GoogleResponse)mapper.readValue(in, GoogleResponse.class);
		in.close();
		return response;
	}
	
	public static GoogleResponse convertFromLatLong(String latlongString) throws IOException {
		/*
		 * Create an java.net.URL object by passing the request URL in
		 * constructor. Here you can see I am converting the fullAddress String
		 * in UTF-8 format. You will get Exception if you don't convert your
		 * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
		 * parameter we also need to pass "sensor" parameter. sensor (required
		 * parameter) — Indicates whether or not the geocoding request comes
		 * from a device with a location sensor. This value must be either true
		 * or false.
		 */
		URL url = new URL(GOOGLE_MAP_API_URL + "/geocode/json?latlng=" + URLEncoder.encode(latlongString, "UTF-8") + "&sensor=false");
		// Open the Connection
		URLConnection conn = url.openConnection();
		
		InputStream in = conn.getInputStream() ;
		ObjectMapper mapper = new ObjectMapper();
		GoogleResponse response = (GoogleResponse)mapper.readValue(in,GoogleResponse.class);
		in.close();
		return response;
	}

//	public static LatLon getLatLong(String address) {
//		LatLon latLong = null;
//		try {
//			URL url = new URL(GOOGLE_MAP_API_URL + "/geocode/json?address=" + address + "&sensor=false");
//			URLConnection conn = url.openConnection();                                                                    
//            conn.connect();
//            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
//            
//            StringBuffer sbLocation = new StringBuffer();
//            for (int i=0; i != -1; i = isr.read()) {   
//                sbLocation.append((char)i);
//            }
//            String getContent = sbLocation.toString().trim();  
//            
//            if(getContent.contains("results"))
//            {
//                String temp = getContent.substring(getContent.indexOf("["));
//                JSONArray JSONArrayForAll = new JSONArray(temp);
//                String lng = JSONArrayForAll.getJSONObject(0).getJSONObject("geometry").getJSONObject("location").get("lng").toString();
//                String lat = JSONArrayForAll.getJSONObject(0).getJSONObject("geometry").getJSONObject("location").get("lat").toString();
//                System.out.println(" Latitude : " + lat);
//                System.out.println(" Longitude : " + lng);
//            }
//		} catch (IOException | JSONException e) {
//			e.printStackTrace();
//		}
//		
//		return latLong;
//	}
//	
	public static void main(String[] args) throws IOException {
		GoogleResponse res = GoogleMapUtils.convertToLatLong("K1 - Nghĩa Tân - Cầu Giấy - Hà Nội");
		if(res.getStatus().equals("OK")) {
			for(Result result : res.getResults()) {
				System.out.println("Lattitude of address is :"  +result.getGeometry().getLocation().getLat());
				System.out.println("Longitude of address is :" + result.getGeometry().getLocation().getLng());
				System.out.println("Location is " + result.getGeometry().getLocation_type());
			}
		} else {
			System.out.println(res.getStatus());
		}
		
		System.out.println("\n");
		GoogleResponse res1 = GoogleMapUtils.convertFromLatLong("18.92038860,72.83013059999999");
		if(res1.getStatus().equals("OK")) {
			for(Result result : res1.getResults()) {
				System.out.println("address is :"  +result.getFormatted_address());
			}
		} else {
			System.out.println(res1.getStatus());
		}
	}
}
