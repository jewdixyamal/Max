package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: sd0  reason: default package */
public abstract class sd0 extends View {
    public sq4 a;
    public Drawable b;
    public ld0 c;
    public ida o;
    public p82 s0;
    public pd0 t0;
    public t33 u0;
    public u7b v0;
    public boolean w0;
    public boolean x0;

    static {
        Math.round(Resources.getSystem().getDisplayMetrics().density * 40.0f);
    }

    public final void a(uj3 uj3, boolean z) {
        Drawable drawable;
        wv6 wv6;
        this.w0 = z;
        int i = this.v0.b(uj3.n()).a;
        int i2 = (i == 10 || i == 20 || i == 40) ? ((TamAvatarView) this).x0 ? gpc.B0 : gpc.A0 : 0;
        if (i2 == 0) {
            drawable = null;
        } else {
            drawable = kt3.b(getContext(), i2);
            if (i == 40) {
                c(drawable);
            }
        }
        this.b = drawable;
        ld0 ld0 = new ld0(this.o, this.s0, this.t0, uj3);
        this.c = ld0;
        sq4 sq4 = this.a;
        if (sq4 != null) {
            rq4 rq4 = sq4.o;
            rq4.getClass();
            ((la6) rq4).i(ld0.c(getContext()), 1);
        }
        t33 t33 = this.u0;
        sq4 sq42 = this.a;
        Uri b2 = this.c.b(t33.q());
        uv6 uv6 = uv6.a;
        if (b2 == null || oag.t(b2.getPath())) {
            wv6 = null;
        } else {
            xv6 d = xv6.d(b2);
            d.g = uv6;
            d.l = getPostprocessor();
            wv6 = d.a();
            s36.o().f(wv6, (t68) null);
        }
        e2b a2 = s36.a.get();
        a2.l = sq42.X;
        a2.k = true;
        if (wv6 != null) {
            a2.e = wv6;
        }
        if (wv6 == null) {
            sq42.i((mq4) null);
        } else {
            sq42.i(a2.a());
        }
    }

    public final void b(Canvas canvas) {
        if (this.w0 && this.b != null) {
            int width = (int) ((((float) getWidth()) / 2.0f) - (getContext().getResources().getDisplayMetrics().density * 0.5f));
            double d = (double) width;
            canvas.save();
            canvas.translate(((float) (((int) (-0.6946583704589973d * d)) + width)) - (((float) this.b.getIntrinsicWidth()) / 2.0f), ((float) (width + (-((int) (d * -0.7193398003386512d))))) - (((float) this.b.getIntrinsicHeight()) / 2.0f));
            Drawable drawable = this.b;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
            this.b.draw(canvas);
            canvas.restore();
        }
    }

    public abstract void c(Drawable drawable);

    public sq4 getDraweeHolder() {
        return this.a;
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    public q6b getPostprocessor() {
        return new doa();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sq4 sq4 = this.a;
        if (sq4 != null) {
            sq4.g();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sq4 sq4 = this.a;
        if (sq4 != null) {
            sq4.h();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        umc e = this.a.e();
        try {
            e.setBounds(0, 0, width, height);
            e.draw(canvas);
        } catch (Throwable th) {
            hm9.p("sd0", "failure to onDraw", th);
        }
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            canvas.restore();
        }
    }

    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        b(canvas);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        sq4 sq4 = this.a;
        if (sq4 != null) {
            sq4.g();
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        sq4 sq4 = this.a;
        if (sq4 != null) {
            sq4.h();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void setSmallOnlineImage(boolean z) {
        this.x0 = z;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        sq4 sq4 = this.a;
        if (sq4 == null || sq4.e() != drawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
