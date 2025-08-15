package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pp8  reason: default package */
public final class pp8 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xp8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pp8(xp8 xp8, Continuation continuation) {
        super(2, continuation);
        this.Z = xp8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pp8) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pp8 pp8 = new pp8(this.Z, continuation);
        pp8.Y = obj;
        return pp8;
    }

    public final Object o(Object obj) {
        xp8 xp8;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            gi9 gi9 = new gi9(list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                xp8 = this.Z;
                if (!hasNext) {
                    break;
                }
                uj3 uj3 = (uj3) it.next();
                pxa a = !gi9.a(uj3.n()) ? null : ((tya) xp8.e.getValue()).a(uj3, false);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ((oq3) xp8.c.getValue()).c(arrayList, new g27(15));
            kld kld = xp8.l;
            this.X = 1;
            if (kld.a(arrayList, this) == tx3) {
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
