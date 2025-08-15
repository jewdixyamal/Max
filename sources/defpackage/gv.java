package defpackage;

/* renamed from: gv  reason: default package */
public final class gv extends hm9 {
    public final /* synthetic */ hv o;

    public gv(hv hvVar) {
        this.o = hvVar;
    }

    public final Object A(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((ema) hvVar.X.b.c).r(obj, obj2);
        }
        throw new AssertionError();
    }

    public final int D() {
        return this.o.b.size();
    }

    public final int F() {
        return this.o.a.size();
    }

    public final boolean c(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((ema) hvVar.X.b.c).d(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean d(int i, int i2) {
        hv hvVar = this.o;
        Object obj = hvVar.a.get(i);
        Object obj2 = hvVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((ema) hvVar.X.b.c).e(obj, obj2);
    }
}
