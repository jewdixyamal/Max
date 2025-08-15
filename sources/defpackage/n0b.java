package defpackage;

/* renamed from: n0b  reason: default package */
public final class n0b extends u2 {
    public static final n0b c = new u2(8);

    public static c64 Z1(long j, long j2, boolean z) {
        StringBuilder j3 = z7b.j(":chats?id=", j, "&type=", z ? "local" : "server");
        j3.append("&message_id=");
        j3.append(j2);
        return new c64(j3.toString());
    }
}
