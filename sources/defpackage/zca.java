package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: zca  reason: default package */
public final class zca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ada Y;
    public final /* synthetic */ File Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zca(ada ada, File file, Continuation continuation) {
        super(2, continuation);
        this.Y = ada;
        this.Z = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zca(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            trc trc = (trc) this.Y.m.getValue();
            this.X = 1;
            trc.getClass();
            obj = j47.t0(xq9.a.plus(trc.b), new src(this.Z, trc, (Continuation) null), this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Uri) obj) == null) {
            hm9.p("ada", "Can't save video", (Throwable) null);
        }
        return e5f.a;
    }
}
