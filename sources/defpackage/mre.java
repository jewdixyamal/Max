package defpackage;

import android.util.LruCache;

/* renamed from: mre  reason: default package */
public final class mre {
    public static final LruCache a = new LruCache(2);

    public static void a(ze0 ze0, rre rre) {
        if (ze0 != null) {
            hm9.m("ThemeBackgroundCache", "Save theme " + ze0 + " to cache.", new Object[0]);
            a.put(ze0, rre);
        }
    }
}
