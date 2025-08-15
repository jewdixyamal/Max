package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: r04  reason: default package */
public final class r04 implements cje {
    public final ViewPager2 a;
    public final boolean b;
    public final boolean c;

    public r04(ViewPager2 viewPager2, boolean z, boolean z2) {
        this.a = viewPager2;
        this.b = z;
        this.c = z2;
    }

    public final void a(eje eje) {
        int[] b2;
        int i;
        boolean z = this.b;
        ViewPager2 viewPager2 = this.a;
        if (z) {
            int i2 = eje.d;
            int currentItem = viewPager2.getCurrentItem() - i2;
            if (Math.abs(currentItem) > 1) {
                int abs = (Math.abs(currentItem) - 1) * Integer.signum(currentItem) * viewPager2.getWidth();
                jb5 jb5 = viewPager2.B0;
                vwc vwc = jb5.b;
                if (!(vwc.f == 1)) {
                    jb5.g = 0;
                    jb5.f = (float) 0;
                    jb5.h = SystemClock.uptimeMillis();
                    VelocityTracker velocityTracker = jb5.d;
                    if (velocityTracker == null) {
                        jb5.d = VelocityTracker.obtain();
                        jb5.e = ViewConfiguration.get(jb5.a.getContext()).getScaledMaximumFlingVelocity();
                    } else {
                        velocityTracker.clear();
                    }
                    vwc.e = 4;
                    vwc.f(true);
                    if (vwc.f != 0) {
                        jb5.c.E0();
                    }
                    long j = jb5.h;
                    MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                    jb5.d.addMovement(obtain);
                    obtain.recycle();
                }
                float f = (float) abs;
                jb5 jb52 = viewPager2.B0;
                if (jb52.b.m) {
                    float f2 = jb52.f - f;
                    jb52.f = f2;
                    int round = Math.round(f2 - ((float) jb52.g));
                    jb52.g += round;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z2 = jb52.a.getOrientation() == 0;
                    int i3 = z2 ? round : 0;
                    if (z2) {
                        round = 0;
                    }
                    float f3 = z2 ? jb52.f : 0.0f;
                    float f4 = z2 ? 0.0f : jb52.f;
                    jb52.c.scrollBy(i3, round);
                    MotionEvent obtain2 = MotionEvent.obtain(jb52.h, uptimeMillis, 2, f3, f4, 0);
                    jb52.d.addMovement(obtain2);
                    obtain2.recycle();
                }
                jb5 jb53 = viewPager2.B0;
                vwc vwc2 = jb53.b;
                boolean z3 = vwc2.m;
                if (z3) {
                    if (!(vwc2.f == 1) || z3) {
                        vwc2.m = false;
                        vwc2.g();
                        uwc uwc = vwc2.g;
                        if (uwc.c == 0) {
                            int i4 = uwc.b;
                            if (i4 != vwc2.h) {
                                vwc2.c(i4);
                            }
                            vwc2.d(0);
                            vwc2.e();
                        } else {
                            vwc2.d(2);
                        }
                    }
                    VelocityTracker velocityTracker2 = jb53.d;
                    velocityTracker2.computeCurrentVelocity(1000, (float) jb53.e);
                    if (!jb53.c.O((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                        ViewPager2 viewPager22 = jb53.a;
                        View i5 = viewPager22.y0.i(viewPager22.u0);
                        if (!(i5 == null || ((i = b2[0]) == 0 && b2[1] == 0))) {
                            viewPager22.x0.A0(i, (b2 = viewPager22.y0.b(viewPager22.u0, i5))[1], false);
                        }
                    }
                }
            }
            viewPager2.e(i2, true);
            return;
        }
        viewPager2.e(eje.d, this.c);
    }
}
