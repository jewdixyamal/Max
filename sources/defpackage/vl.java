package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: vl  reason: default package */
public final class vl extends ContextWrapper implements ug, ase {
    public static vl o;
    public final Application a;
    public final je7 b;
    public final je7 c;

    public vl(Application application, je7 je7, khe khe, x6a x6a) {
        super(application);
        nd7.h = x6a;
        this.b = je7;
        this.a = application;
        this.c = khe;
        o = this;
    }

    public static ed3 b() {
        return (ed3) o.c.getValue();
    }

    public final p7b a() {
        return (p7b) this.b.getValue();
    }

    public final Context getBaseContext() {
        return this.a.getBaseContext();
    }

    public final sme u() {
        return ((tme) ((y8a) b()).getAccessor().c(tme.class)).c();
    }
}
