package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import androidx.media3.common.PlaybackException;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f9  reason: default package */
public final /* synthetic */ class f9 implements hje, qj3, pof, b66, t31, hnc, wu, mq1, cc3, wsd, km7, mm7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f9(wja wja, hh2 hh2) {
        this.a = 20;
        this.c = wja;
        this.b = hh2;
    }

    public void a(int i) {
        DateTimePicker dateTimePicker = (DateTimePicker) this.b;
        if (!dateTimePicker.N0) {
            x34 x34 = (x34) ((b44) this.c).C(i);
            u34 u34 = dateTimePicker.M0;
            if (u34 != null) {
                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) u34;
                hm9.m("ScheduledSendPickerViewModel", "day = " + x34, new Object[0]);
                q0e q0e = scheduledSendPickerViewModel.e;
                m34 m34 = (m34) q0e.getValue();
                if (m34 != null && !tpa.f(m34.a, x34)) {
                    q0e.m((Object) null, m34.a(m34, x34, (qte) null, (qte) null, 6));
                    scheduledSendPickerViewModel.f();
                }
            }
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 1:
                hm9.m("l00", "Attach downloaded", new Object[0]);
                l00 l00 = (l00) obj3;
                l00.b.o((j00) obj2, (File) obj);
                l00.a.C(false);
                return;
            case 18:
                u82 u82 = (u82) obj;
                ((p82) obj3).getClass();
                u82.c = (i92) obj2;
                p82.q(u82);
                u82.x = 0;
                u82.m = 0;
                return;
            case 19:
                u82 u822 = (u82) obj;
                p82 p82 = (p82) obj3;
                p82.getClass();
                Map d = u822.d();
                p7b p7b = (p7b) p82.n;
                d.remove(Long.valueOf(p7b.a.t()));
                if (((e52) obj2).b0()) {
                    for (Long remove : Collections.singletonList(Long.valueOf(p7b.a.t()))) {
                        u822.R.remove(remove);
                    }
                }
                p82.q(u822);
                u822.x = 0;
                return;
            default:
                hl3 hl3 = (hl3) obj;
                hl3.k = (ol3) obj3;
                hl3.i = (nl3) obj2;
                return;
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public Object m58apply(Object obj) {
        bq0 bq0 = (bq0) obj;
        y8 y8Var = (y8) this.b;
        y8Var.getClass();
        wm3 wm3 = (wm3) ((Map) this.c).get(Long.valueOf(bq0.a));
        if (wm3 == null) {
            hm9.m("y8", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(bq0.a));
            return new iq0((String) null, bq0.a, y8Var.w(bq0, (wm3) null), bq0.c);
        }
        return new iq0(bre.c(wm3.w0), bq0.a, y8Var.w(bq0, wm3), bq0.c);
    }

    public void b() {
        o11 o11;
        ln1 ln1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                j11 j11 = (j11) obj2;
                if (j11.P0 != null && (o11 = j11.M0) != null) {
                    ((sy4) o11).G((knc) obj);
                    return;
                }
                return;
            default:
                mn1 mn1 = (mn1) obj2;
                if (tpa.f(mn1.H0, Boolean.TRUE) && (ln1 = mn1.G0) != null) {
                    bc7[] bc7Arr = CallTopPanelWidget.o;
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((o9g) ln1).b;
                    if (((el1) callTopPanelWidget.a.getValue()).u()) {
                        pnf.o(callTopPanelWidget.n0().b.M0, jj1.D);
                        return;
                    }
                    boolean z = true;
                    qt3 s = dy7.c(1).y().Y((knc) obj).s();
                    la1 la1 = (la1) callTopPanelWidget.n0().b.C0.a.getValue();
                    tt3 tt3 = ppa.a;
                    boolean z2 = !la1.g;
                    m31 m31 = la1.f;
                    if ((m31 != null ? m31.a : null) == null) {
                        z = false;
                    }
                    kl7 l = j1e.l();
                    if (z2) {
                        l.add(ppa.a);
                    }
                    if (z) {
                        l.add(ppa.b);
                    }
                    s.I(j1e.d(l)).build().q(callTopPanelWidget);
                    return;
                }
                return;
        }
    }

    public void d(Object obj, tm5 tm5) {
        ((gd) obj).N((q3b) this.c, new imc(tm5, ((i74) this.b).X));
    }

    public Object f(bg4 bg4) {
        String str = (String) this.b;
        nb3 nb3 = (nb3) this.c;
        try {
            Trace.beginSection(str);
            return nb3.f.f(bg4);
        } finally {
            Trace.endSection();
        }
    }

    public void h(eje eje, int i) {
        String str;
        switch (this.a) {
            case 0:
                List list = (List) ((bkg) this.b).b;
                if (!list.isEmpty()) {
                    View view = eje.e;
                    vja vja = view instanceof vja ? (vja) view : null;
                    g9 g9Var = (g9) list.get(i);
                    wja wja = (wja) this.c;
                    Context context = wja.getContext();
                    int i2 = 1;
                    boolean z = i == wja.getSelectedTabPosition();
                    String valueOf = String.valueOf(g9Var.a);
                    String string = context.getString(g9Var.b);
                    if (!z) {
                        i2 = 2;
                    }
                    y5a y5a = new y5a(valueOf, i2, 56, string);
                    if (vja != null) {
                        vja.setTabItem(y5a);
                        return;
                    }
                    vja vja2 = new vja(wja.getContext());
                    vja2.setTabItem(y5a);
                    eje.e = vja2;
                    gje gje = eje.g;
                    if (gje != null) {
                        gje.e();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                y8 y8Var = (y8) this.b;
                if (!((List) y8Var.a).isEmpty()) {
                    View view2 = eje.e;
                    vja vja3 = view2 instanceof vja ? (vja) view2 : null;
                    w81 w81 = (w81) ((List) y8Var.a).get(i);
                    wja wja2 = (wja) this.c;
                    Context context2 = wja2.getContext();
                    int i3 = 1;
                    boolean z2 = i == wja2.getSelectedTabPosition();
                    String valueOf2 = String.valueOf(w81.a);
                    String string2 = context2.getString(w81.b);
                    if (!z2) {
                        i3 = 2;
                    }
                    y5a y5a2 = new y5a(valueOf2, string2, i3, new v5a(0), (Drawable) null, (Drawable) null);
                    if (vja3 != null) {
                        vja3.setTabItem(y5a2);
                        return;
                    }
                    vja vja4 = new vja(wja2.getContext());
                    vja4.setTabItem(y5a2);
                    eje.e = vja4;
                    gje gje2 = eje.g;
                    if (gje2 != null) {
                        gje2.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                wja wja3 = (wja) this.c;
                int selectedTabPosition = wja3.getSelectedTabPosition();
                View view3 = eje.e;
                vja vja5 = view3 instanceof vja ? (vja) view3 : null;
                ih2 ih2 = (ih2) ((hh2) this.b).a.get(i);
                int i4 = 1;
                boolean z3 = i == selectedTabPosition;
                Context context3 = wja3.getContext();
                int ordinal = ih2.ordinal();
                if (ordinal == 0) {
                    str = z7.B(context3, yea.v0);
                } else if (ordinal == 1) {
                    str = z7.B(context3, yea.t0);
                } else if (ordinal == 2) {
                    str = z7.B(context3, yea.u0);
                } else if (ordinal == 3) {
                    str = z7.B(context3, yea.s0);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                String valueOf3 = String.valueOf(ih2.ordinal());
                if (!z3) {
                    i4 = 2;
                }
                y5a y5a3 = new y5a(valueOf3, i4, 8, str);
                if (vja5 != null) {
                    vja5.setTabItem(y5a3);
                    return;
                }
                vja vja6 = new vja(wja3.getContext());
                vja6.setTabItem(y5a3);
                eje.e = vja6;
                gje gje3 = eje.g;
                if (gje3 != null) {
                    gje3.e();
                    return;
                }
                return;
        }
    }

    public void i(m7 m7Var) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                s6 s6Var = (s6) m7Var;
                u31 u31 = (u31) obj2;
                j11 j11 = (j11) obj;
                if (s6Var instanceof p6) {
                    u31.getClass();
                    o11 o11 = j11.M0;
                    if (o11 != null) {
                        ((sy4) o11).I(true);
                    }
                    cu3 cu3 = u31.a;
                    if (cu3 != null) {
                        cu3.dismiss();
                    }
                    u31.a = null;
                    return;
                } else if (s6Var instanceof q6) {
                    u31.getClass();
                    o11 o112 = j11.M0;
                    if (o112 != null) {
                        ((sy4) o112).I(false);
                    }
                    cu3 cu32 = u31.a;
                    if (cu32 != null) {
                        cu32.dismiss();
                    }
                    u31.a = null;
                    return;
                } else if (s6Var instanceof r6) {
                    u31.getClass();
                    o11 o113 = j11.M0;
                    if (o113 != null) {
                        ((sy4) o113).H();
                    }
                    cu3 cu33 = u31.a;
                    if (cu33 != null) {
                        cu33.dismiss();
                    }
                    u31.a = null;
                    return;
                } else if (s6Var instanceof o6) {
                    u31.getClass();
                    o11 o114 = j11.M0;
                    if (o114 != null) {
                        bc7[] bc7Arr = CallBottomPanelWidget.s0;
                        pnf.o(((CallBottomPanelWidget) ((sy4) o114).b).n0().c.M0, ij1.D);
                    }
                    cu3 cu34 = u31.a;
                    if (cu34 != null) {
                        cu34.dismiss();
                    }
                    u31.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            default:
                v6 v6Var = (v6) m7Var;
                u31 u312 = (u31) obj2;
                in1 in1 = (in1) obj;
                if (v6Var instanceof u6) {
                    u312.getClass();
                    ln1 ln1 = in1.L0;
                    if (ln1 != null) {
                        ((o9g) ln1).A(nnf.a);
                    }
                    cu3 cu35 = u312.a;
                    if (cu35 != null) {
                        cu35.dismiss();
                    }
                    u312.a = null;
                    return;
                } else if (v6Var instanceof t6) {
                    u312.getClass();
                    ln1 ln12 = in1.L0;
                    if (ln12 != null) {
                        ((o9g) ln12).A(nnf.c);
                    }
                    cu3 cu36 = u312.a;
                    if (cu36 != null) {
                        cu36.dismiss();
                    }
                    u312.a = null;
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
        }
    }

    public void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                gdVar.B((fd) this.b, (c3b) this.c);
                return;
            case 26:
                gdVar.D((fd) this.b, (f99) this.c);
                return;
            case 27:
                gdVar.A0((fd) this.b, (p0f) this.c);
                return;
            case 28:
                gdVar.m0((fd) this.b, (PlaybackException) this.c);
                return;
            default:
                gdVar.J((fd) this.b, (n54) this.c);
                return;
        }
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 13:
                ((su1) this.b).getClass();
                ((u40) this.c).b(new ru1(lq1, 0));
                return "submitStillCapture";
            case Protos.Attaches.Attach.LOCATION /*14*/:
                xu1 xu1 = (xu1) this.b;
                xu1.getClass();
                ju0.D().execute(new f5((Object) xu1, (Object) (AtomicReference) this.c, (Object) lq1, 13));
                return "OnScreenFlashStart";
            default:
                ay1 ay1 = (ay1) this.b;
                ay1.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = ay1.d;
                executor.execute(new zx1(ay1, (Context) this.c, executor, 1, lq1, elapsedRealtime));
                return "CameraX initInternal";
        }
    }

    public /* synthetic */ f9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public bm7 apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Void voidR = (Void) obj;
                sz1 sz1 = (sz1) this.b;
                sz1.a();
                ((xf4) this.c).a();
                return sz1.m();
            default:
                xu1 xu1 = (xu1) this.b;
                xu1.getClass();
                return f8.g(new vg4((oq1) ((bm7) this.c), xu1.c, TimeUnit.SECONDS.toMillis(3)));
        }
    }
}
