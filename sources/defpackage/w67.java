package defpackage;

import java.util.Comparator;

/* renamed from: w67  reason: default package */
public final class w67 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        v67 v67 = (v67) obj;
        v67 v672 = (v67) obj2;
        if (v67.b == 0 && v672.b != 0) {
            return -1;
        }
        if (v67.b == 0 || v672.b != 0) {
            return Float.compare(v67.e, v672.e);
        }
        return 1;
    }
}
