package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: l32  reason: default package */
public abstract class l32 implements y66 {
    public final lx3 a;
    public final int b;
    public final int c;

    public l32(lx3 lx3, int i, int i2) {
        this.a = lx3;
        this.b = i;
        this.c = i2;
    }

    public Object d(on5 on5, Continuation continuation) {
        Object k = j1e.k(new j32(on5, this, (Continuation) null), continuation);
        return k == tx3.a ? k : e5f.a;
    }

    public final mn5 e(lx3 lx3, int i, int i2) {
        lx3 lx32 = this.a;
        lx3 plus = lx3.plus(lx32);
        int i3 = this.c;
        int i4 = this.b;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i != -3) {
                    if (i4 != -2) {
                        if (i != -2) {
                            i += i4;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i4;
            }
            i2 = i3;
        }
        return (tpa.f(plus, lx32) && i == i4 && i2 == i3) ? this : k(plus, i, i2);
    }

    public String h() {
        return null;
    }

    public abstract Object j(iab iab, Continuation continuation);

    public abstract l32 k(lx3 lx3, int i, int i2);

    public mn5 l() {
        return null;
    }

    public p8c m(sx3 sx3) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        vx3 vx3 = vx3.c;
        k32 k32 = new k32(this, (Continuation) null);
        fab fab = new fab(v3c.x(sx3, this.a), c37.a(i, this.c, 4));
        fab.start(vx3, fab, k32);
        return fab;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String h = h();
        if (h != null) {
            arrayList.add(h);
        }
        hz4 hz4 = hz4.a;
        lx3 lx3 = this.a;
        if (lx3 != hz4) {
            arrayList.add("context=" + lx3);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(wg0.p(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return rh4.m(sb, x53.n0(arrayList, ", ", (String) null, (String) null, (m56) null, 62), ']');
    }
}
