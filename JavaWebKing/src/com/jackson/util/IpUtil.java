package com.jackson.util;

import com.jackson.util.ip.IPSeeker;

public class IpUtil {
	public static String getIpAddress(String ip) {
		try{
			return IPSeeker.getInstance().getAddress(ip);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "Î´ÖªÇøÓò";
	}
}
