package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qif  reason: default package */
public final class qif implements tj3 {
    public final kee a;
    public final /* synthetic */ sif b;

    public qif(sif sif, kee kee) {
        this.b = sif;
        this.a = kee;
    }

    public final void accept(Object obj) {
        zb0 zb0 = (zb0) obj;
        String str = this.b.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, zr6.h(zb0.a, "onOutputSurface close event="), (Throwable) null);
        }
        this.b.e();
        this.a.close();
        Surface surface = (Surface) this.b.Z.remove(this.a);
        if (surface != null) {
            fjf fjf = this.b.u0;
            if (fjf != null) {
                o76.d((AtomicBoolean) fjf.c, true);
                o76.c((Thread) fjf.e);
                fjf.s(surface, true);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
