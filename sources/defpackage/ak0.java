package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: ak0  reason: default package */
public final class ak0 extends r85 {
    public final ck0 q;
    public final Rect r = new Rect();

    public ak0(usd usd) {
        super(usd);
        this.q = usd;
    }

    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            ck0 ck0 = this.q;
            if (i >= ck0.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            ck0.u(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final boolean s(int i, int i2, Bundle bundle) {
        ck0 ck0 = this.q;
        if (!ck0.isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            float f = ck0.j1;
            if (f == 0.0f) {
                f = 1.0f;
            }
            float f2 = (ck0.f1 - ck0.e1) / f;
            float f3 = (float) 20;
            if (f2 > f3) {
                f *= (float) Math.round(f2 / f3);
            }
            if (i2 == 8192) {
                f = -f;
            }
            if (ck0.k()) {
                f = -f;
            }
            if (!ck0.s(i, z04.o(ck0.getValues().get(i).floatValue() + f, ck0.getValueFrom(), ck0.getValueTo()))) {
                return false;
            }
            ck0.v();
            ck0.postInvalidate();
            p(i);
            return true;
        } else if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !ck0.s(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
            return false;
        } else {
            ck0.v();
            ck0.postInvalidate();
            p(i);
            return true;
        }
    }

    public final void u(int i, l4 l4Var) {
        l4Var.b(f4.m);
        ck0 ck0 = this.q;
        List<Float> values = ck0.getValues();
        Float f = values.get(i);
        float floatValue = f.floatValue();
        float valueFrom = ck0.getValueFrom();
        float valueTo = ck0.getValueTo();
        if (ck0.isEnabled()) {
            if (floatValue > valueFrom) {
                l4Var.a(8192);
            }
            if (floatValue < valueTo) {
                l4Var.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityNodeInfo.setRangeInfo(obtain);
        l4Var.h(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (ck0.getContentDescription() != null) {
            sb.append(ck0.getContentDescription());
            sb.append(",");
        }
        String format = String.format(((float) ((int) floatValue)) == floatValue ? "%.0f" : "%.2f", new Object[]{f});
        String string = ck0.getContext().getString(wzb.material_slider_value);
        if (values.size() > 1) {
            string = i == ck0.getValues().size() - 1 ? ck0.getContext().getString(wzb.material_slider_range_end) : i == 0 ? ck0.getContext().getString(wzb.material_slider_range_start) : "";
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + format);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        ck0.u(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
