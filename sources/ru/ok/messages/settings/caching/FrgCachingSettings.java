package ru.ok.messages.settings.caching;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class FrgCachingSettings extends FrgBaseSettings implements bx0 {
    public final jp E1 = vl.o.a().c;
    public String F1 = "";
    public String[] G1;
    public cx0 H1;

    public final void F() {
        a E = this.F0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? (ProgressDialog) E : null) == null) {
            p1(jpc.e1, false);
        }
    }

    public final void I() {
        a14.N(0, U0(), h0(jpc.d1));
    }

    public final void J() {
        a14.N(0, U0(), h0(jpc.E));
    }

    public final void K0() {
        super.K0();
        this.H1.b();
        ((y8a) ((ed3) this.p1.b)).m().f(wuc.SETTINGS_CACHE, spa.f);
    }

    public final void S() {
        a E = this.F0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((E instanceof ProgressDialog ? (ProgressDialog) E : null) == null) {
            q1();
        }
    }

    public final void f(ArrayList arrayList) {
        RecyclerView recyclerView = new RecyclerView(U0(), (AttributeSet) null);
        d0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new r23(d0(), arrayList));
        s08 s08 = new s08(U0());
        int i = jpc.h1;
        oc ocVar = s08.a;
        ocVar.d = ocVar.a.getText(i);
        s08.f(recyclerView).d(jpc.g1, new p46(this, arrayList, 2)).a();
    }

    public final String f1() {
        return "SETTINGS_MEDIA_CACHING";
    }

    public final void m(String str) {
        this.F1 = str;
        if (this.o1) {
            v1();
        }
    }

    public final ArrayList r1() {
        ArrayList arrayList = new ArrayList();
        int i = xxb.setting_caching_time;
        String h0 = h0(jpc.R0);
        jp jpVar = this.E1;
        int i2 = jpVar.g.getInt("app.media.caching.time", 0);
        arrayList.add(gcd.a(i, h0, i2 != 1 ? i2 != 2 ? i2 != 3 ? h0(jpc.S0) : h0(jpc.V0) : h0(jpc.T0) : h0(jpc.U0)));
        int i3 = xxb.setting_caching_limit;
        String h02 = h0(jpc.P0);
        long j = jpVar.g.getLong("app.media.caching.limit", -1);
        gcd a = gcd.a(i3, h02, j <= 0 ? h0(jpc.Q0) : are.w(j, false, (Context) null));
        a.Z = true;
        arrayList.add(a);
        arrayList.add(new gcd(xxb.setting_caching_clear_cache, h0(jpc.h1), h0(jpc.i1), this.F1, (Boolean) null, 1));
        return arrayList;
    }

    public final String s1() {
        return h0(jpc.f1);
    }

    public final void t1(int i) {
        if (i == xxb.setting_caching_time) {
            String[] strArr = {h0(jpc.S0), h0(jpc.U0), h0(jpc.T0), h0(jpc.V0)};
            s08 s08 = new s08(U0());
            int i2 = jpc.R0;
            oc ocVar = s08.a;
            ocVar.d = ocVar.a.getText(i2);
            p46 p46 = new p46(this, strArr, 1);
            oc ocVar2 = s08.a;
            ocVar2.p = strArr;
            ocVar2.r = p46;
            s08.a();
        } else if (i == xxb.setting_caching_limit) {
            ood ood = new ood(d0());
            int i3 = this.r1.k;
            hod configBuilder = ood.getConfigBuilder();
            configBuilder.b = 0.0f;
            configBuilder.d = 0.0f;
            boolean z = true;
            configBuilder.c = (float) (this.G1.length - 1);
            long j = this.E1.g.getLong("app.media.caching.limit", -1);
            configBuilder.d = (float) (j == 536870912 ? 0 : j == 1073741824 ? 1 : j == 2147483648L ? 2 : j == 4294967296L ? 3 : 4);
            int i4 = this.r1.M;
            configBuilder.j = i4;
            configBuilder.r = i4;
            bk4 bk4 = this.m1;
            int i5 = bk4.b;
            configBuilder.f = i5;
            configBuilder.k = i3;
            configBuilder.w = i3;
            configBuilder.g = i5;
            configBuilder.l = i3;
            configBuilder.G = 1.0f;
            int i6 = bk4.f;
            configBuilder.h = i6;
            configBuilder.i = bk4.h;
            configBuilder.E = true;
            configBuilder.D = -1;
            configBuilder.C = bk4.l;
            configBuilder.B = i3;
            configBuilder.W = true;
            configBuilder.A = true;
            configBuilder.m = this.G1.length - 1;
            configBuilder.K = bk4.e;
            configBuilder.L = i6;
            ood ood2 = configBuilder.a;
            ood2.getClass();
            ood2.b = configBuilder.b;
            ood2.c = configBuilder.c;
            ood2.o = configBuilder.d;
            ood2.s0 = configBuilder.e;
            ood2.t0 = configBuilder.f;
            ood2.u0 = configBuilder.g;
            ood2.v0 = configBuilder.h;
            ood2.w0 = configBuilder.i;
            ood2.x0 = configBuilder.j;
            ood2.y0 = configBuilder.k;
            ood2.z0 = configBuilder.l;
            ood2.A0 = configBuilder.m;
            ood2.B0 = configBuilder.n;
            ood2.C0 = configBuilder.o;
            ood2.D0 = configBuilder.p;
            ood2.E0 = configBuilder.q;
            ood2.F0 = configBuilder.r;
            ood2.G0 = configBuilder.s;
            ood2.H0 = configBuilder.t;
            ood2.I0 = configBuilder.u;
            ood2.J0 = configBuilder.v;
            ood2.K0 = configBuilder.w;
            ood2.L0 = configBuilder.x;
            ood2.O0 = configBuilder.y;
            ood2.M0 = configBuilder.z;
            ood2.N0 = configBuilder.A;
            hod hod = ood2.r1;
            String[] strArr2 = hod.F;
            ood2.s1 = strArr2;
            if (strArr2 == null || strArr2.length <= 0) {
                z = false;
            }
            ood2.t1 = z;
            ood2.u1 = hod.G;
            ood2.v1 = hod.H;
            ood2.w1 = hod.I;
            ood2.M1 = hod.J;
            ood2.N1 = hod.U;
            ood2.P1 = hod.T;
            ood2.W0 = configBuilder.B;
            ood2.X0 = configBuilder.C;
            ood2.Y0 = configBuilder.D;
            ood2.x1 = configBuilder.E;
            ood2.C1 = configBuilder.L;
            ood2.B1 = configBuilder.K;
            ood2.D1 = configBuilder.M;
            int i7 = configBuilder.N;
            ood2.a1 = i7;
            ood2.Z0 = i7;
            int i8 = configBuilder.O;
            ood2.c1 = i8;
            ood2.b1 = i8;
            ood2.T0 = configBuilder.Q;
            ood2.S0 = configBuilder.P;
            ood2.U0 = configBuilder.S;
            ood2.y1 = configBuilder.R;
            ood2.P0 = configBuilder.V;
            ood2.Q0 = configBuilder.W;
            ood2.d();
            ood2.e();
            ood2.c();
            ood2.r1 = null;
            ood2.requestLayout();
            ood.setValueFormatListener(new o46(this));
            j47.q(ood, this.m1.r);
            j47.p(ood, this.m1.r);
            s08 s082 = new s08(U0());
            int i9 = jpc.P0;
            oc ocVar3 = s082.a;
            ocVar3.d = ocVar3.a.getText(i9);
            s082.f(ood).d(jpc.I, new p46(this, ood, 0)).a();
        } else if (i == xxb.setting_caching_clear_cache) {
            cx0 cx0 = this.H1;
            synchronized (cx0) {
                try {
                    if (cx0.k == null) {
                        cx0.h.S();
                        r0a n = cx0.c().r(cx0.f).n(cx0.g);
                        sd7 sd7 = new sd7(new yw0(cx0, 4), new yw0(cx0, 5), ft.d);
                        n.a(sd7);
                        cx0.a(sd7);
                    } else {
                        cx0.h.f((ArrayList) cx0.k.c);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void u0(Context context) {
        super.u0(context);
        this.G1 = new String[]{"512MB", "1GB", "2GB", "4GB", h0(jpc.Q0)};
    }

    public final void u1(int i, Object obj) {
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        jyc jyc = (jyc) jke.b();
        this.H1 = new cx0((ng5) jyc.getAccessor().c(ng5.class), (f40) ((y8a) ((ed3) this.p1.b)).getAccessor().c(f40.class), new s23(d0()), jyc.u(), muc.a(), ce.a(), new o46(this), this);
    }
}
