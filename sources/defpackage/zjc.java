package defpackage;

/* renamed from: zjc  reason: default package */
public final class zjc {
    public static final zjc d = new zjc(0, false, false);
    public static final zjc e = new zjc(500, true, false);
    public static final zjc f = new zjc(0, false, true);
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new zjc(100, true, false);
    }

    public zjc(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            c54.j("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
