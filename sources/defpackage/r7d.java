package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: r7d  reason: default package */
public final class r7d implements pi4 {
    public final PmsKey a;
    public final int b = 0;
    public final String[] c;
    public final iqe d;
    public final je7 e;
    public final je7 f;
    public final long g;
    public final q0e h;
    public final w7c i;

    public r7d(PmsKey pmsKey, String[] strArr) {
        this.a = pmsKey;
        this.c = strArr;
        this.d = new iqe(pmsKey.name());
        aj4 aj4 = aj4.a;
        this.e = aj4.getAccessor().d(oyc.class);
        this.f = aj4.getAccessor().d(qyc.class);
        this.g = ei4.b.incrementAndGet();
        q0e a2 = r0e.a(e());
        this.h = a2;
        this.i = new w7c(a2);
    }

    public final void a(b54 b54, Long l) {
        if (ei4.a(b54.a, this.g)) {
            ((oyc) this.e.getValue()).l(this.a.name(), l);
            this.h.m((Object) null, e());
        }
    }

    public final j0e c() {
        return this.i;
    }

    public final List e() {
        z44 z44 = z44.e;
        iqe iqe = new iqe(ey8.h(((qyc) this.f.getValue()).g.getLong(this.a.name(), 0), "Server="));
        return Collections.singletonList(new b54(this.g, this.d, this.b, iqe, z44));
    }
}
