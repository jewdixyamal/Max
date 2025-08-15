package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: m7c  reason: default package */
public final class m7c extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n7c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m7c(n7c n7c, Continuation continuation) {
        super(2, continuation);
        this.Y = n7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m7c) n((e52) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m7c m7c = new m7c(this.Y, continuation);
        m7c.X = obj;
        return m7c;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ReactionsViewModel q = this.Y.q();
        long j = ((e52) this.X).b.l0;
        csc csc = q.g;
        if (csc != null) {
            csc.b(Long.valueOf(j), "lastReactedMessageId");
        }
        return e5f.a;
    }
}
