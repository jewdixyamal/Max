package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* renamed from: gee  reason: default package */
public final /* synthetic */ class gee implements wu {
    public final /* synthetic */ yb0 X;
    public final /* synthetic */ iee a;
    public final /* synthetic */ hee b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yb0 o;

    public /* synthetic */ gee(iee iee, hee hee, int i, yb0 yb0, yb0 yb02) {
        this.a = iee;
        this.b = hee;
        this.c = i;
        this.o = yb0;
        this.X = yb02;
    }

    public final bm7 apply(Object obj) {
        hee hee = this.b;
        Surface surface = (Surface) obj;
        iee iee = this.a;
        iee.getClass();
        surface.getClass();
        try {
            hee.d();
            kee kee = new kee(surface, this.c, iee.g.a, this.o, this.X);
            kee.u0.b.d(new fee(hee, 1), ju0.k());
            c54.p("Consumer can only be linked once.", hee.q == null);
            hee.q = kee;
            return kq0.r(kee);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new dw6(1, e);
        }
    }
}
