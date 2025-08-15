package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wb  reason: default package */
public final class wb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bc Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb(bc bcVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = bcVar;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            pb pbVar = this.Y.c;
            this.X = 1;
            ArrayList arrayList = new ArrayList();
            for (Object next : (List) pbVar.h.getValue()) {
                uj3 uj3 = (uj3) next;
                String valueOf = String.valueOf(uj3.o());
                String str = this.Z;
                if (!eae.o0(valueOf, str, false)) {
                    je7 je7 = pbVar.e;
                    if (!((b0d) je7.getValue()).h(String.valueOf(uj3.d()), str)) {
                        String b = bre.b(uj3.g());
                        if (b != null) {
                            if (!((b0d) je7.getValue()).h(b, str)) {
                            }
                        }
                    }
                }
                arrayList.add(next);
            }
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(pbVar.b((uj3) it.next()));
            }
            ((oq3) pbVar.b.getValue()).c(arrayList2, new k8(6));
            Object a = pbVar.k.a(arrayList2, this);
            if (a != tx3) {
                a = e5f;
            }
            if (a == tx3) {
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
