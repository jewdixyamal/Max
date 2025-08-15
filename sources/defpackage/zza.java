package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.pinbars.PinBarsWidget;

/* renamed from: zza  reason: default package */
public final /* synthetic */ class zza implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ zza(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    public final void onClick(View view) {
        y0b y0b;
        g5f g5f;
        g5f g5f2;
        boolean z = true;
        int i = 0;
        c64 c64 = null;
        PinBarsWidget pinBarsWidget = this.b;
        switch (this.a) {
            case 0:
                int i2 = PinBarsWidget.t0;
                xza m0 = pinBarsWidget.m0();
                uu3 parentController = pinBarsWidget.getParentController();
                a0b a0b = parentController instanceof a0b ? (a0b) parentController : null;
                if (a0b != null) {
                    i = ((ChatScreen) a0b).A0();
                }
                y0b y0b2 = m0.c;
                if (y0b2 != null) {
                    vxd vxd = y0b2.g;
                    if (vxd == null || !vxd.isActive()) {
                        y0b2.g = j47.T(y0b2.d, ((w9a) y0b2.b).b(), (vx3) null, new x0b(y0b2, i, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i3 = PinBarsWidget.t0;
                xza m02 = pinBarsWidget.m0();
                wza wza = m02.b;
                Long l = wza.c;
                if (l != null && (y0b = m02.c) != null) {
                    long longValue = l.longValue();
                    if (wza.o != 1) {
                        z = false;
                    }
                    Object value = y0b.h.getValue();
                    c1b c1b = value instanceof c1b ? (c1b) value : null;
                    if (c1b != null) {
                        n0b.c.getClass();
                        c64 = n0b.Z1(longValue, c1b.a, z);
                    }
                    if (c64 != null) {
                        pnf.o(m02.z0, c64);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int i4 = PinBarsWidget.t0;
                xza m03 = pinBarsWidget.m0();
                m03.w0.b();
                m03.Y.h();
                ywe ywe = pinBarsWidget.a;
                if (ywe != null) {
                    ywe.dismiss();
                }
                pinBarsWidget.a = null;
                return;
            case 3:
                int i5 = PinBarsWidget.t0;
                pinBarsWidget.m0().w0.a();
                return;
            case 4:
                int i6 = PinBarsWidget.t0;
                xza m04 = pinBarsWidget.m0();
                wza wza2 = m04.b;
                Long l2 = wza2.c;
                if (wza2.o != 1) {
                    z = false;
                }
                c64 d = ((y3b) m04.w0.c).d(l2, z);
                if (d != null) {
                    pnf.o(m04.z0, d);
                    return;
                }
                return;
            case 5:
                int i7 = PinBarsWidget.t0;
                xza m05 = pinBarsWidget.m0();
                uu3 parentController2 = pinBarsWidget.getParentController();
                a0b a0b2 = parentController2 instanceof a0b ? (a0b) parentController2 : null;
                int A0 = a0b2 != null ? ((ChatScreen) a0b2).A0() : 0;
                j5f j5f = m05.o;
                if (j5f != null && (g5f = (g5f) j5f.i.a.getValue()) != null) {
                    j47.T(j5f.a, ((w9a) j5f.c).b(), (vx3) null, new h5f(j5f, g5f.a, (Continuation) null), 2);
                    j5f.h.setValue((Object) null);
                    wha wha = (wha) j5f.f.getValue();
                    wha.c(new eia(0, 0, A0, 3));
                    wha.e(new kia(woc.z));
                    wha.g(new eqe(oea.h));
                    wha.i();
                    return;
                }
                return;
            default:
                int i8 = PinBarsWidget.t0;
                j5f j5f2 = pinBarsWidget.m0().o;
                if (j5f2 != null && (g5f2 = (g5f) j5f2.i.a.getValue()) != null) {
                    j47.T(j5f2.a, ((w9a) j5f2.c).b(), (vx3) null, new i5f(j5f2, g5f2.a, (Continuation) null), 2);
                    j5f2.h.setValue((Object) null);
                    return;
                }
                return;
        }
    }
}
