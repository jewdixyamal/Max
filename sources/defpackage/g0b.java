package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: g0b  reason: default package */
public final class g0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g0b) n((d1b) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g0b g0b = new g0b(this.Z, continuation, this.Y);
        g0b.X = obj;
        return g0b;
    }

    public final Object o(Object obj) {
        int i = 0;
        od2.a0(obj);
        d1b d1b = (d1b) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i2 = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(d1b instanceof c1b)) {
            viewGroup.removeView(viewGroup.findViewById(mea.f));
            pinBarsWidget.Y = null;
        } else {
            if (pinBarsWidget.Y == null) {
                pea pea = new pea(pinBarsWidget.getContext());
                pea.setId(mea.f);
                pea.setCloseBtnClickListener(new zza(pinBarsWidget, 0));
                pea.setOnClickListener(new zza(pinBarsWidget, 1));
                v3c.y(new xh0(3, (Continuation) null, 27), pea);
                pinBarsWidget.Y = pea;
                int childCount = viewGroup.getChildCount();
                if (childCount < 0) {
                    i = childCount;
                }
                viewGroup.addView(pea, i);
            }
            pea pea2 = pinBarsWidget.Y;
            if (pea2 != null) {
                c1b c1b = (c1b) d1b;
                CharSequence b = c1b.b.b(pinBarsWidget.getContext());
                if (b == null) {
                    b = "";
                }
                pea2.setSubtitle(b);
                pea2.setCloseButtonVisibility(c1b.c);
            }
        }
        return e5f.a;
    }
}
