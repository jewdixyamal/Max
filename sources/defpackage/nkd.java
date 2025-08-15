package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nkd  reason: default package */
public final class nkd {
    public final ad a;
    public final av0 b;
    public final lq9 c;
    public final o45 d;
    public final s8g e;

    public nkd(ad adVar, av0 av0, lq9 lq9, o45 o45, s8g s8g) {
        this.a = adVar;
        this.b = av0;
        this.c = lq9;
        this.d = o45;
        this.e = s8g;
    }

    public final ArrayList a(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null || oag.t(uri.toString())) {
                hm9.p("nkd", "Failed to send media, uri is empty or null", (Throwable) null);
            } else {
                if (i == 7) {
                    this.a.g("ACTION_FILE_SEND", "share");
                }
                aqd aqd = new aqd(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aqd);
                d9d d9d = new d9d(0, arrayList2);
                d9d.o = true;
                d9d.m = str;
                d9d.n = null;
                arrayList.add(d9d);
            }
        }
        return arrayList;
    }
}
