package defpackage;

/* renamed from: ec4  reason: default package */
public final class ec4 {
    public final n64 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f = -1;
    public final boolean g = false;
    public final long h = maf.D((long) 0);
    public final boolean i = false;
    public int j = 13107200;
    public boolean k;

    public ec4(n64 n64, int i2, int i3, int i4, int i5) {
        a("bufferForPlaybackMs", i4, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i5, 0, "0");
        a("minBufferMs", i2, i4, "bufferForPlaybackMs");
        a("minBufferMs", i2, i5, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i3, i2, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.a = n64;
        this.b = maf.D((long) i2);
        this.c = maf.D((long) i3);
        this.d = maf.D((long) i4);
        this.e = maf.D((long) i5);
    }

    public static void a(String str, int i2, int i3, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        np8.c(sb.toString(), z);
    }

    public final void b(boolean z) {
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.j = i2;
        this.k = false;
        if (z) {
            n64 n64 = this.a;
            synchronized (n64) {
                if (n64.b) {
                    n64.c(0);
                }
            }
        }
    }
}
