package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class OverwritingInputMerger extends n17 {
    public final d24 a(ArrayList arrayList) {
        qqd qqd = new qqd(9, (byte) 0);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((d24) it.next()).a));
        }
        qqd.B(hashMap);
        return qqd.p();
    }
}
