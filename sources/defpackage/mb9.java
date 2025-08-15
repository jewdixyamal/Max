package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mb9  reason: default package */
public final class mb9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kpa Y;
    public final /* synthetic */ xb9 Z;
    public final /* synthetic */ long[] s0;
    public final /* synthetic */ gi9 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb9(kpa kpa, xb9 xb9, long[] jArr, gi9 gi9, Continuation continuation) {
        super(2, continuation);
        this.Y = kpa;
        this.Z = xb9;
        this.s0 = jArr;
        this.t0 = gi9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mb9 mb9 = new mb9(this.Y, this.Z, this.s0, this.t0, continuation);
        mb9.X = obj;
        return mb9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        e5f e5f = e5f.a;
        gi9 gi9 = this.t0;
        kpa kpa = this.Y;
        int i = 0;
        long[] jArr = this.s0;
        xb9 xb9 = this.Z;
        if (kpa != null) {
            boolean i2 = xb9.i();
            xs xsVar = xb9.t0;
            if (i2 && j1e.z(sx3)) {
                ym3 ym3 = (ym3) kpa.a;
                xp3 xp3 = (xp3) kpa.b;
                try {
                    bn3 bn3 = (bn3) xb9.c.getValue();
                    if (ym3 != null) {
                        bn3.a(ym3, jArr, 0);
                        if (xp3 != null) {
                            ((w7b) xb9.o.getValue()).h(0, iz7.n(xp3.c));
                        }
                        xsVar.removeAll(ys.n0(jArr));
                        return e5f;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (Throwable th) {
                    xsVar.removeAll(ys.n0(jArr));
                    throw th;
                }
            }
        }
        xb9.t0.removeAll(ys.n0(jArr));
        int i3 = gi9.d;
        int length = jArr.length;
        while (i < length) {
            long j = jArr[i];
            gi9.b[gi9.e(j)] = j;
            i++;
        }
        return e5f;
    }
}
