package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: s5a  reason: default package */
public final class s5a extends View implements kre {
    public static final /* synthetic */ int K0 = 0;
    public final je7 A0;
    public final je7 B0;
    public k56 C0;
    public k56 D0;
    public boolean E0;
    public tc0 F0;
    public rd0 G0;
    public final wjc H0;
    public final n5 I0;
    public List J0;
    public final String a = s5a.class.getName();
    public final sq4 b;
    public m5a c;
    public int o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public boolean y0;
    public final je7 z0;

    public s5a(Context context) {
        super(context, (AttributeSet) null);
        sq4 sq4 = new sq4(new ma6(getResources()).a());
        umc e = sq4.e();
        if (e != null) {
            e.setCallback(this);
        }
        rq4 rq4 = sq4.o;
        rq4.getClass();
        ya5 ya5 = ((la6) rq4).e;
        ya5.w0 = 50;
        if (ya5.v0 == 1) {
            ya5.v0 = 0;
        }
        this.b = sq4;
        this.c = j5a.a;
        this.o = 1;
        this.v0 = tu0.r(3, new hy4(context, 17));
        this.w0 = tu0.r(3, new hy4(context, 18));
        this.x0 = tu0.r(3, new hy4(context, 19));
        this.z0 = tu0.r(3, new i5a(this, 0));
        this.A0 = tu0.r(3, new i5a(this, 1));
        this.B0 = tu0.r(3, new i5a(this, 2));
        this.H0 = new wjc();
        this.I0 = new n5(2, this);
        sq4.i(f());
    }

