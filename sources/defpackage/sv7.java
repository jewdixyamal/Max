package defpackage;

import java.util.Iterator;

/* renamed from: sv7  reason: default package */
public abstract class sv7 implements Iterable, qb7 {
    public final long a;
    public final long b;
    public final long c;

    public sv7(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1;
    }

    public final Iterator iterator() {
        return new tv7(this.a, this.b, this.c);
    }
}
