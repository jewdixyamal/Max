package defpackage;

import java.util.List;

/* renamed from: ph8  reason: default package */
public final class ph8 {
    public final zw6 a;
    public final int b;
    public final long c;

    public ph8(int i, long j, List list) {
        this.a = zw6.j(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph8)) {
            return false;
        }
        ph8 ph8 = (ph8) obj;
        if (this.a.equals(ph8.a)) {
            Integer valueOf = Integer.valueOf(this.b);
            Integer valueOf2 = Integer.valueOf(ph8.b);
            int i = oaf.a;
            if (valueOf.equals(valueOf2) && Long.valueOf(this.c).equals(Long.valueOf(ph8.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return pag.p(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
