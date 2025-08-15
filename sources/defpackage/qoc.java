package defpackage;

/* renamed from: qoc  reason: default package */
public final class qoc implements poc {
    public final a4c a;

    public qoc(a4c a4c) {
        if (a4c != null) {
            this.a = a4c;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }

    public final void a(int i, byte[] bArr) {
        int i2 = kbg.a[au1.s(i)];
        this.a.log("RtcNotifications", "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : xj6.a(bArr) : new String(bArr)));
    }

    public final void b(ooc ooc) {
        this.a.log("RtcNotifications", "<- " + ooc);
    }

    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}
