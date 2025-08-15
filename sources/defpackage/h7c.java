package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: h7c  reason: default package */
public final class h7c extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h7c) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h7c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jr2 jr2 = (jr2) this.Y.t.getValue();
            this.X = 1;
            jr2.j = true;
            try {
                x77 x77 = jr2.f;
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                hm9.p("jr2", "cancel fail!", th);
            }
            jr2.e(this);
            if (e5f == tx3) {
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
