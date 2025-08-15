package defpackage;

/* renamed from: p0f  reason: default package */
public final class p0f {
    public static final p0f b = new p0f(ffc.X);
    public static final String c = Integer.toString(0, 36);
    public final zw6 a;

    static {
        ls5 ls5 = zw6.b;
        int i = oaf.a;
    }

    public p0f(ffc ffc) {
        this.a = zw6.j(ffc);
    }

    public final zw6 a() {
        return this.a;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            zw6 zw6 = this.a;
            if (i2 >= zw6.size()) {
                return false;
            }
            o0f o0f = (o0f) zw6.get(i2);
            if (o0f.f() && o0f.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
