package defpackage;

/* renamed from: eg7  reason: default package */
public enum eg7 {
    ;
    
    public static final cg7 Companion = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, eg7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [cg7, java.lang.Object] */
    static {
        Companion = new Object();
    }

    public final fg7 a() {
        switch (dg7.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return fg7.c;
            case 3:
            case 4:
                return fg7.o;
            case 5:
                return fg7.X;
            case 6:
                return fg7.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
