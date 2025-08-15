package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: dd7  reason: default package */
public final class dd7 extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] c;
    public final TextView a;
    public final yj b = new yj(10, this, (y5a) y5a.g.getValue());

    static {
        oi9 oi9 = new oi9(dd7.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;");
        nec.a.getClass();
        c = new bc7[]{oi9};
    }

    public dd7(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(xoc.B0);
        i4f.q.b(textView, du4.b);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLetterSpacing(0.0f);
        textView.setSingleLine(true);
        this.a = textView;
        b(getTabItem().c, qp4.u0.j(this));
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textView);
    }

    public static final void a(dd7 dd7) {
        dd7.setText(dd7.getTabItem().b);
        cd7 b2 = b(dd7.getTabItem().c, qp4.u0.j(dd7));
        dd7.getClass();
        dd7.a.setTextColor(b2.a);
        dd7.requestLayout();
        dd7.invalidate();
    }

    public static cd7 b(int i, fka fka) {
        int s = au1.s(i);
        if (s == 0) {
            return new cd7(fka.getText().e);
        }
        if (s == 1) {
            return new cd7(fka.getText().g);
        }
        if (s == 2) {
            return new cd7(fka.d().c.b.e);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final y5a getTabItem() {
        bc7 bc7 = c[0];
        return (y5a) this.b.b;
    }

    public final void onThemeChanged(fka fka) {
        this.a.setTextColor(b(getTabItem().c, fka).a);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(y5a.a(getTabItem(), (CharSequence) null, z ? 1 : 2, (v5a) null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(y5a y5a) {
        this.b.o1(this, c[0], y5a);
    }
}
