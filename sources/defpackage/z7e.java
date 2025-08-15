package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: z7e  reason: default package */
public final class z7e extends ffe implements a66 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ b8e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z7e(m56 m56, long j, b8e b8e, Continuation continuation) {
        super(2, continuation);
        this.X = m56;
        this.Y = j;
        this.Z = b8e;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z7e) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z7e(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        e02 e02;
        od2.a0(obj);
        long j = this.Y;
        m56 m56 = this.X;
        if (m56 != null) {
            m56.invoke(new Long(j));
        }
        b8e b8e = this.Z;
        List<e02> list = ((l7e) b8e.t0.getValue()).a;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (e02 e022 : list) {
            w3e w3e = e022.b;
            int i = (w3e.a > j ? 1 : (w3e.a == j ? 0 : -1));
            long j2 = e022.a;
            if (i == 0) {
                e02 = new e02(j2, w3e.k(w3e, (ArrayList) null, true, false, 191));
            } else if (w3e.Z) {
                e02 = new e02(j2, w3e.k(w3e, (ArrayList) null, false, false, 191));
            } else {
                arrayList.add(e022);
            }
            e022 = e02;
            arrayList.add(e022);
        }
        q0e q0e = b8e.t0;
        q0e.m((Object) null, new l7e(arrayList, ((l7e) q0e.getValue()).b));
        return e5f.a;
    }
}
