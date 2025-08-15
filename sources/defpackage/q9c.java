package defpackage;

/* renamed from: q9c  reason: default package */
public final class q9c implements Comparable {
    public final e52 a;
    public final uj3 b;

    public q9c(e52 e52, uj3 uj3) {
        this.a = e52;
        this.b = uj3;
    }

    public final int compareTo(Object obj) {
        q9c q9c = (q9c) obj;
        e52 e52 = this.a;
        long j = e52 != null ? e52.b.Y : this.b.a.c.r;
        e52 e522 = q9c.a;
        return np8.j(e522 != null ? e522.b.Y : q9c.b.a.c.r, j);
    }
}
