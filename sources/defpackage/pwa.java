package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pwa  reason: default package */
public final class pwa extends ffe implements a66 {
    public q0e X;
    public int Y;
    public final /* synthetic */ qwa Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pwa(qwa qwa, Continuation continuation) {
        super(2, continuation);
        this.Z = qwa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pwa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pwa(this.Z, continuation);
    }

    public final Object o(Object obj) {
        q0e q0e;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            qwa qwa = this.Z;
            q0e q0e2 = qwa.d;
            this.X = q0e2;
            this.Y = 1;
            obj = ((ds3) qwa.a.getValue()).d();
            if (obj == tx3) {
                return tx3;
            }
            q0e = q0e2;
        } else if (i == 1) {
            q0e = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        q0e.setValue(Boolean.valueOf(z));
        return e5f.a;
    }
}
