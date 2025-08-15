package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: e7d  reason: default package */
public final class e7d implements pi4 {
    public final jqe a;
    public final PmsKey b;
    public final boolean c;
    public final int d;
    public final je7 e;
    public final je7 f;
    public final long g;
    public final q0e h;
    public final w7c i;

    public e7d(iqe iqe, PmsKey pmsKey, boolean z, int i2) {
        this.a = iqe;
        this.b = pmsKey;
        this.c = z;
        this.d = i2;
        aj4 aj4 = aj4.a;
        this.e = aj4.getAccessor().d(oyc.class);
        this.f = aj4.getAccessor().d(qyc.class);
        this.g = ei4.b.incrementAndGet();
        q0e a2 = r0e.a(e());
        this.h = a2;
        this.i = new w7c(a2);
    }

    public final j0e c() {
        return this.i;
    }

    public final void d(b54 b54) {
        if (ei4.a(b54.a, this.g)) {
            je7 je7 = this.e;
            boolean z = this.c;
            PmsKey pmsKey = this.b;
            boolean n = ((oyc) je7.getValue()).n(pmsKey, z);
            oyc oyc = (oyc) je7.getValue();
            oyc.getClass();
            oyc.j(pmsKey.name(), !n);
            this.h.m((Object) null, e());
        }
    }

    public final List e() {
        PmsKey pmsKey = this.b;
        boolean z = this.c;
        a54 a54 = new a54(((oyc) this.e.getValue()).n(pmsKey, z));
        iqe iqe = new iqe(ey8.j("Server: ", ((qyc) this.f.getValue()).g.getBoolean(pmsKey.name(), z)));
        return Collections.singletonList(new b54(this.g, this.a, this.d, iqe, a54));
    }

    public e7d(PmsKey pmsKey) {
        this(new iqe(pmsKey.name()), pmsKey, false, 0);
    }

    public e7d(String str, PmsKey pmsKey, boolean z) {
        this(new iqe(str), pmsKey, z, 0);
    }
}
