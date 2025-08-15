package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: xr  reason: default package */
public final class xr extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c62 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zr s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xr(c62 c62, boolean z, zr zrVar, Continuation continuation) {
        super(2, continuation);
        this.Y = c62;
        this.Z = z;
        this.s0 = zrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xr(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            c62 c62 = this.Y;
            String str = c62.b.a;
            bc7[] bc7Arr = zr.J0;
            zr zrVar = this.s0;
            tfg.A(str, this.Z, ((p7b) zrVar.u()).a);
            Context t = zrVar.t();
            this.X = 1;
            if (ao7.a((ao7) zrVar.B0.getValue(), t, c62.b, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
