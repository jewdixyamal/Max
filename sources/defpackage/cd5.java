package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cd5  reason: default package */
public final /* synthetic */ class cd5 implements Callable {
    public final /* synthetic */ dd5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ cd5(dd5 dd5, long j, long j2) {
        this.a = dd5;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        k4a k4a = (k4a) this.a.a;
        return Long.valueOf(ome.d(k4a.z(), new ku(((p7b) k4a.y()).a.o(), 5, this.b, this.c, -1), false, 0, 12));
    }
}
