package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: gt6  reason: default package */
public final class gt6 implements ooc {
    public final Map a;

    public gt6(HashMap hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gt6.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gt6) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
