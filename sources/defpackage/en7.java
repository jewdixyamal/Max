package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: en7  reason: default package */
public final class en7 implements gn7 {
    public final Context b;
    public final bea c;
    public final tda d;
    public final p84 e;
    public final wke f;

    public en7(Context context, bea bea, tda tda, p84 p84, wke wke) {
        this.b = context;
        this.c = bea;
        this.d = tda;
        this.e = p84;
        this.f = wke;
    }

    public final Notification a(long j, PendingIntent pendingIntent) {
        String str;
        this.c.c();
        bea bea = this.c;
        this.e.getClass();
        bu9 h = bea.h("ru.oneme.app.liveLocation", true, true);
        h.e = bu9.c(this.b.getString(c2c.tt_live_location));
        wke wke = this.f;
        p82 p82 = (p82) wke.b.getValue();
        if (p82 == null) {
            str = "";
        } else {
            e52 C = p82.C(j);
            if (C.M()) {
                Context context = wke.a;
                int i = dpc.q;
                C.k0();
                str = context.getString(i, new Object[]{C.u0});
            } else {
                Context context2 = wke.a;
                int i2 = dpc.p;
                C.k0();
                str = context2.getString(i2, new Object[]{C.u0});
            }
        }
        h.f = bu9.c(str);
        h.k = 0;
        this.d.getClass();
        h.F.icon = gpc.n0;
        h.g(0);
        h.p((Uri) null);
        h.i(16, false);
        h.b.add(new nt9(0, this.b.getString(c2c.tt_worker_cancel), pendingIntent));
        this.c.getClass();
        h.g = oag.p(this.b, 10, (Intent) null);
        h.v = "service";
        return h.b();
    }
}
