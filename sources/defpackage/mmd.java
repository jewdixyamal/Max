package defpackage;

/* renamed from: mmd  reason: default package */
public final class mmd implements efb {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmd)) {
            return false;
        }
        ((mmd) obj).getClass();
        return true;
    }

    public final long getItemId() {
        return (long) 8;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 8) == ol7.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(536870920);
    }

    public final int l() {
        return 536870920;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "ShortLinkHeaderItem(viewType=536870920)";
    }
}
