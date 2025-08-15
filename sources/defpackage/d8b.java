package defpackage;

import java.util.List;

/* renamed from: d8b  reason: default package */
public final class d8b extends gle implements dt7 {
    public final List c;

    public d8b(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "PRESET_AVATARS.Response(presets=" + wmd.x(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8b) && tpa.f(this.c, ((d8b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
