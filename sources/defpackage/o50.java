package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o50  reason: default package */
public final class o50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o50(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    private final void n(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        yd4 yd4;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                p50 p50 = (p50) this.b;
                x77 x77 = p50.T0;
                k50 k50 = (k50) obj;
                if (x77 == null || !x77.isActive()) {
                    p50.T0 = od2.L(new zn5(k50.k, new m50(p50, (Continuation) null), 5), lnf.b(view));
                }
                x77 x772 = p50.S0;
                if (x772 == null || !x772.isActive()) {
                    p50.S0 = od2.L(new zn5(k50.l, new n50(p50, (Continuation) null), 5), lnf.b(view));
                    return;
                }
                return;
            case 1:
                td2 td2 = (td2) this.b;
                x77 x773 = td2.L0;
                if (x773 == null || !x773.isActive()) {
                    td2.L0 = od2.L(new zn5((j0e) obj, new sd2(td2, (Continuation) null), 5), lnf.b(view));
                    return;
                }
                return;
            case 2:
                gi5 gi5 = (gi5) this.b;
                x77 x774 = gi5.F0;
                if (x774 == null || !x774.isActive()) {
                    gi5.F0 = od2.L(new zn5(((zf5) obj).n, new fi5(gi5, (Continuation) null), 5), lnf.b(view));
                    return;
                }
                return;
            case 3:
                e eVar = (e) this.b;
                a aVar = eVar.c;
                eVar.k();
                ViewGroup viewGroup = (ViewGroup) aVar.U0.getParent();
                ((b16) obj).a.K();
                Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                if (tag instanceof yd4) {
                    yd4 = (yd4) tag;
                } else {
                    yd4 = new yd4(viewGroup);
                    viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4);
                }
                yd4.h();
                return;
            case 4:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = zmf.a;
                mmf.c((View) obj);
                return;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                tl8 tl8 = (tl8) obj;
                tl8.setPadding(tl8.getPaddingLeft(), tl8.getPaddingTop(), tl8.getPaddingRight(), tu0.G((x6g.f((View) null, tl8.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * fk4.d().getDisplayMetrics().density));
                return;
            case 6:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((uge) obj).requestApplyInsets();
                return;
            case 7:
                return;
            case 8:
                esd esd = (esd) this.b;
                x77 x775 = esd.F0;
                if (x775 == null || !x775.isActive()) {
                    esd.F0 = od2.L(new zn5(((bsd) obj).d, new dsd(esd, (Continuation) null), 5), lnf.b(view));
                    return;
                }
                return;
            case 9:
                gsd gsd = (gsd) this.b;
                x77 x776 = gsd.N0;
                if (x776 == null || !x776.isActive()) {
                    gsd.N0 = od2.L(new zn5(((bsd) obj).d, new fsd(gsd, (Continuation) null), 5), lnf.b(view));
                    return;
                }
                return;
            case 10:
                zwe zwe = (zwe) this.b;
                if (zwe != null) {
                    zwe.B((RecyclerView) view);
                }
                this.b = z7.m((RecyclerView) obj);
                return;
            case 11:
                jd4 jd4 = ql4.a;
                ContextScope a2 = j1e.a(MainDispatcherLoader.dispatcher);
                this.b = a2;
                od2.L(new zn5(new zn5(new t03(sme.d0, 11), new ume(view, (Continuation) null)), new vme((wme) obj, view, (Continuation) null), 5), a2);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                rg7 b2 = lnf.b(view);
                dif dif = (dif) this.b;
                vxd vxd = dif.I0;
                wgf wgf = (wgf) obj;
                if (vxd == null || !vxd.isActive()) {
                    dif.I0 = od2.L(new zn5(wgf.f, new bif(dif, (Continuation) null), 5), b2);
                }
                rg7 b3 = lnf.b(view);
                vxd vxd2 = dif.H0;
                if (vxd2 == null || !vxd2.isActive()) {
                    dif.H0 = od2.L(new zn5(wgf.d, new aif(dif, (Continuation) null), 5), b3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                gh7 gh7 = ((loa) this.c).a;
                if (gh7 == null) {
                    gh7 = null;
                }
                gh7.d(eg7.ON_DESTROY);
                return;
            case 8:
            case 9:
                return;
            case 10:
                zwe zwe = (zwe) this.b;
                if (zwe != null) {
                    zwe.B((RecyclerView) view);
                }
                this.b = null;
                return;
            case 11:
                try {
                    ContextScope contextScope = (ContextScope) this.b;
                    if (contextScope != null) {
                        j1e.i(contextScope, (CancellationException) null);
                    }
                    this.b = null;
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                zef zef = (zef) this.c;
                amf amf = (amf) zef.Q();
                if (amf.b != null && amf.getChildCount() > 0) {
                    zef.u();
                    return;
                }
                return;
            case 13:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ohf ohf = (ohf) this.c;
                if (ohf.L0.a()) {
                    ohf.getBitmapPool().e(ohf.L0.getValue());
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return;
            default:
                hm9.m(v3c.w((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                ((i5g) this.c).a = true;
                return;
        }
    }

    public /* synthetic */ o50(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public o50(b16 b16, e eVar) {
        this.a = 3;
        this.c = b16;
        this.b = eVar;
    }
}
