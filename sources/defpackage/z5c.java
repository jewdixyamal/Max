package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: z5c  reason: default package */
public final class z5c extends ViewGroup implements kre {
    public static final rq9 B0 = new Object();
    public static final /* synthetic */ bc7[] C0;
    public static final khe D0 = new khe(new lab(24));
    public final y5c A0;
    public boolean a;
    public ValueAnimator b;
    public final Paint c = new Paint(1);
    public float o = -1.0f;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final TextView w0;
    public final caa x0;
    public final y5c y0;
    public final y5c z0;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, rq9] */
    static {
        Class<z5c> cls = z5c.class;
        C0 = new bc7[]{new oi9(cls, "isOwn", "isOwn()Z"), rh4.g(nec.a, cls, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;"), new oi9(cls, NewHtcHomeBadger.COUNT, "getCount()I")};
    }

    public z5c(Context context) {
        super(context);
        TextView textView = new TextView(context);
        kqe kqe = i4f.a;
        os2.a.b(textView, du4.b);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.w0 = textView;
        caa caa = new caa(context);
        caa.setHasBackground(false);
        B0.getClass();
        caa.setReplaceInterpolator((PathInterpolator) D0.getValue());
        caa.setTypography(os2.h);
        this.x0 = caa;
        this.y0 = new y5c(this, 0);
        this.z0 = new y5c(new v5c(""), this);
        this.A0 = new y5c(this, 2);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 48.0f));
        addView(textView);
        addView(caa);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.w0;
        return (((float) textView.getWidth()) / 2.0f) + ((float) textView.getLeft());
    }

    public final void a(boolean z) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        float measuredWidth = ((float) getMeasuredWidth()) - getEmojiCenterX();
        float f2 = 0.0f;
        if (this.o == -1.0f) {
            this.o = z ? measuredWidth : 0.0f;
        }
        float f3 = this.o;
        Float valueOf = Float.valueOf(f3);
        if (!(!(f3 == 0.0f))) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : measuredWidth;
        if (!z) {
            floatValue = this.o;
        }
        if (!z) {
            f2 = measuredWidth;
        }
        Float valueOf2 = Float.valueOf(floatValue);
        Float valueOf3 = Float.valueOf(f2);
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = valueOf3.floatValue();
        if (z) {
            f = this.o / measuredWidth;
            j = 350;
        } else {
            f = ((float) 1) - (this.o / measuredWidth);
            j = 500;
        }
        long j2 = (long) (f * ((float) j));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue2, floatValue3});
        ofFloat.setDuration(j2);
        this.x0.setReplaceDuration(j2);
        B0.getClass();
        ofFloat.setInterpolator((PathInterpolator) D0.getValue());
        ofFloat.addUpdateListener(new z00(14, (Object) this));
        ofFloat.addListener(new x5c(this, floatValue2, 0));
        ofFloat.addListener(new mf(7, (Object) this));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final boolean b() {
        bc7 bc7 = C0[0];
        return ((Boolean) this.y0.b).booleanValue();
    }

    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.a;
        Paint paint = this.c;
        caa caa = this.x0;
        if (z) {
            paint.setColor(this.t0);
            canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((float) ((int) this.o)) + emojiCenterX > ((float) caa.getRight())) {
                caa.setTextColor(this.u0);
            } else {
                caa.setTextColor(this.v0);
            }
            paint.setColor(this.s0);
            TextView textView = this.w0;
            canvas.drawCircle(emojiCenterX, (((float) textView.getHeight()) / 2.0f) + ((float) textView.getTop()), this.o, paint);
        } else {
            paint.setColor(b() ? this.s0 : this.t0);
            canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            caa.setTextColor(b() ? this.u0 : this.v0);
        }
        super.dispatchDraw(canvas);
    }

    public final int getCount() {
        bc7 bc7 = C0[2];
        return ((Number) this.A0.b).intValue();
    }

    public final v5c getReaction() {
        bc7 bc7 = C0[1];
        return (v5c) this.z0.b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        TextView textView = this.w0;
        ote.E(textView, G, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
        int d = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), G);
        caa caa = this.x0;
        ote.E(caa, d, (getMeasuredHeight() / 2) - (caa.getMeasuredHeight() / 2), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), 1073741824);
        TextView textView = this.w0;
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = textView.getMeasuredWidth();
        int d = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, measuredWidth, tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density) * 2);
        caa caa = this.x0;
        caa.measure(0, 0);
        setMeasuredDimension(caa.getMeasuredWidth() + d, Math.max(tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density), caa.getMeasuredHeight()));
    }

    public final void onThemeChanged(fka fka) {
    }

    public final void setCount(int i) {
        this.A0.o1(this, C0[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(m56 m56) {
        tu0.K(this, 300, new vu5(this, 25, m56));
    }

    public final void setOwn(boolean z) {
        this.y0.o1(this, C0[0], Boolean.valueOf(z));
    }

    public final void setReaction(v5c v5c) {
        this.z0.o1(this, C0[1], v5c);
    }
}
