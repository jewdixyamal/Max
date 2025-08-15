package defpackage;

/* renamed from: fze  reason: default package */
public final class fze implements a4c {
    public final xye a;
    public final a4c b;

    public fze(xye xye, a4c a4c) {
        this.a = xye;
        this.b = a4c;
    }

    public final void log(String str, String str2) {
        this.b.log(str, str2);
    }

    public final void logException(String str, String str2, Throwable th) {
        this.b.logException(str, str2, th);
    }

    public final void reportException(String str, String str2, Throwable th) {
        this.b.reportException(str, str2, th);
        xye xye = this.a;
        xye.getClass();
        try {
            ((qye) xye.b.getValue()).a((String) null, th);
        } catch (Throwable unused) {
        }
    }
}
