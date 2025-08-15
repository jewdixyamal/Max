package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: c0b  reason: default package */
public final class c0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((c0b) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c0b c0b = new c0b(this.Z, continuation, this.Y);
        c0b.X = obj;
        return c0b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ah6 ah6 = (ah6) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(ah6 instanceof yg6)) {
            viewGroup.removeView(viewGroup.findViewById(mea.a));
            pinBarsWidget.s0 = null;
        } else {
            if (pinBarsWidget.s0 == null) {
                bh6 bh6 = new bh6(pinBarsWidget.getContext());
                bh6.setId(mea.a);
                bh6.setJoinAction(new yza(pinBarsWidget, 0));
                pinBarsWidget.s0 = bh6;
                viewGroup.addView(bh6, viewGroup.getChildCount());
            }
            bh6 bh62 = pinBarsWidget.s0;
            if (bh62 != null) {
                yg6 yg6 = (yg6) ah6;
                bh62.G0.setAvatars(yg6.c);
                bh62.I0.setText(yg6.b.d(bh62));
            }
        }
        return e5f.a;
    }
}
