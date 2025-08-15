package ru.ok.messages.settings.locations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgLiveLocationSettings extends FrgBase implements x46 {
    public sj9 B1;
    public k8g C1;

    public final void H0() {
        super.H0();
        sj9 sj9 = this.B1;
        ((Set) ((xk9) ((kk9) sj9.b)).a).remove(sj9);
        sj9.o.getClass();
        cqc.b(sj9.u0);
        cqc.b(sj9.v0);
        sj9.X.f(sj9);
    }

    public final void K0() {
        super.K0();
        sj9 sj9 = this.B1;
        xk9 xk9 = (xk9) ((kk9) sj9.b);
        xk9.r(sj9);
        xk9.A(true);
        sj9.o.getClass();
        sj9.Z1();
        cqc.b(sj9.v0);
        z7d z7d = ((p7b) sj9.c).b;
        z7d.getClass();
        long q = (long) ((int) z7d.q(PmsKey.f60livelocationsendtimeout, (long) 60));
        r0a n = qy9.k(q, q, TimeUnit.SECONDS, muc.a()).n(ce.a());
        sd7 sd7 = new sd7(new rj9(sj9, 0), new jj9(1), ft.d);
        n.a(sd7);
        sj9.v0 = sd7;
        sj9.X.d(sj9);
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked", this.B1.w0);
    }

    public final String f1() {
        return "SETTINGS_LIVE_LOCATIONS";
    }

    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.C1.A();
        }
    }

    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.C1.y(i, strArr, iArr);
        }
    }

    public final void t(long j) {
        hm9.m("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "On stop now location click %d", Long.valueOf(j));
        sj9 sj9 = this.B1;
        sj9.o.getClass();
        sj9.Y.g("LIVE_LOCATION_STOP", "SETTINGS");
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        Context d0 = d0();
        if (d0 == null) {
            hm9.p("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Context is null", (Throwable) null);
            return null;
        }
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        p7b n = ((y8a) ((ed3) this.p1.b)).n();
        p82 e = ((y8a) ((ed3) this.p1.b)).e();
        cy7 r = ((y8a) ((ed3) this.p1.b)).r();
        hle q = ((y8a) ((ed3) this.p1.b)).q();
        q.getClass();
        ztc a = ((jle) q).a();
        xk9 xk9 = new xk9(d0, viewGroup, (ida) ((y8a) ((ed3) this.p1.b)).getAccessor().c(ida.class));
        ad b = ((y8a) ((ed3) this.p1.b)).b();
        this.C1 = new k8g((Object) this.q1.i(), (Object) this);
        sj9 sj9 = r0;
        sj9 sj92 = new sj9(xk9, n, e, (cn7) ((jyc) jke.b()).getAccessor().c(cn7.class), r, b, this.C1, a, this.q1.h(), this);
        this.B1 = sj9;
        if (bundle2 != null) {
            sj9.w0 = bundle2.getBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked");
        }
        ai3 h1 = h1();
        if (h1 != null) {
            h1.g(h0(jpc.p0));
        }
        xk9.c();
        View view = (View) xk9.c;
        if (view != null) {
            return view;
        }
        hm9.p("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Root view is null", (Throwable) null);
        return null;
    }
}
