package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: xl2  reason: default package */
public final class xl2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ cm2 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl2(xs xsVar, cm2 cm2, Continuation continuation) {
        super(2, continuation);
        this.Z = xsVar;
        this.s0 = cm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xl2 xl2 = new xl2((xs) this.Z, this.s0, continuation);
        xl2.Y = obj;
        return xl2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            StringBuilder sb = new StringBuilder("getFcmHistory: chats=");
            Set set = this.Z;
            sb.append(set);
            hm9.m("cm2", sb.toString(), new Object[0]);
            if (set.isEmpty()) {
                return lz4.a;
            }
            mqc mqc = new mqc(new wl2(this.s0, set, (Continuation) null));
            this.X = 1;
            ty j = i24.j(mqc, 1);
            ua3 a = ngg.a();
            j47.T(sx3, (lx3) j.o, (vx3) null, new jq5((mn5) j.c, a, (Continuation) null), 2);
            obj = a.awaitInternal(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
