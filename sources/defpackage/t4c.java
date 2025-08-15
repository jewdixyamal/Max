package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: t4c  reason: default package */
public final class t4c extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] o;
    public final je7 a;
    public final ix3 b;
    public final yj c = new yj(this);

    static {
        oi9 oi9 = new oi9(t4c.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;");
        nec.a.getClass();
        o = new bc7[]{oi9};
    }

    public t4c(Context context) {
        super(context, (AttributeSet) null);
        this.a = tu0.r(3, new xda(context, 19));
        ix3 ix3 = new ix3((float) tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density));
        this.b = ix3;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(ix3);
        setBackgroundColor(qp4.u0.j(this).b().a.g);
        setClickable(true);
        addView(getTextView());
    }

    public static final void a(t4c t4c, s4c s4c) {
        float f;
        float f2;
        int i;
        TextView textView = t4c.getTextView();
        int ordinal = s4c.ordinal();
        if (ordinal == 0) {
            f = 32.0f;
        } else if (ordinal == 1) {
            f = 44.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextSize(f);
        int ordinal2 = s4c.ordinal();
        if (ordinal2 == 0) {
            f2 = fk4.d().getDisplayMetrics().density * 32.0f;
        } else if (ordinal2 == 1) {
            f2 = fk4.d().getDisplayMetrics().density * 50.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t4c.b.a = f2;
        ViewGroup.LayoutParams layoutParams = t4c.getLayoutParams();
        if (layoutParams != null) {
            int ordinal3 = s4c.ordinal();
            if (ordinal3 == 0) {
                i = tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density);
            } else if (ordinal3 == 1) {
                i = tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams.height = i;
            layoutParams.width = i;
            t4c.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final TextView getTextView() {
        return (TextView) this.a.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final s4c getSize() {
        bc7 bc7 = o[0];
        return (s4c) this.c.b;
    }

    public final void onThemeChanged(fka fka) {
        getTextView().setTextColor(fka.getText().e);
        setBackgroundColor(fka.b().a.g);
    }

    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setSize(s4c s4c) {
        this.c.o1(this, o[0], s4c);
    }

    public final void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
        b();
    }
}
