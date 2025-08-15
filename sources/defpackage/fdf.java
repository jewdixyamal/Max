package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: fdf  reason: default package */
public final class fdf implements tlf {
    public final gef X;
    public final WeakReference Y;
    public final mw7 Z;
    public final String a;
    public final long b;
    public final dkf c;
    public final f4b o;

    public fdf(String str, long j, dkf dkf, f4b f4b, gef gef, WeakReference weakReference, id2 id2) {
        this.a = str;
        this.b = j;
        this.c = dkf;
        this.o = f4b;
        this.X = gef;
        this.Y = weakReference;
        this.Z = id2;
    }

    public final void G(Surface surface) {
        String name = fdf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            long j = this.b;
            String str = this.a;
            boolean b2 = this.c.b();
            StringBuilder j2 = z7b.j("Player autoplay. Surface created, \n                            |msgId:", j, ", \n                            |attachId:", str);
            j2.append("\n                            |playing:");
            j2.append(b2);
            ir6.d(us7, name, x9e.c0(j2.toString()), (Throwable) null);
        }
        this.c.M0(surface);
    }

    public final int M0() {
        return this.X.getHeight();
    }

    public final int R() {
        return this.X.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdf)) {
            return false;
        }
        fdf fdf = (fdf) obj;
        return tpa.f(this.a, fdf.a) && this.b == fdf.b && tpa.f(this.c, fdf.c) && tpa.f(this.o, fdf.o) && tpa.f(this.X, fdf.X) && tpa.f(this.Y, fdf.Y) && tpa.f(this.Z, fdf.Z);
    }

    public final int hashCode() {
        int m = h4f.m(this.a.hashCode() * 31, 31, this.b);
        int hashCode = this.o.hashCode();
        int hashCode2 = this.X.hashCode();
        int hashCode3 = this.Y.hashCode();
        return this.Z.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.c.hashCode() + m) * 31)) * 31)) * 31)) * 31);
    }

    public final int j() {
        this.X.getClass();
        return 2;
    }

    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String name = fdf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            long j = this.b;
            String str = this.a;
            boolean b2 = this.c.b();
            int g = this.Z.g();
            StringBuilder j2 = z7b.j("Player autoplay. Surface destroyed, \n                            |msgId:", j, ", \n                            |attachId:", str);
            j2.append("\n                            |playing:");
            j2.append(b2);
            j2.append("\n                            |states:");
            j2.append(g);
            ir6.d(us7, name, x9e.c0(j2.toString()), (Throwable) null);
        }
        this.o.a(this.c);
        cmf cmf = (cmf) this.Y.get();
        if (cmf != null) {
            cmf.u();
        }
        this.Z.e(this.a);
    }

    public final String toString() {
        return "PlayingState(attachId=" + this.a + ", messageId=" + this.b + ", player=" + this.c + ", playerHolder=" + this.o + ", videoContent=" + this.X + ", weakViewRef=" + this.Y + ", states=" + this.Z + ")";
    }
}
