package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p70  reason: default package */
public final class p70 {
    public final ArrayList a = new ArrayList();
    public final q0e b;
    public final w7c c;

    public p70() {
        q0e a2 = r0e.a((Object) null);
        this.b = a2;
        this.c = new w7c(a2);
    }

    public final void a() {
        ArrayList arrayList = this.a;
        byte[] bArr = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte[] bArr2 = new byte[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    bArr2[i] = (byte) ((((Number) next).intValue() * 127) / 32768);
                    i = i2;
                } else {
                    y53.R();
                    throw null;
                }
            }
            bArr = bArr2;
        }
        this.b.setValue(bArr);
    }
}
