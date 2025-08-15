package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: wpc  reason: default package */
public final class wpc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ r1a Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpc(r1a r1a, Continuation continuation) {
        super(2, continuation);
        this.Z = r1a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wpc) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wpc wpc = new wpc(this.Z, continuation);
        wpc.Y = obj;
        return wpc;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iab = (iab) this.Y;
            AtomicReference atomicReference = new AtomicReference();
            this.Z.a(new l7b(iab, atomicReference, false, 4));
            jw3 jw3 = new jw3(atomicReference, 3);
            this.X = 1;
            if (j47.j(iab, jw3, this) == tx3) {
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
