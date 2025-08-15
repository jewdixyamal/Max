package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: vge  reason: default package */
public final class vge extends e77 implements kre {
    public PorterDuffColorFilter A0;
    public final je7 B0;
    public final WeakReference Y;
    public final Context Z;
    public final k56 s0;
    public final m56 t0;
    public final je7 u0;
    public boolean v0 = true;
    public boolean w0 = true;
    public final RectF x0 = new RectF();
    public final Paint y0;
    public final Paint z0;

    public vge(je7 je7, WeakReference weakReference, im imVar, p59 p59, o59 o59) {
        super(0, 4);
        this.Y = weakReference;
        this.Z = imVar;
        this.s0 = p59;
        this.t0 = o59;
        this.u0 = je7;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.y0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.z0 = paint2;
        qp4.u0.b(imVar).i().getIcon();
        this.A0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.B0 = tu0.r(3, new zja(je7, 27, this));
    }

    public final void a(RecyclerView recyclerView, dec dec) {
        super.a(recyclerView, dec);
        this.w0 = true;
        this.v0 = true;
    }

    public final float d(float f) {
        return Float.MAX_VALUE;
    }

    public final float e() {
        return 1.0f;
    }

    public final boolean g() {
        return ((Boolean) this.s0.invoke()).booleanValue();
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, dec dec, float f, float f2, int i, boolean z) {
        float f3;
        Canvas canvas2 = canvas;
        dec dec2 = dec;
        if (dec2 instanceof ht8) {
            ht8 ht8 = (ht8) dec2;
            zof zof = ht8.K0;
            zof.getClass();
            if (zof == zof.Send || zof == zof.Seen || zof == zof.None) {
                float d = ote.d(f, -(fk4.d().getDisplayMetrics().density * 96.0f), 0.0f);
                super.h(canvas, recyclerView, dec, d, f2, i, z);
                float abs = Math.abs(d) / (fk4.d().getDisplayMetrics().density * 96.0f);
                Paint paint = this.y0;
                paint.setAlpha((int) (((float) 255) * abs));
                paint.setColorFilter(this.A0);
                pq9 pq9 = qp4.u0;
                Context context = this.Z;
                int alpha = Color.alpha(pq9.b(context).i().a().s().b.g);
                Paint paint2 = this.z0;
                paint2.setColor(pq9.b(context).i().a().s().b.g);
                paint2.setAlpha((int) (((float) alpha) * abs));
                View view = ht8.I0;
                float right = (fk4.d().getDisplayMetrics().density * 8.0f) + ((float) view.getRight()) + d + ((((float) 1) - abs) * fk4.d().getDisplayMetrics().density * 32.0f) + (fk4.d().getDisplayMetrics().density * 20.0f);
                View view2 = dec2.a;
                int bottom = ((RecyclerView) view2.getParent()).getBottom();
                float f4 = (fk4.d().getDisplayMetrics().density * 20.0f) + (fk4.d().getDisplayMetrics().density * 8.0f);
                float f5 = (fk4.d().getDisplayMetrics().density * 20.0f) + f4;
                if (((float) view.getHeight()) < f5 || ((float) (bottom - view2.getTop())) < f5) {
                    float top = (fk4.d().getDisplayMetrics().density * 20.0f) + ((float) view2.getTop());
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    f3 = top + ((float) (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
                } else if (view2.getBottom() < bottom) {
                    float bottom2 = (float) view2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    f3 = bottom2 - (((float) (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) + f4);
                } else {
                    f3 = ((float) bottom) - f4;
                }
                canvas2.drawCircle(right, f3, fk4.d().getDisplayMetrics().density * 20.0f, paint2);
                RectF rectF = this.x0;
                float f6 = (fk4.d().getDisplayMetrics().density * 20.0f) / 2.0f;
                rectF.set(right - f6, f3 - f6, right + f6, f3 + f6);
                canvas2.drawBitmap((Bitmap) this.B0.getValue(), (Rect) null, rectF, paint);
                boolean z2 = d < (-(fk4.d().getDisplayMetrics().density * 70.0f));
                WeakReference weakReference = this.Y;
                if (z2 && this.v0) {
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        pag.F(view3, mi6.CONFIRM);
                    }
                    this.v0 = false;
                } else if (!z2) {
                    this.v0 = true;
                }
                if (!z && d < (-(fk4.d().getDisplayMetrics().density * 70.0f)) && this.w0) {
                    this.w0 = false;
                    View view4 = (View) weakReference.get();
                    if (view4 != null) {
                        view4.post(new vs5(view4, 10, view4));
                    }
                    this.t0.invoke(Integer.valueOf(ht8.h()));
                }
            }
        }
    }

    public final boolean i(dec dec, dec dec2) {
        return false;
    }

    public final void onThemeChanged(fka fka) {
        this.A0 = new PorterDuffColorFilter(fka.getIcon().f, PorterDuff.Mode.SRC_IN);
    }
}
