package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: se  reason: default package */
public final class se extends Drawable implements Animatable, kq4 {
    public static final c32 A0 = new c32(7, (byte) 0);
    public long X;
    public long Y;
    public int Z;
    public final vf a;
    public final g03 b;
    public volatile boolean c;
    public long o;
    public long s0;
    public long t0;
    public int u0;
    public final long v0 = 8;
    public int w0;
    public volatile c32 x0 = A0;
    public lh6 y0;
    public final re z0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, av1] */
    public se(wf wfVar) {
        this.a = wfVar;
        ? obj = new Object();
        this.z0 = new re(0, this);
        this.b = new g03(wfVar);
        wfVar.b0(obj);
    }

    public final void a() {
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.clear();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.a != null && this.b != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long max = this.c ? uptimeMillis - this.o : (long) Math.max((double) this.X, 0.0d);
            int T = this.b.T(max);
            if (T == -1) {
                T = this.a.x() - 1;
                this.x0.getClass();
                this.c = false;
            } else if (T == 0 && this.Z != -1 && uptimeMillis >= this.Y) {
                this.x0.getClass();
            }
            boolean c0 = this.a.c0(this, canvas, T);
            if (c0) {
                this.x0.getClass();
                this.Z = T;
            }
            if (!c0) {
                this.w0++;
                if (ta5.a.i(2)) {
                    ta5.d(se.class, Integer.valueOf(this.w0), "Dropped a frame. Count: %s");
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.c) {
                long V = this.b.V(uptimeMillis2 - this.o);
                if (V != -1) {
                    long j = this.o + V + this.v0;
                    this.Y = j;
                    scheduleSelf(this.z0, j);
                } else {
                    this.x0.getClass();
                    this.c = false;
                }
            }
            this.X = max;
        }
    }

    public final int getIntrinsicHeight() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.V() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.a0() : super.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.c;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.Z(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = (long) i;
        if (this.X == j) {
            return false;
        }
        this.X = j;
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        if (this.y0 == null) {
            this.y0 = new lh6();
        }
        this.y0.c = i;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.p(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.y0 == null) {
            this.y0 = new lh6();
        }
        lh6 lh6 = this.y0;
        lh6.f = colorFilter;
        lh6.b = colorFilter != null;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.B(colorFilter);
        }
    }

    public final void start() {
        vf vfVar;
        if (!this.c && (vfVar = this.a) != null && vfVar.x() > 1) {
            this.c = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.s0;
            this.o = j;
            this.Y = j;
            this.X = uptimeMillis - this.t0;
            this.Z = this.u0;
            invalidateSelf();
            this.x0.getClass();
        }
    }

    public final void stop() {
        if (this.c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.s0 = uptimeMillis - this.o;
            this.t0 = uptimeMillis - this.X;
            this.u0 = this.Z;
            this.c = false;
            this.o = 0;
            this.Y = 0;
            this.X = -1;
            this.Z = -1;
            unscheduleSelf(this.z0);
            this.x0.getClass();
        }
    }
}
