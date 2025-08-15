package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* renamed from: uh3  reason: default package */
public final class uh3 {
    public static final String l = Integer.toString(0, 36);
    public static final String m = Integer.toString(1, 36);
    public static final String n = Integer.toString(2, 36);
    public static final String o = Integer.toString(9, 36);
    public static final String p = Integer.toString(3, 36);
    public static final String q = Integer.toString(4, 36);
    public static final String r = Integer.toString(5, 36);
    public static final String s = Integer.toString(6, 36);
    public static final String t = Integer.toString(11, 36);
    public static final String u = Integer.toString(7, 36);
    public static final String v = Integer.toString(8, 36);
    public static final String w = Integer.toString(10, 36);
    public final int a;
    public final int b;
    public final qr6 c;
    public final PendingIntent d;
    public final z9d e;
    public final k3b f;
    public final k3b g;
    public final Bundle h;
    public final Bundle i;
    public final m4b j;
    public final zw6 k;

    static {
        int i2 = oaf.a;
    }

    public uh3(int i2, int i3, qr6 qr6, PendingIntent pendingIntent, zw6 zw6, z9d z9d, k3b k3b, k3b k3b2, Bundle bundle, Bundle bundle2, m4b m4b) {
        this.a = i2;
        this.b = i3;
        this.c = qr6;
        this.d = pendingIntent;
        this.k = zw6;
        this.e = z9d;
        this.f = k3b;
        this.g = k3b2;
        this.h = bundle;
        this.i = bundle2;
        this.j = m4b;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [or6, java.lang.Object] */
    public static uh3 a(Bundle bundle) {
        ffc ffc;
        qr6 qr6;
        IBinder binder = bundle.getBinder(w);
        if (binder instanceof th3) {
            return ((th3) binder).c;
        }
        int i2 = bundle.getInt(l, 0);
        int i3 = bundle.getInt(v, 0);
        IBinder binder2 = bundle.getBinder(m);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o);
        if (parcelableArrayList != null) {
            ww6 i4 = zw6.i();
            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i5);
                bundle2.getClass();
                i4.a(c73.b(i3, bundle2));
            }
            ffc = i4.j();
        } else {
            ls5 ls5 = zw6.b;
            ffc = ffc.X;
        }
        ffc ffc2 = ffc;
        Bundle bundle3 = bundle.getBundle(p);
        z9d b2 = bundle3 == null ? z9d.b : z9d.b(bundle3);
        Bundle bundle4 = bundle.getBundle(r);
        k3b c2 = bundle4 == null ? k3b.b : k3b.c(bundle4);
        Bundle bundle5 = bundle.getBundle(q);
        k3b c3 = bundle5 == null ? k3b.b : k3b.c(bundle5);
        Bundle bundle6 = bundle.getBundle(s);
        Bundle bundle7 = bundle.getBundle(t);
        Bundle bundle8 = bundle.getBundle(u);
        m4b r2 = bundle8 == null ? m4b.F : m4b.r(i3, bundle8);
        int i6 = sj8.i;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof qr6)) {
            ? obj = new Object();
            obj.c = iBinder;
            qr6 = obj;
        } else {
            qr6 = (qr6) queryLocalInterface;
        }
        return new uh3(i2, i3, qr6, pendingIntent, ffc2, b2, c3, c2, bundle6 == null ? Bundle.EMPTY : bundle6, bundle7 == null ? Bundle.EMPTY : bundle7, r2);
    }

    public final Bundle b(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.a);
        bundle.putBinder(m, this.c.asBinder());
        bundle.putParcelable(n, this.d);
        zw6 zw6 = this.k;
        if (!zw6.isEmpty()) {
            bundle.putParcelableArrayList(o, nu0.R(zw6, new un0(24)));
        }
        z9d z9d = this.e;
        z9d.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        m5f g2 = z9d.a.iterator();
        while (g2.hasNext()) {
            arrayList.add(((y9d) g2.next()).b());
        }
        bundle2.putParcelableArrayList(z9d.c, arrayList);
        bundle.putBundle(p, bundle2);
        k3b k3b = this.f;
        bundle.putBundle(q, k3b.f());
        k3b k3b2 = this.g;
        bundle.putBundle(r, k3b2.f());
        bundle.putBundle(s, this.h);
        bundle.putBundle(t, this.i);
        bundle.putBundle(u, this.j.q(j47.R(k3b, k3b2), false, false).t(i2));
        bundle.putInt(v, this.b);
        return bundle;
    }
}
