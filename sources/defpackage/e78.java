package defpackage;

import java.util.ArrayList;

/* renamed from: e78  reason: default package */
public enum e78 {
    ;
    
    public static final ArrayList X = null;
    public static final dp3 o = null;
    public final int a;
    public final int b;
    public final int c;

    /* JADX WARNING: type inference failed for: r0v3, types: [dp3, java.lang.Object] */
    static {
        e78[] e78Arr;
        v25 v25 = new v25(e78Arr);
        Z = v25;
        o = new Object();
        ArrayList arrayList = new ArrayList(z53.S(v25, 10));
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            arrayList.add(Integer.valueOf(((e78) u1Var.next()).b));
        }
        X = arrayList;
    }

    /* access modifiers changed from: public */
    e78(int i, int i2, String str) {
        this.a = r2;
        this.b = i;
        this.c = i2;
    }
}
