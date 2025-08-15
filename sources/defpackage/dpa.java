package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dpa  reason: default package */
public final class dpa implements fpa {
    public final Map a;

    public dpa(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpa) && tpa.f(this.a, ((dpa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallHistoryPageState(callsHistory=" + this.a + ")";
    }
}
