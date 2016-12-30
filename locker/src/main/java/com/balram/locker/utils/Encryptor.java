package com.balram.locker.utils;

import android.app.Activity;
import android.text.TextUtils;
import android.support.design.widget.Snackbar;

import java.security.MessageDigest;
import java.util.Locale;

public class Encryptor {

	private static String bytes2Hex(byte[] bytes) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < bytes.length; n++) {
			stmp = (Integer.toHexString(bytes[n] & 0XFF));
			if (stmp.length() == 1) {
				hs += "0" + stmp;
			} else {
				hs += stmp;
			}
		}
		return hs.toLowerCase(Locale.ENGLISH);
	}

	public static String getSHA1(String text) {
		String sha1 = null;
		if (TextUtils.isEmpty(text)) {
			return sha1;
		}
		MessageDigest sha1Digest = null;
		try {
			sha1Digest = MessageDigest.getInstance("SHA-1");
		} catch (Exception e) {
			return sha1;
		}
		byte[] textBytes = text.getBytes();
		sha1Digest.update(textBytes, 0, text.length());
		byte[] sha1hash = sha1Digest.digest();
		return bytes2Hex(sha1hash);
	}
	public static void snackPeak(Activity activity, String message) {
		Snackbar.make(activity.findViewById(android.R.id.content),
				message, Snackbar.LENGTH_LONG)
				.show();
	}
}
