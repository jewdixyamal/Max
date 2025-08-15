package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: nm4  reason: default package */
public final class nm4 implements mm4 {
    public static final long f = TimeUnit.MINUTES.toMillis(15);
    public final String a = nm4.class.getName();
    public final ReentrantLock b = new ReentrantLock();
    public long c;
    public final HashMap d = new HashMap();
    public final x67 e = new x67();

    public static final String a(nm4 nm4) {
        StringBuilder sb = new StringBuilder("Dns cache:");
        for (Map.Entry entry : nm4.d.entrySet()) {
            sb.append("\n" + ((String) entry.getKey()));
            for (v67 append : (ArrayList) entry.getValue()) {
                sb.append("\n- ");
                sb.append(append);
            }
        }
        return sb.toString();
    }

    public final void b() {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.o, str, "resetIps", (Throwable) null);
        }
        for (Map.Entry value : this.d.entrySet()) {
            for (v67 v67 : (ArrayList) value.getValue()) {
                if (v67.b != 0) {
                    v67.d = 0;
                    v67.c = v67.b;
                } else {
                    v67.d = 0;
                    v67.c = 0;
                }
                v67.e = 1.0f;
            }
        }
    }

    public final void c(String str, InetAddress[] inetAddressArr) {
        int i = 0;
        ArrayList arrayList = new ArrayList(new gs(inetAddressArr, false));
        HashMap hashMap = this.d;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(str, obj);
        }
        ArrayList arrayList2 = (ArrayList) obj;
        while (i < arrayList2.size()) {
            int indexOf = arrayList.indexOf(((v67) arrayList2.get(i)).a);
            if (indexOf != -1) {
                arrayList.remove(indexOf);
                i++;
            } else {
                arrayList2.remove(i);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new v67((InetAddress) it.next()));
        }
    }
}
