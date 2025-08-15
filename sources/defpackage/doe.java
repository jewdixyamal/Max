package defpackage;

import java.util.List;

/* renamed from: doe  reason: default package */
public final /* synthetic */ class doe implements b66, b7b {
    public final /* synthetic */ eoe a;
    public final /* synthetic */ List b;

    public /* synthetic */ doe(eoe eoe, List list) {
        this.a = eoe;
        this.b = list;
    }

    public Object apply(Object obj) {
        eoe eoe = this.a;
        eoe.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return wa3.a;
        }
        doe doe = new doe(eoe, this.b);
        xpb xpb = eoe.c;
        xpb.getClass();
        return new m0a(new ty9(xpb, doe, 3));
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        eoe eoe = this.a;
        eoe.getClass();
        List list = this.b;
        return !((Boolean) new rqd(new q1a(2, new u24(eoe, 7, list)), new z72(28, list), 2).h(new hme(5)).e()).booleanValue();
    }
}
