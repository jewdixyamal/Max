package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: e77  reason: default package */
public abstract class e77 {
    public static final c77 X = new c77(1);
    public static final c77 o = new c77(0);
    public int a = -1;
    public final int b;
    public final int c;

    public e77(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= -3158065 & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= -789517 & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public void a(RecyclerView recyclerView, dec dec) {
        View view = dec.a;
        Object tag = view.getTag(evb.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = zmf.a;
            omf.s(view, floatValue);
        }
        view.setTag(evb.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public float d(float f) {
        return f;
    }

    public float e() {
        return 0.5f;
    }

    public final int f(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.a == -1) {
            this.a = recyclerView.getResources().getDimensionPixelSize(rtb.item_touch_helper_max_drag_scroll_per_frame);
        }
        float f = 1.0f;
        int interpolation = (int) (X.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))) * ((float) (((int) Math.signum((float) i2)) * this.a)));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation2 = (int) (o.getInterpolation(f) * ((float) interpolation));
        return interpolation2 == 0 ? i2 > 0 ? 1 : -1 : interpolation2;
    }

    public boolean g() {
        return true;
    }

    public void h(Canvas canvas, RecyclerView recyclerView, dec dec, float f, float f2, int i, boolean z) {
        View view = dec.a;
        if (z && view.getTag(evb.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = zmf.a;
            Float valueOf = Float.valueOf(omf.i(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    float i3 = omf.i(childAt);
                    if (i3 > f3) {
                        f3 = i3;
                    }
                }
            }
            omf.s(view, f3 + 1.0f);
            view.setTag(evb.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract boolean i(dec dec, dec dec2);

    public void j(dec dec, int i) {
    }
}
