package defpackage;

/* renamed from: st5  reason: default package */
public final class st5 implements ol7 {
    public final jqe a;
    public final boolean b;
    public final int c;

    public /* synthetic */ st5(iqe iqe, boolean z) {
        this(iqe, z, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st5)) {
            return false;
        }
        st5 st5 = (st5) obj;
        return tpa.f(this.a, st5.a) && this.b == st5.b && this.c == st5.c;
    }

    public final long getItemId() {
        return Long.MAX_VALUE;
    }

    public final int hashCode() {
        jqe jqe = this.a;
        return Integer.hashCode(this.c) + ms2.d((jqe == null ? 0 : jqe.hashCode()) * 31, 31, this.b);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return zr6.j(sb, this.c, ")");
    }

    public st5(jqe jqe, boolean z, int i) {
        this.a = jqe;
        this.b = z;
        this.c = i;
    }
}
