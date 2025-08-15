package defpackage;

import android.util.LruCache;

/* renamed from: ief  reason: default package */
public final class ief {
    public static final LruCache a = new LruCache(1000);

    public static gef a(String str) {
        LruCache lruCache = a;
        hef hef = (hef) lruCache.get(str);
        if (hef == null) {
            return null;
        }
        if (hef.b + 3600000 > System.currentTimeMillis()) {
            return hef.a;
        }
        lruCache.remove(str);
        return null;
    }
}
