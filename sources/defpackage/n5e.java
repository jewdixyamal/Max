package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: n5e  reason: default package */
public final class n5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q5e Z;
    public final /* synthetic */ l5e s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n5e(q5e q5e, l5e l5e, Continuation continuation) {
        super(2, continuation);
        this.Z = q5e;
        this.s0 = l5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n5e n5e = new n5e(this.Z, this.s0, continuation);
        n5e.Y = obj;
        return n5e;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            l5e l5e = this.s0;
            String str = l5e.a;
            long j = l5e.b;
            this.Y = sx32;
            this.X = 1;
            Object b = ((y4e) this.Z.o.getValue()).b(str, j, 50, this);
            if (b == tx3) {
                return tx3;
            }
            sx3 = sx32;
            obj = b;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t4e t4e = (t4e) obj;
        this.Z.w0.updateAndGet(new m5e(t4e, 0));
        String name = sx3.getClass().getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            int size = t4e.a.size();
            long j2 = t4e.b;
            ir6.d(us7, name, "Stickers search next page. finish, size:" + size + "|marker:" + j2, (Throwable) null);
        }
        List<d2e> list = t4e.a;
        q5e q5e = this.Z;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (d2e q : list) {
            arrayList.add(q5e.q(q5e, q));
        }
        this.Z.Z.m((Object) null, new szc(2, x53.t0(((szc) this.Z.Z.getValue()).b, arrayList)));
        return e5f.a;
    }
}
