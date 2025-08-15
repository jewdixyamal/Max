package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: dx5  reason: default package */
public final class dx5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jx5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx5(jx5 jx5, Continuation continuation) {
        super(2, continuation);
        this.Z = jx5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dx5) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dx5 dx5 = new dx5(this.Z, continuation);
        dx5.Y = obj;
        return dx5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List<av5> list = (List) this.Y;
            eca eca = this.Z.X;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (av5 av5 : list) {
                arrayList.add(new xa9(av5.a, av5.b, av5.d, av5.e));
            }
            ir6 ir6 = hm9.m;
            if (ir6 != null) {
                eca.getClass();
                if (ir6.c()) {
                    ir6.d(us7.X, "OneMeInitialDataStorage", zr6.h(arrayList.size(), "updateFolders by count: "), (Throwable) null);
                }
            }
            ((AtomicReference) ((ya9) eca.c.getValue()).c).set(arrayList);
            ((ya9) eca.c.getValue()).G();
            q0e q0e = this.Z.s0;
            this.X = 1;
            q0e.m((Object) null, list);
            if (e5f == tx3) {
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
