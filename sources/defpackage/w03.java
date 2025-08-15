package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w03  reason: default package */
public final class w03 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ qp4 c;

    public /* synthetic */ w03(mn5 mn5, qp4 qp4, int i) {
        this.a = i;
        this.b = mn5;
        this.c = qp4;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new v03(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            case 1:
                Object d2 = this.b.d(new v03(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
            default:
                Object d3 = this.b.d(new v03(on5, this.c, 2), continuation);
                return d3 == tx3.a ? d3 : e5f.a;
        }
    }
}
