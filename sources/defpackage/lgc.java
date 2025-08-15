package defpackage;

/* renamed from: lgc  reason: default package */
public final class lgc {
    public static final lgc c = new lgc(0, false);
    public final int a;
    public final boolean b;

    public lgc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lgc.class != obj.getClass()) {
            return false;
        }
        lgc lgc = (lgc) obj;
        return this.a == lgc.a && this.b == lgc.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
