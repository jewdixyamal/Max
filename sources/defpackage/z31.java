package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: z31  reason: default package */
public final class z31 {
    public final Conversation a;
    public final j1e b;
    public final boolean c;
    public final boolean d;

    public z31(Conversation conversation, j1e j1e, boolean z, boolean z2) {
        this.a = conversation;
        this.b = j1e;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z31)) {
            return false;
        }
        z31 z31 = (z31) obj;
        return tpa.f(this.a, z31.a) && tpa.f(this.b, z31.b) && this.c == z31.c && this.d == z31.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Result(conversation=" + this.a + ", callTarget=" + this.b + ", isNewCall=" + this.c + ", isIncoming=" + this.d + ")";
    }
}
