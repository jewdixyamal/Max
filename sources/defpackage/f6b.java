package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f6b  reason: default package */
public final class f6b extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public z5b a;
    public d6b b = d6b.a;
    public boolean c = true;
    public boolean o;
    public ValueAnimator s0;
    public final dnf t0 = new dnf(getContext(), this, new e6b(this));
    public final je7 u0 = tu0.r(3, new x5b(this, 2));
    public int v0 = -1;

    public f6b(Context context) {
        super(context, (AttributeSet) null);
        tu0.K(this, 300, new xx5(26, this));
    }

    public static void a(f6b f6b, float f) {
        f6b.setBackgroundAlpha(f);
    }

    public static void b(f6b f6b, float f) {
        f6b.setBackgroundAlpha(f);
    }

    public static void c(f6b f6b, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            f6b.setBackgroundAlpha(((float) 1) - f);
        }
    }

    public static void d(f6b f6b, a66 a66, float f, ValueAnimator valueAnimator) {
        z5b z5b = f6b.a;
        if (z5b != null) {
            z5b.f().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - z5b.f().getTop());
            f6b.getHalfExpandedViewHelper().a(z5b.f().getTop());
            z5b.m(z5b.f().getTop());
            a66.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
        }
    }

    /* access modifiers changed from: private */
    public final w5b getHalfExpandedViewHelper() {
        return (w5b) this.u0.getValue();
    }

    /* access modifiers changed from: private */
    public final int getScrollStateOffset() {
        int ordinal = this.b.ordinal();
        Integer num = null;
        if (ordinal == 0) {
            z5b z5b = this.a;
            if (z5b != null) {
                num = Integer.valueOf(z5b.e());
            }
        } else if (ordinal == 1) {
            z5b z5b2 = this.a;
            if (z5b2 != null) {
                num = Integer.valueOf(z5b2.c());
            }
        } else if (ordinal == 2) {
            z5b z5b3 = this.a;
            if (z5b3 != null) {
                num = Integer.valueOf(z5b3.a());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View f;
        z5b z5b = this.a;
        if (z5b == null || (f = z5b.f()) == null) {
            return 0;
        }
        return f.getHeight();
    }

    public static /* synthetic */ void i(f6b f6b, int i, x5b x5b, x5b x5b2, a66 a66, int i2) {
        k56 k56 = x5b;
        if ((i2 & 2) != 0) {
            k56 = new s4a(28);
        }
        k56 k562 = x5b2;
        if ((i2 & 4) != 0) {
            k562 = new s4a(28);
        }
        f6b.h(i, k56, k562, a66);
    }

    /* access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (ote.d(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.t0.f()) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final z5b getCallback() {
        return this.a;
    }

    public final d6b getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i, k56 k56, k56 k562, a66 a66) {
        View f;
        ValueAnimator valueAnimator = this.s0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.s0;
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        z5b z5b = this.a;
        if (z5b != null && (f = z5b.f()) != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{f.getTop(), i});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new jf(this, a66, animatedFraction, 1));
            ofInt.addListener(new sg(k562, (FrameLayout) this, k56, 1));
            ofInt.start();
            this.s0 = ofInt;
        }
    }

    public final void j(boolean z) {
        View f;
        this.b = d6b.a;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            z5b z5b = this.a;
            if (z5b != null) {
                z5b.i();
            }
            if (z) {
                i(this, scrollStateOffset, new x5b(this, 1), (x5b) null, new y5b(this, 1), 4);
            } else {
                z5b z5b2 = this.a;
                if (!(z5b2 == null || (f = z5b2.f()) == null)) {
                    f.offsetTopAndBottom(scrollStateOffset);
                }
                z5b z5b3 = this.a;
                if (z5b3 != null) {
                    z5b3.h();
                }
                setBackgroundAlpha(0.0f);
            }
        }
        invalidate();
    }

    public final void k() {
        this.b = d6b.c;
        if (getViewDragHeight() > 0) {
            i(this, getScrollStateOffset(), (x5b) null, new x5b(this, 0), new y5b(this, 0), 2);
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0.n(r4.getX(), r4.getY()) == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 2
            if (r0 != r1) goto L_0x001b
            z5b r0 = r3.a
            if (r0 == 0) goto L_0x001b
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.n(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r3.o = r1
            dnf r3 = r3.t0     // Catch:{ all -> 0x0029 }
            boolean r3 = r3.o(r4)     // Catch:{ all -> 0x0029 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0030
        L_0x0029:
            r3 = move-exception
            njc r4 = new njc
            r4.<init>(r3)
            r3 = r4
        L_0x0030:
            java.lang.Throwable r4 = defpackage.pjc.a(r3)
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = "PopupLayout"
            java.lang.String r1 = "onInterceptTouchEvent fail, issue ONEME-9645"
            defpackage.hm9.p(r0, r1, r4)
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r3 instanceof defpackage.njc
            if (r0 == 0) goto L_0x0044
            r3 = r4
        L_0x0044:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View f;
        z5b z5b = this.a;
        if (z5b != null && (f = z5b.f()) != null) {
            int scrollStateOffset = (this.s0 == null && this.t0.a == 0) ? getScrollStateOffset() : f.getTop();
            super.onLayout(z, i, i2, i3, i4);
            ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            f.offsetTopAndBottom(i5);
            w5b halfExpandedViewHelper = getHalfExpandedViewHelper();
            halfExpandedViewHelper.b = 0;
            halfExpandedViewHelper.a(i5);
            if (this.v0 != f.getMeasuredHeight()) {
                this.v0 = f.getMeasuredHeight();
                if (this.s0 != null) {
                    int ordinal = this.b.ordinal();
                    if (ordinal == 0) {
                        j(true);
                    } else if (ordinal == 1) {
                        setHalfScreen((a66) null);
                    } else if (ordinal == 2) {
                        k();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof c6b) {
            c6b c6b = (c6b) parcelable;
            super.onRestoreInstanceState(c6b.getSuperState());
            d6b d6b = (d6b) d6b.X.get(c6b.a);
            this.b = d6b;
            this.c = c6b.b;
            int ordinal = d6b.ordinal();
            if (ordinal == 0) {
                j(false);
            } else if (ordinal == 1) {
                setHalfScreen((a66) null);
            } else if (ordinal == 2) {
                k();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        return new c6b(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        dnf dnf = this.t0;
        if (dnf.r == null) {
            super.onTouchEvent(motionEvent);
        }
        this.o = true;
        try {
            dnf.i(motionEvent);
            bool = Boolean.TRUE;
        } catch (Throwable th) {
            bool = new njc(th);
        }
        Throwable a2 = pjc.a(bool);
        if (a2 != null) {
            hm9.p("PopupLayout", "onTouchEvent fail, issue ONEME-9645", a2);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof njc) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        dnf dnf = this.t0;
        int i = dnf.a;
        if (i != 2 && i != 1) {
            dnf.a();
            if (dnf.a == 2) {
                OverScroller overScroller = dnf.p;
                overScroller.getCurrX();
                overScroller.getCurrY();
                overScroller.abortAnimation();
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                dnf.q.J(dnf.r, currX, currY);
            }
            dnf.m(0);
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == d6b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(z5b z5b) {
        this.a = z5b;
    }

    public final void setHalfScreen(a66 a66) {
        this.b = d6b.b;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (a66 == null) {
                a66 = new y5b(this, 2);
            }
            h(scrollStateOffset, new s4a(28), new x5b(this, 3), a66);
        } else if (this.b == d6b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(d6b d6b) {
        this.b = d6b;
    }

    public final void setStackFromBottom(boolean z) {
        this.c = z;
    }
}
