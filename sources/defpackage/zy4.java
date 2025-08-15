package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zy4  reason: default package */
public final class zy4 extends ffe implements a66 {
    public final /* synthetic */ m56 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ az4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zy4(m56 m56, int i, az4 az4, Continuation continuation) {
        super(2, continuation);
        this.X = m56;
        this.Y = i;
        this.Z = az4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zy4) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zy4(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = this.Y;
        m56 m56 = this.X;
        if (m56 != null) {
            m56.invoke(new Integer(i));
        }
        az4 az4 = this.Z;
        List<d02> list = ((xy4) az4.u0.a.getValue()).a;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (d02 d02 : list) {
            if (d02.a == i) {
                d02 = d02.k(d02, true);
            } else if (d02.c) {
                d02 = d02.k(d02, false);
            }
            arrayList.add(d02);
        }
        q0e q0e = az4.t0;
        q0e.m((Object) null, new xy4(arrayList, ((xy4) q0e.getValue()).b));
        return e5f.a;
    }
}
