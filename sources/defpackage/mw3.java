package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.cookie.SM;

/* renamed from: mw3  reason: default package */
public final class mw3 {
    public static final yxc a = new yxc(9);

    public static void a(zs zsVar) {
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        Iterator it = zsVar.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            Object next = u1Var.next();
            if (SM.SET_COOKIE.equals(((lq6) next).a)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                obj2 = HttpCookie.parse(((lq6) it2.next()).b);
            } catch (Exception unused) {
                obj2 = nz4.a;
            }
            arrayList2.add(obj2);
        }
        ArrayList T = z53.T(arrayList2);
        ArrayList arrayList3 = new ArrayList(z53.S(T, 10));
        Iterator it3 = T.iterator();
        while (it3.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it3.next();
            httpCookie.toString();
            arrayList3.add(httpCookie);
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            if ("vdt".equals(((HttpCookie) obj).getName())) {
                break;
            }
        }
        HttpCookie httpCookie2 = (HttpCookie) obj;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
