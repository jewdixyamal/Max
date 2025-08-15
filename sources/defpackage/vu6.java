package defpackage;

/* renamed from: vu6  reason: default package */
public enum vu6 {
    ;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, vu6] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, vu6] */
    static {
        values();
    }

    public final String toString() {
        int i = uu6.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "released" : "error" : "intermediate_available" : "success" : "requested";
    }
}
