package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fge  reason: default package */
public final class fge implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ ige c;

    public /* synthetic */ fge(t03 t03, ige ige, int i) {
        this.a = i;
        this.b = t03;
        this.c = ige;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new ege(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new ege(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}
