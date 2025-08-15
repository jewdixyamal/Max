package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: vee  reason: default package */
public final class vee implements SurfaceHolder.Callback {
    public Size X;
    public boolean Y = false;
    public boolean Z = false;
    public Size a;
    public see b;
    public see c;
    public u00 o;
    public final /* synthetic */ wee s0;

    public vee(wee wee) {
        this.s0 = wee;
    }

    public final boolean a() {
        wee wee = this.s0;
        Surface surface = wee.e.getHolder().getSurface();
        if (this.Y || this.b == null || !Objects.equals(this.a, this.X)) {
            return false;
        }
        u00 u00 = this.o;
        see see = this.b;
        Objects.requireNonNull(see);
        see.b(surface, ot3.a(wee.e.getContext()), new cy1(8, u00));
        this.Y = true;
        wee.a = true;
        wee.m();
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.X = new Size(i2, i3);
        a();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        see see;
        if (this.Z && (see = this.c) != null) {
            see.d();
            see.j.b((Object) null);
            this.c = null;
            this.Z = false;
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.Y) {
            see see = this.b;
            if (see != null) {
                Objects.toString(see);
                this.b.l.a();
            }
        } else {
            see see2 = this.b;
            if (see2 != null) {
                Objects.toString(see2);
                this.b.d();
            }
        }
        this.Z = true;
        see see3 = this.b;
        if (see3 != null) {
            this.c = see3;
        }
        this.Y = false;
        this.b = null;
        this.o = null;
        this.X = null;
        this.a = null;
    }
}
