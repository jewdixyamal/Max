package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: xc8  reason: default package */
public final class xc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ yc8 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xc8(Object obj, Continuation continuation, es8 es8, boolean z, yc8 yc8) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8;
        this.Z = z;
        this.s0 = yc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xc8(this.X, continuation, this.Y, this.Z, this.s0);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l20 l20 = (l20) this.X;
        long hashCode = (long) l20.r.hashCode();
        jk0 jk0 = jk0.b;
        kk0 kk0 = kk0.b;
        es8 es8 = this.Y;
        String str = l20.r;
        k20 k20 = l20.d;
        if (k20 != null) {
            return new wm8(hashCode, es8.a.b, k20.a, kk5.r(ju0.t(k20.d, kk0, jk0)), 2, new Long(k20.c), str, this.Z, (Uri) null, false);
        }
        yc8 yc8 = this.s0;
        d20 d20 = l20.o;
        x10 x10 = l20.b;
        if (x10 != null && x10.X) {
            return new wm8(hashCode, es8.a.b, x10.s0, kk5.r(ju0.t(x10.v0, kk0, jk0)), 3, (Long) null, str, this.Z, (Uri) null, !yc8.c.b(true) && !d20.c());
        } else if (x10 != null) {
            return new wm8(hashCode, es8.a.b, x10.s0, kk5.r(ju0.t(x10.a, kk0, jk0)), 1, (Long) null, str, this.Z, ((o20) yc8.e.getValue()).c(l20, false), !yc8.c.d() && !d20.c());
        } else {
            String name = yc8.getClass().getName();
            long j = es8.a.b;
            throw new IllegalStateException((name + ": Unknown type in PhotoVideoAttach with messageId = " + j).toString());
        }
    }
}
