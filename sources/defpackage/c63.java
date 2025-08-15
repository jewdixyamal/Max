package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: c63  reason: default package */
public abstract class c63 extends b63 {
    public static void U(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
