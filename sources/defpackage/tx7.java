package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: tx7  reason: default package */
public final /* synthetic */ class tx7 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;

    public /* synthetic */ tx7(yx7 yx7, long j, String str, int i) {
        this.a = i;
        this.b = yx7;
        this.c = j;
        this.o = str;
    }

    public final void accept(Object obj) {
        int size;
        boolean z;
        switch (this.a) {
            case 0:
                yx7 yx7 = this.b;
                long j = this.c;
                String str = this.o;
                vx7 vx7 = (vx7) obj;
                yx7.getClass();
                synchronized (vx7) {
                    size = vx7.c.size();
                }
                hm9.H("yx7", "searchChatsAndMessages %d, finish %d ms", Integer.valueOf(size), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j)));
                ArrayList arrayList = new ArrayList(vx7.c);
                yx7.n = arrayList;
                if (!arrayList.isEmpty()) {
                    try {
                        yx7.e.d(yx7);
                    } catch (Exception unused) {
                    }
                }
                if (arrayList.isEmpty()) {
                    synchronized (vx7) {
                        z = vx7.a.contains(wx7.a) && vx7.a.contains(wx7.c) && vx7.a.contains(wx7.b);
                    }
                    if (!z) {
                        return;
                    }
                }
                if (yx7.i != null) {
                    hm9.H("yx7", "searchChatsAndMessages, notify listener", new Object[0]);
                    yx7.i.c(str, arrayList);
                    return;
                }
                return;
            default:
                yx7 yx72 = this.b;
                long j2 = this.c;
                String str2 = this.o;
                List list = (List) obj;
                yx72.getClass();
                hm9.H("yx7", "searchChats %d, finish %dms", Integer.valueOf(list.size()), Long.valueOf(System.currentTimeMillis() - j2));
                yx72.o = list;
                if (!list.isEmpty()) {
                    try {
                        yx72.e.d(yx72);
                    } catch (Exception unused2) {
                    }
                }
                px7 px7 = yx72.i;
                if (px7 != null) {
                    px7.b(str2, list);
                    return;
                }
                return;
        }
    }
}
