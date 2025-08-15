package defpackage;

import java.util.Set;

/* renamed from: ge2  reason: default package */
public final class ge2 {
    public final pk a;
    public final p82 b;
    public final au8 c;
    public final m7b d;
    public final gh3 e;
    public final zu8 f;

    public ge2(pk pkVar, p82 p82, au8 au8, m7b m7b, gh3 gh3, zu8 zu8) {
        this.a = pkVar;
        this.b = p82;
        this.c = au8;
        this.d = m7b;
        this.e = gh3;
        this.f = zu8;
    }

    public final long a(e52 e52, cu8 cu8, boolean z, Set set) {
        int i;
        ge2 ge2;
        e52 e522 = e52;
        cu8 cu82 = cu8;
        long j = e522.b.a;
        long j2 = cu82 != null ? cu82.b : 0;
        long j3 = cu82 != null ? cu82.c : 0;
        int i2 = z ? 100 : 0;
        if (z) {
            ge2 = this;
            i = 0;
        } else {
            i = 100;
            ge2 = this;
        }
        k4a k4a = (k4a) ge2.a;
        long j4 = e522.a;
        if (!k4a.o(j4)) {
            return 0;
        }
        return k4a.v(k4a, new rd2(((p7b) k4a.y()).a.o(), j4, j, j2, j3, i2, i, set));
    }

    public final boolean b(boolean z) {
        int i = ((p7b) this.d).c.g.getInt("app.media.load.gif", 0);
        return z ? c(i) : i != -1;
    }

    public final boolean c(int i) {
        gh3 gh3 = this.e;
        boolean g = gh3.g();
        zh3 b2 = gh3.b();
        if (i != -1) {
            return i != 0 ? b2 == zh3.c : b2 == zh3.c || ((p7b) this.d).c.n() || !g;
        }
        return false;
    }

    public final boolean d() {
        return c(((p7b) this.d).c.g.getInt("app.media.load.photo", 0));
    }

    public final boolean e(boolean z) {
        int i = ((p7b) this.d).c.g.getInt("app.media.load.stickers", 0);
        return z ? c(i) : i != -1;
    }
}
