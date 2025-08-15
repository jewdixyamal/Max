package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: cec  reason: default package */
public final class cec implements Runnable {
    public boolean X = false;
    public boolean Y = false;
    public final /* synthetic */ RecyclerView Z;
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator o;

    public cec(RecyclerView recyclerView) {
        this.Z = recyclerView;
        c77 c77 = RecyclerView.T1;
        this.o = c77;
        this.c = new OverScroller(recyclerView.getContext(), c77);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.Z;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.o;
        c77 c77 = RecyclerView.T1;
        if (interpolator != c77) {
            this.o = c77;
            this.c = new OverScroller(recyclerView.getContext(), c77);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.X) {
            this.Y = true;
            return;
        }
        RecyclerView recyclerView = this.Z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = zmf.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.Z;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.T1;
        }
        if (this.o != interpolator) {
            this.o = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.Z;
        if (recyclerView.B0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.Y = false;
        this.X = true;
        recyclerView.s();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int r = RecyclerView.r(currX - this.a, recyclerView.W0, recyclerView.Y0, recyclerView.getWidth());
            int r2 = RecyclerView.r(i5, recyclerView.X0, recyclerView.Z0, recyclerView.getHeight());
            int[] iArr = recyclerView.E1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean y = recyclerView.y(r, r2, 1, iArr, (int[]) null);
            int[] iArr2 = recyclerView.E1;
            if (y) {
                r -= iArr2[0];
                r2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.q(r, r2);
            }
            if (recyclerView.A0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.w0(r, r2, iArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[1];
                int i8 = r - i6;
                int i9 = r2 - i7;
                yh7 yh7 = recyclerView.B0.e;
                if (yh7 != null && !yh7.d && yh7.e) {
                    int b2 = recyclerView.s1.b();
                    if (b2 == 0) {
                        yh7.l();
                    } else if (yh7.a >= b2) {
                        yh7.a = b2 - 1;
                        yh7.i(i6, i7);
                    } else {
                        yh7.i(i6, i7);
                    }
                }
                i3 = i6;
                i2 = i8;
                i = i9;
                i4 = i7;
            } else {
                i2 = r;
                i = r2;
                i4 = 0;
                i3 = 0;
            }
            if (!recyclerView.D0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i10 = i4;
            recyclerView.z(i3, i4, i2, i, (int[]) null, 1, iArr3);
            int i11 = i2 - iArr2[0];
            int i12 = i - iArr2[1];
            if (!(i3 == 0 && i10 == 0)) {
                recyclerView.A(i3, i10);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            yh7 yh72 = recyclerView.B0.e;
            if ((yh72 == null || !yh72.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.C();
                        if (recyclerView.W0.isFinished()) {
                            recyclerView.W0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.D();
                        if (recyclerView.Y0.isFinished()) {
                            recyclerView.Y0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.X0.isFinished()) {
                            recyclerView.X0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.Z0.isFinished()) {
                            recyclerView.Z0.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i13 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = zmf.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.R1) {
                    b23 b23 = recyclerView.r1;
                    int[] iArr4 = b23.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    b23.d = 0;
                }
            } else {
                b();
                ca6 ca6 = recyclerView.q1;
                if (ca6 != null) {
                    ca6.a(recyclerView, i3, i10);
                }
            }
        }
        yh7 yh73 = recyclerView.B0.e;
        if (yh73 != null && yh73.d) {
            yh73.i(0, 0);
        }
        this.X = false;
        if (this.Y) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = zmf.a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.a(1);
    }
}
