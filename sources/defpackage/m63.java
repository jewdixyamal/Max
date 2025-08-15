package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: m63  reason: default package */
public final class m63 extends hdc {
    public int[] X = {-65536};
    public final int Y;
    public final int Z;
    public final int o;
    public int s0 = -1;
    public final int t0;
    public o63 u0;

    public m63(Context context, int i) {
        this.o = i;
        this.Y = tu0.f(context, 6);
        this.Z = tu0.f(context, 32);
        this.t0 = tu0.f(context, 2);
    }

    public final int j() {
        return this.X.length;
    }

    public final void r(dec dec, int i) {
        q63 q63 = (q63) dec;
        q63.F0.setColor(this.X[i]);
        View view = q63.a;
        view.animate().cancel();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, n63] */
    public final dec t(ViewGroup viewGroup, int i) {
        int measuredHeight;
        int paddingBottom;
        int i2 = this.s0;
        int i3 = this.Z;
        int i4 = this.Y;
        int i5 = this.o;
        if (i2 == -1) {
            if (i5 == 0) {
                measuredHeight = viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft();
                paddingBottom = viewGroup.getPaddingRight();
            } else {
                measuredHeight = viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop();
                paddingBottom = viewGroup.getPaddingBottom();
            }
            int i6 = measuredHeight - paddingBottom;
            float f = (float) ((i4 * 2) + i3);
            float f2 = (float) i6;
            float f3 = f2 / f;
            this.s0 = (int) (((f2 / (f3 - (f3 - (((float) ((int) f3)) + 0.5f)))) - f) / 2.0f);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new pdc(-2, -2));
        frameLayout.setClipToPadding(false);
        if (i5 == 0) {
            int i7 = this.s0 + i4;
            frameLayout.setPadding(i7, i4, i7, i4);
        } else {
            int i8 = this.s0 + i4;
            frameLayout.setPadding(i4, i8, i4, i8);
        }
        ? view = new View(viewGroup.getContext());
        view.c = tu0.f(view.getContext(), 2);
        Paint paint = new Paint();
        view.a = paint;
        paint.setColor(-65536);
        Paint paint2 = view.a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        view.a.setAntiAlias(true);
        view.a.setDither(true);
        Paint paint3 = new Paint();
        view.b = paint3;
        paint3.setColor(-1);
        view.b.setStyle(style);
        view.b.setAntiAlias(true);
        view.b.setDither(true);
        view.setClipToOutline(false);
        view.setOutlineProvider(new e62(view, 2));
        view.setLayoutParams(new pdc(i3, i3));
        view.setElevation((float) this.t0);
        frameLayout.addView(view);
        return new q63(frameLayout, view, this.u0);
    }
}
