package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k6b  reason: default package */
public final class k6b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l6b Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ k56 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k6b(l6b l6b, String str, zja zja, Continuation continuation) {
        super(2, continuation);
        this.Y = l6b;
        this.Z = str;
        this.s0 = zja;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k6b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new k6b(this.Y, this.Z, (zja) this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            l6b l6b = this.Y;
            ((hyc) ((q33) l6b.b.getValue())).m("server.port", this.Z);
            if (((hyc) ((q33) l6b.b.getValue())).t() != -1) {
                ((yle) l6b.o.getValue()).i();
            }
            cx7 c = ((w9a) ((kke) l6b.c.getValue())).c();
            j6b j6b = new j6b((zja) this.s0, (Continuation) null);
            this.X = 1;
            if (j47.t0(c, j6b, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
