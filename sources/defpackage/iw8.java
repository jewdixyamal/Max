package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: iw8  reason: default package */
public final class iw8 extends ViewGroup implements mr2 {
    public static final /* synthetic */ bc7[] J0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final Path D0;
    public final RectF E0;
    public final Paint F0;
    public final Paint G0;
    public final TextPaint H0;
    public final gi I0;
    public final hw8 a = new hw8(this, 0);
    public final hw8 b = new hw8(this, 1);
    public is0 c;
    public Layout o;
    public Layout s0;
    public Layout t0;
    public Layout u0;
    public final je7 v0;
    public Layout w0;
    public Layout x0;
    public int y0;
    public Layout z0;

    static {
        Class<iw8> cls = iw8.class;
        J0 = new bc7[]{new oi9(cls, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;"), rh4.g(nec.a, cls, "isFloating", "isFloating()Z")};
    }

    public iw8(Context context) {
        super(context);
        this.v0 = tu0.r(3, new hy4(context, 15));
        this.A0 = tu0.r(3, new j78(9));
        this.B0 = tu0.r(3, new j78(10));
        this.C0 = tu0.r(3, new hy4(context, 16));
        this.D0 = new Path();
        this.E0 = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.F0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        this.G0 = paint2;
        TextPaint textPaint = new TextPaint();
        os2.c.a(textPaint, context.getResources().getDisplayMetrics(), du4.b);
        this.H0 = textPaint;
        this.I0 = new gi(2, this);
    }

    public static final void f(iw8 iw8, Canvas canvas, float f) {
        boolean h = iw8.h();
        Paint paint = iw8.G0;
        float strokeWidth = h ? 0.0f : paint.getStrokeWidth();
        boolean h2 = iw8.h();
        float measuredHeight = (float) iw8.getMeasuredHeight();
        if (!h2) {
            measuredHeight -= paint.getStrokeWidth();
        }
        canvas.drawLine(f, strokeWidth, f, measuredHeight, paint);
    }

    private final s5a getAvatarView() {
        return (s5a) this.v0.getValue();
    }

    private final ix3 getDefaultImageOutlineProvider() {
        return (ix3) this.A0.getValue();
    }

    private final fw8 getDrawMode() {
        bc7 bc7 = J0[0];
        return (fw8) this.a.b;
    }

    private final OneMeDraweeView getImageView() {
        return (OneMeDraweeView) this.C0.getValue();
    }

    private final ix3 getRoundImageOutlineProvider() {
        return (ix3) this.B0.getValue();
    }

    private final void setDrawMode(fw8 fw8) {
        this.a.o1(this, J0[0], fw8);
    }

    private final void setFloating(boolean z) {
        this.b.o1(this, J0[1], Boolean.valueOf(z));
    }

    public final void a(is0 is0) {
        this.c = is0;
        n();
        Paint paint = this.G0;
        boolean h = h();
        ks0 ks0 = is0.c;
        paint.setColor(h ? ks0.d : ks0.c);
        this.F0.setColor(qp4.u0.j(this).a().s().b.g);
        invalidate();
    }

    public final int b() {
        if (h()) {
            return tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        }
        if (getDrawMode() == fw8.Y) {
            return 0;
        }
        return tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    }

    public final int c() {
        if (h()) {
            return tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    public final void d(Canvas canvas, float f) {
        if (this.y0 > 1) {
            float f2 = (float) 11;
            float G = f + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f2));
            float bottom = ((float) getImageView().getBottom()) - ((float) tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            TextPaint textPaint = this.H0;
            pq9 pq9 = qp4.u0;
            textPaint.setColor(pq9.j(this).b().e);
            canvas.drawCircle(G, bottom, (float) tu0.G(((float) 9) * fk4.d().getDisplayMetrics().density), textPaint);
            textPaint.setColor(pq9.j(this).a().s().g.a);
            float f3 = (float) 2;
            float measureText = G - (textPaint.measureText(String.valueOf(this.y0)) / f3);
            float descent = textPaint.descent();
            canvas.drawText(String.valueOf(this.y0), measureText, bottom - ((textPaint.ascent() + descent) / f3), textPaint);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        n();
        int b2 = b();
        int c2 = c();
        boolean h = h();
        Path path = this.D0;
        if (h) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.drawRect(this.E0, this.F0);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        boolean h2 = h();
        fw8 fw8 = fw8.Y;
        if (h2 || getDrawMode() != fw8) {
            boolean K = c54.K(this);
            Paint paint = this.G0;
            float measuredWidth = K ? ((float) getMeasuredWidth()) - (paint.getStrokeWidth() / ((float) 2)) : paint.getStrokeWidth() / ((float) 2);
            if (h()) {
                int save2 = canvas.save();
                canvas.clipPath(path);
                try {
                    f(this, canvas, measuredWidth);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } else {
                int save3 = canvas.save();
                try {
                    f(this, canvas, measuredWidth);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
        }
        if (!(getDrawMode() == fw8 || getDrawMode() == fw8.c)) {
            Layout layout = this.o;
            int save4 = canvas.save();
            canvas.translate((float) b2, (float) c2);
            if (layout != null) {
                try {
                    layout.draw(canvas);
                } catch (Throwable th) {
                    canvas.restoreToCount(save4);
                    throw th;
                }
            }
            canvas.restoreToCount(save4);
            c2 += nu0.p(this.o);
        }
        int ordinal = getDrawMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int c3 = rh4.c((float) 2, fk4.d().getDisplayMetrics().density, c2);
                int d = wg0.d((float) 6, fk4.d().getDisplayMetrics().density, tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density), b2);
                Layout layout2 = this.t0;
                float f = (float) d;
                int save5 = canvas.save();
                canvas.translate(f, (float) c3);
                if (layout2 != null) {
                    try {
                        layout2.draw(canvas);
                    } catch (Throwable th2) {
                        canvas.restoreToCount(save5);
                        throw th2;
                    }
                }
                canvas.restoreToCount(save5);
                int p = nu0.p(this.t0) + c3;
                Layout layout3 = this.u0;
                int save6 = canvas.save();
                canvas.translate(f, (float) p);
                if (layout3 != null) {
                    try {
                        layout3.draw(canvas);
                    } catch (Throwable th3) {
                        canvas.restoreToCount(save6);
                        throw th3;
                    }
                }
                canvas.restoreToCount(save6);
            } else if (ordinal == 2) {
                d(canvas, (float) b2);
                int d2 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density), b2);
                int measuredHeight = (((getMeasuredHeight() - c2) / 2) - ((nu0.p(this.z0) + nu0.p(this.o)) / 2)) + c2;
                Layout layout4 = this.o;
                float f2 = (float) d2;
                int save7 = canvas.save();
                canvas.translate(f2, (float) measuredHeight);
                if (layout4 != null) {
                    try {
                        layout4.draw(canvas);
                    } catch (Throwable th4) {
                        canvas.restoreToCount(save7);
                        throw th4;
                    }
                }
                canvas.restoreToCount(save7);
                int p2 = nu0.p(this.o) + measuredHeight;
                Layout layout5 = this.z0;
                int save8 = canvas.save();
                canvas.translate(f2, (float) p2);
                if (layout5 != null) {
                    try {
                        layout5.draw(canvas);
                    } catch (Throwable th5) {
                        canvas.restoreToCount(save8);
                        throw th5;
                    }
                }
                canvas.restoreToCount(save8);
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    Layout layout6 = this.w0;
                    float f3 = (float) b2;
                    int save9 = canvas.save();
                    canvas.translate(f3, (float) c2);
                    if (layout6 != null) {
                        try {
                            layout6.draw(canvas);
                        } catch (Throwable th6) {
                            canvas.restoreToCount(save9);
                            throw th6;
                        }
                    }
                    canvas.restoreToCount(save9);
                    int p3 = nu0.p(this.w0) + c2;
                    d(canvas, f3);
                    int d3 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, getImageView().getMeasuredWidth(), b2);
                    Layout layout7 = this.x0;
                    float f4 = (float) d3;
                    int save10 = canvas.save();
                    canvas.translate(f4, (float) p3);
                    if (layout7 != null) {
                        try {
                            layout7.draw(canvas);
                        } catch (Throwable th7) {
                            canvas.restoreToCount(save10);
                            throw th7;
                        }
                    }
                    canvas.restoreToCount(save10);
                    int p4 = nu0.p(this.x0) + p3;
                    Layout layout8 = this.z0;
                    int save11 = canvas.save();
                    canvas.translate(f4, (float) p4);
                    if (layout8 != null) {
                        try {
                            layout8.draw(canvas);
                        } catch (Throwable th8) {
                            canvas.restoreToCount(save11);
                            throw th8;
                        }
                    }
                    canvas.restoreToCount(save11);
                } else if (ordinal == 5) {
                    Layout layout9 = this.w0;
                    float f5 = (float) b2;
                    int save12 = canvas.save();
                    canvas.translate(f5, (float) c2);
                    if (layout9 != null) {
                        try {
                            layout9.draw(canvas);
                        } catch (Throwable th9) {
                            canvas.restoreToCount(save12);
                            throw th9;
                        }
                    }
                    canvas.restoreToCount(save12);
                    int p5 = nu0.p(this.w0) + c2;
                    Layout layout10 = this.x0;
                    int save13 = canvas.save();
                    canvas.translate(f5, (float) p5);
                    if (layout10 != null) {
                        try {
                            layout10.draw(canvas);
                        } catch (Throwable th10) {
                            canvas.restoreToCount(save13);
                            throw th10;
                        }
                    }
                    canvas.restoreToCount(save13);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            super.dispatchDraw(canvas);
        }
        if (getDrawMode() == fw8.o) {
            Layout layout11 = this.w0;
            float f6 = (float) b2;
            int save14 = canvas.save();
            canvas.translate(f6, (float) c2);
            if (layout11 != null) {
                try {
                    layout11.draw(canvas);
                } catch (Throwable th11) {
                    canvas.restoreToCount(save14);
                    throw th11;
                }
            }
            canvas.restoreToCount(save14);
            int p6 = nu0.p(this.w0) + c2;
            Layout layout12 = this.x0;
            int save15 = canvas.save();
            canvas.translate(f6, (float) p6);
            if (layout12 != null) {
                try {
                    layout12.draw(canvas);
                } catch (Throwable th12) {
                    canvas.restoreToCount(save15);
                    throw th12;
                }
            }
            canvas.restoreToCount(save15);
            c2 = wg0.d((float) 6, fk4.d().getDisplayMetrics().density, nu0.p(this.x0), p6);
        }
        Layout layout13 = this.s0;
        int save16 = canvas.save();
        canvas.translate((float) b2, (float) c2);
        if (layout13 != null) {
            try {
                layout13.draw(canvas);
            } catch (Throwable th13) {
                canvas.restoreToCount(save16);
                throw th13;
            }
        }
        canvas.restoreToCount(save16);
        super.dispatchDraw(canvas);
    }

    public final void g(xv8 xv8) {
        ay7.b(this, getImageView(), -1);
        OneMeDraweeView imageView = getImageView();
        String str = xv8.a;
        int i = 0;
        if (!(!(str == null || str.length() == 0))) {
            i = 8;
        }
        imageView.setVisibility(i);
        OneMeDraweeView imageView2 = getImageView();
        wv6 wv6 = null;
        String str2 = xv8.a;
        wv6 b2 = str2 != null ? wv6.b(str2) : null;
        Uri uri = xv8.d;
        if (uri != null) {
            wv6 = wv6.a(uri);
        }
        imageView2.o(b2, wv6);
        getImageView().setOutlineProvider(xv8.e ? getRoundImageOutlineProvider() : getDefaultImageOutlineProvider());
        this.y0 = xv8.b;
        this.z0 = xv8.c;
    }

    public final boolean h() {
        bc7 bc7 = J0[1];
        return ((Boolean) this.b.b).booleanValue();
    }

    public final void i(Layout layout, wv8 wv8) {
        setDrawMode(fw8.b);
        this.o = layout;
        this.t0 = wv8.a;
        this.u0 = wv8.b;
        ay7.b(this, getAvatarView(), -1);
        getAvatarView().setVisibility(0);
        s5a.i(getAvatarView(), wv8.e, Long.valueOf(wv8.c), wv8.d);
    }

    public final void j(Layout layout, xv8 xv8, vv8 vv8) {
        setDrawMode(fw8.X);
        this.o = layout;
        g(xv8);
        this.w0 = vv8.b();
        this.x0 = vv8.a();
    }

    public final void k(Layout layout, xv8 xv8) {
        setDrawMode(fw8.c);
        this.o = layout;
        g(xv8);
    }

    public final void l(Layout layout, Layout layout2, vv8 vv8) {
        setDrawMode(fw8.o);
        this.o = layout;
        this.s0 = layout2;
        this.w0 = vv8.b();
        this.x0 = vv8.a();
    }

    public final void m(Layout layout, Layout layout2) {
        setDrawMode(fw8.a);
        this.o = layout;
        this.s0 = layout2;
        od2.W(this, layout2, this.I0);
    }

    public final void n() {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextPaint paint7;
        is0 is0 = this.c;
        if (is0 != null) {
            Layout layout = this.o;
            pq9 pq9 = qp4.u0;
            ls0 ls0 = is0.d;
            if (!(layout == null || (paint7 = layout.getPaint()) == null)) {
                paint7.setColor(h() ? pq9.j(this).a().s().g.a : ls0.l);
            }
            Layout layout2 = this.s0;
            if (!(layout2 == null || (paint6 = layout2.getPaint()) == null)) {
                paint6.setColor(h() ? pq9.j(this).a().s().g.a : ls0.k);
            }
            Layout layout3 = this.s0;
            if (layout3 != null) {
                CharSequence text = layout3.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned != null) {
                    Object[] spans = spanned.getSpans(0, layout3.getText().length(), Object.class);
                    if (spans != null) {
                        for (Object obj : spans) {
                            mr2 mr2 = obj instanceof mr2 ? (mr2) obj : null;
                            if (mr2 != null) {
                                mr2.a(is0);
                            }
                        }
                    }
                }
            }
            Layout layout4 = this.u0;
            if (!(layout4 == null || (paint5 = layout4.getPaint()) == null)) {
                paint5.setColor(h() ? pq9.j(this).a().s().g.a : ls0.k);
            }
            Layout layout5 = this.t0;
            if (!(layout5 == null || (paint4 = layout5.getPaint()) == null)) {
                paint4.setColor(h() ? pq9.j(this).a().s().g.a : ls0.k);
            }
            Layout layout6 = this.w0;
            if (!(layout6 == null || (paint3 = layout6.getPaint()) == null)) {
                paint3.setColor(h() ? pq9.j(this).a().s().g.a : ls0.g);
            }
            Layout layout7 = this.x0;
            if (!(layout7 == null || (paint2 = layout7.getPaint()) == null)) {
                paint2.setColor(h() ? pq9.j(this).a().s().g.a : ls0.l);
            }
            Layout layout8 = this.z0;
            if (layout8 != null && (paint = layout8.getPaint()) != null) {
                paint.setColor(h() ? pq9.j(this).a().s().g.a : ls0.k);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.s0;
        if (layout != null) {
            od2.W(this, layout, this.I0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.s0;
        if (layout != null) {
            od2.Y(layout, this.I0);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b2 = b();
        int p = nu0.p(this.o) + c();
        int ordinal = getDrawMode().ordinal();
        if (ordinal == 1) {
            ote.E(getAvatarView(), b2, rh4.c((float) 2, fk4.d().getDisplayMetrics().density, p), 0, 12);
        } else if (ordinal == 2) {
            ote.E(getImageView(), b2, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else if (ordinal == 4) {
            ote.E(getImageView(), b2, nu0.p(this.w0) + p, 0, 12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (r10 != 4) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            int r10 = r8.c()
            r0 = 2
            int r10 = r10 * r0
            int r1 = r8.b()
            fw8 r2 = r8.getDrawMode()
            int[] r3 = defpackage.gw8.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 6
            if (r2 != r3) goto L_0x003e
            android.text.Layout r0 = r8.w0
            int r0 = defpackage.nu0.p(r0)
            android.text.Layout r2 = r8.x0
            int r2 = defpackage.nu0.p(r2)
            int r2 = r2 + r0
            int r2 = r2 + r10
            android.text.Layout r10 = r8.w0
            int r10 = defpackage.nu0.q(r10)
            android.text.Layout r0 = r8.x0
            int r0 = defpackage.nu0.q(r0)
            int r10 = java.lang.Math.max(r10, r0)
            int r1 = r1 + r10
            goto L_0x0202
        L_0x003e:
            android.text.Layout r2 = r8.o
            int r2 = defpackage.nu0.p(r2)
            int r2 = r2 + r10
            fw8 r10 = r8.getDrawMode()
            int r10 = r10.ordinal()
            r4 = 3
            if (r10 == 0) goto L_0x019f
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            if (r10 == r6) goto L_0x0115
            r6 = 4
            if (r10 == r0) goto L_0x005e
            if (r10 == r4) goto L_0x019f
            if (r10 == r6) goto L_0x005e
            goto L_0x0202
        L_0x005e:
            r10 = 32
            float r10 = (float) r10
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r10 = r10 * r0
            int r10 = defpackage.tu0.G(r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = r8.getImageView()
            r0.measure(r10, r10)
            fw8 r10 = r8.getDrawMode()
            fw8 r0 = defpackage.fw8.c
            if (r10 != r0) goto L_0x00ac
            one.me.sdk.uikit.common.views.OneMeDraweeView r10 = r8.getImageView()
            int r10 = r10.getMeasuredWidth()
            float r0 = (float) r6
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r10 = defpackage.rh4.c(r0, r3, r10)
            android.text.Layout r0 = r8.o
            int r0 = defpackage.nu0.q(r0)
            android.text.Layout r3 = r8.z0
            int r3 = defpackage.nu0.q(r3)
            int r0 = java.lang.Math.max(r0, r3)
        L_0x00aa:
            int r0 = r0 + r10
            goto L_0x00de
        L_0x00ac:
            one.me.sdk.uikit.common.views.OneMeDraweeView r10 = r8.getImageView()
            int r10 = r10.getMeasuredWidth()
            float r0 = (float) r6
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r10 = defpackage.rh4.c(r0, r3, r10)
            android.text.Layout r0 = r8.o
            int r0 = defpackage.nu0.q(r0)
            android.text.Layout r3 = r8.z0
            int r3 = defpackage.nu0.q(r3)
            android.text.Layout r4 = r8.x0
            int r4 = defpackage.nu0.q(r4)
            int r3 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r3)
            goto L_0x00aa
        L_0x00de:
            int r1 = r1 + r0
            one.me.sdk.uikit.common.views.OneMeDraweeView r10 = r8.getImageView()
            int r10 = r10.getMeasuredHeight()
            android.text.Layout r0 = r8.z0
            int r0 = defpackage.nu0.p(r0)
            android.text.Layout r3 = r8.o
            int r3 = defpackage.nu0.p(r3)
            int r3 = r3 + r0
            int r10 = java.lang.Math.max(r10, r3)
            int r10 = r10 + r2
            fw8 r0 = r8.getDrawMode()
            fw8 r2 = defpackage.fw8.X
            if (r0 != r2) goto L_0x010b
            android.text.Layout r0 = r8.w0
            int r0 = defpackage.nu0.p(r0)
            int r2 = r0 + r10
            goto L_0x0202
        L_0x010b:
            android.text.Layout r0 = r8.o
            int r0 = defpackage.nu0.p(r0)
            int r2 = r10 - r0
            goto L_0x0202
        L_0x0115:
            float r10 = (float) r0
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r10 = r10 * r0
            int r10 = defpackage.tu0.G(r10)
            r0 = 28
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r0
            int r4 = defpackage.tu0.G(r4)
            android.text.Layout r6 = r8.u0
            int r6 = defpackage.nu0.p(r6)
            android.text.Layout r7 = r8.t0
            int r7 = defpackage.nu0.p(r7)
            int r7 = r7 + r6
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = r4 + r10
            int r2 = r2 + r4
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r0
            int r10 = defpackage.tu0.G(r10)
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r10 = defpackage.rh4.c(r3, r4, r10)
            android.text.Layout r3 = r8.u0
            int r3 = defpackage.nu0.q(r3)
            android.text.Layout r4 = r8.t0
            int r4 = defpackage.nu0.q(r4)
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + r10
            android.text.Layout r10 = r8.o
            int r10 = defpackage.nu0.q(r10)
            int r10 = java.lang.Math.max(r10, r3)
            int r1 = r1 + r10
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r0 = r0 * r10
            int r10 = defpackage.tu0.G(r0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            s5a r0 = r8.getAvatarView()
            r0.measure(r10, r10)
            goto L_0x0202
        L_0x019f:
            android.text.Layout r10 = r8.s0
            int r10 = defpackage.nu0.p(r10)
            int r2 = r2 + r10
            android.text.Layout r10 = r8.o
            int r10 = defpackage.nu0.q(r10)
            android.text.Layout r5 = r8.s0
            int r5 = defpackage.nu0.q(r5)
            android.text.Layout r6 = r8.w0
            int r6 = defpackage.nu0.q(r6)
            android.text.Layout r7 = r8.x0
            int r7 = defpackage.nu0.q(r7)
            int[] r5 = new int[]{r5, r6, r7}
            r6 = 0
        L_0x01c3:
            if (r6 >= r4) goto L_0x01ce
            r7 = r5[r6]
            int r10 = java.lang.Math.max(r10, r7)
            int r6 = r6 + 1
            goto L_0x01c3
        L_0x01ce:
            int r1 = r1 + r10
            fw8 r10 = r8.getDrawMode()
            fw8 r4 = defpackage.fw8.o
            if (r10 != r4) goto L_0x0202
            android.text.Layout r10 = r8.w0
            int r10 = defpackage.nu0.p(r10)
            float r0 = (float) r0
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r10 = defpackage.rh4.c(r0, r4, r10)
            android.text.Layout r0 = r8.x0
            int r0 = defpackage.nu0.p(r0)
            int r0 = r0 + r10
            float r10 = (float) r3
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r2 = defpackage.wg0.d(r10, r3, r0, r2)
        L_0x0202:
            boolean r10 = r8.h()
            if (r10 == 0) goto L_0x0219
            r10 = 8
            float r10 = (float) r10
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            int r1 = defpackage.rh4.c(r10, r0, r1)
        L_0x0219:
            if (r1 <= r9) goto L_0x021c
            goto L_0x021d
        L_0x021c:
            r9 = r1
        L_0x021d:
            r8.setMeasuredDimension(r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw8.onMeasure(int, int):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.E0;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.D0;
        path.reset();
        path.addRoundRect(rectF, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, Path.Direction.CW);
    }

    public final void setIsFloating(boolean z) {
        setFloating(z);
    }

    public final void setSingleForward(vv8 vv8) {
        setDrawMode(fw8.Y);
        this.w0 = vv8.b();
        this.x0 = vv8.a();
    }
}
