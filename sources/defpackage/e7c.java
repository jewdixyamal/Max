package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: e7c  reason: default package */
public final class e7c extends ffe implements a66 {
    public final /* synthetic */ ReactionsViewModel X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e7c) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e7c(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ReactionsViewModel reactionsViewModel = this.X;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "ru.ok.onechat.reactions.ReactionsViewModel", zr6.i("defaultReactions = [", x53.n0(x53.y0((List) reactionsViewModel.q.getValue(), 8), (String) null, (String) null, (String) null, (m56) null, 63), "]"), (Throwable) null);
        }
        e52 i = this.X.i();
        if (i != null) {
            ReactionsViewModel reactionsViewModel2 = this.X;
            long j = i.b.l0;
            csc csc = reactionsViewModel2.g;
            if (csc != null) {
                csc.b(Long.valueOf(j), "lastReactedMessageId");
            }
        }
        return e5f.a;
    }
}
