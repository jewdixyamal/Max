package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: iea  reason: default package */
public final class iea extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] t0;
    public final hea a = new hea(this, 0);
    public final hea b = new hea(this, 1);
    public final pha c;
    public final ShapeDrawable o;
    public final RippleDrawable s0;

    static {
        Class<iea> cls = iea.class;
        t0 = new bc7[]{new oi9(cls, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;"), rh4.g(nec.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;")};
    }

    public iea(Context context) {
        super(context, (AttributeSet) null);
        pha pha = new pha(context, (AttributeSet) null);
        pha.setId(xoc.i);
        this.c = pha;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.o = shapeDrawable;
        int i = qp4.u0.j(this).d().a.a.d;
        this.s0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        addView(pha);
        b();
        c();
    }

    public final void a(float f, int i, String str) {
        Drawable n = s36.n(getContext(), i);
        if (n != null) {
            pha pha = this.c;
            pha.setImageDrawable(n);
            pha.s0 = m6d.i(str);
            pha.o = f;
            pha.invalidate();
        }
    }

    public final void b() {
        int i;
        pq9 pq9 = qp4.u0;
        pq9.j(this).getIcon();
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            i = pq9.j(this).b().f;
        } else if (ordinal == 1) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.getPaint().setColor(i);
        pq9.j(this).b();
        ColorStateList valueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.s0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void c() {
        int i;
        int i2;
        int ordinal = getSize().ordinal();
        if (ordinal == 0) {
            i = 24;
        } else if (ordinal == 1) {
            i = 32;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int G = tu0.G(((float) i) * fk4.d().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(G, G));
        int ordinal2 = getSize().ordinal();
        if (ordinal2 == 0) {
            i2 = 8;
        } else if (ordinal2 == 1) {
            i2 = 10;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int G2 = tu0.G(((float) i2) * fk4.d().getDisplayMetrics().density);
        setPadding(G2, G2, G2, G2);
        setOutlineProvider(new ix3((float) G));
        requestLayout();
        invalidate();
    }

    public final fea getMode() {
        bc7 bc7 = t0[1];
        return (fea) this.b.b;
    }

    public final gea getSize() {
        bc7 bc7 = t0[0];
        return (gea) this.a.b;
    }

    public final void onThemeChanged(fka fka) {
        b();
    }

    public final void setMode(fea fea) {
        this.b.o1(this, t0[1], fea);
    }

    public final void setSize(gea gea) {
        this.a.o1(this, t0[0], gea);
    }
}
