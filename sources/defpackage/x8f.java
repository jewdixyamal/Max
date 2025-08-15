package defpackage;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: x8f  reason: default package */
public final class x8f {
    public HashSet a;

    public static void a(HashSet hashSet, String str) {
        if (!oag.t(str)) {
            hashSet.add(new File(str));
        }
    }

    public final boolean b(File file) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((File) it.next()).equals(file)) {
                hm9.m("x8f", "canBeRemoved: skip file: %s", file);
                return false;
            }
        }
        return true;
    }
}
