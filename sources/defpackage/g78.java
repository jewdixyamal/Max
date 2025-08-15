package defpackage;

/* renamed from: g78  reason: default package */
public abstract class g78 extends j13 {
    public final long u0;

    public g78(t24 t24, a34 a34, qy5 qy5, int i, Object obj, long j, long j2, long j3) {
        super(t24, a34, 1, qy5, i, obj, j, j2);
        qy5.getClass();
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
