package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vx1  reason: default package */
public final /* synthetic */ class vx1 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                bc0 bc0 = (bc0) obj;
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                return;
            case 1:
                zb0 zb0 = (zb0) obj;
                ce4 ce4 = (ce4) obj3;
                ce4.getClass();
                kee kee = (kee) obj2;
                kee.close();
                Surface surface = (Surface) ce4.s0.remove(kee);
                if (surface != null) {
                    zm4 zm4 = ce4.a;
                    o76.d((AtomicBoolean) zm4.c, true);
                    o76.c((Thread) zm4.e);
                    zm4.s(surface, true);
                    return;
                }
                return;
            case 2:
                zb0 zb02 = (zb0) obj;
                vs4 vs4 = (vs4) obj3;
                vs4.getClass();
                kee kee2 = (kee) obj2;
                kee2.close();
                Surface surface2 = (Surface) vs4.s0.remove(kee2);
                if (surface2 != null) {
                    ts4 ts4 = vs4.a;
                    o76.d((AtomicBoolean) ts4.c, true);
                    o76.c((Thread) ts4.e);
                    ts4.s(surface2, true);
                    return;
                }
                return;
            case 3:
                gr7 gr7 = (gr7) obj;
                fk9 fk9 = (fk9) obj3;
                fk9.getClass();
                gr7.f = ((Boolean) obj2).booleanValue();
                fk9.Y.getClass();
                hm9.o("nr7", "background permissions is not supported yet");
                gr7.g = false;
                return;
            default:
                Throwable th = (Throwable) obj;
                adc adc = (adc) obj3;
                if (adc.W == null) {
                    if (th instanceof EncodeException) {
                        adc.f0 = 5;
                    } else {
                        adc.f0 = 6;
                    }
                    adc.W = th;
                    adc.H();
                    ((lq1) obj2).b((Object) null);
                    return;
                }
                return;
        }
    }
}
