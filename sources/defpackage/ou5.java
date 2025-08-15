package defpackage;

/* renamed from: ou5  reason: default package */
public final class ou5 implements ol7 {
    public final int a;

    public ou5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou5) && this.a == ((ou5) obj).a;
    }

    public final long getItemId() {
        return 9223372036854775806L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.a;
    }

    public final String toString() {
        return zr6.j(new StringBuilder("FolderMemberAddItem(viewType="), this.a, ")");
    }
}
