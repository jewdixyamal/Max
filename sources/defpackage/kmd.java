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
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kmd  reason: default package */
public final class kmd extends Drawable implements Animatable, kre {
    public static final /* synthetic */ bc7[] A0;
    public static final float[] B0 = {1.0f, 0.33f, 1.0f};
    public static final float[] C0 = {0.0f, 359.0f};
    public final eob X;
    public final ObjectAnimator Y;
    public final ObjectAnimator Z;
    public final Context a;
    public final ShapeDrawable[] b;
    public final kpa[] c;
    public final eob o;
    public final jmd s0;
    public final jmd t0;
    public final jmd u0;
    public final jmd v0;
    public final jmd w0;
    public final jmd x0;
    public final jmd y0;
    public final jmd z0;

    static {
        Class<kmd> cls = kmd.class;
        A0 = new bc7[]{new oi9(cls, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;"), rh4.g(nec.a, cls, "rotationValues", "getRotationValues()[F"), new oi9(cls, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;"), new oi9(cls, "rotationDuration", "getRotationDuration()J"), new oi9(cls, "scaleValues", "getScaleValues()[F"), new oi9(cls, "scaleDuration", "getScaleDuration()J"), new oi9(cls, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;"), new oi9(cls, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z")};
    }

    public kmd(Context context) {
        this.a = context;
        pq9 pq9 = qp4.u0;
        this.b = new ShapeDrawable[]{a14.b(pq9.b(context).i().g().b.a.a), a14.b(pq9.b(context).i().g().b.a.b), a14.b(pq9.b(context).i().g().b.a.c), a14.b(pq9.b(context).i().g().b.a.d)};
        kpa[] kpaArr = new kpa[4];
        for (int i = 0; i < 4; i++) {
            kpaArr[i] = new kpa(new eob("x"), new eob("y"));
        }
        this.c = kpaArr;
        eob eob = new eob("scaleXY", 1.0f);
        this.o = eob;
        eob eob2 = new eob("rotation", 0.0f);
        this.X = eob2;
        float[] fArr = B0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, eob, Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration(8000);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new gmd(this, 0));
        this.Y = ofFloat;
        float[] fArr2 = C0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, eob2, Arrays.copyOf(fArr2, fArr2.length));
        ofFloat2.setDuration(8000);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new gmd(this, 1));
        this.Z = ofFloat2;
        this.s0 = new jmd(this, 0);
        this.t0 = new jmd(fArr2, this, 1);
        this.u0 = new jmd(this, 2);
        this.v0 = new jmd(this, 3);
        this.w0 = new jmd(fArr, this, 4);
        this.x0 = new jmd(this, 5);
        this.y0 = new jmd(this, 6);
        this.z0 = new jmd(this, 7);
    }

    public final void a(fka fka) {
        int[] iArr;
        int i = 0;
        bc7 bc7 = A0[0];
        int ordinal = ((hmd) this.s0.b).ordinal();
        if (ordinal == 0) {
            iArr = new int[]{fka.g().b.a.a, fka.g().b.a.b, fka.g().b.a.c, fka.g().b.a.d};
        } else if (ordinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (ordinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else if (ordinal == 3) {
            iArr = new int[]{-9803158, -6645094, -8882570, -10197916};
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            this.b[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
    }

    public final void b(hmd hmd) {
        this.s0.o1(this, A0[0], hmd);
    }

    public final void c(boolean z) {
        this.z0.o1(this, A0[7], Boolean.valueOf(z));
    }

    public final void d() {
        bc7 bc7 = A0[7];
        if (((Boolean) this.z0.b).booleanValue()) {
            ObjectAnimator objectAnimator = this.Y;
            if (!objectAnimator.isRunning()) {
                objectAnimator.start();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        canvas.save();
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        canvas.rotate(this.X.a, centerX, centerY);
        float f = this.o.a;
        canvas.scale(f, f, centerX, centerY);
        ShapeDrawable[] shapeDrawableArr = this.b;
        int length = shapeDrawableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ShapeDrawable shapeDrawable = shapeDrawableArr[i];
            int i3 = i2 + 1;
            kpa kpa = this.c[i2];
            float f2 = ((eob) kpa.a).a;
            float f3 = ((eob) kpa.b).a;
            int save = canvas.save();
            canvas.translate(f2, f3);
            try {
                shapeDrawable.draw(canvas);
                canvas.restoreToCount(save);
                i++;
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.Z.isRunning() || this.Y.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        bc7 bc7 = A0[6];
        Integer num = (Integer) this.y0.b;
        int intValue = num != null ? num.intValue() : Math.min(rect.width() / 2, rect.height() / 2);
        int i = intValue / 2;
        int i2 = 0;
        for (ShapeDrawable shapeDrawable : this.b) {
            float f = (float) intValue;
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, intValue, intValue);
        }
        kpa[] kpaArr = this.c;
        int length = kpaArr.length;
        int i3 = 0;
        while (i2 < length) {
            kpa kpa = kpaArr[i2];
            int i4 = i3 + 1;
            float f2 = (float) i;
            double d = (double) (((float) i3) * 1.5707964f);
            float cos = (((float) Math.cos(d)) * f2) + ((float) (rect.left + i));
            float sin = (f2 * ((float) Math.sin(d))) + ((float) (rect.top + i));
            ((eob) kpa.a).a = cos;
            ((eob) kpa.b).a = sin;
            i2++;
            i3 = i4;
        }
    }

    public final void onThemeChanged(fka fka) {
        a(fka);
    }

    public final void setAlpha(int i) {
        for (ShapeDrawable alpha : this.b) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (ShapeDrawable paint : this.b) {
            paint.getPaint().setColorFilter(colorFilter);
        }
    }

    public final void start() {
        hm9.m("ShineAnimatedDrawable", "start()", new Object[0]);
        d();
        this.Z.start();
    }

    public final void stop() {
        hm9.m("ShineAnimatedDrawable", "stop()", new Object[0]);
        ObjectAnimator objectAnimator = this.Y;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.Z.cancel();
    }
}
