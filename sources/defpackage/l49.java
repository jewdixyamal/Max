package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: l49  reason: default package */
public final class l49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l49(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.Y = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l49(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        n59 n59 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ArrayList c = ((l29) n59.p1.getValue()).c();
            ArrayList arrayList = new ArrayList(z53.S(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((MessageModel) it.next()).a));
            }
            long j = n59.b.a;
            this.X = 1;
            obj = ((u79) n59.H0.getValue()).b(j, arrayList, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            cx7 c2 = ((w9a) n59.Y).c();
            k49 k49 = new k49(n59, (Continuation) null);
            this.X = 2;
            if (j47.t0(c2, k49, this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
