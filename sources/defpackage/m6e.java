package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: m6e  reason: default package */
public final /* synthetic */ class m6e implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ m6e(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = StickersSettingsScreen.Y;
                this.b.getRouter().C();
                return e5f.a;
            case 1:
                StickersSettingsScreen stickersSettingsScreen = this.b;
                bc7[] bc7Arr2 = StickersSettingsScreen.Y;
                w6e m0 = stickersSettingsScreen.m0();
                int g = ((dec) obj).g();
                String name = w6e.class.getName();
                ir6 ir6 = hm9.m;
                if (ir6 != null) {
                    m0.getClass();
                    if (ir6.c()) {
                        us7 us7 = us7.X;
                        Long l = m0.t0;
                        Long l2 = m0.v0;
                        ir6.d(us7, name, "Move finish. moved:" + l + ", target:" + l2, (Throwable) null);
                    }
                }
                Long l3 = m0.t0;
                Long l4 = m0.v0;
                if (l3 == null || l4 == null || m0.u0 == -1 || m0.u0 == g) {
                    m0.u0 = -1;
                    m0.t0 = null;
                    m0.v0 = null;
                } else {
                    m0.u0 = -1;
                    m0.t0 = null;
                    m0.v0 = null;
                    m0.w0.o1(m0, w6e.B0[0], j47.S(m0.a, ((w9a) m0.c).b(), vx3.b, new u6e(m0, l3, l4, (Continuation) null)));
                }
                return e5f.a;
            case 2:
                y0d y0d = (y0d) obj;
                bc7[] bc7Arr3 = StickersSettingsScreen.Y;
                w6e m02 = this.b.m0();
                m02.getClass();
                boolean z = y0d instanceof w0d;
                s35 s35 = m02.s0;
                if (z) {
                    l6e.c.getClass();
                    wg0.k(":stickers/set?set_id=" + ((w0d) y0d).a, s35);
                } else if (y0d instanceof x0d) {
                    pnf.o(s35, ((x0d) y0d).b);
                }
                return e5f.a;
            case 3:
                y0d y0d2 = (y0d) obj;
                bc7[] bc7Arr4 = StickersSettingsScreen.Y;
                w6e m03 = this.b.m0();
                m03.getClass();
                if (y0d2 instanceof w0d) {
                    kl7 l5 = j1e.l();
                    int i = gja.k;
                    eqe eqe = new eqe(hja.n);
                    Integer valueOf = Integer.valueOf(woc.Z1);
                    int i2 = wfa.S;
                    l5.add(new tt3(i, (jqe) eqe, valueOf, Integer.valueOf(i2), 4));
                    l5.add(new tt3(gja.l, (jqe) new eqe(hja.o), Integer.valueOf(yfa.y), Integer.valueOf(i2), 4));
                    l5.add(new tt3(gja.i, (jqe) new eqe(hja.f), Integer.valueOf(woc.t), Integer.valueOf(i2), 4));
                    l5.add(new tt3(gja.j, (jqe) new eqe(hja.m), Integer.valueOf(woc.w), Integer.valueOf(wfa.P), 4));
                    kl7 d = j1e.d(l5);
                    m03.x0 = Long.valueOf(((w0d) y0d2).a);
                    pnf.o(m03.Z, new ted(d));
                }
                return e5f.a;
            default:
                dec dec = (dec) obj;
                bc7[] bc7Arr5 = StickersSettingsScreen.Y;
                pag.F(dec.a, ni6.LONG_PRESS);
                f77 f77 = this.b.o;
                if (f77 != null) {
                    f77.t(dec);
                }
                return e5f.a;
        }
    }
}
