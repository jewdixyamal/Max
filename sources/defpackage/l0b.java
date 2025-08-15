package defpackage;

import android.graphics.Point;
import android.view.View;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: l0b  reason: default package */
public final class l0b implements View.OnLayoutChangeListener {
    public final /* synthetic */ eb9 a;
    public final /* synthetic */ PinBarsWidget b;
    public final /* synthetic */ jqe c;

    public l0b(eb9 eb9, PinBarsWidget pinBarsWidget, jqe jqe) {
        this.a = eb9;
        this.b = pinBarsWidget;
        this.c = jqe;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ywe ywe;
        View view2 = view;
        view.removeOnLayoutChangeListener(this);
        int[] iArr = new int[2];
        View tooltipAnchor = this.a.getTooltipAnchor();
        tooltipAnchor.getLocationOnScreen(iArr);
        PinBarsWidget pinBarsWidget = this.b;
        Point point = new Point(rh4.q((float) 18, fk4.d().getDisplayMetrics().density, (br7.D(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
        ywe ywe2 = pinBarsWidget.a;
        if (!(ywe2 == null || !ywe2.isShowing() || (ywe = pinBarsWidget.a) == null)) {
            ywe.dismiss();
        }
        ywe ywe3 = new ywe(pinBarsWidget.getContext(), tooltipAnchor, (k56) new qk2(5, pinBarsWidget), (k56) null, 1, 3, 8);
        ywe3.d(this.c);
        ywe3.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        ywe3.setOnDismissListener(new hr8(1, pinBarsWidget));
        pinBarsWidget.a = ywe3;
    }
}
