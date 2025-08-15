package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.exception.UserNotFoundException;

/* renamed from: s72  reason: default package */
public final /* synthetic */ class s72 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ s72(p82 p82, int i) {
        this.a = i;
        this.b = p82;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        ArrayList arrayList;
        int i;
        byte[] bArr;
        switch (this.a) {
            case 0:
                p82 p82 = this.b;
                if (!p82.i) {
                    hm9.m("p82", "load 1: start", new Object[0]);
                    if (!p82.i) {
                        ((iye) p82.A.get()).getClass();
                        iye.a("ChatController.load()");
                        long nanoTime = System.nanoTime();
                        xs xsVar = new xs(0);
                        ArrayList arrayList2 = new ArrayList();
                        rm4 rm4 = p82.A;
                        ((iye) rm4.get()).getClass();
                        iye.a("ChatController.selectChats()");
                        elc elc = ((k24) ((c34) p82.l.get())).b;
                        dt2 c = elc.c();
                        c.getClass();
                        xlc a2 = xlc.a(0, "SELECT * FROM chats");
                        ilc ilc = c.a;
                        ilc.b();
                        Cursor o = ilc.o(a2, (CancellationSignal) null);
                        try {
                            int n = tfg.n(o, "id");
                            int n2 = tfg.n(o, "server_id");
                            int n3 = tfg.n(o, "data");
                            int n4 = tfg.n(o, "favourite_index");
                            int n5 = tfg.n(o, "sort_time");
                            long j = nanoTime;
                            int n6 = tfg.n(o, "cid");
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(o.getCount());
                            while (o.moveToNext()) {
                                long j2 = o.getLong(n);
                                long j3 = o.getLong(n2);
                                if (o.isNull(n3)) {
                                    i = n;
                                    bArr = null;
                                } else {
                                    bArr = o.getBlob(n3);
                                    i = n;
                                }
                                arrayList4.add(new la2(j2, j3, c.a().a(bArr), o.getLong(n4), o.getLong(n5), o.getLong(n6)));
                                n = i;
                            }
                            o.close();
                            a2.n();
                            TreeSet treeSet = new TreeSet(elc.g);
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                treeSet.add(elc.a((la2) it.next()));
                            }
                            List<l92> D0 = x53.D0(treeSet);
                            ((iye) rm4.get()).getClass();
                            Trace.endSection();
                            ArrayList arrayList5 = new ArrayList();
                            hm9.m("p82", "load 2", new Object[0]);
                            for (l92 l92 : D0) {
                                k92 k92 = l92.c;
                                if (k92.b != j92.b || ((k92.r0 != 1 && !k92.i0) || k92.e.containsKey(Long.valueOf(p82.K())))) {
                                    p82.U(l92.b, l92);
                                    xsVar.add(Long.valueOf(l92.b));
                                    long j4 = l92.c.j;
                                    if (j4 > 0) {
                                        arrayList = arrayList3;
                                        arrayList.add(Long.valueOf(j4));
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                    arrayList3 = arrayList;
                                } else {
                                    arrayList5.add(l92);
                                }
                            }
                            ArrayList arrayList6 = arrayList3;
                            hm9.m("p82", "load 3", new Object[0]);
                            if (!arrayList5.isEmpty()) {
                                p82.y.b(new wt1(p82, 6, arrayList5));
                            }
                            hm9.m("p82", "load 4", new Object[0]);
                            ((iye) p82.A.get()).getClass();
                            iye.a("ChatController.load().processedChats");
                            us l = ((au8) p82.s.get()).l(arrayList6);
                            hm9.m("p82", "load 5", new Object[0]);
                            qs qsVar = new qs(xsVar);
                            while (qsVar.hasNext()) {
                                l92 l922 = (l92) p82.d.get((Long) qsVar.next());
                                if (l922 != null) {
                                    e52 g = p82.g(l922, (cu8) l.get(Long.valueOf(l922.c.j)));
                                    if (g.b.f(((p7b) p82.n).a.t())) {
                                        p82.a = g;
                                    }
                                }
                            }
                            hm9.m("p82", "load 6", new Object[0]);
                            ((iye) p82.A.get()).getClass();
                            Trace.endSection();
                            p82.i = true;
                            hm9.m("p82", "load 7", new Object[0]);
                            p82.j.b();
                            ir6 ir6 = hm9.m;
                            if (ir6 != null && ir6.c()) {
                                us7 us7 = us7.X;
                                Locale locale = Locale.ROOT;
                                int size = xsVar.size();
                                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
                                ir6.d(us7, "p82", "chats loaded to memory cache size: " + size + " by time " + millis + "ms", (Throwable) null);
                            }
                            p82.m.c(new vz2(xsVar, true, true, (mg4) null, (h9b) null, 120));
                            ((iye) p82.A.get()).getClass();
                            Trace.endSection();
                            if (p82.a == null) {
                                try {
                                    e52 e52 = (e52) p82.e0("create-saved-messages", new b82(p82, 0));
                                    List singletonList = Collections.singletonList(p82.a);
                                    o82 o82 = p82.G;
                                    if (o82 != null) {
                                        o82.c(singletonList);
                                    }
                                } catch (UserNotFoundException unused) {
                                }
                            }
                            hm9.m("p82", "load 8: finish", new Object[0]);
                            return;
                        } catch (Throwable th) {
                            o.close();
                            a2.n();
                            throw th;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                p82 p822 = this.b;
                p822.f.clear();
                p822.c.clear();
                p822.g.clear();
                p822.d.clear();
                p822.b.clear();
                p822.e.clear();
                p822.h.clear();
                p822.a = null;
                return;
        }
    }
}
