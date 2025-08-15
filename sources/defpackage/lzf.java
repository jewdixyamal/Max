package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: lzf  reason: default package */
public final class lzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzf(zzf zzf, Continuation continuation) {
        super(2, continuation);
        this.Y = zzf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lzf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            zzf zzf = this.Y;
            q0e q0e = zzf.F0;
            Boolean bool = Boolean.FALSE;
            q0e.m((Object) null, bool);
            zzf.G0.m((Object) null, bool);
            zzf.B0 = null;
            for (ia7 d : (List) zzf.D0.c) {
                d.d((wsf) null);
            }
            Object t0 = j47.t0(((w9a) ((kke) zzf.u0.getValue())).b(), new nzf(zzf, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
