package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ki4  reason: default package */
public final class ki4 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5[] b;

    public /* synthetic */ ki4(mn5[] mn5Arr, int i) {
        this.a = i;
        this.b = mn5Arr;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                mn5[] mn5Arr = this.b;
                Object h = oag.h(on5, new qb1(mn5Arr, 1), new ji4(3, (Continuation) null, 0), continuation, mn5Arr);
                return h == tx3.a ? h : e5f.a;
            case 1:
                mn5[] mn5Arr2 = this.b;
                Object h2 = oag.h(on5, new qb1(mn5Arr2, 2), new ji4(3, (Continuation) null, 1), continuation, mn5Arr2);
                return h2 == tx3.a ? h2 : e5f.a;
            case 2:
                mn5[] mn5Arr3 = this.b;
                Object h3 = oag.h(on5, new qb1(mn5Arr3, 4), new ji4(3, (Continuation) null, 2), continuation, mn5Arr3);
                return h3 == tx3.a ? h3 : e5f.a;
            default:
                mn5[] mn5Arr4 = this.b;
                Object h4 = oag.h(on5, new qb1(mn5Arr4, 5), new ji4(3, (Continuation) null, 3), continuation, mn5Arr4);
                return h4 == tx3.a ? h4 : e5f.a;
        }
    }
}
