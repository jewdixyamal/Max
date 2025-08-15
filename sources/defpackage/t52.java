package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: t52  reason: default package */
public final class t52 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ u52 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t52(u52 u52, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = u52;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t52) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t52(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 q = this.Y.q();
            if (q == null) {
                return e5f;
            }
            ContextScope a = j1e.a(this.b);
            List<Object> list = this.Z;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (Object s52 : list) {
                arrayList.add(j47.h(a, (nx3) null, new s52(s52, (Continuation) null, this.Y, q, list), 3));
            }
            this.X = 1;
            if (pag.c(arrayList, this) == tx3) {
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
