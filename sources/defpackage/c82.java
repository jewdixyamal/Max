package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c82  reason: default package */
public final /* synthetic */ class c82 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c82(p82 p82, long j, int i) {
        this.a = i;
        this.b = p82;
        this.c = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.b.f;
                long j = this.c;
                e52 e52 = (e52) concurrentHashMap.get(Long.valueOf(j));
                if (e52 != null) {
                    return e52;
                }
                throw new IllegalArgumentException(ey8.h(j, "chat not found: "));
            default:
                ConcurrentHashMap concurrentHashMap2 = this.b.g;
                long j2 = this.c;
                e52 e522 = (e52) concurrentHashMap2.get(Long.valueOf(j2));
                if (e522 != null) {
                    return e522;
                }
                throw new IllegalArgumentException(ey8.h(j2, "chat not found: "));
        }
    }
}
