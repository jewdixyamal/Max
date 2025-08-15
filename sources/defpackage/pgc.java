package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: pgc  reason: default package */
public final class pgc implements ug7 {
    public final /* synthetic */ ry1 X;
    public final /* synthetic */ xi9 Y;
    public final /* synthetic */ a66 Z;
    public final /* synthetic */ eg7 a;
    public final /* synthetic */ mec b;
    public final /* synthetic */ sx3 c;
    public final /* synthetic */ eg7 o;

    public pgc(eg7 eg7, mec mec, sx3 sx3, eg7 eg72, sy1 sy1, aj9 aj9, a66 a66) {
        this.a = eg7;
        this.b = mec;
        this.c = sx3;
        this.o = eg72;
        this.X = sy1;
        this.Y = aj9;
        this.Z = a66;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        eg7 eg72 = this.a;
        mec mec = this.b;
        if (eg7 == eg72) {
            mec.a = j47.T(this.c, (lx3) null, (vx3) null, new ogc(this.Y, this.Z, (Continuation) null), 3);
            return;
        }
        if (eg7 == this.o) {
            x77 x77 = (x77) mec.a;
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            mec.a = null;
        }
        if (eg7 == eg7.ON_DESTROY) {
            this.X.resumeWith(e5f.a);
        }
    }
}
