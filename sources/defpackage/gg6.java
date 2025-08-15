package defpackage;

/* renamed from: gg6  reason: default package */
public final class gg6 {
    public static final gg6 e = hg6.l(Integer.MIN_VALUE, 1, hg6.F0, 0.0f);
    public final boolean a;
    public final dg6 b;
    public final ote c;
    public final float d;

    public gg6(boolean z, dg6 dg6, ote ote, float f) {
        this.a = z;
        this.b = dg6;
        this.c = ote;
        this.d = f;
    }

    public final ote a(boolean z) {
        wf6 wf6 = hg6.F0;
        ote ote = this.c;
        return ote != wf6 ? ote : this.d == 0.0f ? z ? hg6.I0 : hg6.N0 : hg6.O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gg6.class != obj.getClass()) {
            return false;
        }
        gg6 gg6 = (gg6) obj;
        return this.c.equals(gg6.c) && this.b.equals(gg6.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
