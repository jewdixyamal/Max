package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.rlottie.RLottieDrawable;

/* renamed from: zj  reason: default package */
public final class zj extends Drawable implements Animatable {
    public static final /* synthetic */ bc7[] A0;
    public static final ThreadLocal B0 = ThreadLocal.withInitial(new tj(0));
    public static final je7 C0 = tu0.r(3, new m(6));
    public static final oq9 z0 = new oq9(6);
    public final boolean X;
    public final cx7 Y;
    public final yj Z;
    public final int a;
    public final mn5 b;
    public final mi c;
    public final fi o;
    public final String s0;
    public final pf t0;
    public final je7 u0;
    public final Drawable v0;
    public final khe w0;
    public RLottieDrawable x0;
    public ContextScope y0;

    static {
        oi9 oi9 = new oi9(zj.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;");
        nec.a.getClass();
        A0 = new bc7[]{oi9};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zj(Context context, int i, q0e q0e, mi miVar, fi fiVar) {
        this(context, i, q0e, miVar, fiVar, true, MainDispatcherLoader.dispatcher);
        jd4 jd4 = ql4.a;
    }

    public final void a(Canvas canvas, float f, float f2, float f3, Paint paint) {
        Canvas canvas2;
        Drawable b2 = b();
        canvas.save();
        float f4 = f3 - f2;
        canvas.translate(f, f4 > ((float) b2.getBounds().height()) ? (f4 / ((float) 2)) - ((float) (b2.getBounds().height() / 2)) : f3 - ((float) b2.getBounds().height()));
        if (this.X && paint.getAlpha() != 255) {
            paint.setAlpha(255);
        }
        RLottieDrawable rLottieDrawable = this.x0;
        Class<zj> cls = zj.class;
        if (b2 == rLottieDrawable) {
            Picture picture = (Picture) B0.get();
            if (picture != null) {
                try {
                    canvas2 = picture.beginRecording(((RLottieDrawable) b2).getBounds().width(), ((RLottieDrawable) b2).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) b2;
                    canvas2 = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvas2 = null;
            }
            try {
                ((RLottieDrawable) b2).draw(canvas2, paint);
            } catch (IllegalStateException e) {
                hm9.p(cls.getName(), "fail to draw drawable", e);
                if (w9e.p0(e.toString(), "Underflow in restore", false) && isRunning()) {
                    d();
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            b2.setAlpha(paint.getAlpha());
            b2.draw(canvas);
        }
        canvas.restore();
        if (rLottieDrawable != null && b2 == rLottieDrawable) {
            Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
            if (renderingBitmap == null) {
                String name = cls.getName();
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.Z, name, wg0.i("Can't draw lottie because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), (Throwable) null);
                }
                khe khe = this.w0;
                (khe.a() ? (Drawable) khe.getValue() : this.v0).draw(canvas);
                d();
                return;
            }
            canvas.save();
            canvas.translate(f, f3 - ((float) rLottieDrawable.getBounds().height()));
            canvas.scale(((float) rLottieDrawable.getBounds().width()) / ((float) rLottieDrawable.getIntrinsicWidth()), ((float) rLottieDrawable.getBounds().height()) / ((float) rLottieDrawable.getIntrinsicHeight()));
            canvas.drawBitmap(renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    public final Drawable b() {
        bc7 bc7 = A0[0];
        int ordinal = ((uj) this.Z.b).ordinal();
        Drawable drawable = this.v0;
        if (ordinal == 0) {
            return drawable;
        }
        if (ordinal == 1) {
            return (Drawable) this.w0.getValue();
        }
        if (ordinal == 2) {
            RLottieDrawable rLottieDrawable = this.x0;
            if (rLottieDrawable == null) {
                return drawable;
            }
            if (!(!rLottieDrawable.isLoadingFailed())) {
                rLottieDrawable = null;
            }
            return rLottieDrawable != null ? rLottieDrawable : drawable;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(String str) {
        f9f f9f = (f9f) this.w0.getValue();
        f9f.c((Uri) null, str);
        rq4 rq4 = f9f.a.o;
        rq4.getClass();
        ((la6) rq4).i(this.v0, 1);
        f9f.invalidateSelf();
        f9f.c = new ga(this, 1, f9f);
        e(uj.b);
    }

    public final void d() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.x0;
        if (b2 != rLottieDrawable) {
            b().invalidateSelf();
        } else if (rLottieDrawable != null) {
            rLottieDrawable.invalidateInternal();
        }
    }

    public final void draw(Canvas canvas) {
        float height = (float) getBounds().height();
        z0.getClass();
        a(canvas, 0.0f, 0.0f, height, (Paint) C0.getValue());
    }

    public final void e(uj ujVar) {
        this.Z.o1(this, A0[0], ujVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        return tpa.f(this.b, ((zj) obj).b);
    }

    public final int getIntrinsicHeight() {
        return b().getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return b().getIntrinsicWidth();
    }

    public final int getOpacity() {
        return b().getOpacity();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + zj.class.hashCode();
    }

    public final void invalidateSelf() {
        d();
    }

    public final boolean isRunning() {
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable = this.x0;
        return b2 == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public final void setAlpha(int i) {
        b().setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        khe khe = this.w0;
        if (khe.a()) {
            ((f9f) khe.getValue()).setBounds(i, i2, i3, i4);
        }
        this.v0.setBounds(i, i2, i3, i4);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i3, i4);
        }
        super.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        b().setColorFilter(colorFilter);
    }

    public final void start() {
        hm9.m(zj.class.getName(), "start", new Object[0]);
        if (!j1e.z(this.y0)) {
            this.y0 = j1e.a(f46.a().plus(this.Y));
            od2.L(new zn5(new t03(this.b, 11), new xj(this, (Continuation) null), 5), this.y0);
        }
        Drawable drawable = this.v0;
        pf pfVar = this.t0;
        drawable.setCallback(pfVar);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(pfVar);
        }
        khe khe = this.w0;
        if (khe.a()) {
            ((f9f) khe.getValue()).setCallback(pfVar);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable b2 = b();
        RLottieDrawable rLottieDrawable3 = this.x0;
        if (b2 == rLottieDrawable3 && rLottieDrawable3 != null) {
            rLottieDrawable3.start();
        }
    }

    public final void stop() {
        hm9.m(zj.class.getName(), "stop", new Object[0]);
        j1e.i(this.y0, (CancellationException) null);
        this.v0.setCallback((Drawable.Callback) null);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback((Drawable.Callback) null);
        }
        khe khe = this.w0;
        if (khe.a()) {
            ((f9f) khe.getValue()).setCallback((Drawable.Callback) null);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }

    public zj(Context context, int i, mn5 mn5, mi miVar, fi fiVar, boolean z, cx7 cx7) {
        Drawable drawable;
        this.a = i;
        this.b = mn5;
        this.c = miVar;
        this.o = fiVar;
        this.X = z;
        this.Y = cx7;
        this.Z = new yj(this);
        this.s0 = zj.class.getName();
        this.t0 = new pf(1, this);
        je7 r = tu0.r(3, new x5(8, this));
        this.u0 = r;
        if (miVar instanceof ki) {
            drawable = ((ki) miVar).a;
        } else if (miVar instanceof li) {
            drawable = (jz4) r.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.v0 = drawable;
        this.w0 = new khe(new x2((Object) context, 1, (Object) this));
        this.y0 = j1e.a(f46.a().plus(cx7));
        od2.L(new zn5(new t03(mn5, 11), new xj(this, (Continuation) null), 5), this.y0);
    }

    public final void setBounds(Rect rect) {
        khe khe = this.w0;
        if (khe.a()) {
            ((f9f) khe.getValue()).setBounds(rect);
        }
        this.v0.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
        super.setBounds(b().getBounds());
    }
}
