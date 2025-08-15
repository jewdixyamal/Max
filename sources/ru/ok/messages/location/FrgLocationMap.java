package ru.ok.messages.location;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgLocationMap extends FrgBase implements x46, w46 {
    public y16 B1;
    public fk9 C1;
    public k8g D1;
    public rke E1;
    public cn7 F1;
    public ir7 G1;
    public long H1;
    public int I1;
    public boolean J1;

    public final void H0() {
        super.H0();
        fk9 fk9 = this.C1;
        if (fk9 != null) {
            fk9.Y.c(fk9);
            ((el9) ((kk9) fk9.b)).getClass();
            cqc.b(fk9.I0);
        }
    }

    public final void K0() {
        super.K0();
        ((y8a) ((ed3) this.p1.b)).m().f(this.J1 ? wuc.CHAT_SHARE_LOCATION : wuc.CHAT_LOCATION_VIEWER, spa.f);
        fk9 fk9 = this.C1;
        if (fk9 != null) {
            fk9.Y.b(fk9);
            fk9.c2();
            ((el9) ((kk9) fk9.b)).getClass();
            xpb xpb = fk9.G0;
            if (xpb != null && fk9.C0.c == 1) {
                xpb.e(Boolean.TRUE);
            }
            cqc.b(fk9.I0);
            z7d z7d = ((p7b) fk9.A0).b;
            z7d.getClass();
            long q = (long) ((int) z7d.q(PmsKey.f60livelocationsendtimeout, (long) 60));
            r0a n = qy9.k(q, q, TimeUnit.SECONDS, muc.a()).n(ce.a());
            sd7 sd7 = new sd7(new ck9(fk9, 6), new jj9(10), ft.d);
            n.a(sd7);
            fk9.I0 = sd7;
        }
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        fk9 fk9 = this.C1;
        ir7 ir7 = fk9.C0;
        ny7 E = ((el9) ((kk9) fk9.b)).E();
        er7 er7 = fk9.D0;
        boolean z = fk9.F0;
        bundle.putParcelable("ru.ok.tamtam.extra.VIEW_STATE", new jr7(ir7));
        bundle.putParcelable("ru.ok.tamtam.extra.MAP_CONFIG", new oy7(E));
        bundle.putSerializable("ru.ok.tamtam.extra.LAST_LOCATION", er7);
        bundle.putBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", z);
    }

    public final void d() {
        this.C1.c2();
    }

    public final String f1() {
        return "PICK_LOCATION";
    }

    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.D1.A();
        }
    }

    public final boolean n1() {
        fk9 fk9 = this.C1;
        if (fk9.C0.d != 3) {
            return false;
        }
        fk9.Z1();
        return true;
    }

    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.D1.y(i, strArr, iArr);
        }
    }

    public final void r1(e08 e08) {
        Context d0 = d0();
        if (d0 != null) {
            er7 er7 = e08.a;
            double d = er7.a;
            ArrayList arrayList = hm9.l;
            ((pk4) ((y8a) ((ed3) this.p1.b)).getAccessor().c(pk4.class)).getClass();
            String str = "https://maps.google.com/maps?f=d&daddr=" + d + "," + er7.b;
            String str2 = e08.e;
            if (!(str2 == null || str2.length() == 0)) {
                try {
                    str = str + " (" + URLEncoder.encode(str2, "utf-8") + ")";
                } catch (UnsupportedEncodingException e) {
                    hm9.p(je6.class.getName(), "Can't encode name ".concat(str2), e);
                }
            }
            try {
                d0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (ActivityNotFoundException e2) {
                hm9.p("hm9", "openDirections: ", e2);
                int i = jpc.F1;
                Handler handler = a14.i;
                a14.N(0, d0, d0.getString(i));
            }
            this.q1.b().f("LOCATION_MAP_DIRECTION_CLICK");
        }
    }

    public final void t(long j) {
        if (this.G1.c == 1) {
            this.q1.b().g("LIVE_LOCATION_STOP", "VIEWER");
        } else {
            this.q1.b().g("LIVE_LOCATION_STOP", "PICKER");
        }
        this.C1.Z1();
        this.F1.getClass();
    }

    public final void v() {
    }

    public final void x() {
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, ny7] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.Object, ny7] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        nr7 nr7;
        long j;
        boolean z;
        er7 er7;
        ny7 ny7;
        oy7 oy7;
        jr7 jr7;
        String str2;
        Bundle bundle2 = bundle;
        Context d0 = d0();
        c cVar = this.F0;
        e08 e08 = null;
        if (d0 == null || cVar == null || this.Z == null) {
            hm9.p("ru.ok.messages.location.FrgLocationMap", "Context or fragmentManager is null", (Throwable) null);
            return null;
        }
        this.D1 = new k8g((Object) this.q1.i(), (Object) this);
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        this.F1 = (cn7) ((jyc) jke.b()).getAccessor().c(cn7.class);
        ida o = this.q1.o();
        el3 g = this.q1.g();
        vy7 vy7 = (vy7) ((y8a) ((ed3) this.p1.b)).getAccessor().c(vy7.class);
        ad b = this.q1.b();
        nr7 nr72 = (nr7) this.q1.getAccessor().c(nr7.class);
        this.E1 = (rke) this.q1.getAccessor().c(rke.class);
        long t = ((p7b) this.q1.q()).a.t();
        int i = dpc.E;
        String h0 = h0(i);
        this.H1 = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        this.I1 = this.Z.getInt("ru.ok.tamtam.extra.REQUEST_CODE");
        e52 C = this.q1.f().C(this.H1);
        if (C == null) {
            hm9.p("ru.ok.messages.location.FrgLocationMap", "Chat is null", (Throwable) null);
            return null;
        }
        boolean M = C.M();
        Bundle bundle3 = this.Z;
        er7 er72 = er7.Z;
        if (bundle3 == null) {
            z = M;
            er7 = er72;
            nr7 = nr72;
            str = "ru.ok.messages.location.FrgLocationMap";
            j = 0;
        } else {
            long j2 = bundle3.getLong("ru.ok.tamtam.extra.MESSAGE_ID");
            nr7 = nr72;
            long j3 = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID");
            er7 er73 = (er7) this.Z.getSerializable("ru.ok.tamtam.extra.LOCATION");
            if (er73 == null) {
                er73 = er72;
            }
            boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.LIVE");
            str = "ru.ok.messages.location.FrgLocationMap";
            long j4 = this.Z.getLong("ru.ok.tamtam.extra.DATE");
            er7 = er72;
            boolean z3 = this.Z.getBoolean("ru.ok.tamtam.extra.ACTIVE");
            z = M;
            String string = this.Z.getString("ru.ok.tamtam.extra.DEVICE_ID");
            j = 0;
            if (j2 == 0) {
                e08 = null;
            } else {
                if (j3 == ((p7b) this.q1.q()).a.t()) {
                    str2 = h0(i);
                } else {
                    uj3 i2 = g.i(j3, false);
                    str2 = i2 != null ? i2.d() : null;
                }
                d08 d08 = new d08(er73);
                d08.c = j2;
                d08.b = j3;
                d08.e = str2;
                d08.h = z2;
                d08.j = j4;
                d08.d = i08.c;
                d08.k = z3;
                d08.l = string;
                e08 = new e08(d08);
            }
        }
        this.J1 = e08 == null;
        ir7 ir7 = (bundle2 == null || (jr7 = (jr7) bundle2.getParcelable("ru.ok.tamtam.extra.VIEW_STATE")) == null) ? null : jr7.a;
        if (ir7 == null) {
            boolean z4 = !C.b.J.b(32);
            Bundle bundle4 = this.Z;
            if (bundle4 != null) {
                z4 &= !bundle4.getBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", false);
            }
            gr7 gr7 = new gr7();
            gr7.a = z4;
            if (e08 == null) {
                gr7.c = 2;
                gr7.d = 2;
                gr7.h = -1;
            } else {
                gr7.c = 1;
                gr7.d = 1;
                gr7.h = e08.c;
            }
            gr7.i = z;
            gr7.j = ((p7b) this.q1.q()).a.g.getBoolean("app.dev.live.location.debug.view", false);
            gr7.k = ((p7b) this.q1.q()).a.g.getBoolean("app.dev.randomize.my.live.location", false);
            ir7 = new ir7(gr7);
        }
        this.G1 = ir7;
        p7b n = ((y8a) ((ed3) this.p1.b)).n();
        int i3 = n.c.g.getInt("app.location.map.type", 1);
        ny7 ny72 = (bundle2 == null || (oy7 = (oy7) bundle2.getParcelable("ru.ok.tamtam.extra.MAP_CONFIG")) == null) ? null : oy7.a;
        if (ny72 == null) {
            float f = 14.0f;
            if (e08 == null) {
                ? obj = new Object();
                obj.a = 1.401298464324817E-45d;
                obj.b = 1.401298464324817E-45d;
                obj.c = false;
                obj.d = true;
                obj.e = true;
                obj.f = i3;
                obj.g = 14.0f;
                obj.h = 0.0f;
                obj.i = 0.0f;
                ny7 = new ny7(obj);
            } else {
                Bundle bundle5 = this.Z;
                float f2 = bundle5 == null ? 14.0f : bundle5.getFloat("ru.ok.tamtam.extra.ZOOM", 14.0f);
                er7 er74 = e08.a;
                double d = er74.a;
                if (f2 > 0.0f) {
                    f = f2;
                }
                ? obj2 = new Object();
                obj2.a = d;
                obj2.b = er74.b;
                obj2.c = false;
                obj2.d = true;
                obj2.e = true;
                obj2.f = i3;
                obj2.g = f;
                obj2.h = 0.0f;
                obj2.i = 0.0f;
                ny7 = new ny7(obj2);
            }
            ny72 = ny7;
        }
        er7 er75 = bundle2 != null ? (er7) bundle2.getSerializable("ru.ok.tamtam.extra.LAST_LOCATION") : null;
        er7 er76 = er75 == null ? er7 : er75;
        boolean z5 = bundle2 != null ? bundle2.getBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", true) : true;
        new WeakReference(this);
        new WeakReference((Object) null);
        tg c = ((y8a) ((ed3) this.p1.b)).c();
        hle q = ((y8a) ((ed3) this.p1.b)).q();
        ri4 h = this.q1.h();
        long j5 = e08 == null ? j : e08.c;
        c cVar2 = this.F0;
        q.getClass();
        el9 el9 = new el9(d0, viewGroup, o, g, vy7, b, cVar2, j5, c, n, ((jle) q).a(), h, T0().getBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", true), (u8e) ((y8a) ((ed3) this.p1.b)).getAccessor().c(u8e.class));
        fk9 fk9 = r0;
        el9 el92 = el9;
        String str3 = str;
        fk9 fk92 = new fk9(this.G1, ny72, er76, z5, el9, nr7, this.E1, this.F1, t, this.H1, h0, e08, this, g, this.D1, h, q, this.q1.q());
        this.C1 = fk9;
        if (this.G1.c != 1 && bundle == null) {
            this.D1.A();
        }
        el92.c();
        View view = (View) el92.c;
        if (view != null) {
            return view;
        }
        hm9.p(str3, "Root view is null", (Throwable) null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2.S();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y0() {
        /*
            r2 = this;
            super.y0()
            androidx.fragment.app.b r2 = r2.b0()
            if (r2 == 0) goto L_0x0026
            boolean r0 = r2 instanceof ru.ok.messages.location.ActLocationMap
            if (r0 == 0) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            n16 r2 = r2.S()
            int r0 = defpackage.xxb.frg_location_map__map
            androidx.fragment.app.a r0 = r2.D(r0)
            if (r0 == 0) goto L_0x0026
            he0 r1 = new he0
            r1.<init>(r2)
            r1.h(r0)
            r2 = 1
            r1.d(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.location.FrgLocationMap.y0():void");
    }

    public final void z0() {
        super.z0();
        fk9 fk9 = this.C1;
        if (fk9 != null) {
            xpb xpb = fk9.G0;
            if (xpb != null) {
                xpb.b();
            }
            fk9.H0.b();
            fk9.s0.getClass();
            cqc.b(fk9.K0);
            cqc.b(fk9.X);
            cqc.b(fk9.J0);
            el9 el9 = (el9) ((kk9) fk9.b);
            qy7 qy7 = el9.K0;
            if (qy7 != null) {
                LinkedHashMap linkedHashMap = qy7.a;
                for (xi0 xi0 : linkedHashMap.values()) {
                    xi0.a.F();
                    zl4 zl4 = xi0.c;
                    if (zl4 != null) {
                        zl4.g();
                    }
                }
                linkedHashMap.clear();
                qy7.b();
                qy7.a();
            }
            el9.C0.animate().cancel();
            ValueAnimator valueAnimator = el9.N0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            el9.o.g();
            this.C1 = null;
        }
    }
}
