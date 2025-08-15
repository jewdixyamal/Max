package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jyf  reason: default package */
public final class jyf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ oyf Z;
    public final /* synthetic */ lyf s0;
    public final /* synthetic */ String t0 = "WebAppRequestPhone";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jyf(lyf lyf, oyf oyf, Continuation continuation) {
        super(2, continuation);
        this.Z = oyf;
        this.s0 = lyf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jyf) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jyf jyf = new jyf(this.s0, this.Z, continuation);
        jyf.Y = obj;
        return jyf;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        lyf lyf = this.s0;
        if (i == 0) {
            od2.a0(obj);
            ryf ryf = new ryf(this.Z.a, (String) this.Y);
            zt0 zt0 = lyf.e;
            ja7 ja7 = lyf.a;
            ja7.getClass();
            x97 x97 = new x97(this.t0, ja7.b(ryf.Companion.serializer(), ryf));
            this.X = 1;
            if (zt0.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wsf wsf = lyf.f;
        if (wsf != null) {
            iwf.a((iwf) lyf.b.getValue(), this.t0, wsf.a, wsf.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return e5f.a;
    }
}
