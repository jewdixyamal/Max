package defpackage;

/* renamed from: f78  reason: default package */
public abstract class f78 extends h13 {
    public final long u0;

    public f78(r24 r24, z24 z24, oy5 oy5, int i, Object obj, long j, long j2, long j3) {
        super(r24, z24, 1, oy5, i, obj, j, j2);
        oy5.getClass();
        this.u0 = j3;
    }

    public long b() {
        long j = this.u0;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    public abstract boolean c();
}
