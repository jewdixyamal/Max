package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: cy3  reason: default package */
public final class cy3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ilc s0;
    public final /* synthetic */ String[] t0;
    public final /* synthetic */ Callable u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cy3(ilc ilc, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.s0 = ilc;
        this.t0 = strArr;
        this.u0 = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cy3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cy3 cy3 = new cy3(this.s0, this.t0, this.u0, continuation);
        cy3.Y = obj;
        return cy3;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Callable callable = this.u0;
            by3 by3 = new by3(this.Z, this.s0, (on5) this.Y, this.t0, callable, (Continuation) null);
            this.X = 1;
            if (j1e.k(by3, this) == tx3) {
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
