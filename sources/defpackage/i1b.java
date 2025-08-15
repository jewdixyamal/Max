package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: i1b  reason: default package */
public final class i1b {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, h1b h1b) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(h1b);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(h1b, obj);
        }
        List list = (List) obj;
        if (!list.contains(viewGroup)) {
            list.add(viewGroup);
            if (viewGroup.getMeasuredWidth() != 0 && viewGroup.getMeasuredHeight() != 0) {
                c();
            }
        }
    }

    public final List b(h1b h1b) {
        ArrayList arrayList;
        List list = (List) this.b.get(h1b);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                View view = (View) next;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? nz4.a : arrayList;
    }

    public final void c() {
        int i = 0;
        int i2 = 0;
        for (View height : b(h1b.a)) {
            i2 += height.getHeight();
        }
        for (View height2 : b(h1b.b)) {
            i += height2.getHeight();
        }
        j1b j1b = new j1b(i2, i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mm1) ((g1b) it.next())).E(j1b);
        }
    }
}
