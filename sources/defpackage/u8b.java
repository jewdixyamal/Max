package defpackage;

/* renamed from: u8b  reason: default package */
public final class u8b {
    public static final u8b e = new u8b((String) null, (j1e) null, d95.b, y21.h);
    public final String a;
    public final j1e b;
    public final i95 c;
    public final y21 d;

    public u8b(String str, j1e j1e, i95 i95, y21 y21) {
        this.a = str;
        this.b = j1e;
        this.c = i95;
        this.d = y21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8b)) {
            return false;
        }
        u8b u8b = (u8b) obj;
        return tpa.f(this.a, u8b.a) && tpa.f(this.b, u8b.b) && tpa.f(this.c, u8b.c) && tpa.f(this.d, u8b.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        j1e j1e = this.b;
        if (j1e != null) {
            i = j1e.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
