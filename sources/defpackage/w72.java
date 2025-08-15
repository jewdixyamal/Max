package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: w72  reason: default package */
public final /* synthetic */ class w72 implements Runnable {
    public final /* synthetic */ p82 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ e52 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ w72(p82 p82, long j, e52 e52, boolean z) {
        this.a = p82;
        this.b = j;
        this.c = e52;
        this.o = z;
    }

    public final void run() {
        p82 p82 = this.a;
        ConcurrentHashMap concurrentHashMap = p82.f;
        long j = this.b;
        boolean containsKey = concurrentHashMap.containsKey(Long.valueOf(j));
        Long valueOf = Long.valueOf(j);
        e52 e52 = this.c;
        concurrentHashMap.put(valueOf, e52);
        boolean f = e52.b.f(p82.K());
        k92 k92 = e52.b;
        if (!f) {
            p82.c.put(Long.valueOf(k92.l), e52);
        }
        if (f || k92.a != 0) {
            p82.g.put(Long.valueOf(k92.a), e52);
        }
        boolean t = oag.t(k92.I);
        ConcurrentHashMap concurrentHashMap2 = p82.h;
        if (!t) {
            concurrentHashMap2.put(Long.valueOf(j), e52);
        } else {
            concurrentHashMap2.remove(Long.valueOf(j));
        }
        if (containsKey) {
            je7 je7 = p82.C;
            if (je7.getValue() != null) {
                ((zb2) ((ta2) je7.getValue())).k(j, e52);
            }
            if (this.o) {
                p82.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), false, false, mg4.REGULAR, (oi0) null, true, wz4.a));
                List singletonList = Collections.singletonList(e52);
                o82 o82 = p82.G;
                if (o82 != null) {
                    o82.c(singletonList);
                }
            }
        }
    }
}
