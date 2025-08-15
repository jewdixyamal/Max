package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* renamed from: ku2  reason: default package */
public final class ku2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ku2(pu2 pu2, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ku2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ku2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        pu2 pu2 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            a aVar = pu2.Y;
            this.X = 1;
            if (aVar.a(this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hm9.m(pu2.z0, "handle logout", new Object[0]);
        j1e.i(pu2.A0, (CancellationException) null);
        return e5f.a;
    }
}
