package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: c2f  reason: default package */
public abstract class c2f {
    public static final j90 a = new j90();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v7, types: [b2f, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, w1f w1f) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (w1f == null) {
                w1f = a;
            }
            w1f k = w1f.clone();
            ArrayList arrayList2 = (ArrayList) c().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((w1f) it.next()).B(viewGroup);
                }
            }
            if (k != null) {
                k.i(viewGroup, true);
            }
            au1.r(viewGroup.getTag(gvb.transition_current_scene));
            viewGroup.setTag(gvb.transition_current_scene, (Object) null);
            ? obj = new Object();
            obj.a = k;
            obj.b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((w1f) arrayList2.get(size)).q(viewGroup);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [qpd, java.lang.Object, us] */
    public static us c() {
        us usVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (usVar = (us) weakReference.get()) != null) {
            return usVar;
        }
        ? qpd = new qpd();
        threadLocal.set(new WeakReference(qpd));
        return qpd;
    }
}
