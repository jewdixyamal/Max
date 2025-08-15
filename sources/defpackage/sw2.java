package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sw2  reason: default package */
public final class sw2 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ nx2 c;

    public /* synthetic */ sw2(mn5 mn5, nx2 nx2, int i) {
        this.a = i;
        this.b = mn5;
        this.c = nx2;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new rw2(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            case 1:
                Object d2 = this.b.d(new rw2(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
            case 2:
                Object d3 = this.b.d(new rw2(on5, this.c, 2), continuation);
                return d3 == tx3.a ? d3 : e5f.a;
            case 3:
                Object d4 = this.b.d(new rw2(on5, this.c, 3), continuation);
                return d4 == tx3.a ? d4 : e5f.a;
            default:
                Object d5 = this.b.d(new rw2(on5, this.c, 4), continuation);
                return d5 == tx3.a ? d5 : e5f.a;
        }
    }
}
