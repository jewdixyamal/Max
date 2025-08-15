package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.fragment.app.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: moa  reason: default package */
public final class moa implements poa {
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public final Object o;
    public Object s0;

    public moa(rx0 rx0, ey3 ey3) {
        rx0 rx02 = rx0;
        this.a = rx02;
        this.b = ey3;
        this.c = new kw4(rx02.c, rx02.d, 1.0d);
        this.o = new kw4(rx02.f, rx02.g, 0.0d);
        this.X = new kw4(rx02.k, 0.0d, 2);
        this.Y = new kw4(rx02.j, 0.0d, 2);
        this.Z = new kw4(rx02.w, rx02.x, 4);
        this.s0 = new kw4(rx02.y, rx02.z, 4);
    }

    public double a(double d, double d2, double d3, boolean z) {
        double d4;
        kw4 kw4 = (kw4) this.o;
        kw4.a(d);
        kw4 kw42 = (kw4) this.s0;
        m56 m56 = (m56) this.b;
        kw4 kw43 = (kw4) this.X;
        kw4 kw44 = (kw4) this.Y;
        kw4 kw45 = (kw4) this.Z;
        if (z) {
            kw45.a(d3);
            m56.invoke("EMAs: rtt=" + kw4.d + " bitrateE=" + kw45.d + " bitrateR=" + kw42.d);
        } else {
            kw44.a(d2);
            kw43.a(d2);
            m56.invoke("EMAs: rtt=" + kw4.d + " lossFast=" + kw44.d + " lossSlow=" + kw43.d);
        }
        double d5 = kw4.d;
        rx0 rx0 = (rx0) this.a;
        double d6 = rx0.n;
        double d7 = 0.0d;
        int i = 0;
        double d8 = 1.0d;
        if (d6 <= 0.0d || d5 <= d6) {
            int F = tu0.F((d5 - rx0.e) / rx0.h);
            if (F < 0) {
                F = 0;
            }
            d4 = Math.pow(1.0d - rx0.i, (double) F);
        } else {
            d4 = 0.0d;
        }
        if (!z) {
            double d9 = kw43.d;
            double d10 = kw44.d;
            double d11 = rx0.o;
            if (d11 <= 0.0d || d10 <= d11) {
                double d12 = rx0.p;
                if (d12 <= 0.0d || d9 <= d12) {
                    if (rx0.q) {
                        int F2 = tu0.F((d9 - rx0.r) / rx0.s);
                        if (F2 >= 0) {
                            i = F2;
                        }
                        d7 = Math.pow(1.0d - rx0.t, (double) i);
                    } else if (d10 > 0.0d) {
                        d8 = (1.0d - (d10 * rx0.l)) - (d9 * rx0.m);
                    }
                }
            }
            return d4 * d7;
        } else if (rx0.u) {
            double d13 = kw42.d;
            double d14 = kw45.d;
            if (!Double.isInfinite(d13) && !Double.isNaN(d13) && !Double.isInfinite(d14) && !Double.isNaN(d14)) {
                double min = 1.0d - ((1.0d - (Math.min(d14, d13) / Math.max(d14, d13))) * rx0.v);
                if (min <= 1.0d) {
                    d8 = min;
                }
            }
        }
        d7 = d8;
        return d4 * d7;
    }

    public void b(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((neg) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    public void c(double d) {
        ((kw4) this.s0).a(d);
    }

    public void d(Bundle bundle, neg neg) {
        if (((b9b) this.a) != null) {
            neg.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(neg);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.Y = (xje) this.o;
        e();
    }

    public void e() {
        Activity activity = (Activity) this.Z;
        if (activity != null && ((xje) this.Y) != null && ((b9b) this.a) == null) {
            try {
                int i = lz7.g;
                synchronized (lz7.class) {
                    lz7.p(activity);
                }
                yig J0 = dy7.N((Activity) this.Z).J0(new oy9((Activity) this.Z));
                if (J0 != null) {
                    ((xje) this.Y).c(new b9b((a) this.X, J0));
                    ArrayList arrayList = (ArrayList) this.s0;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b9b) this.a).m((rde) it.next());
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public void reset() {
        kw4 kw4 = (kw4) this.c;
        kw4.d = kw4.c;
        kw4 kw42 = (kw4) this.o;
        kw42.d = kw42.c;
        kw4 kw43 = (kw4) this.X;
        kw43.d = kw43.c;
        kw4 kw44 = (kw4) this.Y;
        kw44.d = kw44.c;
        kw4 kw45 = (kw4) this.Z;
        kw45.d = kw45.c;
        kw4 kw46 = (kw4) this.s0;
        kw46.d = kw46.c;
    }

    public moa(a aVar) {
        this.o = new xje(5, (Object) this);
        this.s0 = new ArrayList();
        this.X = aVar;
    }

    public moa(Context context) {
        this.a = context;
        this.b = tu0.r(3, new x81(this, 0));
        this.c = tu0.r(3, new x81(this, 1));
        this.o = tu0.r(3, new x81(this, 2));
        this.X = tu0.r(3, new x81(this, 3));
        this.Y = tu0.r(3, new x81(this, 4));
        this.Z = tu0.r(3, new x81(this, 5));
        this.s0 = tu0.r(3, new x81(this, 6));
    }

    public moa(j92 j92, kke kke, ede ede, ns3 ns3) {
        this.a = j92;
        this.b = kke;
        this.c = ede;
        this.o = ns3;
    }
}
