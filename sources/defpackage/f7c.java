package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: f7c  reason: default package */
public final class f7c extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ReactionsViewModel Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Z = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f7c) n((g7c) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f7c f7c = new f7c(this.Z, continuation);
        f7c.Y = obj;
        return f7c;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (ReactionsViewModel.e(this.Z, (g7c) this.Y, this) == tx3) {
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
