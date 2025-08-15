package defpackage;

/* renamed from: xj9  reason: default package */
public final /* synthetic */ class xj9 implements l66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj9 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xj9(zj9 zj9, Object obj, int i) {
        this.a = i;
        this.b = zj9;
        this.c = obj;
    }

    public final Object apply(Object obj) {
        oq7 oq7 = (oq7) obj;
        switch (this.a) {
            case 0:
                zj9 zj9 = this.b;
                zj9.getClass();
                yj9 yj9 = (yj9) this.c;
                oq7.i = yj9.b.a;
                oq7.a = true;
                oq7.b = true;
                oq7.g = false;
                oq7.h = false;
                oq7.c = false;
                oq7.n = zj9.t0.d;
                oq7.o = yj9.e;
                return oq7;
            default:
                zj9 zj92 = this.b;
                zj92.getClass();
                oq7.a = false;
                oq7.b = true;
                oq7.c = false;
                oq7.i = (mqb) this.c;
                oq7.g = false;
                oq7.h = false;
                oq7.n = zj92.t0.d;
                return oq7;
        }
    }
}
