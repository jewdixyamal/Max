package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kv  reason: default package */
public final class kv implements ti9 {
    public final /* synthetic */ q0e a = r0e.a(Collections.singletonList(new Object()));
    public final /* synthetic */ bx b;

    public kv(bx bxVar) {
        this.b = bxVar;
    }

    public final Object a(Object obj, Continuation continuation) {
        this.a.setValue((List) obj);
        return e5f.a;
    }

    public final List b() {
        return this.a.b();
    }

    public final boolean c(Object obj, Object obj2) {
        q0e q0e = this.a;
        q0e.getClass();
        return q0e.m((List) obj, (List) obj2);
    }

    public final Object d(on5 on5, Continuation continuation) {
        this.a.d(on5, continuation);
        return tx3.a;
    }

    public final void f() {
        this.a.f();
        throw null;
    }

    public final boolean g(Object obj) {
        this.a.setValue((List) obj);
        return true;
    }

    /* renamed from: h */
    public final List getValue() {
        return (List) this.a.getValue();
    }

    public final j0e i() {
        return this.a.i();
    }

    public final void setValue(Object obj) {
        this.a.m((Object) null, (List) obj);
    }
}
