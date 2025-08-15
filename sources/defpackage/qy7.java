package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: qy7  reason: default package */
public final class qy7 {
    public static final /* synthetic */ int t = 0;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final rxd d;
    public final vy7 e;
    public final ztc f;
    public final o84 g;
    public final qx7 h;
    public final c32 i;
    public final kp7 j;
    public final kp7 k;
    public final kp7 l;
    public final kp7 m;
    public iq1 n;
    public bkg o;
    public iq1 p;
    public long q;
    public iq1 r;
    public bkg s;

    public qy7(rxd rxd, vy7 vy7, ztc ztc, o84 o84, qx7 qx7, c32 c32, kp7 kp7, kp7 kp72, kp7 kp73, kp7 kp74) {
        this.d = rxd;
        this.e = vy7;
        this.f = ztc;
        this.g = o84;
        this.h = qx7;
        this.i = c32;
        this.j = kp7;
        this.k = kp72;
        this.l = kp73;
        this.m = kp74;
    }

    public final void a() {
        bkg bkg = this.s;
        if (bkg != null) {
            v13 v13 = (v13) bkg.b;
            v13.getClass();
            try {
                fjg fjg = (fjg) v13.a;
                fjg.H0(fjg.G0(), 1);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b() {
        c();
        bkg bkg = this.o;
        if (bkg != null) {
            h5b h5b = (h5b) bkg.b;
            h5b.getClass();
            try {
                ofg ofg = (ofg) h5b.a;
                ofg.H0(ofg.G0(), 1);
                this.o = null;
                this.q = 0;
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void c() {
        cqc.b(this.p);
        cqc.b(this.r);
        LinkedHashMap linkedHashMap = this.b;
        for (xi0 xi0 : linkedHashMap.values()) {
            xi0.a.F();
        }
        linkedHashMap.clear();
    }

    public final void d(double d2, double d3, Float f2, Float f3, Float f4) {
        LatLng latLng = new LatLng(d2, d3);
        kx1 kx1 = ((lx1) this.k.b()).a;
        kx1.c = latLng;
        kx1.a = f2.floatValue();
        kx1.b = f3.floatValue();
        float floatValue = f4.floatValue();
        kx1.getClass();
        CameraPosition cameraPosition = new CameraPosition((LatLng) kx1.c, kx1.a, kx1.b, floatValue);
        this.g.getClass();
        try {
            sfg sfg = mr0.m;
            fp3.o(sfg, "CameraUpdateFactory is not initialized");
            Parcel G0 = sfg.G0();
            agg.b(G0, cameraPosition);
            Parcel R = sfg.R(G0, 7);
            xr6 K0 = oy9.K0(R.readStrongBinder());
            R.recycle();
            e(new bkg(6, new y8(K0)), false);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void e(bkg bkg, boolean z) {
        y8 y8Var = (y8) bkg.b;
        rxd rxd = this.d;
        if (z) {
            rxd.getClass();
            y7g y7g = (y7g) rxd.b;
            y7g.getClass();
            try {
                fp3.o(y8Var, "CameraUpdate must not be null.");
                eig eig = (eig) y7g.b;
                Parcel G0 = eig.G0();
                agg.c(G0, (xr6) y8Var.a);
                G0.writeInt(800);
                G0.writeStrongBinder((IBinder) null);
                eig.H0(G0, 7);
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            rxd.getClass();
            y7g y7g2 = (y7g) rxd.b;
            y7g2.getClass();
            try {
                fp3.o(y8Var, "CameraUpdate must not be null.");
                eig eig2 = (eig) y7g2.b;
                Parcel G02 = eig2.G0();
                agg.c(G02, (xr6) y8Var.a);
                eig2.H0(G02, 4);
            } catch (RemoteException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void f(int i2) {
        int i3;
        rxd rxd = this.d;
        rxd.getClass();
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                int i4 = 2;
                if (i2 != 2) {
                    i4 = 3;
                    if (i2 != 3) {
                        i4 = 4;
                        if (i2 != 4) {
                            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unknown tam map type = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                        }
                    }
                }
                i3 = i4;
            }
        } else {
            i3 = 0;
        }
        y7g y7g = (y7g) rxd.b;
        y7g.getClass();
        try {
            eig eig = (eig) y7g.b;
            Parcel G0 = eig.G0();
            G0.writeInt(i3);
            eig.H0(G0, 16);
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void g(Context context, boolean z) {
        boolean z2 = false;
        rxd rxd = this.d;
        if (!z) {
            rxd.e0(false);
            return;
        }
        int c2 = z7.c(context, "android.permission.ACCESS_FINE_LOCATION");
        int c3 = z7.c(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (c2 == 0 && c3 == 0) {
            z2 = true;
        }
        rxd.e0(z2);
    }
}
