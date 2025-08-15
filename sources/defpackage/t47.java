package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: t47  reason: default package */
public final class t47 {
    public final s47 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public t47(s47 s47, int[] iArr, String[] strArr) {
        this.a = s47;
        this.b = iArr;
        this.c = strArr;
        this.d = (strArr.length == 0) ^ true ? Collections.singleton(strArr[0]) : wz4.a;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Set set2 = wz4.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                wbd wbd = new wbd();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        wbd.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                set2 = z7.a(wbd);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                set2 = this.d;
            }
        }
        if (!set2.isEmpty()) {
            this.a.a(set2);
        }
    }
}
