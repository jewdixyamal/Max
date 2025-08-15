package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: wf  reason: default package */
public final class wf implements vf {
    public Object X = dv0.DEFAULT;
    public Object Y;
    public Object Z;
    public boolean a;
    public long b;
    public Object c;
    public Object o = "";

    public void B(ColorFilter colorFilter) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.B(colorFilter);
        }
    }

    public int G() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.G();
    }

    public int M(int i) {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.M(i);
    }

    public int V() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return -1;
        }
        return vfVar.V();
    }

    public void Z(Rect rect) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.Z(rect);
        }
    }

    public synchronized void a() {
        if (!this.a) {
            this.a = true;
            ((ScheduledExecutorService) this.X).schedule((re) this.Z, 1000, TimeUnit.MILLISECONDS);
        }
    }

    public int a0() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return -1;
        }
        return vfVar.a0();
    }

    public void b0(av1 av1) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.b0(av1);
        }
    }

    public boolean c0(Drawable drawable, Canvas canvas, int i) {
        this.b = ((hc9) this.o).now();
        boolean z = false;
        vf vfVar = (vf) this.c;
        if (vfVar != null && vfVar.c0(drawable, canvas, i)) {
            z = true;
        }
        a();
        return z;
    }

    public void clear() {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.clear();
        }
    }

    public int g0() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.g0();
    }

    public void p(int i) {
        vf vfVar = (vf) this.c;
        if (vfVar != null) {
            vfVar.p(i);
        }
    }

    public int x() {
        vf vfVar = (vf) this.c;
        if (vfVar == null) {
            return 0;
        }
        return vfVar.x();
    }
}
