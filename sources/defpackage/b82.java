package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: b82  reason: default package */
public final /* synthetic */ class b82 implements lde {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ b82(p82 p82, int i) {
        this.a = i;
        this.b = p82;
    }

    public final Object get() {
        Long l;
        switch (this.a) {
            case 0:
                p82 p82 = this.b;
                e52 e52 = p82.a;
                if (e52 != null) {
                    return e52;
                }
                if (((p7b) p82.n).a.t() != -1) {
                    long K = p82.K();
                    rm4 rm4 = p82.l;
                    elc elc = ((k24) ((c34) rm4.get())).b;
                    elc.getClass();
                    l92 l92 = (l92) ((OneMeRoomDatabase) elc.a.m()).p(new dlc(0, new clc(elc, K, 0)));
                    cu8 cu8 = null;
                    if (l92 == null) {
                        k92 t = p82.t(0, 0, 2, K, Collections.singletonMap(Long.valueOf(K), 0L), 0, 3, 0, 0, (w4d) null);
                        l92 = new l92(((k24) ((c34) rm4.get())).b.e(t), t);
                    } else {
                        vlc vlc = ((k24) ((c34) rm4.get())).c;
                        ru8 c = vlc.d().c(l92.c.j);
                        if (c != null) {
                            cu8 = vlc.b(c);
                        }
                    }
                    cu8 cu82 = cu8;
                    p82.d.put(Long.valueOf(l92.b), l92);
                    e52 g = p82.g(l92, cu82);
                    p82.a = g;
                    return g;
                }
                throw new IllegalStateException("no user id");
            case 1:
                try {
                    Iterator it = this.b.E(p82.I).iterator();
                    if (!it.hasNext()) {
                        l = null;
                    } else {
                        Long valueOf = Long.valueOf(((e52) it.next()).b.k);
                        while (it.hasNext()) {
                            Long valueOf2 = Long.valueOf(((e52) it.next()).b.k);
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                        l = valueOf;
                    }
                    return Long.valueOf(l != null ? l.longValue() : 0);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            default:
                return this.b.a;
        }
    }
}
