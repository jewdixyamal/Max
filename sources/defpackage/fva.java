package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: fva  reason: default package */
public final class fva extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ jva Z;
    public final /* synthetic */ List s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fva(List list, jva jva, List list2, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = jva;
        this.s0 = list2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fva) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fva fva = new fva(this.Y, this.Z, this.s0, continuation);
        fva.X = obj;
        return fva;
    }

    public final Object o(Object obj) {
        String str;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        ArrayList arrayList = new ArrayList();
        for (wua wua : this.Y) {
            if (!j1e.z(sx3)) {
                return nz4.a;
            }
            wua b = jva.b(this.Z, wua, this.s0);
            if (b == null || (str = b.X) == null || str.length() == 0) {
                arrayList.add(new wua(wua.b, wua.c, wua.o, (String) null, wua.Y, (String) null, (String) null, (String) null, (String) null, 0));
            }
        }
        return arrayList;
    }
}
