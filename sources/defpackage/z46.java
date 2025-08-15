package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.settings.FrgMessagesSettings;

/* renamed from: z46  reason: default package */
public final class z46 extends ffe implements a66 {
    public final /* synthetic */ FrgMessagesSettings X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z46(FrgMessagesSettings frgMessagesSettings, Continuation continuation) {
        super(2, continuation);
        this.X = frgMessagesSettings;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z46) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z46(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        FrgMessagesSettings frgMessagesSettings = this.X;
        ((t6b) frgMessagesSettings.q1.getAccessor().c(t6b.class)).d();
        frgMessagesSettings.q1.f().O();
        return e5f.a;
    }
}
