package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Iterator;
import java.util.Map;

/* renamed from: oif  reason: default package */
public final class oif implements SurfaceTexture.OnFrameAvailableListener {
    public final boolean a;
    public final /* synthetic */ sif b;

    public oif(sif sif, boolean z) {
        this.b = sif;
        this.a = z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            hm9.p(this.b.a, "onFrameAvailable, surface texture is null!", (Throwable) null);
            return;
        }
        sif sif = this.b;
        if (sif.v0 || sif.b.get()) {
            hm9.p(this.b.a, "onFrameAvailable, called in released state", (Throwable) null);
            return;
        }
        sif sif2 = this.b;
        fjf fjf = sif2.u0;
        if (fjf != null) {
            boolean z = false;
            boolean z2 = false;
            for (Map.Entry entry : sif2.Z.entrySet()) {
                kee kee = (kee) entry.getKey();
                Surface surface = (Surface) entry.getValue();
                int i = kee.c;
                if (i == 34) {
                    if (!z2) {
                        surfaceTexture.updateTexImage();
                        surfaceTexture.getTransformMatrix(sif2.s0);
                        z2 = true;
                    }
                    kee.n(sif2.t0, sif2.s0);
                    try {
                        fjf.w(surfaceTexture, surface, sif2.t0, this.a);
                        z = true;
                    } catch (RuntimeException e) {
                        hm9.p(sif2.a, "failed to render with GL renderer", e);
                    }
                } else {
                    hm9.m0(sif2.a, "onFrameAvailable, unsupported format=" + i + " for surfaceOutput=" + kee, new Object[0]);
                }
            }
            if (z) {
                sif sif3 = this.b;
                if (!sif3.x0) {
                    sif3.x0 = true;
                    String str = sif3.a;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        us7 us7 = us7.X;
                        pif pif = sif3.c;
                        pif.getClass();
                        ir6.d(us7, str, ey8.i(SystemClock.elapsedRealtime() - pif.c, "notifyFirstFrameRendered, in ", " ms after video message processor started"), (Throwable) null);
                    }
                    Iterator it = sif3.Y.iterator();
                    while (it.hasNext()) {
                        ((tif) it.next()).c();
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
