package defpackage;

/* renamed from: ji3  reason: default package */
public final class ji3 extends hi3 implements d2d {
    public final int s0;
    public final long t0;

    public ji3(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.s0 = i;
        this.t0 = j == -1 ? -1 : j;
    }

    public final long a() {
        return this.t0;
    }

    public final long b(long j) {
        return (Math.max(0, j - this.b) * 8000000) / ((long) this.X);
    }

    public final int h() {
        return this.s0;
    }
}
