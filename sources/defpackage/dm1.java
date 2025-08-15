package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* renamed from: dm1  reason: default package */
public final class dm1 extends ConstraintLayout implements pv3, zj1, em1 {
    public final je7 G0 = tu0.r(3, new dk1(8));
    public final je7 H0;
    public final je7 I0;
    public final AppCompatTextView J0;
    public final AppCompatImageView K0;
    public final AppCompatImageView L0;
    public cm1 M0;
    public Boolean N0;
    public Boolean O0;
    public Boolean P0;
    public CharSequence Q0;
    public gg1 R0;
    public iaf S0;
    public qv3 T0;
    public fm1 U0;
    public i1b V0;

    public dm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H0 = tu0.r(3, new a5(context, 10));
        this.I0 = tu0.r(3, new md1(2, this));
        this.R0 = gg1.c;
        setLayoutParams(new ti3(-1, -2));
        float f = (float) 32;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(rvb.call_video_rotation);
        appCompatImageView.setBackground(getBackgroundView());
        appCompatImageView.setImageResource(ztb.ic_rotation_view_16);
        float f2 = (float) 5;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(G, G, G, G);
        appCompatImageView.setVisibility(8);
        pq9 pq9 = qp4.u0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.p(appCompatImageView).c.getIcon().f));
        this.K0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(rvb.call_pin);
        appCompatImageView2.setImageResource(ztb.ic_pin_13);
        appCompatImageView2.setBackground(getBackgroundView());
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9.p(appCompatImageView2).c.getIcon().f));
        int G2 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        appCompatImageView2.setPadding(G2, G2, G2, G2);
        appCompatImageView2.setVisibility(8);
        tu0.K(appCompatImageView2, 300, new bm1(this, 1));
        this.L0 = appCompatImageView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(rvb.call_user_full_name);
        appCompatTextView.setMaxLines(1);
        i4f.p.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9.p(appCompatTextView).c.getText().e);
        appCompatTextView.setBackground(getBackgroundView());
        appCompatTextView.setGravity(17);
        float f3 = (float) 8;
        float f4 = (float) 7;
        appCompatTextView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setVisibility(8);
        np8.n(appCompatTextView);
        this.J0 = appCompatTextView;
        float f5 = (float) 26;
        addView(appCompatImageView2, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(fk4.d().getDisplayMetrics().density * f5));
        addView(appCompatImageView, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView, -2, -2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(1, this));
        } else {
            A(this.Q0);
        }
        dj3 q = fp3.q(this);
        int id = appCompatImageView2.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        q.d(id, 7, appCompatTextView.getId(), 6);
        q.d(id, 6, 0, 6);
        q.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        q.d(id2, 6, appCompatImageView2.getId(), 7);
        float f6 = (float) 4;
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f6));
        q.d(id2, 7, appCompatImageView.getId(), 6);
        new l2a(q, 7, id2, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        q.g(id2).d.l0 = true;
        int id3 = appCompatImageView.getId();
        q.d(id3, 3, 0, 3);
        q.d(id3, 4, 0, 4);
        q.d(id3, 6, appCompatTextView.getId(), 7);
        q.d(id3, 7, 0, 7);
        q.a(this);
    }

    private final float[] getBG_RADIUS() {
        return (float[]) this.G0.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final ivc getCallScreen() {
        return (ivc) this.H0.getValue();
    }

    private final int getTargetWidth() {
        return ((Number) this.I0.getValue()).intValue();
    }

    public static int w(dm1 dm1) {
        return wg0.m((float) 8, fk4.d().getDisplayMetrics().density, 2, wg0.m((float) 32, fk4.d().getDisplayMetrics().density, 2, wg0.m((float) 4, fk4.d().getDisplayMetrics().density, 2, wg0.m((float) 26, fk4.d().getDisplayMetrics().density, 2, dm1.getCallScreen().b))));
    }

    public final void A(CharSequence charSequence) {
        int targetWidth = getTargetWidth();
        AppCompatTextView appCompatTextView = this.J0;
        appCompatTextView.post(new f5((Object) appCompatTextView, (Object) dy7.f(charSequence, appCompatTextView, targetWidth), (Object) this, 10));
    }

    public final List H(nv3 nv3, nv3 nv32) {
        kl7 l = j1e.l();
        l.add(z7.C(this, (Math.abs(nv3.d) - ((float) nv3.f)) * ((float) nv3.c)));
        if (tpa.f(this.P0, Boolean.TRUE)) {
            l.add(z7.o(this, nv32.a));
        }
        return j1e.d(l);
    }

    public final void f(kl7 kl7, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (ft.q(this, z)) {
            kl7.add(ft.c(this, z, f, f2, j));
        }
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    public final void o(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fm1 fm1 = this.U0;
        if (fm1 != null) {
            ((gm1) fm1).a.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fm1 fm1 = this.U0;
        if (fm1 != null) {
            ((gm1) fm1).a.remove(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A(this.Q0);
    }

    public final void p() {
        y();
    }

    public final void setActive(boolean z) {
        if (!tpa.f(this.P0, Boolean.valueOf(z))) {
            this.P0 = Boolean.valueOf(z);
            y();
        }
    }

    public final void setCallSpeakerMediator(fm1 fm1) {
        this.U0 = fm1;
    }

    public final void setControlsMediator(qv3 qv3) {
        this.T0 = qv3;
    }

    public final void setLabel(CharSequence charSequence) {
        if (!tpa.f(this.Q0, charSequence)) {
            this.Q0 = charSequence;
            A(charSequence);
        }
    }

    public final void setListener(cm1 cm1) {
        this.M0 = cm1;
    }

    public final void setParticipantId(gg1 gg1) {
        this.R0 = gg1;
    }

    public final void setPipBoundariesController(i1b i1b) {
        this.V0 = i1b;
    }

    public final void x() {
        Boolean bool = this.O0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence charSequence = this.Q0;
        if (charSequence == null) {
            charSequence = "";
        }
        AppCompatTextView appCompatTextView = this.J0;
        if (booleanValue) {
            charSequence = getContext().getString(f0c.call_user_talking_accessibility);
        }
        appCompatTextView.setContentDescription(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((defpackage.uv3) r0).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r7 = this;
            qv3 r0 = r7.T0
            if (r0 == 0) goto L_0x0011
            uv3 r0 = (defpackage.uv3) r0
            ov3 r0 = r0.j
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0011
            r0 = 0
        L_0x000f:
            r2 = r0
            goto L_0x001a
        L_0x0011:
            java.lang.Boolean r0 = r7.P0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.tpa.f(r0, r1)
            goto L_0x000f
        L_0x001a:
            l r5 = new l
            r0 = 20
            r5.<init>(r0, r7)
            r6 = 2
            r3 = 0
            r1 = r7
            defpackage.ft.g(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm1.y():void");
    }
}
