package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jj2  reason: default package */
public final class jj2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ ck2 Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jj2(ck2 ck2, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ck2;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jj2(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        long j;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        ck2 ck2 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            gef gef = ((ej2) ck2.W0.a.getValue()).b;
            String str = ck2.w0;
            if (gef == null) {
                hm9.m(str, "Can't load frame for preview because videoContent is null", new Object[0]);
                return e5f;
            }
            je7 je7 = ck2.D0;
            if (!tpa.f(((p26) je7.getValue()).c().a, gef)) {
                ((p26) je7.getValue()).f(new m26(gef, 6));
                if (!((p26) je7.getValue()).d()) {
                    hm9.m(str, "Can't load frame for preview because can't extract frame", new Object[0]);
                    return e5f;
                }
                ((p26) je7.getValue()).prepare();
            }
            long j2 = ck2.M0.get();
            int i2 = (gef.c() > 0 ? 1 : (gef.c() == 0 ? 0 : -1));
            int i3 = this.s0;
            if (i2 == 0 || Math.abs((double) (j2 - ((long) i3))) > ((double) gef.c()) * 0.01d) {
                q0e q0e = ck2.R0;
                q0e.m((Object) null, aj2.a((aj2) q0e.getValue(), new zi2((n26) null, true, false, 5)));
                j = (long) i3;
                this.X = j;
                this.Y = 1;
                obj2 = ((p26) je7.getValue()).e(j, this);
                if (obj2 == tx3) {
                    return tx3;
                }
            }
            return e5f;
        } else if (i == 1) {
            long j3 = this.X;
            od2.a0(obj);
            j = j3;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0e q0e2 = ck2.R0;
        q0e2.m((Object) null, aj2.a((aj2) q0e2.getValue(), new zi2((n26) obj2, false, false, 6)));
        ck2.M0.updateAndGet(new ij2(j));
        return e5f;
    }
}
