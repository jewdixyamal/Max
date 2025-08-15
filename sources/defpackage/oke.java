package defpackage;

import java.io.File;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: oke  reason: default package */
public final class oke implements fh3 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public iq1 s0;
    public sd7 t0;
    public wd6 u0;
    public int v0;
    public long w0;

    public oke(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.o = je74;
        this.X = je75;
        this.Y = je76;
        this.Z = je77;
    }

    public final void a() {
    }

    public final void b() {
        if (((gh3) this.Z.getValue()).b() != zh3.c) {
            cqc.b(this.t0);
            wd6 wd6 = this.u0;
            if (wd6 != null) {
                int i = this.v0;
                hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
                ((LoadEmojiFontWorker) wd6.b).state = new sn7(i);
                return;
            }
            return;
        }
        c(this.u0);
    }

    public final void c(wd6 wd6) {
        hm9.m("oke", "Load font", new Object[0]);
        this.u0 = wd6;
        if (!cqc.c(this.s0)) {
            hm9.m("oke", "Font already loading", new Object[0]);
            return;
        }
        q1a q1a = new q1a(2, new l5(15, this));
        hle hle = (hle) this.X.getValue();
        hle.getClass();
        drd i = q1a.m(((jle) hle).a()).i(muc.d);
        iq1 iq1 = new iq1(new mke(this, wd6, 0), 2, new mke(this, wd6, 1));
        i.k(iq1);
        this.s0 = iq1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [a8g, uw4, java.lang.Object] */
    public final void d(File file, wd6 wd6) {
        hm9.m("oke", "Tam emoji font loaded", new Object[0]);
        je7 je7 = this.X;
        je7 je72 = this.Y;
        ? obj = new Object();
        obj.a = file;
        obj.b = je7;
        obj.c = je72;
        mx5 mx5 = new mx5(obj);
        if (wd6 != null) {
            hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontSuccess %s", mx5);
            ((LoadEmojiFontWorker) wd6.b).state = new tn7(mx5);
        }
        ((gh3) this.Z.getValue()).e(this);
        this.u0 = null;
    }
}
