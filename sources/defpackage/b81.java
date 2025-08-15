package defpackage;

import java.util.List;

/* renamed from: b81  reason: default package */
public final class b81 extends hm9 {
    public final /* synthetic */ int o;
    public final List p;
    public final List q;

    public /* synthetic */ b81(int i, List list, List list2) {
        this.o = i;
        this.p = list;
        this.q = list2;
    }

    public final int D() {
        switch (this.o) {
            case 0:
                return this.q.size();
            case 1:
                return this.q.size();
            case 2:
                return this.q.size();
            default:
                return this.q.size();
        }
    }

    public final int F() {
        switch (this.o) {
            case 0:
                return this.p.size();
            case 1:
                return this.p.size();
            case 2:
                return this.p.size();
            default:
                return this.p.size();
        }
    }

    public final boolean c(int i, int i2) {
        switch (this.o) {
            case 0:
                return tpa.f(this.p.get(i), this.q.get(i2));
            case 1:
                return tpa.f(this.p.get(i), this.q.get(i2));
            case 2:
                return this.p.get(i) == this.q.get(i2);
            default:
                return tpa.f(x53.j0(i, this.p), x53.j0(i2, this.q));
        }
    }

    public final boolean d(int i, int i2) {
        switch (this.o) {
            case 0:
                return ((w81) this.p.get(i)).c == ((w81) this.q.get(i2)).c;
            case 1:
                return tpa.f(((av5) this.p.get(i)).a, ((av5) this.q.get(i2)).a);
            case 2:
                return ((bd7) this.p.get(i)).c == ((bd7) this.q.get(i2)).c;
            default:
                uab uab = (uab) x53.j0(i, this.p);
                Long l = null;
                Long valueOf = uab != null ? Long.valueOf(uab.a) : null;
                uab uab2 = (uab) x53.j0(i2, this.q);
                if (uab2 != null) {
                    l = Long.valueOf(uab2.a);
                }
                return tpa.f(valueOf, l);
        }
    }
}
