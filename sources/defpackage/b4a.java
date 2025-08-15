package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: b4a  reason: default package */
public abstract class b4a {
    public static final ArrayList a = new ArrayList();

    static {
        Class<c4a> cls = c4a.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = a;
            au1.r(it.next());
            arrayList.add((Object) null);
        }
    }
}
