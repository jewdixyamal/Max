package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: ne7  reason: default package */
public final class ne7 implements SharedPreferences {
    public final khe a;

    public ne7(Context context, li5 li5, mi5 mi5, fd7 fd7) {
        this.a = new khe(new bp((Object) context.getDir("file_prefs", 0), (Object) li5, (Object) mi5, (Object) fd7, 3));
    }

    public final ki5 a() {
        return (ki5) this.a.getValue();
    }

    public final boolean contains(String str) {
        return a().d.b(str);
    }

    public final SharedPreferences.Editor edit() {
        return a().edit();
    }

    public final Map getAll() {
        return a().getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return a().getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return a().getStringSet(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
