package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: u91  reason: default package */
public final class u91 extends Drawable implements Animatable {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final kmd Y;
    public final yj Z;
    public final Context a;
    public final Path b = new Path();
    public final hg c;
    public final ObjectAnimator o;

    static {
        oi9 oi9 = new oi9(u91.class, "backgroundColor", "getBackgroundColor$calls_ui_release()Lone/me/calls/ui/animation/CallIndicatorWaveDrawable$Companion$BackgroundColor;");
        nec.a.getClass();
        s0 = new bc7[]{oi9};
    }

    public u91(Context context) {
        this.a = context;
        hg hgVar = new hg("waveX", 0);
        this.c = hgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{0, context.getResources().getDisplayMetrics().widthPixels});
        ofInt.setDuration(1200);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new z00(4, (Object) this));
        this.o = ofInt;
        this.X = tu0.r(3, new x5(27, this));
        kmd a2 = a();
        this.Y = a2;
        this.Z = new yj(this);
        kmd a3 = a();
        a2.getClass();
        bc7 bc7 = kmd.A0[0];
        a3.b((hmd) a2.s0.b);
    }

    public final kmd a() {
        return (kmd) this.X.getValue();
    }

    public final void draw(Canvas canvas) {
        hg hgVar = this.c;
        int save = canvas.save();
        try {
            if (this.o.isRunning()) {
                canvas.translate(-((float) hgVar.a), 0.0f);
                Path path = this.b;
                canvas.clipOutPath(path);
                canvas.translate((float) getBounds().width(), 0.0f);
                canvas.clipOutPath(path);
                canvas.translate(((float) hgVar.a) - ((float) getBounds().width()), 0.0f);
                yj yjVar = this.Z;
                bc7 bc7 = s0[0];
                int ordinal = ((t91) yjVar.b).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        canvas.drawColor(qp4.u0.o(this.a).c.b().k);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            a().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return a().isRunning() || this.o.isRunning();
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        float width = (float) rect.width();
        float height = (float) rect.height();
        int max = Math.max(rect.height(), rect.width());
        kmd a2 = a();
        a2.y0.o1(a2, kmd.A0[6], Integer.valueOf(max / 2));
        a().setBounds(new Rect(0, 0, rect.width(), max));
        float f = (float) 15;
        float f2 = (float) 2;
        float G = height - (((float) tu0.G(fk4.d().getDisplayMetrics().density * f)) / f2);
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, G);
        float f3 = width / 3.0f;
        float f4 = f3 * f2;
        path.cubicTo(f3, height - ((float) tu0.G(fk4.d().getDisplayMetrics().density * f)), f4, height, width, height - (((float) tu0.G(f * fk4.d().getDisplayMetrics().density)) / f2));
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.lineTo(0.0f, G);
    }

    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        a().a(qp4.u0.o(this.a).c);
        a().start();
        this.o.start();
    }

    public final void stop() {
        a().a(qp4.u0.o(this.a).c);
        a().stop();
        this.o.cancel();
    }
}
