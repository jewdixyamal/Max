package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mu2  reason: default package */
public final /* synthetic */ class mu2 implements on5, m66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object a2 = ((on5) this.b).a((mt2) obj, continuation);
                return a2 == tx3.a ? a2 : e5f.a;
            default:
                Object o = ((fab) ((iab) this.b)).a.o((v6f) obj, continuation);
                return o == tx3.a ? o : e5f.a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof on5) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof on5) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
    }

    public final f66 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new o66(2, 0, on5.class, (on5) this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new o66(2, 0, iab.class, (iab) this.b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
