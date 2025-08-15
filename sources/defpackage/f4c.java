package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* renamed from: f4c  reason: default package */
public abstract class f4c extends ConstraintLayout {
    public final u3c G0 = new u3c(1, this);
    public int H0;
    public final q18 I0;

    public f4c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(vyb.material_radial_view_group, this);
        q18 q18 = new q18();
        this.I0 = q18;
        nfc nfc = new nfc(0.5f);
        i8g e = q18.a.a.e();
        e.e = nfc;
        e.f = nfc;
        e.g = nfc;
        e.h = nfc;
        q18.setShapeAppearanceModel(e.c());
        this.I0.l(ColorStateList.valueOf(-1));
        q18 q182 = this.I0;
        WeakHashMap weakHashMap = zmf.a;
        setBackground(q182);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.RadialViewGroup, i, 0);
        this.H0 = obtainStyledAttributes.getDimensionPixelSize(z2c.RadialViewGroup_materialCircleRadius, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = zmf.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            u3c u3c = this.G0;
            handler.removeCallbacks(u3c);
            handler.post(u3c);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        w();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            u3c u3c = this.G0;
            handler.removeCallbacks(u3c);
            handler.post(u3c);
        }
    }

    public final void setBackgroundColor(int i) {
        this.I0.l(ColorStateList.valueOf(i));
    }

    public abstract void w();
}
