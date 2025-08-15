package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.Objects;

/* renamed from: hd0  reason: default package */
public final /* synthetic */ class hd0 implements qj3, wu, km7, jm7, fa8, id6, u4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hd0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public void a(jd6 jd6, hd6 hd6, long j) {
        m1f m1f = (m1f) this.c;
        int i = this.b;
        m1f.getClass();
        d54.a();
        kf4 kf4 = m1f.A0;
        kf4.getClass();
        i63 i63 = m1f.b;
        synchronized (kf4) {
            try {
                fm9.k(oaf.l(kf4.g, i));
                jf4 jf4 = (jf4) kf4.g.get(i);
                fm9.k(!jf4.b);
                i63 i632 = i63.h;
                if (kf4.l == null) {
                    kf4.l = i63;
                }
                fm9.j("Mixing different ColorInfos is not supported.", kf4.l.equals(i63));
                kf4.d.getClass();
                Float valueOf = Float.valueOf(1.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                jf4.a.add(new if4(jd6, hd6, j, new k8g((Object) Pair.create(valueOf2, valueOf2), (Object) Pair.create(valueOf2, valueOf2), (Object) Pair.create(valueOf, valueOf))));
                if (i == kf4.o) {
                    kf4.d();
                } else {
                    kf4.e(jf4);
                }
                kf4.f.v(new ff4(kf4, 2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                int i = this.b;
                drawable.setBounds(0, 0, i, i);
                drawable.draw((Canvas) this.c);
                return;
            case 1:
                xy7 xy7 = (xy7) obj;
                qy7 qy7 = (qy7) this.c;
                qy7.c.put(Integer.valueOf(this.b), xy7);
                y7g y7g = (y7g) qy7.d.b;
                if (xy7 == null) {
                    y7g.G((wy7) null);
                    return;
                } else {
                    y7g.G(xy7.a);
                    return;
                }
            default:
                u82 u82 = (u82) obj;
                ((p82) this.c).getClass();
                int i2 = this.b;
                u82.m = i2;
                if (i2 == 0) {
                    u82.N = false;
                    u82.O = false;
                    return;
                }
                return;
        }
    }

    public bm7 apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        su1 su1 = (su1) this.c;
        su1.getClass();
        if (u40.g(this.b, totalCaptureResult)) {
            su1.g = su1.k;
        }
        return su1.i.a(totalCaptureResult);
    }

    public boolean b(View view) {
        int i = SideSheetBehavior.x;
        ((SideSheetBehavior) this.c).x(this.b);
        return true;
    }

    public void c(w98 w98) {
        if (w98.isConnected()) {
            ffc ffc = w98.p;
            List list = (List) this.c;
            w98.o = zw6.j(list);
            ffc a2 = c73.a(list, w98.q, w98.t);
            w98.p = a2;
            boolean equals = Objects.equals(a2, ffc);
            boolean z = true;
            boolean z2 = !equals;
            a98 a98 = w98.a;
            a98.getClass();
            if (Looper.myLooper() != a98.X.getLooper()) {
                z = false;
            }
            fm9.k(z);
            y88 y88 = a98.o;
            y88.getClass();
            ew6 r = y88.r();
            if (z2) {
                y88.g();
            }
            w98.c1(this.b, r);
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((n3b) obj).f0(((a3b) this.c).a, this.b);
                return;
            case 5:
                ((m3b) obj).A((rb8) this.c, this.b);
                return;
            default:
                ((n3b) obj).G(this.b, (tb8) this.c);
                return;
        }
    }

    public /* synthetic */ hd0(int i, ffc ffc) {
        this.a = 7;
        this.b = i;
        this.c = ffc;
    }
}
