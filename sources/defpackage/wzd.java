package defpackage;

/* renamed from: wzd  reason: default package */
public final class wzd extends q06 {
    public final /* synthetic */ v1d b;
    public final /* synthetic */ g03 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wzd(g03 g03, v1d v1d, v1d v1d2) {
        super(v1d);
        this.c = g03;
        this.b = v1d2;
    }

    public final t1d e(long j) {
        t1d e = this.b.e(j);
        z1d z1d = e.a;
        long j2 = z1d.a;
        long j3 = z1d.b;
        long j4 = this.c.b;
        z1d z1d2 = new z1d(j2, j3 + j4);
        z1d z1d3 = e.b;
        return new t1d(z1d2, new z1d(z1d3.a, z1d3.b + j4));
    }
}
