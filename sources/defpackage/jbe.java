package defpackage;

import java.util.List;

/* renamed from: jbe  reason: default package */
public abstract class jbe extends oy implements abe {
    public long X;
    public long c;
    public abe o;

    public final int g(long j) {
        abe abe = this.o;
        abe.getClass();
        return abe.g(j - this.X);
    }

    public final long i(int i) {
        abe abe = this.o;
        abe.getClass();
        return abe.i(i) + this.X;
    }

    public final List p(long j) {
        abe abe = this.o;
        abe.getClass();
        return abe.p(j - this.X);
    }

    public final int u() {
        abe abe = this.o;
        abe.getClass();
        return abe.u();
    }

    public abstract void v();

    public final void w(long j, abe abe, long j2) {
        this.c = j;
        this.o = abe;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.X = j;
    }
}
