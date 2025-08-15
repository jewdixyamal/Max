package defpackage;

/* renamed from: v52  reason: default package */
public final class v52 {
    public final long a;
    public final String b;

    public v52(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v52)) {
            return false;
        }
        v52 v52 = (v52) obj;
        return this.a == v52.a && tpa.f(this.b, v52.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatAndFolderCrossRef(chatId=");
        sb.append(this.a);
        sb.append(", folderId=");
        return zr6.l(sb, this.b, ")");
    }
}
