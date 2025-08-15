package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: p6a  reason: default package */
public final class p6a implements pi4 {
    public final long a = ei4.b.incrementAndGet();
    public final q0e b;
    public final w7c c;
    public final /* synthetic */ je7 d;

    public p6a(je7 je7) {
        this.d = je7;
        q0e a2 = r0e.a(e());
        this.b = a2;
        this.c = new w7c(a2);
    }

    public final j0e c() {
        return this.c;
    }

    public final void d(b54 b54) {
        if (ei4.a(b54.a, this.a)) {
            je7 je7 = this.d;
            List list = null;
            icd icd = ((List) ((se5) ((qe5) je7.getValue())).i.getValue()) != null ? null : new icd("https://max.ru/s/img/big-logo.png", 2165956, "Войти в MAX", (String) null);
            qe5 qe5 = (qe5) je7.getValue();
            if (icd != null) {
                list = Collections.singletonList(icd);
            }
            se5 se5 = (se5) qe5;
            se5.getClass();
            se5.i = new v07(list);
        }
        this.b.setValue(e());
    }

    public final kl7 e() {
        kl7 l = j1e.l();
        l.add(new b54(this.a, new iqe("Включить баннер MAX в настройках?"), avb.ic_notification, (jqe) null, new a54(((List) ((se5) ((qe5) this.d.getValue())).i.getValue()) != null), 8));
        return j1e.d(l);
    }
}
