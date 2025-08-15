package defpackage;

/* renamed from: zz  reason: default package */
public final class zz extends b00 {
    public final long a;
    public final jqe b;

    public zz(long j, iqe iqe) {
        this.a = j;
        this.b = iqe;
    }

    public final long a() {
        return this.a;
    }

    public final jqe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return this.a == zzVar.a && tpa.f(this.b, zzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
