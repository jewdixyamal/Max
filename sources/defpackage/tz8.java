package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tz8  reason: default package */
public final class tz8 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ xz8 c;

    public /* synthetic */ tz8(q0e q0e, xz8 xz8, int i) {
        this.a = i;
        this.b = q0e;
        this.c = xz8;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new sz8(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new sz8(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}
