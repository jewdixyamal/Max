package defpackage;

/* renamed from: e02  reason: default package */
public final class e02 implements f02 {
    public final int X;
    public final long Y;
    public final long a;
    public final w3e b;
    public final jqe c;
    public final Integer o;

    public e02(long j, w3e w3e) {
        this.a = j;
        this.b = w3e;
        this.c = w3e.b;
        this.o = w3e.o;
        this.X = w3e.t0;
        this.Y = w3e.u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e02)) {
            return false;
        }
        e02 e02 = (e02) obj;
        return this.a == e02.a && tpa.f(this.b, e02.b);
    }

    public final long getItemId() {
        return this.Y;
    }

    public final jqe getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final boolean r() {
        return this.b.Y == 1;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }
}
