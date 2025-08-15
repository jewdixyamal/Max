package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: dif  reason: default package */
public final class dif extends ViewGroup implements k34, l7c, jw8, aoa, cmf, bmf, mhf {
    public static final /* synthetic */ bc7[] L0;
    public final xhf A0;
    public final je7 B0;
    public final je7 C0;
    public final int D0;
    public final int E0;
    public final yj F0;
    public o50 G0;
    public vxd H0;
    public vxd I0;
    public ValueAnimator J0;
    public int K0;
    public final m56 a;
    public final r6c b;
    public final dw8 c;
    public final boa o;
    public final zef s0;
    public final ShapeDrawable t0;
    public final jjf u0 = new jjf();
    public final bu6 v0;
    public final mdf w0;
    public final j34 x0;
    public final je7 y0;
    public final Rect z0;

    static {
        oi9 oi9 = new oi9(dif.class, "model", "getModel()Lone/me/messages/list/loader/model/VideoMessageAttach;");
        nec.a.getClass();
        L0 = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boa, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dif(Context context, om8 om8) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        ? obj = new Object();
        zef zef = new zef();
        this.a = om8;
        this.b = r6c;
        this.c = dw8;
        this.o = obj;
        this.s0 = zef;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.setCallback(this);
        this.t0 = shapeDrawable;
        bu6 bu6 = new bu6(context);
        wnc wnc = new wnc();
        wnc.b = true;
        ((la6) bu6.getHierarchy()).n(wnc);
        tu0.K(bu6, 300, new elb(14, (Object) this));
        bu6.setOnLongClickListener(new zl0(12, this));
        this.v0 = bu6;
        mdf mdf = new mdf(context);
        mdf.setBackgroundEnabled(true);
        mdf.setDrawableEnabled(false);
        mdf.setCapsuleInside(false);
        this.w0 = mdf;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(true);
        j34.setBackgroundColor(getColorBubbleOutside());
        this.x0 = j34;
        this.y0 = tu0.r(3, new whf(this, 0));
        this.z0 = new Rect();
        xhf xhf = new xhf();
        xhf.b(getIconBackgroundColor(), Integer.valueOf(tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density)));
        Drawable b2 = kt3.b(getContext(), woc.P0);
        int G = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        int iconColor = getIconColor();
        xhf.addLayer(b2);
        b2.setTint(iconColor);
        xhf.setLayerSize(1, G, G);
        xhf.setLayerGravity(1, 17);
        this.A0 = xhf;
        this.B0 = tu0.r(3, new whf(this, 1));
        this.C0 = tu0.r(3, new khf(context, this));
        float f = (float) 4;
        this.D0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.E0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.F0 = new yj(28, this);
        r6c.b = this;
        dw8.b = this;
        zef.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(bu6, new ViewGroup.LayoutParams(-1, -1));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        addView(mdf, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.K0 = tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density);
    }

    public static xhf a(dif dif) {
        xhf xhf = new xhf();
        xhf.b(dif.getIconBackgroundColor(), Integer.valueOf(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density)));
        a10 a10 = new a10();
        a10.a = kt3.b(dif.getContext(), woc.m0);
        a10.invalidateSelf();
        a10.p.setColor(dif.getIconColor());
        a10.invalidateSelf();
        a10.e = true;
        a10.invalidateSelf();
        int G = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
        int iconColor = dif.getIconColor();
        xhf.addLayer(a10);
        a10.setTint(iconColor);
        xhf.setLayerSize(1, G, G);
        xhf.setLayerGravity(1, 17);
        return xhf;
    }

    public static void b(dif dif) {
        wgf model = dif.getModel();
        if (model != null) {
            dif.a.invoke(new k19(model.a, model));
        }
    }

    public static xhf d(dif dif) {
        xhf xhf = new xhf();
        xhf.b(dif.getIconBackgroundColor(), Integer.valueOf(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density)));
        Drawable b2 = kt3.b(dif.getContext(), woc.u0);
        int G = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        int iconColor = dif.getIconColor();
        xhf.addLayer(b2);
        b2.setTint(iconColor);
        xhf.setLayerSize(1, G, G);
        xhf.setLayerGravity(1, 17);
        return xhf;
    }

    public static final void e(dif dif) {
        wgf model = dif.getModel();
        if (model != null) {
            dif.a.invoke(new l19(model.a, model));
        }
    }

    private final int getBorderColor() {
        return qp4.u0.j(this).a().k().a.h;
    }

    private final boolean getCanDrawMuteIcon() {
        return getMeasuredWidth() == tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density) && this.v0.getOverlayDrawable() == null;
    }

    private final int getColorBubbleOutside() {
        return qp4.u0.j(this).a().s().b.g;
    }

    private final ohf getDurationSlider() {
        return (ohf) this.C0.getValue();
    }

    private final int getIconBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final int getIconColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    private final wgf getModel() {
        bc7 bc7 = L0[0];
        return (wgf) this.F0.b;
    }

    private final xhf getNeedDownloadDrawable() {
        return (xhf) this.y0.getValue();
    }

    private final xhf getProgressDownloadDrawable() {
        return (xhf) this.B0.getValue();
    }

    public static final void h(dif dif) {
        dif dif2 = dif;
        wgf model = dif.getModel();
        if (model != null) {
            wcf wcf = model.c;
            yt6 yt6 = r3;
            yt6 yt62 = new yt6(0, wcf.b, wcf.c, wcf.d, false, wcf.e, false, wcf.h, wcf.i, (String) null, (Uri) null, 3584);
            dif2.v0.setImageAttach(yt6);
            long e = ft4.e(wcf.f);
            String[] strArr = are.b;
            dif2.w0.setContent(tfg.c(e));
            dif2.y(model.e);
            dif.requestLayout();
            dif.invalidate();
        }
    }

    public static final void i(dif dif, ijf ijf) {
        wgf model = dif.getModel();
        if (tpa.f(model != null ? Long.valueOf(model.a) : null, ijf != null ? Long.valueOf(ijf.a) : null)) {
            zef zef = dif.s0;
            View R = zef.R();
            if (R != null) {
                R.setForeground((Drawable) null);
            }
            int i = ijf != null ? ijf.X : 0;
            int i2 = i == 0 ? -1 : yhf.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 != 1) {
                bu6 bu6 = dif.v0;
                if (i2 == 2) {
                    int maxAvailableWidth$message_list_release = ((zs8) dif.getParent()).getMaxAvailableWidth$message_list_release();
                    bu6.setOverlayDrawable((Drawable) null);
                    int G = tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density);
                    if (G == bu6.getMeasuredWidth()) {
                        ValueAnimator valueAnimator = dif.J0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{G, maxAvailableWidth$message_list_release});
                        ofInt.addUpdateListener(new yj0(9, dif));
                        ofInt.setDuration(300);
                        ofInt.addListener(new cif(dif, 0));
                        ofInt.start();
                        dif.J0 = ofInt;
                    }
                } else if (i2 == 3) {
                    ay7.b(dif, dif.getDurationSlider(), -1);
                    dif.getDurationSlider().setVisibility(0);
                    ohf.k(dif.getDurationSlider(), ijf.Y);
                } else if (i2 == 5) {
                    je7 je7 = dif.C0;
                    if (je7.a()) {
                        ohf ohf = (ohf) je7.getValue();
                        ohf.setVisibility(8);
                        ohf.j();
                    }
                    zef.u();
                    int i3 = dif.K0;
                    int G2 = tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density);
                    if (i3 == bu6.getMeasuredWidth()) {
                        ValueAnimator valueAnimator2 = dif.J0;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{i3, G2});
                        ofInt2.addUpdateListener(new yj0(9, dif));
                        ofInt2.setDuration(300);
                        ofInt2.addListener(new cif(dif, 1));
                        ofInt2.start();
                        dif.J0 = ofInt2;
                    }
                }
            } else {
                dif.s0.o(ijf, ijf.c, ijf.a, false, false);
            }
        }
    }

    private final void setModel(wgf wgf) {
        this.F0.o1(this, L0[0], wgf);
    }

    public final void c(is0 is0) {
        this.c.c(is0);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.t0.draw(canvas);
        if (getCanDrawMuteIcon()) {
            Rect rect = this.z0;
            xhf xhf = this.A0;
            xhf.setBounds(rect);
            xhf.draw(canvas);
        }
    }

    public final void f(ix8 ix8, boolean z) {
        this.b.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.x0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.o.a;
    }

    public View getPreviewView() {
        return this.v0;
    }

    public final boolean j() {
        return this.s0.j();
    }

    public final void k(is0 is0, boolean z) {
        this.b.k(is0, z);
    }

    public final void l() {
        this.c.l();
    }

    public final boolean m() {
        return br7.H((je7) this.s0.c);
    }

    public final void n(wgf wgf) {
        o50 o50;
        setModel(wgf);
        this.G0 = new o50(this, 14, wgf);
        if (isAttachedToWindow() && (o50 = this.G0) != null) {
            o50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.G0);
    }

    public final void o(tlf tlf, o00 o00, long j, boolean z, boolean z2) {
        this.s0.o(tlf, o00, j, z, true);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jjf jjf = this.u0;
        jjf.getClass();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Region region = (Region) jjf.e;
        if (!region.isEmpty()) {
            Region region2 = (Region) jjf.d;
            if (!region2.isEmpty() && !region.contains(x, y) && region2.contains(x, y)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f = (float) 4;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        int i6 = 0;
        if (br7.H((je7) this.c.c)) {
            int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, G);
            this.c.T(0, c2);
            G = wg0.d(f, fk4.d().getDisplayMetrics().density, this.c.K(), c2);
        }
        ote.E(this.v0, 0, G, 0, 12);
        if (getCanDrawMuteIcon()) {
            int measuredWidth = ((this.v0.getMeasuredWidth() / 2) + this.v0.getLeft()) - (this.A0.getIntrinsicWidth() / 2);
            int q = rh4.q((float) 12, fk4.d().getDisplayMetrics().density, this.v0.getBottom() - this.A0.getIntrinsicHeight());
            this.z0.set(measuredWidth, q, this.A0.getIntrinsicWidth() + measuredWidth, this.A0.getIntrinsicHeight() + q);
        }
        je7 je7 = this.C0;
        if (je7.a()) {
            ote.E((ohf) je7.getValue(), 0, G, 0, 12);
        }
        if (br7.H((je7) this.s0.c)) {
            this.s0.T(0, G);
            View R = this.s0.R();
            if (R != null) {
                int x = (int) R.getX();
                int y = (int) R.getY();
                this.t0.setBounds(x, y, R.getMeasuredWidth() + x, R.getMeasuredHeight() + y);
                jjf jjf = this.u0;
                jjf.getClass();
                int measuredWidth2 = R.getMeasuredWidth();
                int measuredHeight = R.getMeasuredHeight();
                if (!(measuredWidth2 == jjf.a && measuredHeight == jjf.b)) {
                    jjf.a = measuredWidth2;
                    jjf.b = measuredHeight;
                    if (R.getMeasuredWidth() != R.getMeasuredHeight()) {
                        String name = jjf.class.getName();
                        ir6 ir6 = hm9.m;
                        if (ir6 != null && ir6.c()) {
                            ir6.d(us7.Z, name, rh4.h("Cannot calculate a video msg clickable area: w=", R.getMeasuredWidth(), R.getMeasuredHeight(), ", h="), (Throwable) null);
                        }
                    } else {
                        float measuredWidth3 = ((float) R.getMeasuredWidth()) / 2.0f;
                        ((Path) jjf.c).reset();
                        ((Path) jjf.c).addCircle(((float) R.getLeft()) + measuredWidth3, ((float) R.getTop()) + measuredWidth3, measuredWidth3, Path.Direction.CW);
                        ((Region) jjf.d).set(R.getLeft(), R.getTop(), R.getRight(), R.getBottom());
                        ((Region) jjf.e).setPath((Path) jjf.c, (Region) jjf.d);
                    }
                }
            }
        } else {
            bu6 bu6 = this.v0;
            int x2 = (int) bu6.getX();
            int y2 = (int) bu6.getY();
            this.t0.setBounds(x2, y2, bu6.getMeasuredWidth() + x2, bu6.getMeasuredHeight() + y2);
            jjf jjf2 = this.u0;
            ((Region) jjf2.e).setEmpty();
            ((Region) jjf2.d).setEmpty();
            jjf2.a = -1;
            jjf2.b = -1;
        }
        if (br7.H((je7) this.b.c)) {
            i5 = rh4.q((float) 10, fk4.d().getDisplayMetrics().density, rh4.q((float) 8, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - this.b.K()));
        } else {
            i5 = getMeasuredHeight();
        }
        ote.E(this.x0, (getMeasuredWidth() - this.x0.getMeasuredWidth()) - this.E0, (i5 - this.x0.getMeasuredHeight()) - this.D0, 0, 12);
        ote.E(this.w0, 0, (i5 - this.w0.getMeasuredHeight()) - this.D0, 0, 12);
        if (br7.H((je7) this.b.c)) {
            int c3 = rh4.c((float) 10, fk4.d().getDisplayMetrics().density, i5);
            r6c r6c = this.b;
            if (r6c.Z) {
                i6 = getMeasuredWidth() - this.b.L();
            }
            r6c.T(i6, c3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : wg0.m((float) 10, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i3 = getDependOnOutsideView() ? size : 0;
        float f = (float) 4;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        dw8 dw8 = this.c;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            i3 = Math.max(i3, dw8.L());
            G += (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + dw8.K();
        }
        j34 j34 = this.x0;
        j34.measure(i, i2);
        mdf mdf = this.w0;
        mdf.measure(i, i2);
        int max = Math.max(j34.getMeasuredHeight(), mdf.getMeasuredHeight()) + G;
        int i4 = this.K0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        bu6 bu6 = this.v0;
        bu6.measure(makeMeasureSpec, makeMeasureSpec2);
        je7 je7 = this.C0;
        if (je7.a()) {
            ((ohf) je7.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        int max2 = Math.max(i3, Math.max(bu6.getMeasuredWidth(), mdf.getMeasuredWidth() + j34.getMeasuredWidth()));
        int measuredHeight = bu6.getMeasuredHeight() + max;
        zef zef = this.s0;
        if (br7.H((je7) zef.c)) {
            zef.U(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        r6c r6c = this.b;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            max2 = Math.max(max2, r6c.L());
            measuredHeight = wg0.d((float) 8, fk4.d().getDisplayMetrics().density, r6c.K() + tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density), measuredHeight);
        }
        setMeasuredDimension(max2, measuredHeight);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void onStartTemporaryDetach() {
        this.s0.u();
        int i = this.K0;
        int G = tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density);
        if (i == this.v0.getMeasuredWidth()) {
            ValueAnimator valueAnimator = this.J0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, G});
            ofInt.addUpdateListener(new yj0(9, this));
            ofInt.setDuration(300);
            ofInt.addListener(new Object());
            ofInt.start();
            this.J0 = ofInt;
        }
        super.onStartTemporaryDetach();
    }

    public final void p(v83 v83) {
        Drawable foreground = this.v0.getForeground();
        xhf xhf = foreground instanceof xhf ? (xhf) foreground : null;
        m73 m73 = v83.b;
        w83 w83 = v83.c;
        if (xhf != null) {
            w83.getClass();
            m73.getClass();
            xhf.a();
        }
        w83.getClass();
        m73.getClass();
        this.A0.a();
        ShapeDrawable shapeDrawable = this.t0;
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.invalidateSelf();
        this.w0.invalidate();
    }

    public final void q(boolean z) {
        this.b.q(z);
    }

    public final /* bridge */ /* synthetic */ xlf r(boolean z) {
        return vlf.a;
    }

    public final boolean s() {
        return this.s0.s();
    }

    public void setChipObserver(w5c w5c) {
        this.b.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
        this.x0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.x0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.x0.setStatus$message_list_release(zof);
    }

    public void setDependOnOutsideView(boolean z) {
        this.o.a = z;
    }

    public void setForwardClickListener(m56 m56) {
        this.c.X = m56;
    }

    public void setIsIncoming(boolean z) {
        this.b.o = z;
    }

    public void setLink(cw8 cw8) {
        this.c.setLink(cw8);
    }

    public void setOnClickListener(m56 m56) {
        this.b.X = m56;
    }

    public void setReplyClickListener(a66 a66) {
        this.c.o = a66;
    }

    public void setStackFromEnd(boolean z) {
        this.b.Z = z;
    }

    public void setVideoClickListener(a66 a66) {
        this.s0.o = a66;
    }

    public void setVideoLongClickListener(a66 a66) {
        this.s0.X = a66;
    }

    public final void t() {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new h19(model.a, model));
        }
    }

    public final void u() {
        this.s0.u();
    }

    public final void v() {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new i19(model.a, model));
        }
    }

    public final void w(float f) {
        wgf model = getModel();
        if (model != null) {
            this.a.invoke(new j19(model.a, model, f));
        }
    }

    public final void x(float f) {
        bu6 bu6 = this.v0;
        Drawable overlayDrawable = bu6.getOverlayDrawable();
        Drawable drawable = null;
        xhf xhf = overlayDrawable instanceof xhf ? (xhf) overlayDrawable : null;
        if (xhf != null) {
            drawable = xhf.getDrawable(1);
        }
        if (!(drawable instanceof a10)) {
            bu6.setOverlayDrawable(getProgressDownloadDrawable());
            drawable = bu6.getOverlayDrawable();
        }
        if (drawable != null) {
            drawable.setLevel((int) (f * ((float) 100)));
        }
    }

    public final void y(b00 b00) {
        wgf model = getModel();
        if (tpa.f(model != null ? Long.valueOf(model.a) : null, b00 != null ? Long.valueOf(b00.a()) : null) && b00 != null) {
            if (b00 instanceof xz) {
                x(((xz) b00).b);
            } else if (b00 instanceof a00) {
                x(((a00) b00).b);
            } else {
                boolean z = b00 instanceof yz;
                bu6 bu6 = this.v0;
                if (z) {
                    bu6.setOverlayDrawable(getNeedDownloadDrawable());
                } else if (b00 instanceof zz) {
                    bu6.setOverlayDrawable((Drawable) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void z(wgf wgf) {
        setModel(wgf);
    }
}
