package defpackage;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: om9  reason: default package */
public abstract class om9 {
    public static final AtomicReference a = new AtomicReference(new HashMap());
    public static final je7 b;
    public static final gaa c;
    public static final khe d = new khe(new j78(14));
    public static final khe e = new khe(new j78(15));

    static {
        jm9 jm9 = tu0.l;
        b = (jm9 != null ? jm9 : null).a;
        if (jm9 == null) {
            jm9 = null;
        }
        c = jm9.c;
    }

    public static final mm9 a(String str, int i, boolean z) {
        sc4 sc4;
        while (true) {
            AtomicReference atomicReference = a;
            HashMap hashMap = (HashMap) atomicReference.get();
            HashMap hashMap2 = new HashMap(hashMap);
            mm9 mm9 = (mm9) hashMap2.get(str);
            if (mm9 == null) {
                jm9 jm9 = tu0.l;
                if (jm9 == null) {
                    jm9 = null;
                }
                aea aea = jm9.b;
                int s = au1.s(i);
                if (s == 0) {
                    sc4 = (sc4) d.getValue();
                } else if (s == 1) {
                    sc4 = (sc4) e.getValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mm9 = new mm9(aea, sc4, (ExecutorService) b.getValue(), str, z);
                hashMap2.put(str, mm9);
                mm9.d();
                hashMap2.put(str, mm9);
            }
            while (true) {
                if (atomicReference.compareAndSet(hashMap, hashMap2)) {
                    if (z) {
                        boolean z2 = mm9.e;
                        mm9.e = true;
                        if (!z2 && mm9.e) {
                            mm9.d();
                        }
                    }
                    return mm9;
                } else if (atomicReference.get() != hashMap) {
                }
            }
        }
    }
}
