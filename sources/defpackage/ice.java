package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ice  reason: default package */
public final class ice extends ffe implements a66 {
    public final /* synthetic */ moa X;
    public final /* synthetic */ Set Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ice(moa moa, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.X = moa;
        this.Y = linkedHashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ice) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ice(this.X, (LinkedHashSet) this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        moa moa = this.X;
        boolean z = ((j92) moa.a) == j92.b;
        Set set = this.Y;
        List<ybe> b = z ? ((bde) moa.c).b((LinkedHashSet) set) : ((ns3) moa.o).b((LinkedHashSet) set);
        ArrayList arrayList = new ArrayList(z53.S(b, 10));
        for (ybe fde : b) {
            arrayList.add(new fde(fde, !z));
        }
        return arrayList;
    }
}
