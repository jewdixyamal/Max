package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: i7c  reason: default package */
public final class i7c extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i7c) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i7c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            jr2 jr2 = (jr2) this.Y.t.getValue();
            this.X = 1;
            jr2.getClass();
            Object t0 = j47.t0(jr2.l, new gr2(jr2, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    hm9.p("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving: fail to run()", th);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
