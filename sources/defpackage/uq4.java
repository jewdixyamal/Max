package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: uq4  reason: default package */
public abstract class uq4 extends ImageView {
    public static boolean u0 = false;
    public final jt a = new jt(0);
    public float b = 0.0f;
    public sq4 c;
    public boolean o = false;
    public boolean s0 = false;
    public Object t0 = null;

    public uq4(Context context) {
        super(context);
        h(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        u0 = z;
    }

    public void g() {
        invalidate();
    }

    public float getAspectRatio() {
        return this.b;
    }

    public mq4 getController() {
        return this.c.X;
    }

    public Object getExtraData() {
        return this.t0;
    }

    public rq4 getHierarchy() {
        rq4 rq4 = this.c.o;
        rq4.getClass();
        return rq4;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.e();
    }

    public final void h(Context context) {
        try {
            f46.I();
            if (this.o) {
                f46.I();
                return;
            }
            boolean z = true;
            this.o = true;
            this.c = new sq4((la6) null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                f46.I();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!u0 || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.s0 = z;
            f46.I();
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final void i() {
        Drawable drawable;
        if (this.s0 && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        this.c.g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
        this.c.h();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        i();
        this.c.g();
    }

    public void onMeasure(int i, int i2) {
        jt jtVar = this.a;
        jtVar.b = i;
        jtVar.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                jtVar.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(jtVar.b) - paddingRight)) / f) + ((float) paddingBottom)), jtVar.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    jtVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(jtVar.c) - paddingBottom)) * f) + ((float) paddingRight)), jtVar.b), 1073741824);
                }
            }
        }
        super.onMeasure(jtVar.b, jtVar.c);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        i();
        this.c.h();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        sa6 sa6;
        sq4 sq4 = this.c;
        if (sq4.f()) {
            k0 k0Var = (k0) sq4.X;
            k0Var.getClass();
            boolean i = ta5.a.i(2);
            Class cls = k0.x;
            if (i) {
                ta5.f(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, motionEvent);
            }
            ta6 ta6 = k0Var.e;
            if (ta6 != null && (ta6.c || k0Var.q())) {
                ta6 ta62 = k0Var.e;
                ta62.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    float f = ta62.b;
                    if (action == 1) {
                        ta62.c = false;
                        if (Math.abs(motionEvent.getX() - ta62.f) > f || Math.abs(motionEvent.getY() - ta62.g) > f) {
                            ta62.d = false;
                        }
                        if (ta62.d && motionEvent.getEventTime() - ta62.e <= ((long) ViewConfiguration.getLongPressTimeout()) && (sa6 = ta62.a) != null) {
                            k0 k0Var2 = (k0) sa6;
                            if (ta5.a.i(2)) {
                                ta5.e(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(k0Var2)), k0Var2.j);
                            }
                            if (k0Var2.q()) {
                                k0Var2.d.c++;
                                la6 la6 = k0Var2.h;
                                la6.f.o(la6.a);
                                la6.g();
                                k0Var2.r();
                            }
                        }
                        ta62.d = false;
                    } else if (action != 2) {
                        if (action == 3) {
                            ta62.c = false;
                            ta62.d = false;
                        }
                    } else if (Math.abs(motionEvent.getX() - ta62.f) > f || Math.abs(motionEvent.getY() - ta62.g) > f) {
                        ta62.d = false;
                    }
                } else {
                    ta62.c = true;
                    ta62.d = true;
                    ta62.e = motionEvent.getEventTime();
                    ta62.f = motionEvent.getX();
                    ta62.g = motionEvent.getY();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        i();
    }

    public void setAspectRatio(float f) {
        if (f != this.b) {
            this.b = f;
            requestLayout();
        }
    }

    public void setController(mq4 mq4) {
        this.c.i(mq4);
        super.setImageDrawable(this.c.e());
    }

    public void setExtraData(Object obj) {
        this.t0 = obj;
    }

    public void setHierarchy(rq4 rq4) {
        this.c.j(rq4);
        super.setImageDrawable(this.c.e());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        h(getContext());
        this.c.i((mq4) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        h(getContext());
        this.c.i((mq4) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        h(getContext());
        this.c.i((mq4) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        h(getContext());
        this.c.i((mq4) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.s0 = z;
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        sq4 sq4 = this.c;
        r0.e(sq4 != null ? sq4.toString() : "<no holder set>", "holder");
        return r0.toString();
    }

    public uq4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context);
    }

    public uq4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(context);
    }
}
