package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s95  reason: default package */
public final class s95 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t95 Z;
    public final /* synthetic */ String s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s95(t95 t95, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = t95;
        this.s0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s95) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s95 s95 = new s95(this.Z, this.s0, continuation);
        s95.Y = obj;
        return s95;
    }

    public final Object o(Object obj) {
        Throwable th;
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        t95 t95 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            try {
                ac S = od2.S(new mqc(new q95(t95, this.s0, (Continuation) null)), 5, new r95(sx32, (Continuation) null));
                this.Y = sx32;
                this.X = 1;
                Object A = od2.A(S, this);
                if (A == tx3) {
                    return tx3;
                }
                sx3 sx33 = sx32;
                obj = A;
                sx3 = sx33;
            } catch (Throwable th2) {
                sx3 sx34 = sx32;
                th = th2;
                sx3 = sx34;
                String name = sx3.getClass().getName();
                hm9.p(name, "ExternalCallback request failed due to " + th + ".", th);
                pnf.o(t95.o, new p95(new eqe(jpc.E)));
                return e5f.a;
            }
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            try {
                od2.a0(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k95 k95 = (k95) obj;
        Long l = k95.c;
        if (l != null) {
            s35 s35 = t95.o;
            vw7 vw7 = vw7.c;
            long longValue = l.longValue();
            osf osf = osf.URL;
            String str = k95.o;
            vw7.getClass();
            pnf.o(s35, vw7.c2(longValue, osf, str));
        } else {
            pnf.o(t95.o, o95.b);
        }
        return e5f.a;
    }
}
