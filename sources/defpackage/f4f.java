package defpackage;

/* renamed from: f4f  reason: default package */
public final class f4f extends pi0 {
    public final long b;
    public final String c;

    public f4f(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypingEvent{chatId=");
        sb.append(this.b);
        sb.append(", text='");
        return zr6.l(sb, this.c, "'}");
    }
}