    public static LayerDrawable a(s5a s5a) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{s5a.getCallBadgeBackgroundDrawable(), s5a.getCallIconDrawable()});
        int G = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        layerDrawable.setLayerSize(0, G, G);
        layerDrawable.setLayerSize(1, G2, G2);
        layerDrawable.setLayerInset(1, G3, G3, G3, G3);
        return layerDrawable;
    }

    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.v0.getValue();
    }

    private final GradientDrawable getCallBadgeBackgroundDrawable() {
        return (GradientDrawable) this.z0.getValue();
    }

    private final LayerDrawable getCallBadgeDrawable() {
        return (LayerDrawable) this.B0.getValue();
    }

    private final Drawable getCallIconDrawable() {
        return (Drawable) this.A0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.x0.getValue();
    }

    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.w0.getValue();
    }

    public static void h(s5a s5a, String str, uc0 uc0) {
        s5a.setAvatarUrl(str);
        s5a.g(uc0, true);
    }

    public static void i(s5a s5a, String str, Long l, CharSequence charSequence) {
        uc0 a2 = oag.a(charSequence, l);
        s5a.setAvatarUrl(str);
        s5a.g(a2, true);
    }

    public static void j(s5a s5a, Drawable drawable, m5a m5a, int i) {
        if ((i & 2) != 0) {
            m5a = s5a.c;
        }
        m5a m5a2 = m5a;
        fka j = qp4.u0.j(s5a);
        l8 l8Var = new l8(2, j);
        l8 l8Var2 = new l8(3, j);
        s5a.setAvatarShape(m5a2);
        s5a.setCustomPlaceholder(drawable != null ? new rd0(drawable, m5a2, j, l8Var, l8Var2) : null);
        s5a.invalidate();
    }

    public final d2b f() {
        e2b a2 = s36.a.get();
        a2.g = this.H0;
        a2.h = this.I0;
        a2.l = this.b.X;
        a2.k = true;
        return a2.a();
    }

    public final void g(uc0 uc0, boolean z) {
        sq4 sq4 = this.b;
        if (uc0 != null && uc0 != uc0.c && (uc0.a != 0 || uc0.b.length() != 0)) {
            tc0 tc0 = new tc0(this.c, uc0, qp4.u0.b(getContext()).i());
            tc0.t0.o1(tc0, tc0.u0[0], Boolean.valueOf(z));
            this.F0 = tc0;
            rq4 rq4 = sq4.o;
            rq4.getClass();
            ((la6) rq4).i(tc0, 1);
            rq4 rq42 = sq4.o;
            rq42.getClass();
            ((la6) rq42).i(tc0, 5);
            this.o = 3;
        } else if (this.o == 3) {
            rq4 rq43 = sq4.o;
            rq43.getClass();
            ((la6) rq43).i((Drawable) null, 1);
            this.F0 = null;
            this.o = 1;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new o5a(this, drawable, 0));
        } else {
            post(new p5a(this, drawable, 0));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.g();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.h();
    }

    public final void onDraw(Canvas canvas) {
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        umc e = this.b.e();
        if (e != null) {
            e.setBounds(0, 0, min, min);
        }
        if (e != null) {
            e.draw(canvas);
        }
        if (this.s0) {
            int G = min >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density) : min >= tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) : min >= tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            getCloseBadgeDrawable().setBounds(min - G, 0, min, G);
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.t0) {
            int G2 = min - (min >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density) : min >= tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) : min >= tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
            float f = (float) 3;
            getOnlineBadgeDrawable().setBounds(rh4.c(f, fk4.d().getDisplayMetrics().density, G2), rh4.c(f, fk4.d().getDisplayMetrics().density, G2), rh4.c(f, fk4.d().getDisplayMetrics().density, min), rh4.c(f, fk4.d().getDisplayMetrics().density, min));
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.u0) {
            float f2 = (float) 28;
            getAddBadgeDrawable().setBounds(rh4.q(f2, fk4.d().getDisplayMetrics().density, min), rh4.q(f2, fk4.d().getDisplayMetrics().density, min), min, min);
            getAddBadgeDrawable().draw(canvas);
        }
        if (this.y0) {
            float f3 = (float) 24;
            getCallBadgeDrawable().setBounds(rh4.q(f3, fk4.d().getDisplayMetrics().density, min), rh4.q(f3, fk4.d().getDisplayMetrics().density, min), min, min);
            getCallBadgeDrawable().draw(canvas);
        }
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.g();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.h();
    }

    public final void onThemeChanged(fka fka) {
        tc0 tc0;
        EnhancedVectorDrawable addBadgeDrawable = getAddBadgeDrawable();
        c54.Z(addBadgeDrawable, "background", fka.b().a.f);
        c54.Z(addBadgeDrawable, "plus", fka.getIcon().b);
        EnhancedVectorDrawable onlineBadgeDrawable = getOnlineBadgeDrawable();
        c54.Z(onlineBadgeDrawable, "online", fka.getIcon().e);
        ne0 b2 = fka.b();
        VectorPath findPath = onlineBadgeDrawable.findPath("online");
        if (findPath != null) {
            findPath.setStrokeColor(b2.k);
            onlineBadgeDrawable.invalidatePath();
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        c54.Z(closeBadgeDrawable, "cross", -1);
        c54.Z(closeBadgeDrawable, "circle_background", fka.getIcon().j);
        getCallIconDrawable().setTint(-1);
        GradientDrawable callBadgeBackgroundDrawable = getCallBadgeBackgroundDrawable();
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        pq9 pq9 = qp4.u0;
        callBadgeBackgroundDrawable.setStroke(G, pq9.j(this).b().k);
        callBadgeBackgroundDrawable.setColor(pq9.j(this).getIcon().k);
        int s = au1.s(this.o);
        if (s == 1) {
            rd0 rd0 = this.G0;
            if (rd0 != null) {
                rd0.onThemeChanged(fka);
            }
        } else if (s == 2 && (tc0 = this.F0) != null) {
            tc0.onThemeChanged(fka);
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k56 k56;
        if (!this.s0 || this.D0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.E0 && getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (k56 = this.D0) != null) {
                k56.invoke();
            }
            return super.onTouchEvent(motionEvent);
        }
        boolean contains = getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.E0 = contains;
        if (contains) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new q5a(this, drawable, runnable, j, 0));
            return;
        }
        post(new q5a(this, drawable, runnable, j, 1));
    }

    public final void setAddBadgeVisibility(boolean z) {
        this.u0 = z;
        if (z) {
            this.t0 = false;
        }
        invalidate();
    }

    public final void setAvatarShape(m5a m5a) {
        if (!tpa.f(this.c, m5a)) {
            this.c = m5a;
            invalidate();
        }
    }

    public final void setAvatarUrl(String str) {
        wv6 wv6;
        List list = this.J0;
        if (list != null && list.size() == 1) {
            List list2 = this.J0;
            if (tpa.f(list2 != null ? (String) x53.g0(list2) : null, str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.J0 = null;
            wv6 = null;
        } else {
            this.J0 = Collections.singletonList(str);
            vc0 vc0 = h5a.a;
            wv6 = h5a.b(str, this.c, 4);
        }
        sq4 sq4 = this.b;
        if (wv6 != null) {
            iv6 o2 = s36.o();
            o2.getClass();
            this.H0.a(new hv6(o2, wv6, str));
            if (sq4.X == null) {
                sq4.i(f());
                return;
            }
            return;
        }
        sq4.i((mq4) null);
    }

    public final void setAvatarUrls(List<String> list) {
        if (list == null || list.isEmpty() || !tpa.f(this.J0, list)) {
            sq4 sq4 = this.b;
            if (list == null || list.isEmpty()) {
                sq4.i((mq4) null);
                this.J0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (String str : list) {
                vc0 vc0 = h5a.a;
                wv6 b2 = h5a.b(str, this.c, 4);
                iv6 o2 = s36.o();
                o2.getClass();
                arrayList.add(new hv6(o2, b2, str));
            }
            rz6 rz6 = new rz6(arrayList, true);
            this.J0 = list;
            this.H0.a(rz6);
            if (sq4.X == null) {
                sq4.i(f());
            }
        }
    }

    public final void setCallBadgeVisibility(boolean z) {
        this.y0 = z;
        if (z) {
            this.t0 = false;
            this.u0 = false;
        }
        invalidate();
    }

    public final void setCloseBadgeClickListener(k56 k56) {
        this.D0 = k56;
    }

    public final void setCloseBadgeVisibility(boolean z) {
        this.s0 = z;
        invalidate();
    }

    public final void setCustomOverlay(od0 od0) {
        sq4 sq4 = this.b;
        if (od0 == null) {
            rq4 rq4 = sq4.o;
            rq4.getClass();
            ((la6) rq4).k((Drawable) null);
            return;
        }
        rq4 rq42 = sq4.o;
        rq42.getClass();
        ((la6) rq42).k(od0);
    }

    public final void setCustomPlaceholder(rd0 rd0) {
        sq4 sq4 = this.b;
        if (rd0 != null) {
            this.G0 = rd0;
            rq4 rq4 = sq4.o;
            rq4.getClass();
            ((la6) rq4).i(rd0, 1);
            this.o = 2;
        } else if (this.o == 2) {
            rq4 rq42 = sq4.o;
            rq42.getClass();
            ((la6) rq42).i((Drawable) null, 1);
            this.G0 = null;
            this.o = 1;
        }
    }

    public final void setOnImageLoadedListener(k56 k56) {
        this.C0 = k56;
    }

    public final void setOnlineBadgeVisibility(boolean z) {
        this.t0 = z;
        if (z) {
            this.u0 = false;
        }
        invalidate();
    }

    public final void setOverlay(Drawable drawable) {
        od0 od0;
        if (drawable != null) {
            m5a m5a = this.c;
            Context context = getContext();
            od0 = new od0(drawable, m5a, context, new nd0(context, 0), new nd0(context, 1));
        } else {
            od0 = null;
        }
        setCustomOverlay(od0);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new r5a(this, drawable, runnable, 0));
        } else {
            post(new r5a(this, drawable, runnable, 1));
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return this.b.e() == drawable || super.verifyDrawable(drawable);
    }

    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new o5a(this, drawable, 1));
        } else {
            post(new p5a(this, drawable, 1));
        }
    }
}
