package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* renamed from: oa9  reason: default package */
public final class oa9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a Y;
    public final /* synthetic */ wa9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oa9(a aVar, wa9 wa9, Continuation continuation) {
        super(2, continuation);
        this.Y = aVar;
        this.Z = wa9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oa9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oa9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.a(this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wa9 wa9 = this.Z;
        ((zc0) wa9.g.getValue()).b.clear();
        j1e.i(wa9.f, (CancellationException) null);
        return e5f.a;
    }
}
