package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;

/* renamed from: mcc  reason: default package */
public final class mcc extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final je7 Y = tu0.r(3, new hbc(3));
    public final je7 Z = tu0.r(3, new lwa(13, this));
    public final Context a;
    public final hg b;
    public final ObjectAnimator c;
    public final hg o;

    public mcc(Context context) {
        this.a = context;
        hg hgVar = new hg("bgAlpha", 255);
        this.b = hgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{255, 128, 255});
        ofInt.setDuration(2000);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new lcc(this, 0));
        this.c = ofInt;
        hg hgVar2 = new hg("indicatorAlpha", 255);
        this.o = hgVar2;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, hgVar2, new int[]{255, 0, 255});
        ofInt2.setDuration(2000);
        ofInt2.setRepeatCount(-1);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.addUpdateListener(new lcc(this, 1));
        this.X = ofInt2;
    }

    public final void draw(Canvas canvas) {
        je7 je7 = this.Y;
        ((ShapeDrawable) je7.getValue()).setAlpha(this.b.a);
        ((ShapeDrawable) je7.getValue()).draw(canvas);
        je7 je72 = this.Z;
        int save = canvas.save();
        canvas.translate((float) ((getBounds().width() / 2) - (((ShapeDrawable) je72.getValue()).getBounds().width() / 2)), (float) ((getBounds().height() / 2) - (((ShapeDrawable) je72.getValue()).getBounds().height() / 2)));
        try {
            ((ShapeDrawable) je72.getValue()).setAlpha(this.o.a);
            ((ShapeDrawable) je72.getValue()).draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.c.isRunning() || this.X.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.Y.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int min = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.Z.getValue()).setBounds(0, 0, min, min);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.c.start();
        this.X.start();
    }

    public final void stop() {
        this.c.cancel();
        this.X.cancel();
    }
}
