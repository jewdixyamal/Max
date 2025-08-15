package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ps1  reason: default package */
public abstract class ps1 {
    public static final je7 a = tu0.r(3, new dk1(21));

    public static final boolean a(znc znc) {
        String str;
        Object obj;
        Object obj2;
        je7 je7 = a;
        Iterator it = ((List) je7.getValue()).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (znc.g((String) obj) != null) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            Iterator it2 = znc.e().iterator();
            loop1:
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                coc coc = (coc) obj2;
                List<String> list = (List) je7.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str3 : list) {
                        String str4 = coc.b;
                        if (str4 != null && w9e.p0(str4, str3, false)) {
                            break loop1;
                        }
                    }
                    continue;
                }
            }
            coc coc2 = (coc) obj2;
            if (coc2 != null) {
                str = coc2.b;
            }
            str2 = str;
        }
        if (str2 != null) {
            znc.D(str2);
        }
        return str2 != null;
    }
}
