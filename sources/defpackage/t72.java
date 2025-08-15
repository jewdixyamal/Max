package defpackage;

import android.content.Context;

/* renamed from: t72  reason: default package */
public final /* synthetic */ class t72 implements c7b, lde {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t72(p82 p82, boolean z, boolean z2) {
        this.c = p82;
        this.a = z;
        this.b = z2;
    }

    public Object get() {
        return are.g((Context) this.c, this.a, this.b);
    }

    public boolean test(Object obj) {
        e52 e52 = (e52) obj;
        p82 p82 = (p82) this.c;
        p82.getClass();
        int i = e52.b.m;
        boolean z = this.a;
        return (i > 0 || (z && e52.i0())) && (this.b || !e52.V(((p7b) p82.n).a) || e52.A()) && !e52.F() && ((e52.e0() && e52.h0()) || (z && e52.i0()));
    }

    public /* synthetic */ t72(Context context, boolean z) {
        this.c = context;
        this.a = z;
        this.b = true;
    }
}
