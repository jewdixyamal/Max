package defpackage;

import android.view.MenuItem;
import com.google.android.gms.location.LocationAvailability;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: u5e  reason: default package */
public final class u5e implements w2e, a76, kwe, im7 {
    public Object a;

    public /* synthetic */ u5e(Object obj) {
        this.a = obj;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void b(boolean z) {
        py0 py0 = (py0) this.a;
        a4c a4c = py0.V0;
        a4c.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        py0.s0.post(new u60((Object) this, z, 14));
    }

    public void d(Throwable th) {
        ihe ihe;
        ihe ihe2 = (ihe) this.a;
        jhe jhe = (jhe) ihe2;
        synchronized (jhe.a) {
            try {
                List<xf4> list = jhe.j;
                if (list != null) {
                    for (xf4 b : list) {
                        b.b();
                    }
                    jhe.j = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        jhe.t.d();
        q40 q40 = ihe2.b;
        Iterator it = q40.h().iterator();
        while (it.hasNext() && (ihe = (ihe) it.next()) != ihe2) {
            jhe jhe2 = (jhe) ihe;
            synchronized (jhe2.a) {
                try {
                    List<xf4> list2 = jhe2.j;
                    if (list2 != null) {
                        for (xf4 b2 : list2) {
                            b2.b();
                        }
                        jhe2.j = null;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            jhe2.t.d();
        }
        synchronized (q40.b) {
            ((LinkedHashSet) q40.X).remove(ihe2);
        }
    }

    public void f(Object obj) {
        le6 le6 = (le6) obj;
        le6.getClass();
        boolean z = ((LocationAvailability) this.a).o < 1000;
        le6.a.getClass();
        hm9.m("ak6", "onLocationAvailability: %s", Boolean.valueOf(z));
    }

    public void g(z2e z2e) {
        ((t5e) this.a).g(z2e);
    }

    public void k(z2e z2e) {
        ((t5e) this.a).k(z2e);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((mwe) this.a).X.onMenuItemSelected(0, menuItem);
    }
}
