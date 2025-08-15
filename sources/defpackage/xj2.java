package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xj2  reason: default package */
public final class xj2 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ ck2 c;

    public /* synthetic */ xj2(w7c w7c, ck2 ck2, int i) {
        this.a = i;
        this.b = w7c;
        this.c = ck2;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new wj2(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new wj2(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}
