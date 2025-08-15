package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: i23  reason: default package */
public final class i23 {
    public final HashMap a = new HashMap();
    public final Map b;

    public i23(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            eg7 eg7 = (eg7) entry.getValue();
            List list = (List) this.a.get(eg7);
            if (list == null) {
                list = new ArrayList();
                this.a.put(eg7, list);
            }
            list.add((j23) entry.getKey());
        }
    }

    public static void a(List list, eh7 eh7, eg7 eg7, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                j23 j23 = (j23) list.get(size);
                j23.getClass();
                try {
                    int i = j23.a;
                    Method method = j23.b;
                    if (i == 0) {
                        method.invoke(obj, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(obj, new Object[]{eh7});
                    } else if (i == 2) {
                        method.invoke(obj, new Object[]{eh7, eg7});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
