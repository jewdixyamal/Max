package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: b13  reason: default package */
public final class b13 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qp4 Z;
    public final /* synthetic */ k56 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b13(qp4 qp4, k56 k56, Continuation continuation) {
        super(2, continuation);
        this.Z = qp4;
        this.s0 = k56;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b13) n((fka) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b13 b13 = new b13(this.Z, this.s0, continuation);
        b13.Y = obj;
        return b13;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            fka fka = (fka) this.Y;
            String str = (String) this.Z.a;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, str, "themeFlow " + fka, (Throwable) null);
            }
            h7b h7b = (h7b) this.Z.b;
            this.X = 1;
            h7b.getClass();
            jd4 jd4 = ql4.a;
            Object t0 = j47.t0(MainDispatcherLoader.dispatcher.getImmediate(), new o8(h7b, (List) this.s0.invoke(), (Continuation) null), this);
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
