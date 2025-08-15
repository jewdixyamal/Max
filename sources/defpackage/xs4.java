package defpackage;

import java.util.HashMap;

/* renamed from: xs4  reason: default package */
public final class xs4 extends HashMap {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, xs4, java.util.HashMap] */
    public static xs4 a(gy8 gy8) {
        int N = lz7.N(gy8);
        ? hashMap = new HashMap();
        for (int i = 0; i < N; i++) {
            hashMap.put(Long.valueOf(gy8.w0()), Long.valueOf(gy8.w0()));
        }
        return hashMap;
    }
}
