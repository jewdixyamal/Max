package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: k89  reason: default package */
public final class k89 extends ffe implements a66 {
    public v5c X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ e52 s0;
    public final /* synthetic */ l89 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k89(e52 e52, l89 l89, Continuation continuation) {
        super(2, continuation);
        this.s0 = e52;
        this.t0 = l89;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k89 k89 = new k89(this.s0, this.t0, continuation);
        k89.Z = obj;
        return k89;
    }

    public final Object o(Object obj) {
        v5c v5c;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Z;
            e52 e52 = this.s0;
            if (e52.y0 == null) {
                kr2 kr2 = e52.B0;
                String str = e52.b.m0;
                kr2.getClass();
                e52.y0 = oag.t(str) ? null : ((jx8) kr2.f.get()).b(str);
            }
            v5c v5c2 = e52.y0;
            if (v5c2 == null) {
                return e5f;
            }
            jc6 jc6 = this.t0.h;
            e52 e522 = this.s0;
            long j = e522.a;
            long j2 = e522.b.l0;
            this.Z = sx3;
            this.X = v5c2;
            this.Y = 1;
            obj2 = j47.t0(((w9a) ((kke) jc6.a)).b(), new ic6(jc6, j, j2, (Continuation) null), this);
            if (obj2 == tx3) {
                return tx3;
            }
            v5c = v5c2;
        } else if (i == 1) {
            v5c v5c3 = this.X;
            sx3 sx32 = (sx3) this.Z;
            od2.a0(obj);
            obj2 = obj;
            v5c = v5c3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu8 cu8 = (cu8) obj2;
        if (cu8 == null) {
            String str2 = this.t0.i;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.s0, str2, "Chat model has reaction info, but can't find message for this reaction", (Throwable) null);
            }
            return e5f;
        }
        this.t0.f.invoke(Collections.singleton(v5c), new Long(cu8.b));
        q0e q0e = this.t0.m;
        q0e.m((Object) null, bxc.a((bxc) q0e.getValue(), 0, false, false, new axc(this.s0.b.l0, cu8.k(), v5c), 7));
        return e5f;
    }
}
