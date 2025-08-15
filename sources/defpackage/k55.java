package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: k55  reason: default package */
public final class k55 implements Callable {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object o;

    public k55(Callable callable, g55 g55, h55 h55) {
        this.b = callable;
        this.c = g55;
        this.o = h55;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                h55 h55 = (h55) this.o;
                long a2 = ((g55) this.c).a();
                try {
                    return ((Callable) this.b).call();
                } finally {
                    h55.a(a2);
                }
            default:
                StringBuilder l = au1.l("DELETE FROM folder_and_chats WHERE folderId = ? AND chatId IN (");
                List<Long> list = (List) this.b;
                a14.c(l, list.size());
                l.append(")");
                String sb = l.toString();
                alc alc = (alc) this.o;
                q36 d = alc.a.d(sb);
                String str = (String) this.c;
                if (str == null) {
                    d.W(1);
                } else {
                    d.f(1, str);
                }
                int i = 2;
                for (Long l2 : list) {
                    if (l2 == null) {
                        d.W(i);
                    } else {
                        d.j(i, l2.longValue());
                    }
                    i++;
                }
                ilc ilc = alc.a;
                ilc.c();
                try {
                    d.n();
                    ilc.r();
                    ilc.l();
                    return e5f.a;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
        }
    }

    public k55(alc alc, List list, String str) {
        this.o = alc;
        this.b = list;
        this.c = str;
    }
}
