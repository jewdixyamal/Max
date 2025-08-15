package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: sxa  reason: default package */
public final class sxa extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ txa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sxa(txa txa, Continuation continuation) {
        super(2, continuation);
        this.Z = txa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sxa) n((Set) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sxa sxa = new sxa(this.Z, continuation);
        sxa.Y = obj;
        return sxa;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Set<Number> set = (Set) this.Y;
            boolean isEmpty = set.isEmpty();
            txa txa = this.Z;
            if (isEmpty) {
                txa.o.m((Object) null, oz4.a);
            } else {
                CharSequence charSequence = (CharSequence) txa.t0.getValue();
                if (!(charSequence == null || charSequence.length() == 0)) {
                    pnf.o(txa.s0, uxa.a);
                }
                ArrayList arrayList = new ArrayList(z53.S(set, 10));
                for (Number longValue : set) {
                    arrayList.add(txa.b.g(longValue.longValue()));
                }
                ki4 ki4 = new ki4((mn5[]) x53.D0(arrayList).toArray(new mn5[0]), 3);
                v59 v59 = new v59(2, txa.o, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
                this.X = 1;
                if (od2.r(ki4, v59, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
