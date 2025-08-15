package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: h0b  reason: default package */
public final class h0b extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0b(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h0b) n((bb9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h0b h0b = new h0b(this.Z, continuation, this.Y);
        h0b.X = obj;
        return h0b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bb9 bb9 = (bb9) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.t0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        db9 db9 = null;
        if (!(bb9 instanceof ab9)) {
            viewGroup.removeView(viewGroup.findViewById(mea.g));
            pinBarsWidget.X = null;
        } else {
            int i2 = -1;
            if (pinBarsWidget.X == null) {
                eb9 eb9 = new eb9(pinBarsWidget.getContext(), (AttributeSet) null);
                eb9.setId(mea.g);
                eb9.setOnCloseClickListener(new zza(pinBarsWidget, 2));
                eb9.setOnPlaybackSpeedClick(new wz7(19, pinBarsWidget));
                eb9.setOnPlaybackClickListener(new zza(pinBarsWidget, 3));
                tu0.K(eb9, 300, new zza(pinBarsWidget, 4));
                eb9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                v3c.y(new xh0(3, (Continuation) null, 26), eb9);
                pinBarsWidget.X = eb9;
                int childCount = viewGroup.getChildCount();
                if (1 <= childCount) {
                    childCount = 1;
                }
                viewGroup.addView(eb9, childCount);
            }
            eb9 eb92 = pinBarsWidget.X;
            if (eb92 != null) {
                ab9 ab9 = (ab9) bb9;
                eb92.setIsPlaying(ab9.d);
                eb92.setTitle(ab9.a.b(eb92.getContext()));
                eb92.setSubtitle(ab9.b.b(eb92.getContext()));
                d3b d3b = ab9.c;
                if (d3b != null) {
                    i2 = b0b.$EnumSwitchMapping$1[d3b.ordinal()];
                }
                if (i2 == 1) {
                    db9 = db9.a;
                } else if (i2 == 2) {
                    db9 = db9.b;
                } else if (i2 == 3) {
                    db9 = db9.c;
                }
                eb92.setPlaybackSpeed(db9);
                eb92.setProgress(((Number) pinBarsWidget.m0().y0.a.getValue()).floatValue());
            }
        }
        return e5f.a;
    }
}
