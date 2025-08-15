package defpackage;

/* renamed from: lv4  reason: default package */
public final class lv4 {
    public final tb8 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final vv4 g;

    public lv4(tb8 tb8, boolean z, boolean z2, boolean z3, long j, int i, vv4 vv4) {
        fm9.j("Audio and video cannot both be removed", !z || !z2);
        this.a = tb8;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = i;
        this.g = vv4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kv4, java.lang.Object] */
    public final kv4 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final long b(long j) {
        long j2;
        boolean z = this.b;
        vv4 vv4 = this.g;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            ls5 l = vv4.a.listIterator(0);
            j2 = j;
            while (l.hasNext()) {
                j2 = ((m60) l.next()).f(j2);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            ls5 l2 = vv4.b.listIterator(0);
            while (l2.hasNext()) {
                ((z18) l2.next()).getClass();
            }
        }
        return Math.max(j2, j);
    }
}
