package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y23  reason: default package */
public final class y23 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ z23 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y23(z23 z23, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = z23;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y23) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y23(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y.a;
            long j = this.Z;
            ir6 ir6 = hm9.m;
            uaa uaa = null;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, ey8.h(j, "start clear draft for chatId:"), (Throwable) null);
            }
            e52 e52 = (e52) ((jz2) ((iy2) ((je7) this.Y.c).getValue())).m(this.Z).a.getValue();
            if (e52 == null) {
                hm9.m((String) this.Y.a, "can't clear draft because chat is null", new Object[0]);
                return e5f;
            }
            uaa uaa2 = e52.b.f0;
            if (uaa2 instanceof uaa) {
                uaa = uaa2;
            }
            if (uaa == null) {
                hm9.m((String) this.Y.a, "Draft empty in chat don't need clear", new Object[0]);
                return e5f;
            }
            hm9.m((String) this.Y.a, "Clear local draft", new Object[0]);
            z23 z23 = this.Y;
            this.X = 1;
            z23.getClass();
            hm9.m((String) z23.a, ey8.h(e52.a, "dropAllDrafts "), new Object[0]);
            k92 k92 = e52.b;
            if (k92.f0 != null) {
                Long l = uaa.e;
                long longValue = l != null ? l.longValue() : k92.g0;
                if (!((qyc) ((y7d) ((je7) z23.f).getValue())).u()) {
                    longValue = 0;
                }
                ((jz2) ((iy2) ((je7) z23.c).getValue())).l().k(e52.a, longValue, (uaa) null);
            }
            Object c = z23.c(e52.a, uaa, this);
            if (c != tx3) {
                c = e5f;
            }
            if (c == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
