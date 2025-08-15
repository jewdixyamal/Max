package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yf  reason: default package */
public abstract class yf {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final khe e;
    public static final kc f;
    public static final kc g;

    static {
        khe khe = new khe(new m(4));
        e = khe;
        kc kcVar = new kc(1);
        f = kcVar;
        kc kcVar2 = new kc(2);
        g = kcVar2;
        ((Handler) khe.getValue()).post(kcVar);
        ((Handler) khe.getValue()).post(kcVar2);
    }

    public static void a(v26 v26, int i) {
        woe woe = v26.b;
        int e2 = ote.e(woe.g + i, (int) ote.b(((float) v26.a) * 0.5f, 1.0f), v26.a);
        int i2 = woe.g;
        if (e2 != i2 && e2 != i2) {
            woe.g = ote.e(e2, 1, woe.f);
            ht0 q = woe.q();
            if (q != null) {
                q.a(woe.g);
            }
        }
    }
}
