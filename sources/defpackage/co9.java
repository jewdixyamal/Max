package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: co9  reason: default package */
public final class co9 implements ooc {
    public final Map a;

    public co9(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || co9.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((co9) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "NetworkStatusNotification{networkStatus=" + this.a + '}';
    }
}
