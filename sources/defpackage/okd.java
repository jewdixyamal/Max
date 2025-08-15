package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: okd  reason: default package */
public final class okd extends ffe implements a66 {
    public final Object invoke(Object obj, Object obj2) {
        return ((okd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) fi4.a.getAccessor().c(wha.class);
        wha.h("Скачивание логов началось");
        wha.b("Для успешного скачивания логов не покидайте экран");
        return wha.i();
    }
}
