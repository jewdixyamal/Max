package defpackage;

/* renamed from: q61  reason: default package */
public final class q61 implements a4c {
    public final void log(String str, String str2) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "CallsSdk", rh4.k("[", str, "] ", str2), (Throwable) null);
        }
    }

    public final void logException(String str, String str2, Throwable th) {
        hm9.r("CallsSdk", th, "[%s] %s", str, str2);
    }
}
