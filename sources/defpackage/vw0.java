package defpackage;

import java.util.ArrayList;

/* renamed from: vw0  reason: default package */
public enum vw0 {
    AUDIO(nha.q, nha.d, nha.c, oha.e, oha.j),
    MUSIC(nha.v, nha.l, nha.k, oha.v, oha.o);
    
    public static final qq9 Y = null;
    public static final ArrayList Z = null;
    public static final ArrayList s0 = null;
    public final int X;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    /* JADX WARNING: type inference failed for: r0v3, types: [qq9, java.lang.Object] */
    static {
        vw0[] vw0Arr;
        v25 v25 = new v25(vw0Arr);
        w0 = v25;
        Y = new Object();
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(Integer.valueOf(((vw0) u1Var.next()).a));
        }
        Z = arrayList;
        v25 v252 = w0;
        ArrayList arrayList2 = new ArrayList(z53.S(v252, 10));
        u1 u1Var2 = new u1(0, v252);
        while (u1Var2.hasNext()) {
            arrayList2.add(Integer.valueOf(((vw0) u1Var2.next()).b));
        }
        s0 = arrayList2;
    }

    /* access modifiers changed from: public */
    vw0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = i4;
        this.X = i5;
    }
}
