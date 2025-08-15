package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: e0b  reason: default package */
public final class e0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e0b) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e0b e0b = new e0b(continuation, this.Y);
        e0b.X = obj;
        return e0b;
    }

    public final Object o(Object obj) {
        ywe ywe;
        od2.a0(obj);
        h50 h50 = (h50) this.X;
        boolean f = tpa.f(h50, f50.a);
        PinBarsWidget pinBarsWidget = this.Y;
        if (f) {
            int i = PinBarsWidget.t0;
            ywe ywe2 = pinBarsWidget.a;
            if (ywe2 != null) {
                ywe2.dismiss();
            }
            pinBarsWidget.a = null;
        } else if (h50 instanceof g50) {
            jqe jqe = ((g50) h50).a;
            eb9 eb9 = pinBarsWidget.X;
            if (eb9 != null) {
                if (!eb9.isLaidOut() || eb9.isLayoutRequested()) {
                    eb9.addOnLayoutChangeListener(new l0b(eb9, pinBarsWidget, jqe));
                } else {
                    int[] iArr = new int[2];
                    View tooltipAnchor = eb9.getTooltipAnchor();
                    tooltipAnchor.getLocationOnScreen(iArr);
                    Point point = new Point(rh4.q((float) 18, fk4.d().getDisplayMetrics().density, (br7.D(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                    ywe ywe3 = pinBarsWidget.a;
                    if (!(ywe3 == null || !ywe3.isShowing() || (ywe = pinBarsWidget.a) == null)) {
                        ywe.dismiss();
                    }
                    ywe ywe4 = new ywe(pinBarsWidget.getContext(), tooltipAnchor, (k56) new qk2(5, pinBarsWidget), (k56) null, 1, 3, 8);
                    ywe4.d(jqe);
                    ywe4.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    ywe4.setOnDismissListener(new hr8(1, pinBarsWidget));
                    pinBarsWidget.a = ywe4;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
