package defpackage;

import android.media.AudioManager;

/* renamed from: lkc  reason: default package */
public final class lkc {
    public final khe a = new khe(new hbc(5));
    public final khe b;
    public kkc c;

    public lkc(je7 je7, je7 je72) {
        this.b = new khe(new a81(je7, this, je72, 9));
    }

    public final xh1 a() {
        return (xh1) this.b.getValue();
    }

    public final void b() {
        this.c = kkc.END;
        xh1 a2 = a();
        if (((AudioManager) a2.d.getValue()).getRingerMode() == 2) {
            a2.a(a2.b.a, false);
        }
    }

    public final void c() {
        kkc kkc = this.c;
        if (kkc == kkc.END || kkc == kkc.BUSY) {
            this.c = null;
            return;
        }
        this.c = null;
        a().c();
    }
}
