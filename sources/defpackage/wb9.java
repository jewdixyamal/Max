package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: wb9  reason: default package */
public final class wb9 extends ffe implements a66 {
    public zf4 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ long[] s0;
    public final /* synthetic */ xb9 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb9(xb9 xb9, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.s0 = jArr;
        this.t0 = xb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wb9 wb9 = new wb9(this.t0, continuation, this.s0);
        wb9.Z = obj;
        return wb9;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        zf4 zf4;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Z;
            long[] jArr = this.s0;
            if (jArr.length != 0) {
                xb9 xb9 = this.t0;
                if (xb9.i() && j1e.z(sx32)) {
                    zf4 h = j47.h(sx32, (nx3) null, new vb9(xb9, (Continuation) null, jArr), 3);
                    ArrayList d0 = ys.d0(new yf4[]{h, null});
                    this.Z = sx32;
                    this.X = h;
                    this.Y = 1;
                    if (pag.c(d0, this) == tx3) {
                        return tx3;
                    }
                    sx3 = sx32;
                    zf4 = h;
                }
            }
            return null;
        } else if (i == 1) {
            zf4 = this.X;
            sx3 = (sx3) this.Z;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j1e.o(sx3);
        ym3 ym3 = (ym3) zf4.m();
        if (ym3 == null) {
            return null;
        }
        return new kpa(ym3, (Object) null);
    }
}
