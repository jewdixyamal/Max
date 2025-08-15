package defpackage;

/* renamed from: ui4  reason: default package */
public final class ui4 {
    public static final ui4 e = new sv0(0).b();
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        int i2 = oaf.a;
    }

    public ui4(sv0 sv0) {
        this.a = sv0.b;
        this.b = sv0.c;
        this.c = sv0.d;
        this.d = (String) sv0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui4)) {
            return false;
        }
        ui4 ui4 = (ui4) obj;
        return this.a == ui4.a && this.b == ui4.b && this.c == ui4.c && oaf.a(this.d, ui4.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
