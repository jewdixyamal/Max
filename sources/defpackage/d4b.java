package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;

/* renamed from: d4b  reason: default package */
public final class d4b implements yze {
    public final erc a;
    public final y7g b = new y7g(18);
    public final k99 c = new p54(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ e4b e;

    /* JADX WARNING: type inference failed for: r2v3, types: [k99, p54] */
    public d4b(e4b e4b, n64 n64) {
        this.e = e4b;
        this.a = new erc(n64, (tr4) null, (lr4) null);
    }

    public final void a(long j, int i, int i2, int i3, wze wze) {
        long f;
        long j2;
        this.a.a(j, i, i2, i3, wze);
        while (this.a.s(false)) {
            k99 k99 = this.c;
            k99.v();
            if (this.a.x(this.b, k99, 0, false) == -4) {
                k99.y();
            } else {
                k99 = null;
            }
            if (k99 != null) {
                long j3 = k99.Z;
                f99 m = ((xo) this.e.t0).m(k99);
                if (m != null) {
                    d45 d45 = (d45) m.a[0];
                    String str = d45.a;
                    String str2 = d45.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = oaf.V(oaf.q(d45.X));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            b4b b4b = new b4b(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, b4b));
                        }
                    }
                }
            }
        }
        erc erc = this.a;
        xqc xqc = erc.a;
        synchronized (erc) {
            int i4 = erc.s;
            f = i4 == 0 ? -1 : erc.f(i4);
        }
        xqc.c(f);
    }

    public final void b(wpa wpa, int i, int i2) {
        this.a.b(wpa, i, 0);
    }

    public final int c(m24 m24, int i, boolean z) {
        return this.a.c(m24, i, z);
    }

    public final void e(qy5 qy5) {
        this.a.e(qy5);
    }
}
