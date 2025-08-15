package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ap1  reason: default package */
public final class ap1 extends ConstraintLayout implements kre, em1 {
    public static final /* synthetic */ bc7[] l1;
    public final je7 G0 = tu0.r(3, new dk1(14));
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final GestureDetector L0;
    public final s5a M0;
    public final TextView N0;
    public final knc O0;
    public k56 P0;
    public k56 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final ViewStub Y0;
    public final khe Z0;
    public final je7 a1;
    public xo1 b1;
    public Boolean c1;
    public Boolean d1;
    public Boolean e1;
    public CharSequence f1;
    public iaf g1;
    public gg1 h1;
    public haf i1;
    public final zo1 j1;
    public final zo1 k1;

    static {
        Class<ap1> cls = ap1.class;
        l1 = new bc7[]{new oi9(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;"), rh4.g(nec.a, cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.H0 = tu0.r(3, new wo1(context2, this, 0));
        this.I0 = tu0.r(3, new a5(context2, 21));
        this.J0 = tu0.r(3, new a5(context2, 22));
        this.K0 = tu0.r(3, new a5(context2, 23));
        this.R0 = tu0.r(3, new wo1(context2, this, 1));
        this.S0 = tu0.r(3, new wo1(context2, this, 2));
        this.T0 = tu0.r(3, new wo1(context2, this, 3));
        this.U0 = tu0.r(3, new a5(context2, 24));
        this.Z0 = new khe(new uo1(this, 0));
        this.a1 = tu0.r(3, new uo1(this, 2));
        this.h1 = gg1.c;
        this.j1 = new zo1(this, 0);
        this.k1 = new zo1(this, 1);
        setLayoutParams(new ti3(-1, -1));
        setElevation(fk4.d().getDisplayMetrics().density * 2.0f);
        dy7.H(this, fk4.d().getDisplayMetrics().density * 20.0f);
        setBackgroundColor(getBackgroundColor());
        this.L0 = new GestureDetector(context2, new q00(4, this));
        s5a s5a = new s5a(context2);
        s5a.setId(y7a.H1);
        s5a.setAvatarShape(j5a.a);
        this.M0 = s5a;
        TextView textView = new TextView(context2);
        textView.setId(y7a.F1);
        textView.setMaxLines(1);
        textView.setTextColor(qp4.u0.p(textView).c.getText().e);
        i4f.p.b(textView, du4.b);
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        textView.setPadding(G, G, G, G);
        np8.n(textView);
        this.N0 = textView;
        knc knc = new knc(context2, (AttributeSet) null);
        knc.setId(y7a.i0);
        knc.setMode(fnc.a);
        knc.setVisibility(8);
        knc.setImageSize(new gnc(getActionButtonSize(), getActionButtonSize()));
        this.O0 = knc;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(y7a.r0);
        this.W0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(y7a.p0);
        this.X0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(y7a.t0);
        this.V0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(y7a.g0);
        this.Y0 = viewStub4;
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setId(y7a.n0);
        frameLayout.addView(textView, -2, -2);
        addView(s5a, getAvatarSize(), getAvatarSize());
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(frameLayout, -1, -2);
        addView(knc);
        addView(viewStub3);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(2, this));
        } else {
            K(this.f1);
        }
        dj3 q = fp3.q(this);
        int id = s5a.getId();
        q.d(id, 4, 0, 4);
        au1.p((float) 5, fk4.d().getDisplayMetrics().density, new l2a(q, 4, id, 4));
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = viewStub.getId();
        q.d(id2, 4, 0, 4);
        q.d(id2, 3, 0, 3);
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        int id3 = viewStub4.getId();
        q.d(id3, 4, 0, 4);
        q.d(id3, 3, 0, 3);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        int id4 = viewStub2.getId();
        q.d(id4, 4, 0, 4);
        q.d(id4, 3, 0, 3);
        q.d(id4, 6, 0, 6);
        q.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        q.d(id5, 6, 0, 6);
        float f = (float) 8;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id5, 4));
        q.d(id5, 4, 0, 4);
        new l2a(q, 4, id5, 4).e(getNameVerticalMargin());
        q.d(id5, 7, 0, 7);
        new l2a(q, 7, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id6 = knc.getId();
        q.d(id6, 3, 0, 3);
        new l2a(q, 3, id6, 4).e(getActionButtonPadding());
        q.d(id6, 7, 0, 7);
        new l2a(q, 7, id6, 4).e(getActionButtonPadding());
        int id7 = viewStub3.getId();
        q.d(id7, 3, 0, 3);
        new l2a(q, 3, id7, 4).e(getActionButtonPadding());
        q.d(id7, 6, 0, 6);
        new l2a(q, 6, id7, 4).e(getActionButtonPadding());
        q.a(this);
    }

    public static ImageView A(Context context, ap1 ap1) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.t0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ap1.getActionButtonSize(), ap1.getActionButtonSize()));
        imageView.setImageDrawable(ap1.getRaiseHandIcon());
        tu0.K(imageView, 300, new vo1(ap1, 3));
        return imageView;
    }

    public static View B(Context context, ap1 ap1) {
        View view = new View(context);
        view.setId(y7a.g0);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(ap1.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static ShapeDrawable C(ap1 ap1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(ap1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(qp4.u0.p(ap1).c.b().e);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static final void E(ap1 ap1) {
        s5a s5a = ap1.M0;
        ViewGroup.LayoutParams layoutParams = s5a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ap1.getAvatarSize();
            layoutParams.width = ap1.getAvatarSize();
            s5a.setLayoutParams(layoutParams);
            TextView textView = ap1.N0;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = ap1.getNameVerticalMargin();
                textView.setLayoutParams(marginLayoutParams);
                knc knc = ap1.O0;
                ViewGroup.LayoutParams layoutParams3 = knc.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.topMargin = ap1.getActionButtonPadding();
                    marginLayoutParams2.setMarginEnd(ap1.getActionButtonPadding());
                    knc.setLayoutParams(marginLayoutParams2);
                    if (br7.G(ap1.V0)) {
                        ImageView raiseHandView = ap1.getRaiseHandView();
                        ViewGroup.LayoutParams layoutParams4 = raiseHandView.getLayoutParams();
                        if (layoutParams4 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams3.height = ap1.getActionButtonSize();
                            marginLayoutParams3.width = ap1.getActionButtonSize();
                            raiseHandView.setLayoutParams(marginLayoutParams3);
                            ap1.getRaiseHandIcon().setBounds(0, 0, ap1.getActionButtonSize(), ap1.getActionButtonSize());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    knc.setImageSize(new gnc(ap1.getActionButtonSize(), ap1.getActionButtonSize()));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final int getActionButtonPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int ordinal = getMode().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3) {
                return tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            return tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 1 || ordinal == 2) {
            return tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 3) {
            return tu0.G(((float) 216) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 4) {
            return tu0.G(((float) 216) * fk4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().b().l;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final t21 getCameraPreviewView() {
        return (t21) this.U0.getValue();
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.a1.getValue();
    }

    private final View getLoadingView() {
        return (View) this.S0.getValue();
    }

    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.G0.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final Drawable getMoreIcon() {
        return (Drawable) this.K0.getValue();
    }

    private final int getNameVerticalMargin() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    }

    private final Drawable getPinnedIcon() {
        return (Drawable) this.I0.getValue();
    }

    private final k4c getRaiseHandIcon() {
        return (k4c) this.H0.getValue();
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.R0.getValue();
    }

    private final ip1 getRender() {
        return (ip1) this.T0.getValue();
    }

    private final Drawable getRotateIcon() {
        return (Drawable) this.J0.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.Z0.getValue();
    }

    private final int getViewPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal == 2) {
                return tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    }

    public static void w(ap1 ap1, boolean z) {
        dy7.M(ap1.getRender(), z);
        s5a s5a = ap1.M0;
        int i = 0;
        boolean z2 = !z;
        if ((s5a.getVisibility() == 0) != z2) {
            if (!z2) {
                i = 8;
            }
            s5a.setVisibility(i);
        }
        ShapeDrawable backgroundItemView = ap1.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        ap1.N0.setBackground(backgroundItemView);
    }

    public static ShapeDrawable x(ap1 ap1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(ap1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(qp4.u0.p(ap1).c.b().a.l);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static k4c y(Context context, ap1 ap1) {
        k4c k4c = new k4c(context);
        k4c.setBounds(0, 0, ap1.getActionButtonSize(), ap1.getActionButtonSize());
        return k4c;
    }

    public final void F(boolean z) {
        ViewStub viewStub = this.Y0;
        if ((br7.G(viewStub) || z) && !tpa.f(this.d1, Boolean.valueOf(z))) {
            br7.F(viewStub, getLoadingView(), (k56) null);
            this.d1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void G(boolean z) {
        if (!tpa.f(this.c1, Boolean.valueOf(z))) {
            this.c1 = Boolean.valueOf(z);
            ShapeDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            setForeground(talkingDrawable);
        }
    }

    public final void I(boolean z, boolean z2) {
        br7.F(this.X0, getCameraPreviewView(), (k56) null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        getCameraPreviewView().a(z, z2);
    }

    public final void J(String str, CharSequence charSequence) {
        if (!tpa.f(this.f1, charSequence)) {
            this.f1 = charSequence;
            K(charSequence);
            this.N0.setContentDescription(str);
        }
    }

    public final void K(CharSequence charSequence) {
        int i = 8;
        int m = wg0.m((float) 8, fk4.d().getDisplayMetrics().density, 2, getMeasuredWidth());
        TextView textView = this.N0;
        CharSequence f = dy7.f(charSequence, textView, wg0.m((float) 6, fk4.d().getDisplayMetrics().density, 2, m) - (getViewPadding() * 2));
        textView.setText(f);
        if (!(f == null || w9e.C0(f))) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final fka getCustomTheme() {
        bc7 bc7 = l1[1];
        return (fka) this.k1.b;
    }

    public final yo1 getMode() {
        bc7 bc7 = l1[0];
        return (yo1) this.j1.b;
    }

    public final void onAttachedToWindow() {
        fm1 fm1;
        super.onAttachedToWindow();
        k56 k56 = this.P0;
        if (!(k56 == null || (fm1 = (fm1) k56.invoke()) == null)) {
            ((gm1) fm1).a.add(this);
        }
        if (br7.G(this.V0) && tpa.f(this.e1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    public final void onDetachedFromWindow() {
        fm1 fm1;
        super.onDetachedFromWindow();
        k56 k56 = this.P0;
        if (!(k56 == null || (fm1 = (fm1) k56.invoke()) == null)) {
            ((gm1) fm1).a.remove(this);
        }
        if (br7.G(this.V0)) {
            getRaiseHandIcon().stop();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        K(this.f1);
    }

    public final void onThemeChanged(fka fka) {
        setBackgroundColor(getBackgroundColor());
        TextView textView = this.N0;
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.L0.onTouchEvent(motionEvent);
    }

    public final void p() {
        setOpponentVideo(this.i1);
    }

    public final void setAvatar(md0 md0) {
        uc0 uc0 = null;
        String str = md0 != null ? md0.b : null;
        if (md0 != null) {
            uc0 = md0.a;
        }
        s5a.h(this.M0, str, uc0);
    }

    public final void setBackgroundCorners(float f) {
        dy7.H(this, f);
    }

    public final void setButtonAction(iaf iaf) {
        if (this.g1 != iaf) {
            this.g1 = iaf;
            int ordinal = iaf.ordinal();
            pq9 pq9 = qp4.u0;
            fnc fnc = fnc.s0;
            knc knc = this.O0;
            if (ordinal == 0) {
                knc.setVisibility(0);
                knc.A(getMoreIcon(), pq9.p(knc).c.getIcon().f);
                knc.setMode(fnc);
                knc.setContentDescription(knc.getContext().getString(f0c.call_user_item_more));
                tu0.K(knc, 300, new vo1(this, 0));
                knc.setButtonPadding(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal == 1) {
                knc.setVisibility(0);
                knc.A(getRotateIcon(), pq9.p(knc).c.getIcon().f);
                knc.setMode(fnc.X);
                knc.setContentDescription(knc.getContext().getString(b8a.c2));
                tu0.K(knc, 300, new vo1(this, 2));
                knc.setButtonPadding(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal == 2) {
                knc.setVisibility(0);
                knc.A(getPinnedIcon(), pq9.p(knc).c.getIcon().f);
                knc.setMode(fnc);
                knc.setContentDescription(knc.getContext().getString(f0c.call_user_info_pinned));
                tu0.K(knc, 300, new vo1(this, 1));
                knc.setButtonPadding(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density));
            } else if (ordinal == 3) {
                knc.setVisibility(8);
                knc.setContentDescription((CharSequence) null);
                knc.setMode(fnc);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setCallSpeakerMediator(k56 k56) {
        this.P0 = k56;
    }

    public final void setCustomTheme(fka fka) {
        this.k1.o1(this, l1[1], fka);
    }

    public final void setMode(yo1 yo1) {
        this.j1.o1(this, l1[0], yo1);
    }

    public final void setOpponentVideo(haf haf) {
        fm1 fm1;
        haf haf2;
        ViewStub viewStub = this.W0;
        if (haf != null || br7.G(viewStub)) {
            ip1 render = getRender();
            boolean z = false;
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, indexOfChild, layoutParams);
                dy7.M(getRender(), false);
            }
            k56 k56 = this.P0;
            if (!(k56 == null || (fm1 = (fm1) k56.invoke()) == null || (haf2 = ((gm1) fm1).b) == null || !haf2.g || haf == null || haf2.a != haf.a)) {
                z = true;
            }
            ip1 render2 = getRender();
            render2.t0 = haf;
            render2.u0 = z;
            getRender().d();
            this.i1 = haf;
        }
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.V0;
        if (br7.G(viewStub) || z) {
            this.e1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, indexOfChild, layoutParams);
                getRaiseHandIcon().setBounds(0, 0, getActionButtonSize(), getActionButtonSize());
            }
            ft.g(getRaiseHandView(), z, 50, (m56) null, 4);
            k4c raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56) {
        this.Q0 = k56;
    }
}
