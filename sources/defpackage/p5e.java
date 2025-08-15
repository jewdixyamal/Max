package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: p5e  reason: default package */
public final class p5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ q5e s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p5e(String str, q5e q5e, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = q5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p5e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p5e p5e = new p5e(this.Z, this.s0, continuation);
        p5e.Y = obj;
        return p5e;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        int i2 = 2;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            String str = this.Z;
            if (str == null || str.length() == 0) {
                this.s0.w0.updateAndGet(new oe2(11));
                this.s0.Z.m((Object) null, new szc(2, (List) this.s0.v0.get()));
                return e5f;
            }
            this.s0.w0.updateAndGet(new o5e(this.Z, 0));
            String str2 = this.Z;
            this.Y = sx32;
            this.X = 1;
            Object b = ((y4e) this.s0.o.getValue()).b(str2, 0, 50, this);
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
        this.s0.w0.updateAndGet(new m5e(t4e, 1));
        String name = sx3.getClass().getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            int size = t4e.a.size();
            long j = t4e.b;
            ir6.d(us7, name, "Stickers search. finish, size:" + size + "|marker:" + j, (Throwable) null);
        }
        List<d2e> list = t4e.a;
        q5e q5e = this.s0;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (d2e q : list) {
            arrayList.add(q5e.q(q5e, q));
        }
        if (arrayList.isEmpty()) {
            i2 = 3;
        }
        this.s0.Z.m((Object) null, new szc(i2, arrayList));
        return e5f;
    }
}
