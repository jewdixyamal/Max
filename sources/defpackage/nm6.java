package defpackage;

/* renamed from: nm6  reason: default package */
public abstract class nm6 implements Comparable {
    public final long X;
    public final dr4 Y;
    public final String Z;
    public final String a;
    public final lm6 b;
    public final long c;
    public final int o;
    public final String s0;
    public final long t0;
    public final long u0;
    public final boolean v0;

    public nm6(String str, lm6 lm6, long j, int i, long j2, dr4 dr4, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = lm6;
        this.c = j;
        this.o = i;
        this.X = j2;
        this.Y = dr4;
        this.Z = str2;
        this.s0 = str3;
        this.t0 = j3;
        this.u0 = j4;
        this.v0 = z;
    }

    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.X;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
