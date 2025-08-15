package defpackage;

import android.app.Application;
import android.view.Surface;

/* renamed from: y4b  reason: default package */
public final class y4b implements f4b {
    public final Application a;
    public final o45 b;
    public final n65 c;
    public final je7 d;
    public final n4b e;
    public final String f = y4b.class.getName();
    public final xs g = new xs(0);

    public y4b(Application application, o45 o45, n65 n65, je7 je7, n4b n4b) {
        this.a = application;
        this.b = o45;
        this.c = n65;
        this.d = je7;
        this.e = n4b;
    }

    public final void a(dkf dkf) {
        String str = this.f;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Players pool. Free player, " + dkf, (Throwable) null);
        }
        dkf.N0();
        dkf.M0((Surface) null);
        this.g.add(dkf);
    }

    public final dkf get() {
        if (this.g.isEmpty()) {
            hm9.m(this.f, "Players pool. Pool is empty create new player", new Object[0]);
            return new dkf(this.a, this.b, this.c, this.d, this.e);
        }
        xs xsVar = this.g;
        dkf dkf = (dkf) xsVar.d(xsVar.c - 1);
        String str = this.f;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Players pool. Pool has player, " + dkf, (Throwable) null);
        }
        return dkf;
    }
}
