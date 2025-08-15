package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: zt2  reason: default package */
public final class zt2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ pu2 Z;
    public final /* synthetic */ jec s0;
    public final /* synthetic */ mm3 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zt2(Object obj, Continuation continuation, pu2 pu2, jec jec, mm3 mm3) {
        super(2, continuation);
        this.Y = obj;
        this.Z = pu2;
        this.s0 = jec;
        this.t0 = mm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zt2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zt2(this.Y, continuation, this.Z, this.s0, this.t0);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            pu2 pu2 = this.Z;
            e52 e52 = (e52) ((jz2) ((iy2) pu2.t0.getValue())).m(((nl2) this.Y).a).a.getValue();
            if (e52 == null) {
                return null;
            }
            ArrayList j = e52.j();
            if (j.isEmpty()) {
                return e5f;
            }
            Iterator it = j.iterator();
            while (it.hasNext()) {
                if (this.t0.a.d(((uj3) it.next()).n())) {
                    this.X = 1;
                    p82 l = ((jz2) ((iy2) pu2.t0.getValue())).l();
                    ConcurrentHashMap concurrentHashMap = l.f;
                    long j2 = e52.a;
                    e52 e522 = (e52) concurrentHashMap.get(Long.valueOf(j2));
                    if (e522 == null) {
                        e522 = l.C(j2);
                    }
                    if (e522 != null) {
                        if (l.A(j2) == null) {
                            ((cba) ((o45) l.o.get())).c(new IllegalArgumentException(ey8.h(j2, "chat is null for #")), true);
                        } else {
                            ma2 ma2 = (ma2) l.x.get();
                            long t = ((p7b) ((m7b) ma2.c.getValue())).a.t();
                            es8 es8 = e522.o;
                            es8 es82 = e522.X;
                            e52 a = ma2.a(e522.a, t, e522.b, e522.c, es8, es82);
                            a.o0((el3) l.r.get());
                            l.f0((String) null, new w72(l, j2, a, true));
                        }
                    }
                    if (e5f == tx3) {
                        return tx3;
                    }
                }
            }
            return e5f;
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.s0.a = true;
        return e5f;
    }
}
