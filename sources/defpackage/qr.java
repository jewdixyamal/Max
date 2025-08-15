package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qr  reason: default package */
public final class qr extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y52 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qr(y52 y52, Continuation continuation) {
        super(2, continuation);
        this.Y = y52;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qr) n((pm2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qr qrVar = new qr(this.Y, continuation);
        qrVar.X = obj;
        return qrVar;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.a((pm2) this.X);
        return e5f.a;
    }
}
