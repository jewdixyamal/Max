package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ju4  reason: default package */
public final class ju4 implements iu4 {
    public final DynamicRangeProfiles a;

    public ju4(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            eu4 eu4 = (eu4) fu4.a.get(l);
            c54.o(eu4, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(eu4);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final Set a() {
        return d(this.a.getSupportedProfiles());
    }

    public final DynamicRangeProfiles b() {
        return this.a;
    }

    public final Set c(eu4 eu4) {
        Long a2 = fu4.a(eu4, this.a);
        boolean z = a2 != null;
        c54.j("DynamicRange is not supported: " + eu4, z);
        return d(this.a.getProfileCaptureRequestConstraints(a2.longValue()));
    }
}
