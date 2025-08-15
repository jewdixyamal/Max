package defpackage;

/* renamed from: che  reason: default package */
public final class che extends pi0 {
    public final boolean b;

    public che(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof che) && this.b == ((che) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return au1.j(new StringBuilder("SyncMutedChatsEvent(isSuccessful="), this.b, ")");
    }
}
