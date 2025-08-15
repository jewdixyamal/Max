package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.a;

/* renamed from: x16  reason: default package */
public final class x16 implements pi6, isc, ynf {
    public gh7 X = null;
    public td Y = null;
    public final a a;
    public final xnf b;
    public final Runnable c;
    public vnf o;

    public x16(a aVar, xnf xnf, dd4 dd4) {
        this.a = aVar;
        this.b = xnf;
        this.c = dd4;
    }

    public final gh7 Q() {
        b();
        return this.X;
    }

    public final void a(eg7 eg7) {
        this.X.d(eg7);
    }

    public final void b() {
        if (this.X == null) {
            this.X = new gh7(this);
            td tdVar = new td((isc) this);
            this.Y = tdVar;
            tdVar.s();
            this.c.run();
        }
    }

    public final vnf o() {
        Application application;
        a aVar = this.a;
        vnf o2 = aVar.o();
        if (!o2.equals(aVar.g1)) {
            this.o = o2;
            return o2;
        }
        if (this.o == null) {
            Context applicationContext = aVar.U0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.o = new jsc(application, aVar, aVar.Z);
        }
        return this.o;
    }

    public final wh9 p() {
        Application application;
        a aVar = this.a;
        Context applicationContext = aVar.U0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        wh9 wh9 = new wh9(0);
        if (application != null) {
            wh9.a(unf.d, application);
        }
        wh9.a(z7.e, aVar);
        wh9.a(z7.f, this);
        Bundle bundle = aVar.Z;
        if (bundle != null) {
            wh9.a(z7.g, bundle);
        }
        return wh9;
    }

    public final xnf w() {
        b();
        return this.b;
    }

    public final mm y() {
        b();
        return (mm) this.Y.o;
    }
}
