package defpackage;

import java.util.Iterator;

/* renamed from: sg4  reason: default package */
public final /* synthetic */ class sg4 implements n38 {
    public final /* synthetic */ tg4 a;

    public /* synthetic */ sg4(tg4 tg4) {
        this.a = tg4;
    }

    public final void p(o38 o38) {
        tg4 tg4 = this.a;
        tg4.d = o38;
        Iterator it = tg4.c.iterator();
        while (it.hasNext()) {
            ((n38) it.next()).p(o38);
        }
    }
}
