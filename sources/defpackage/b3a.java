package defpackage;

import java.util.ListIterator;

/* renamed from: b3a  reason: default package */
public final class b3a extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3a(i3a i3a, int i) {
        super(1);
        this.a = i;
        this.b = i3a;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                ge0 ge0 = (ge0) obj;
                i3a i3a = this.b;
                hs hsVar = i3a.b;
                ListIterator listIterator = hsVar.listIterator(hsVar.getSize());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((a3a) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                a3a a3a = (a3a) obj2;
                if (i3a.c != null) {
                    i3a.c();
                }
                i3a.c = a3a;
                if (a3a != null) {
                    a3a.d();
                }
                return e5f.a;
            default:
                ge0 ge02 = (ge0) obj;
                i3a i3a2 = this.b;
                a3a a3a2 = i3a2.c;
                if (a3a2 == null) {
                    hs hsVar2 = i3a2.b;
                    ListIterator listIterator2 = hsVar2.listIterator(hsVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((a3a) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    a3a2 = (a3a) obj3;
                }
                if (a3a2 != null) {
                    a3a2.c(ge02);
                }
                return e5f.a;
        }
    }
}
