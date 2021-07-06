package com.example.cs8claps.sharealbum;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

import java.util.Set;

public class SharedPreferencesHandler {

	public static SharedPreferences getSharedPreferences(Context ctx) {
		return PreferenceManager.getDefaultSharedPreferences(ctx);
	}

	public static void setStringValues(Context ctx, String key,
									   String DataToSave) {
		Editor editor = getSharedPreferences(ctx).edit();
		editor.putString(key, DataToSave);
		editor.commit();
	}

	public static void setStringSetValues(Context ctx, String key,
										  Set<String> DataToSave) {
		Editor editor = getSharedPreferences(ctx).edit();
		editor.putStringSet(key, DataToSave);
		editor.commit();
	}

	public static Set<String> getStringSetValues(Context ctx, String key) {
	    return getSharedPreferences(ctx).getStringSet(key, null);
    }

	public static String getStringValues(Context ctx, String key) {
		return getSharedPreferences(ctx).getString(key, null);
	}


}