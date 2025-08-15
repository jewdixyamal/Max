package defpackage;

/* renamed from: m08  reason: default package */
public final class m08 extends s06 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public m08(mue mue, Object obj, Object obj2) {
        super(mue);
        this.f = obj;
        this.g = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    public final hue g(int i, hue hue, boolean z) {
        this.e.g(i, hue, z);
        if (oaf.a(hue.b, this.g) && z) {
            hue.b = h;
        }
        return hue;
    }

    public final Object m(int i) {
        Object m = this.e.m(i);
        return oaf.a(m, this.g) ? h : m;
    }

    public final kue n(int i, kue kue, long j) {
        this.e.n(i, kue, j);
        if (oaf.a(kue.a, this.f)) {
            kue.a = kue.q;
        }
        return kue;
    }
}
