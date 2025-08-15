package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: jba  reason: default package */
public final class jba extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nba Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jba(nba nba, Continuation continuation) {
        super(2, continuation);
        this.Y = nba;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jba) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jba jba = new jba(this.Y, continuation);
        jba.X = obj;
        return jba;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        nba nba = this.Y;
        HashSet B0 = x53.B0((List) this.X);
        vxd vxd = nba.h;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        nba.h = null;
        nx3 limitedParallelism = ((w9a) nba.b).a().limitedParallelism(1, "folders-counters");
        ArrayList arrayList = new ArrayList(z53.S(B0, 10));
        Iterator it = B0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (tpa.f(str, "all.chat.folder")) {
                obj2 = new qn5(3, new kba(str, hy3.b));
            } else {
                obj2 = new nj7(new ht5(str, nba.c, nba.a, nba.d, limitedParallelism).e, str, 1);
            }
            arrayList.add(obj2);
        }
        nba.h = od2.L(new zn5(new ki4((mn5[]) x53.D0(arrayList).toArray(new mn5[0]), 2), new v59(2, nba.e, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), 5), nba.g);
        return e5f.a;
    }
}
