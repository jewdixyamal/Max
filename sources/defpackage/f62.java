package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f62  reason: default package */
public final class f62 extends View implements kre {
    public final je7 a;
    public final je7 b = tu0.r(3, new d62(this, 1));

    public f62(Context context) {
        super(context, (AttributeSet) null);
        je7 r = tu0.r(3, new d62(this, 0));
        this.a = r;
        float f = (float) 64;
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 0));
        setForeground((Drawable) r.getValue());
    }

    private final LayerDrawable getSelectedIndicatorIcon() {
        return (LayerDrawable) this.b.getValue();
    }

    public final void onThemeChanged(fka fka) {
        je7 je7 = this.a;
        if (je7.a()) {
            ((GradientDrawable) je7.getValue()).setStroke(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density), fka.i().b.b);
        }
        Paint paint = ((ShapeDrawable) getSelectedIndicatorIcon().getDrawable(0)).getPaint();
        fka.b();
        paint.setColor(-1728053248);
        ngg.G(getSelectedIndicatorIcon().getDrawable(1), -1);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }

    public void setSelected(boolean z) {
        setForeground(z ? getSelectedIndicatorIcon() : (Drawable) this.a.getValue());
        super.setSelected(z);
    }
}
