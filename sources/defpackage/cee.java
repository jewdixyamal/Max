package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: cee  reason: default package */
public final class cee {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(xb0 xb0) {
        this.a.add(xb0);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        b(arrayList2, size2, new int[size2], 0);
        xb0[] xb0Arr = new xb0[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    xb0 xb0 = (xb0) arrayList.get(i);
                    xb0 xb02 = (xb0) list.get(iArr[i]);
                    xb0.getClass();
                    z2 &= xb02.b.a <= xb0.b.a && xb02.a == xb0.a;
                    if (!z2) {
                        continue;
                        break;
                    }
                    xb0Arr[iArr[i]] = (xb0) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(xb0Arr);
        }
        return null;
    }
}
