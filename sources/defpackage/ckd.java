package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.util.share.ShareData;

/* renamed from: ckd  reason: default package */
public final class ckd implements qza {
    public final ShareData a;
    public final aea b;
    public final x3c c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final q0e g;
    public final w7c h;
    public final kld i;
    public final v7c j;
    public final h7b k = new h7b(17);
    public sx3 l;
    public boolean m;

    public ckd(ShareData shareData, aea aea, x3c x3c, je7 je7, je7 je72, je7 je73) {
        this.a = shareData;
        this.b = aea;
        this.c = x3c;
        this.d = je7;
        this.e = je72;
        this.f = je73;
        q0e a2 = r0e.a((Object) null);
        this.g = a2;
        this.h = new w7c(a2);
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.i = b2;
        this.j = new v7c(b2);
        if (shareData == null) {
            throw new IllegalStateException("ShareData is null".toString());
        }
    }

    public final void a() {
        this.l = null;
    }

    public final void b(gza gza) {
        ((AtomicReference) this.c.Y).updateAndGet(new iz0(9, gza));
    }

    public final void c(sx3 sx3) {
        this.l = sx3;
        j47.T(sx3, ((w9a) ((kke) this.d.getValue())).b(), (vx3) null, new akd(this, (Continuation) null), 2);
    }

    public final void e(long j2) {
        ((AtomicReference) this.c.Y).updateAndGet(new v79(j2, 3));
    }
}
