package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sa9  reason: default package */
public final class sa9 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ wa9 c;

    public /* synthetic */ sa9(mn5 mn5, wa9 wa9, int i) {
        this.a = i;
        this.b = mn5;
        this.c = wa9;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new ra9(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new ra9(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}
