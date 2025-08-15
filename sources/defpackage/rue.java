package defpackage;

/* renamed from: rue  reason: default package */
public final class rue implements akc {
    public final long b;
    public final akc c;

    public rue(long j, akc akc) {
        c54.j("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = akc;
    }

    public final long a() {
        return this.b;
    }

    public final zjc b(mx1 mx1) {
        zjc b2 = this.c.b(mx1);
        long j = this.b;
        if (j <= 0) {
            return b2;
        }
        return mx1.b >= j - b2.a ? zjc.d : b2;
    }
}
