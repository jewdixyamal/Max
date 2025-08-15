package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: sb1  reason: default package */
public final class sb1 implements mn5 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ sb1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                mn5[] mn5Arr = (mn5[]) this.b;
                Object h = oag.h(on5, new qb1(mn5Arr, 0), new rb1((Continuation) null, (sx3) this.c, (List) this.o, (vb1) this.X), continuation, mn5Arr);
                return h == tx3.a ? h : e5f.a;
            case 1:
                Object d = ((mn5) this.b).d(new p32(on5, (Comparator) this.c, (nx2) this.o, (Long) this.X, 2), continuation);
                return d == tx3.a ? d : e5f.a;
            case 2:
                Object d2 = ((mn5) this.b).d(new p32(on5, (q27) this.c, (je7) this.o, (je7) this.X, 3), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
            case 3:
                Object d3 = ((mn5) this.b).d(new p32(on5, (c67) this.c, (je7) this.o, (je7) this.X, 4), continuation);
                return d3 == tx3.a ? d3 : e5f.a;
            default:
                Object d4 = ((mn5) this.b).d(new p32(on5, (Comparator) this.c, (eya) this.o, (Long) this.X, 5), continuation);
                return d4 == tx3.a ? d4 : e5f.a;
        }
    }
}
