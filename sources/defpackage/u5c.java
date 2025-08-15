package defpackage;

import java.util.Arrays;
import java.util.Set;

/* renamed from: u5c  reason: default package */
public interface u5c {
    static void a(ol olVar, pke pke) {
        pl plVar = olVar.c;
        if (plVar == null) {
            plVar = null;
        }
        if (((Set) ((qyc) ((y7d) plVar.d.getValue())).j.getValue()).contains(pke.b)) {
            hm9.k0(olVar.getClass().getName(), (Exception) null, "detect common reaction error, call onMaxFailCount() for task", Arrays.copyOf(new Object[]{pke}, 1));
            ((hua) olVar).d();
        }
    }
}
