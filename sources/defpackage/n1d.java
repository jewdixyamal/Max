package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: n1d  reason: default package */
public final class n1d {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e = tu0.r(3, new hbc(14));

    public n1d(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final ida a() {
        return (ida) this.a.getValue();
    }

    public final void b(kl7 kl7, uj3 uj3, e52 e52) {
        xib xib;
        qyc qyc = (qyc) ((y7d) this.d.getValue());
        qyc.getClass();
        if (qyc.n(PmsKey.f29debugprofileinfo, false) || ((t33) ((q33) this.c.getValue())).g.getBoolean("app.debug.profile.info.enabled", false)) {
            if (uj3 == null) {
                uj3 = e52 != null ? e52.l() : null;
            }
            if (uj3 != null) {
                xib = new xib(uj3.n());
            } else if (e52 != null) {
                xib = new xib(e52.b.a);
            } else {
                return;
            }
            kl7.add(xib);
        }
    }
}
