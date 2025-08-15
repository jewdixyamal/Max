package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b54  reason: default package */
public final class b54 {
    public final long a;
    public final jqe b;
    public final int c;
    public final jqe d;
    public final fp3 e;

    public b54(long j, jqe jqe, int i, jqe jqe2, fp3 fp3) {
        this.a = j;
        this.b = jqe;
        this.c = i;
        this.d = jqe2;
        this.e = fp3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b54)) {
            return false;
        }
        b54 b54 = (b54) obj;
        return ei4.a(this.a, b54.a) && tpa.f(this.b, b54.b) && this.c == b54.c && tpa.f(this.d, b54.d) && tpa.f(this.e, b54.e);
    }

    public final int hashCode() {
        AtomicLong atomicLong = ei4.b;
        int e2 = k7d.e(this.c, k7d.f(Long.hashCode(this.a) * 31, 31, this.b), 31);
        jqe jqe = this.d;
        return this.e.hashCode() + ((e2 + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        String b2 = ei4.b(this.a);
        return "DebugSettingItem(itemId=" + b2 + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b54(long j, jqe jqe, int i, jqe jqe2, fp3 fp3, int i2) {
        this(j, jqe, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : jqe2, (i2 & 16) != 0 ? y44.e : fp3);
    }
}
