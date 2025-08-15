package defpackage;

/* renamed from: f0f  reason: default package */
public final class f0f {
    public static final f0f d = new f0f(new qk9());
    public static final String e = Integer.toString(1, 36);
    public static final String f = Integer.toString(2, 36);
    public static final String g = Integer.toString(3, 36);
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i = oaf.a;
    }

    public f0f(qk9 qk9) {
        this.a = qk9.a;
        this.b = qk9.b;
        this.c = qk9.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0f.class != obj.getClass()) {
            return false;
        }
        f0f f0f = (f0f) obj;
        return this.a == f0f.a && this.b == f0f.b && this.c == f0f.c;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
