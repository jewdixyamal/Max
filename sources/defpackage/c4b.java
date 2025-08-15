package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.ParserException;

/* renamed from: c4b  reason: default package */
public final class c4b implements xze {
    public final drc a;
    public final imc b = new imc(19);
    public final j99 c = new o54(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ e4b e;

    /* JADX WARNING: type inference failed for: r2v3, types: [j99, o54] */
    public c4b(e4b e4b, n64 n64) {
        this.e = e4b;
        this.a = new drc(n64, (sr4) null, (kr4) null);
    }

    public final int a(l24 l24, int i, boolean z) {
        return this.a.e(l24, i, z);
    }

    public final void b(long j, int i, int i2, int i3, vze vze) {
        long g;
        long j2;
        this.a.b(j, i, i2, i3, vze);
        while (this.a.t(false)) {
            j99 j99 = this.c;
            j99.v();
            if (this.a.y(this.b, j99, 0, false) == -4) {
                j99.y();
            } else {
                j99 = null;
            }
            if (j99 != null) {
                long j3 = j99.Y;
                e99 v = ((wo) this.e.t0).v(j99);
                if (v != null) {
                    c45 c45 = (c45) v.a[0];
                    String str = c45.a;
                    String str2 = c45.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = maf.G(maf.n(c45.X));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            a4b a4b = new a4b(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, a4b));
                        }
                    }
                }
            }
        }
        drc drc = this.a;
        xqc xqc = drc.a;
        synchronized (drc) {
            int i4 = drc.s;
            g = i4 == 0 ? -1 : drc.g(i4);
        }
        xqc.c(g);
    }

    public final void c(int i, yaf yaf) {
        this.a.f(i, yaf);
    }

    public final void d(oy5 oy5) {
        this.a.d(oy5);
    }
}
