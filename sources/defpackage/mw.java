package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: mw  reason: default package */
public final class mw extends ffe implements c66 {
    public /* synthetic */ List X;
    public /* synthetic */ long Y;
    public final /* synthetic */ bx Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mw(bx bxVar, Continuation continuation) {
        super(3, continuation);
        this.Z = bxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        mw mwVar = new mw(this.Z, (Continuation) obj3);
        mwVar.X = (List) obj;
        mwVar.Y = longValue;
        return mwVar.o(e5f.a);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = this.X;
        long j = this.Y;
        bc7[] bc7Arr = bx.F;
        bx bxVar = this.Z;
        List l = bxVar.l(j);
        yx4 yx4 = bxVar.c;
        if (yx4 != null) {
            StringBuilder j2 = wg0.j("getHistoryItems return ", l.size(), " out of total ", list.size(), " around ");
            j2.append(j);
            yx4.b(j2.toString());
        }
        return l;
    }
}
