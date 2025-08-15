package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h44  reason: default package */
public final class h44 extends ffe implements m56 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ o44 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h44(long j, o44 o44, Continuation continuation) {
        super(1, continuation);
        this.s0 = j;
        this.Z = o44;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new h44(this.s0, this.Z, continuation).o(e5f.a);
            default:
                return new h44(this.Z, this.s0, continuation).o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        e5f e5f = e5f.a;
        long j = this.s0;
        o44 o44 = this.Z;
        tx3 tx3 = tx3.a;
        switch (this.X) {
            case 0:
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    hm9.m(o44.k, "cancelServerChatId %d", new Long(j));
                    o44.g.e.l(j);
                    this.Y = 1;
                    return ((n79) ((b79) o44.a.getValue())).d(j, this) == tx3 ? tx3 : e5f;
                } else if (i == 1) {
                    od2.a0(obj);
                    return e5f;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    f44 f44 = o44.g;
                    f44 f442 = f44.f;
                    boolean z = f44.b;
                    gi9 gi9 = f44.e;
                    gi9.a(j);
                    f44 f443 = new f44(f44.a, z, gi9, f44.c, (je5) null);
                    this.Y = 1;
                    return o44.a(o44, f443, this) == tx3 ? tx3 : e5f;
                } else if (i2 == 1) {
                    od2.a0(obj);
                    return e5f;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h44(o44 o44, long j, Continuation continuation) {
        super(1, continuation);
        this.Z = o44;
        this.s0 = j;
    }
}
