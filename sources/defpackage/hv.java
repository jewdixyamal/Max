package defpackage;

import java.util.List;

/* renamed from: hv  reason: default package */
public final class hv implements Runnable {
    public final /* synthetic */ iv X;
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;

    public hv(iv ivVar, List list, List list2, int i, Runnable runnable) {
        this.X = ivVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.o = runnable;
    }

    public final void run() {
        this.X.c.execute(new h76((Object) this, (Object) lz7.e(new gv(this)), false, 2));
    }
}
