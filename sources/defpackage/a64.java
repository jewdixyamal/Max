package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a64  reason: default package */
public final class a64 {
    public final LinkedHashMap a = new LinkedHashMap();

    public a64(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b64 b64 = (b64) it.next();
            for (e64 put : b64.a().a) {
                this.a.put(put, b64);
            }
        }
    }

    public final kpa a(Uri uri) {
        String a2 = m64.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            e64 e64 = (e64) entry.getKey();
            b64 b64 = (b64) entry.getValue();
            if (m64.a(e64.a).equals(a2)) {
                return new kpa(e64, b64);
            }
        }
        return null;
    }
}
