package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: i4a  reason: default package */
public final class i4a extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] c;
    public final yj a = new yj(this);
    public final TextView b;

    static {
        oi9 oi9 = new oi9(i4a.class, "appearance", "getAppearance()Lone/me/pinbars/unknowncontact/OneMeActionButton$Appearance;");
        nec.a.getClass();
        c = new bc7[]{oi9};
    }

    public i4a(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        i4f.D.b(textView, du4.b);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        float f = (float) 40;
        setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f));
        setMinimumWidth(tu0.G(f * fk4.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 12.0f));
        float f2 = (float) 16;
        float f3 = (float) 10;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(qp4.u0.j(this));
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = qp4.u0.j(this).d().a.a.h;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    public final h4a getAppearance() {
        bc7 bc7 = c[0];
        return (h4a) this.a.b;
    }

    public final void onThemeChanged(fka fka) {
        int i;
        int ordinal = getAppearance().ordinal();
        if (ordinal == 0) {
            i = isEnabled() ? fka.getText().j : fka.d().c.b.g;
        } else if (ordinal == 1) {
            i = isEnabled() ? fka.getText().b : fka.d().c.b.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(h4a h4a) {
        this.a.o1(this, c[0], h4a);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(qp4.u0.j(this));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
