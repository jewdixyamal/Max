package defpackage;

import android.app.Application;
import android.view.Surface;

/* renamed from: jrd  reason: default package */
public final class jrd implements f4b {
    public final Application a;
    public final o45 b;
    public final n65 c;
    public final je7 d;
    public final n4b e;
    public final String f = jrd.class.getName();
    public final fic g = new fic(new lwa(28, this));

    public jrd(Application application, o45 o45, n65 n65, je7 je7, n4b n4b) {
        this.a = application;
        this.b = o45;
        this.c = n65;
        this.d = je7;
        this.e = n4b;
    }

    public final void a(dkf dkf) {
        hm9.m(this.f, "Single player handler. Free player", new Object[0]);
        dkf.N0();
        dkf.M0((Surface) null);
    }

    public final dkf get() {
        String str = this.f;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("Single player handler. Player exist: ", this.g.a()), (Throwable) null);
        }
        return (dkf) this.g.getValue();
    }
}
