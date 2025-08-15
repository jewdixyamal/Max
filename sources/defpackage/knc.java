package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: knc  reason: default package */
public final class knc extends ConstraintLayout {
    public static final /* synthetic */ bc7[] S0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public hnc L0;
    public final je7 M0 = tu0.r(3, new hbc(6));
    public final je7 N0 = tu0.r(3, new lwa(21, this));
    public final je7 O0 = tu0.r(3, new hbc(7));
    public final jnc P0 = new jnc(this, 0);
    public final jnc Q0 = new jnc(this, 1);
    public final jnc R0;

    static {
        Class<knc> cls = knc.class;
        S0 = new bc7[]{new oi9(cls, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;"), rh4.g(nec.a, cls, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;"), new oi9(cls, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;")};
    }

    public knc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new xda(context, 21));
        this.H0 = tu0.r(3, new xda(context, 22));
        this.I0 = tu0.r(3, new xda(context, 23));
        this.J0 = tu0.r(3, new zja(context, 15, this));
        this.K0 = tu0.r(3, new xda(context, 24));
        float f = (float) 52;
        this.R0 = new jnc(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)), this);
        addView(getIconView(), tu0.G(fk4.c() * f), tu0.G(fk4.c() * f));
        addView(getStubCounterView());
        addView(getStubTitleView());
        tu0.K(this, 300, new elb(1, (Object) this));
        C();
        dj3 q = fp3.q(this);
        int id = getIconView().getId();
        q.d(id, 3, 0, 3);
        float f2 = (float) 4;
        new l2a(q, 3, id, 4).e(tu0.G(fk4.c() * f2));
        q.d(id, 7, 0, 7);
        new l2a(q, 7, id, 4).e(tu0.G(fk4.c() * f2));
        q.d(id, 6, 0, 6);
        new l2a(q, 6, id, 4).e(tu0.G(fk4.c() * f2));
        q.d(id, 4, getStubTitleView().getId(), 3);
        new l2a(q, 4, id, 4).e(tu0.G(fk4.c() * f2));
        int id2 = getStubCounterView().getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        q.d(id3, 3, getIconView().getId(), 4);
        new l2a(q, 3, id3, 4).e(tu0.G(fk4.c() * f2));
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        q.a(this);
    }

    public static void B(knc knc, int i) {
        knc.y(i, qp4.u0.p(knc).c.getIcon().f);
    }

    private final int getContrastColor() {
        return -868664768;
    }

    private final caa getCounterView() {
        return (caa) this.J0.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = inc.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float[] getIconBgRadius() {
        return (float[]) this.M0.getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.I0.getValue();
    }

    private final int getInactiveColor() {
        return qp4.u0.p(this).c.d().b.a.g;
    }

    private final int getNegativeColor() {
        return qp4.u0.p(this).c.b().a.e;
    }

    private final int getNeutralColor() {
        return qp4.u0.p(this).c.b().a.g;
    }

    private final int getPositiveColor() {
        return qp4.u0.p(this).c.b().a.l;
    }

    private final int getSelectedColor() {
        return qp4.u0.p(this).c.d().a.a.c;
    }

    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.O0.getValue();
    }

    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.N0.getValue();
    }

    private final ViewStub getStubCounterView() {
        return (ViewStub) this.G0.getValue();
    }

    private final ViewStub getStubTitleView() {
        return (ViewStub) this.H0.getValue();
    }

    private final int getThemedColor() {
        return qp4.u0.p(this).c.b().a.m;
    }

    private final TextView getTitleView() {
        return (TextView) this.K0.getValue();
    }

    public static ShapeDrawable w(knc knc) {
        return new ShapeDrawable(new RoundRectShape(knc.getIconBgRadius(), (RectF) null, (float[]) null));
    }

    public final void A(Drawable drawable, int i) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void C() {
        Integer num;
        RippleDrawable rippleDrawable;
        switch (getMode().ordinal()) {
            case 0:
                num = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                num = Integer.valueOf(getPositiveColor());
                break;
            case 2:
                num = Integer.valueOf(getNegativeColor());
                break;
            case 3:
                num = Integer.valueOf(getSelectedColor());
                break;
            case 4:
                num = Integer.valueOf(getContrastColor());
                break;
            case 5:
                num = Integer.valueOf(getInactiveColor());
                break;
            case 6:
                num = Integer.valueOf(getThemedColor());
                break;
            case 7:
                num = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView iconView = getIconView();
        pq9 pq9 = qp4.u0;
        if (num != null) {
            int i = pq9.p(this).c.d().a.a.c;
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(num.intValue());
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), currentShape, (Drawable) null);
        } else {
            int i2 = pq9.j(this).d().a.a.h;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, currentShape2);
        }
        iconView.setBackground(rippleDrawable);
    }

    public final gnc getImageSize() {
        bc7 bc7 = S0[2];
        return (gnc) this.R0.b;
    }

    public final fnc getMode() {
        bc7 bc7 = S0[0];
        return (fnc) this.P0.b;
    }

    public final enc getShape() {
        bc7 bc7 = S0[1];
        return (enc) this.Q0.b;
    }

    public final void setAccessibility(jqe jqe) {
        getIconView().setContentDescription(jqe != null ? jqe.b(getContext()) : null);
    }

    public final void setButtonPadding(int i) {
        ImageView iconView = getIconView();
        int G = tu0.G(fk4.c() * ((float) i));
        iconView.setPadding(G, G, G, G);
    }

    public final void setCounter(int i) {
        if (br7.G(getStubCounterView()) || i != 0) {
            br7.F(getStubCounterView(), getCounterView(), (k56) null);
            int i2 = 0;
            getCounterView().g(i, false);
            caa counterView = getCounterView();
            if (i == 0) {
                i2 = 8;
            }
            counterView.setVisibility(i2);
        }
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(gnc gnc) {
        this.R0.o1(this, S0[2], gnc);
    }

    public final void setListener(hnc hnc) {
        this.L0 = hnc;
    }

    public final void setMode(fnc fnc) {
        this.P0.o1(this, S0[0], fnc);
    }

    public final void setShape(enc enc) {
        this.Q0.o1(this, S0[1], enc);
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(jqe jqe) {
        if (br7.G(getStubTitleView()) || jqe != null) {
            CharSequence charSequence = null;
            br7.F(getStubTitleView(), getTitleView(), (k56) null);
            TextView titleView = getTitleView();
            if (jqe != null) {
                charSequence = jqe.b(getContext());
            }
            titleView.setText(charSequence);
            getTitleView().setVisibility(jqe != null ? 0 : 8);
        }
    }

    public final void y(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void setAccessibility(Integer num) {
        String str;
        ImageView iconView = getIconView();
        if (num != null) {
            str = getContext().getString(num.intValue());
        } else {
            str = null;
        }
        iconView.setContentDescription(str);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
