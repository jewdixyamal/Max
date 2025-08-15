package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: j0b  reason: default package */
public final class j0b extends ffe implements g66 {
    public /* synthetic */ bb9 X;
    public /* synthetic */ d1b Y;
    public /* synthetic */ g5f Z;
    public /* synthetic */ ah6 s0;
    public final /* synthetic */ PinBarsWidget t0;
    public final /* synthetic */ View u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(5, continuation);
        this.t0 = pinBarsWidget;
        this.u0 = view;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        PinBarsWidget pinBarsWidget = this.t0;
        j0b j0b = new j0b(this.u0, (Continuation) obj5, pinBarsWidget);
        j0b.X = (bb9) obj;
        j0b.Y = (d1b) obj2;
        j0b.Z = (g5f) obj3;
        j0b.s0 = (ah6) obj4;
        e5f e5f = e5f.a;
        j0b.o(e5f);
        return e5f;
    }

    public final Object o(Object obj) {
        g5f g5f;
        g5f g5f2;
        od2.a0(obj);
        bb9 bb9 = this.X;
        d1b d1b = this.Y;
        g5f g5f3 = this.Z;
        ah6 ah6 = this.s0;
        boolean z = d1b instanceof b1b;
        View view = this.u0;
        PinBarsWidget pinBarsWidget = this.t0;
        if (!z || !(bb9 instanceof za9) || g5f3 == null || !(ah6 instanceof zg6)) {
            View findViewById = view.findViewById(mea.i);
            if (findViewById != null) {
                int i = PinBarsWidget.t0;
                j5f j5f = pinBarsWidget.m0().o;
                if (!(j5f == null || (g5f = (g5f) j5f.i.a.getValue()) == null)) {
                    el3 el3 = j5f.b.a;
                    el3.getClass();
                    cqc.a(new dl3(0, g5f.a, 0, el3), el3.m, (f6) null, new un0(27), (ztc) null);
                }
                ((ViewGroup) view).removeView(findViewById);
                pinBarsWidget.Z = null;
            }
        } else {
            if (pinBarsWidget.Z == null) {
                k5f k5f = new k5f(pinBarsWidget.getContext());
                k5f.setId(mea.i);
                k5f.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                k5f.setOnAddContactClickListener(new zza(pinBarsWidget, 5));
                k5f.setOnBlockContactClickListener(new zza(pinBarsWidget, 6));
                v3c.y(new xh0(3, (Continuation) null, 28), k5f);
                pinBarsWidget.Z = k5f;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                if (childCount >= 0) {
                    childCount = 0;
                }
                viewGroup.addView(k5f, childCount);
            }
            j5f j5f2 = pinBarsWidget.m0().o;
            if (!(j5f2 == null || (g5f2 = (g5f) j5f2.i.a.getValue()) == null)) {
                long n = ((hyc) ((q33) j5f2.g.getValue())).n();
                el3 el32 = j5f2.b.a;
                el32.getClass();
                cqc.a(new dl3(0, g5f2.a, n, el32), el32.m, (f6) null, new un0(27), (ztc) null);
            }
        }
        return e5f.a;
    }
}
