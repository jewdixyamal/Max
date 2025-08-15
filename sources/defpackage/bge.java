package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bge  reason: default package */
public final class bge extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bge(cge cge, Continuation continuation) {
        super(2, continuation);
        this.Z = cge;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bge) n((v6f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bge bge = new bge(this.Z, continuation);
        bge.Y = obj;
        return bge;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            v6f v6f = (v6f) this.Y;
            if (v6f.a()) {
                d7f d7f = v6f.a;
                int i2 = d7f.c;
                boolean z = i2 == 6;
                cge cge = this.Z;
                if (z || h4f.a(i2)) {
                    this.X = 1;
                    if (cge.h(d7f, this) == tx3) {
                        return tx3;
                    }
                } else {
                    this.X = 2;
                    if (cge.f(v6f, this) == tx3) {
                        return tx3;
                    }
                }
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
