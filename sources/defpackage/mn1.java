package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: mn1  reason: default package */
public final class mn1 extends ConstraintLayout {
    public static final /* synthetic */ int V0 = 0;
    public ln1 G0;
    public Boolean H0;
    public final je7 I0;
    public ywe J0;
    public AnimatorSet K0;
    public final Handler L0 = new Handler(Looper.getMainLooper());
    public final b M0 = new b(23, (Object) this);
    public vwe N0;
    public final TextView O0;
    public final TextView P0;
    public final knc Q0;
    public final knc R0;
    public final ViewStub S0;
    public final je7 T0;
    public Boolean U0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.I0 = tu0.r(3, new a5(context2, 13));
        knc knc = new knc(context2, (AttributeSet) null);
        knc.setId(rvb.call_collapsing);
        knc.B(knc, ztb.ic_down_chevron_24);
        knc.setAccessibility(Integer.valueOf(f0c.call_collapsing_accessibility));
        fnc fnc = fnc.a;
        knc.setMode(fnc);
        knc.setListener(new kn1(this, 0));
        float f = (float) 40;
        knc.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        knc.setLayoutParams(new ti3(-2, -2));
        float f2 = (float) 3;
        knc.setButtonPadding(tu0.G(fk4.c() * f2));
        TextView textView = new TextView(context2);
        textView.setId(rvb.call_name);
        textView.setGravity(8388611);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        i4f.j.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.p(textView).c.getText().e);
        textView.setVisibility(8);
        this.O0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(rvb.call_status);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(8388611);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9.p(textView2).c.getText().h);
        textView2.setVisibility(8);
        this.P0 = textView2;
        knc knc2 = new knc(context2, (AttributeSet) null);
        knc2.setId(y7a.i0);
        knc2.setMode(fnc);
        knc.B(knc2, x7a.p0);
        knc2.setAccessibility(Integer.valueOf(b8a.j0));
        knc2.setListener(new f9(this, 11, knc2));
        knc2.setButtonPadding(tu0.G(fk4.c() * f2));
        knc2.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        knc2.setLayoutParams(new ti3(-2, -2));
        this.Q0 = knc2;
        knc knc3 = new knc(context2, (AttributeSet) null);
        knc3.setId(y7a.y1);
        knc.B(knc3, x7a.y);
        knc3.setAccessibility(Integer.valueOf(b8a.U1));
        knc3.setMode(fnc);
        knc3.setButtonPadding(tu0.G(fk4.c() * f2));
        knc3.setImageSize(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        knc3.setLayoutParams(new ti3(-2, -2));
        knc3.setListener(new kn1(this, 1));
        this.R0 = knc3;
        this.T0 = tu0.r(3, new x2((Object) context2, 16, (Object) this));
        setLayoutParams(new ti3(-1, -2));
        int G = tu0.G(fk4.c() * f);
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(y7a.h0);
        this.S0 = viewStub;
        addView(knc);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(knc2);
        addView(viewStub, G, G);
        addView(knc3);
        dj3 q = fp3.q(this);
        int id = knc.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        int id2 = textView.getId();
        q.d(id2, 6, knc.getId(), 7);
        float f3 = (float) 8;
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.c() * f3));
        q.d(id2, 3, knc.getId(), 3);
        q.d(id2, 4, textView2.getId(), 3);
        q.d(id2, 7, knc3.getId(), 6);
        new l2a(q, 7, id2, 4).e(tu0.G(fk4.c() * f3));
        q.g(id2).d.l0 = true;
        q.g(id2).d.W = 2;
        int id3 = textView2.getId();
        q.d(id3, 6, textView.getId(), 6);
        q.d(id3, 3, textView.getId(), 4);
        q.d(id3, 7, textView.getId(), 7);
        q.d(id3, 4, knc.getId(), 4);
        q.g(id3).d.l0 = true;
        int id4 = knc3.getId();
        q.d(id4, 7, knc2.getId(), 6);
        q.d(id4, 3, 0, 3);
        q.d(id4, 4, 0, 4);
        int id5 = knc2.getId();
        q.d(id5, 7, viewStub.getId(), 6);
        q.d(id5, 3, 0, 3);
        q.d(id5, 4, 0, 4);
        int id6 = viewStub.getId();
        q.d(id6, 7, 0, 7);
        q.d(id6, 3, 0, 3);
        q.d(id6, 4, 0, 4);
        q.a(this);
    }

    private final View getRecordButton() {
        return (View) this.T0.getValue();
    }

    private final mcc getRecordDrawable() {
        return (mcc) this.I0.getValue();
    }

    public static View w(Context context, mn1 mn1) {
        View view = new View(context);
        view.setId(y7a.h0);
        view.setVisibility(8);
        float f = (float) 40;
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)));
        tu0.K(view, 300, new c5(mn1, view));
        view.setBackground(mn1.getRecordDrawable());
        return view;
    }

    public static void x(mn1 mn1, boolean z) {
        mn1.K0 = null;
        mn1.getRecordButton().setVisibility(z ? 0 : 8);
        b bVar = mn1.M0;
        Handler handler = mn1.L0;
        knc knc = mn1.Q0;
        if (z) {
            ViewGroup.LayoutParams layoutParams = knc.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = tu0.G(fk4.c() * ((float) 8));
                knc.setLayoutParams(marginLayoutParams);
                mn1.getRecordDrawable().start();
                handler.post(bVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams2 = knc.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.rightMargin = 0;
            knc.setLayoutParams(marginLayoutParams2);
            mn1.getRecordDrawable().stop();
            handler.removeCallbacks(bVar);
            ywe ywe = mn1.J0;
            if (ywe != null) {
                ywe.a();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void A(vwe vwe) {
        this.N0 = null;
        if (vwe == null) {
            ywe ywe = this.J0;
            if (ywe != null) {
                ywe.dismiss();
                return;
            }
            return;
        }
        ywe ywe2 = this.J0;
        if (ywe2 == null || !ywe2.isShowing()) {
            int[] iArr = new int[2];
            getRecordButton().getLocationOnScreen(iArr);
            Point point = new Point(((br7.D(getContext()) - iArr[0]) - (getRecordButton().getWidth() / 2)) - tu0.G(fk4.c() * ((float) 18)), getRecordButton().getHeight() + iArr[1]);
            ywe ywe3 = this.J0;
            if (ywe3 != null) {
                ywe3.dismiss();
            }
            ywe ywe4 = new ywe(getContext(), getRecordButton(), (k56) new jn1(this, 1), (k56) new dk1(11), (k56) null, 1, 3);
            ywe4.d(vwe.a);
            TextView textView = ywe4.t0;
            textView.setText(vwe.b.b(textView.getContext()));
            CharSequence text = textView.getText();
            textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
            jn1 jn1 = new jn1(this, 0);
            ImageView imageView = ywe4.u0;
            imageView.setVisibility(0);
            tu0.K(imageView, 300, new v7d(jn1, 15, ywe4));
            TextView textView2 = ywe4.s0;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
                textView2.setLayoutParams(marginLayoutParams);
                ywe4.showAtLocation(ywe4.a, 8388661, point.x - (ywe4.getWidth() / 2), point.y);
                View contentView = ywe4.getContentView();
                if (contentView != null) {
                    ywe.b(ywe4, contentView, true, (wwe) null, 6);
                }
                ywe4.setOnDismissListener(new m11(2, this));
                this.J0 = ywe4;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (br7.G(this.S0) && getRecordButton().getVisibility() == 0) {
            getRecordDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (br7.G(this.S0)) {
            getRecordDrawable().stop();
        }
    }

    public final void setAddUserCount(int i) {
        this.R0.setCounter(i);
    }

    public final void setAddUserState(boolean z) {
        ft.g(this.R0, z, 0, (m56) null, 6);
    }

    public final void setClickListener(ln1 ln1) {
        this.G0 = ln1;
    }

    public final void setMoreButtonVisible(boolean z) {
        ft.g(this.Q0, z, 0, (m56) null, 6);
    }

    public final void setStatus(CharSequence charSequence) {
        TextView textView = this.P0;
        if (!tpa.f(textView.getText(), charSequence)) {
            textView.setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.O0;
        if (!tpa.f(textView.getText(), charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r11v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(boolean r11, defpackage.vwe r12) {
        /*
            r10 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            android.view.ViewStub r3 = r10.S0
            boolean r4 = defpackage.br7.G(r3)
            if (r4 != 0) goto L_0x000c
            goto L_0x0048
        L_0x000c:
            android.animation.AnimatorSet r4 = r10.K0
            if (r4 == 0) goto L_0x0018
            boolean r4 = r4.isRunning()
            if (r4 != r2) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            android.view.View r5 = r10.getRecordButton()
            boolean r5 = defpackage.ft.l(r5)
            if (r5 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            if (r12 == 0) goto L_0x002a
            r10.N0 = r12
            goto L_0x0048
        L_0x002a:
            android.view.View r4 = r10.getRecordButton()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x003a
            if (r12 == 0) goto L_0x003a
            r10.A(r12)
            goto L_0x0048
        L_0x003a:
            android.os.Handler r4 = r10.L0
            b r5 = r10.M0
            r4.removeCallbacks(r5)
            ywe r4 = r10.J0
            if (r4 == 0) goto L_0x0048
            r4.a()
        L_0x0048:
            if (r11 != 0) goto L_0x0051
            boolean r4 = defpackage.br7.G(r3)
            if (r4 != 0) goto L_0x0051
            return
        L_0x0051:
            java.lang.Boolean r4 = r10.U0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 == 0) goto L_0x005e
            return
        L_0x005e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r10.U0 = r4
            android.view.View r4 = r10.getRecordButton()
            r5 = 0
            defpackage.br7.F(r3, r4, r5)
            r10.N0 = r12
            android.animation.AnimatorSet r12 = r10.K0
            if (r12 == 0) goto L_0x0075
            r12.cancel()
        L_0x0075:
            android.view.View r12 = r10.getRecordButton()
            k81 r3 = new k81
            r3.<init>(r10, r11, r2)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            int r6 = defpackage.y7a.m
            if (r11 == 0) goto L_0x008a
            java.lang.String r7 = "fade_in"
            goto L_0x008c
        L_0x008a:
            java.lang.String r7 = "fade_out"
        L_0x008c:
            knc r8 = r10.Q0
            if (r11 == 0) goto L_0x00ca
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x009b
            r5 = r11
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x009b:
            if (r5 == 0) goto L_0x00a0
            int r11 = r5.rightMargin
            goto L_0x00a1
        L_0x00a0:
            r11 = r0
        L_0x00a1:
            int r5 = r12.getWidth()
            int[] r11 = new int[]{r11, r5}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            zf r5 = new zf
            r5.<init>(r8, r2)
            r11.addUpdateListener(r5)
            android.util.Property r5 = android.view.View.ALPHA
            float[] r8 = new float[r1]
            r8 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r8)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r0] = r11
            r1[r2] = r5
            r4.playSequentially(r1)
            goto L_0x0104
        L_0x00ca:
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            boolean r9 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x00d5
            r5 = r11
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x00d5:
            if (r5 == 0) goto L_0x00da
            int r11 = r5.rightMargin
            goto L_0x00db
        L_0x00da:
            r11 = r0
        L_0x00db:
            int r5 = r12.getWidth()
            int r5 = -r5
            int[] r11 = new int[]{r11, r5}
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofInt(r11)
            zf r5 = new zf
            r5.<init>(r8, r1)
            r11.addUpdateListener(r5)
            android.util.Property r5 = android.view.View.ALPHA
            float[] r8 = new float[r1]
            r8 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r12, r5, r8)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r0] = r11
            r1[r2] = r5
            r4.playTogether(r1)
        L_0x0104:
            r0 = 150(0x96, double:7.4E-322)
            r4.setDuration(r0)
            android.view.animation.LinearInterpolator r11 = new android.view.animation.LinearInterpolator
            r11.<init>()
            r4.setInterpolator(r11)
            sg r11 = new sg
            r11.<init>((android.view.View) r12, (int) r6, (java.lang.String) r7, (defpackage.k81) r3)
            r4.addListener(r11)
            r4.start()
            r10.K0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn1.y(boolean, vwe):void");
    }
}
