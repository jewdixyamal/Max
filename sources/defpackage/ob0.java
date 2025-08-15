package defpackage;

/* renamed from: ob0  reason: default package */
public final class ob0 {
    public final long a;
    public final long b;
    public final p90 c;

    public ob0(long j, long j2, p90 p90) {
        this.a = j;
        this.b = j2;
        this.c = p90;
    }

    public static ob0 a(long j, long j2, p90 p90) {
        boolean z = false;
        c54.j("duration must be positive value.", j >= 0);
        if (j2 >= 0) {
            z = true;
        }
        c54.j("bytes must be positive value.", z);
        return new ob0(j, j2, p90);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0 = (ob0) obj;
        return this.a == ob0.a && this.b == ob0.b && this.c.equals(ob0.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
