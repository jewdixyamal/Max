package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: f6e  reason: default package */
public final class f6e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ g6e t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f6e(String str, g6e g6e, Continuation continuation) {
        super(2, continuation);
        this.s0 = str;
        this.t0 = g6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f6e f6e = new f6e(this.s0, this.t0, continuation);
        f6e.Z = obj;
        return f6e;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        u4e u4e;
        ir6 ir6;
        sx3 sx32;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx33 = (sx3) this.Z;
            String str = this.s0;
            if (str == null || str.length() == 0) {
                g6e g6e = this.t0;
                bc7[] bc7Arr = g6e.j;
                g6e.d.setValue(g6e.k);
                g6e.g.set(new c6e((String) null, 3));
                return e5f;
            }
            this.t0.g.updateAndGet(new o5e(this.s0, 1));
            String str2 = this.s0;
            this.Z = sx33;
            this.Y = 1;
            Object d = y4e.d((y4e) this.t0.b.getValue(), str2, 0, this, 6);
            if (d == tx3) {
                return tx3;
            }
            Object obj2 = d;
            sx32 = sx33;
            obj = obj2;
        } else if (i == 1) {
            sx32 = (sx3) this.Z;
            od2.a0(obj);
        } else if (i == 2) {
            u4e = this.X;
            sx3 = (sx3) this.Z;
            od2.a0(obj);
            List list = (List) obj;
            this.t0.g.updateAndGet(new y5e(u4e, 2));
            String name = sx3.getClass().getName();
            ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                int size = u4e.a.size();
                long j = u4e.b;
                ir6.d(us7, name, "Stickers sets search. finish, size:" + size + "|marker:" + j, (Throwable) null);
            }
            this.t0.d.m((Object) null, new d6e(2, false, list));
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u4e u4e2 = (u4e) obj;
        uqd c = ((a4e) this.t0.a.getValue()).c(u4e2.a);
        this.Z = sx32;
        this.X = u4e2;
        this.Y = 2;
        Object f = s36.f(c, this);
        if (f == tx3) {
            return tx3;
        }
        sx3 = sx32;
        u4e = u4e2;
        obj = f;
        List list2 = (List) obj;
        this.t0.g.updateAndGet(new y5e(u4e, 2));
        String name2 = sx3.getClass().getName();
        ir6 = hm9.m;
        us7 us72 = us7.X;
        int size2 = u4e.a.size();
        long j2 = u4e.b;
        ir6.d(us72, name2, "Stickers sets search. finish, size:" + size2 + "|marker:" + j2, (Throwable) null);
        this.t0.d.m((Object) null, new d6e(2, false, list2));
        return e5f;
    }
}
