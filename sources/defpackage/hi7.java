package defpackage;

/* renamed from: hi7  reason: default package */
public final class hi7 extends pi0 {
    public final dh6 X;
    public final def Y;
    public final Long Z;
    public final Long b;
    public final long c;
    public final kq3 o;
    public final String s0;

    public hi7(long j, Long l, long j2, kq3 kq3, dh6 dh6, def def, Long l2, String str) {
        super(j);
        this.b = l;
        this.c = j2;
        this.o = kq3;
        this.X = dh6;
        this.Y = def;
        this.Z = l2;
        this.s0 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkInfoEvent{chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", contactSearchResult=");
        sb.append(this.o);
        sb.append(", groupChatInfo=");
        sb.append(this.X);
        sb.append(", videoConference=");
        sb.append(this.Y);
        sb.append(", stickerSetId=");
        sb.append(this.Z);
        sb.append(", startPayload='");
        return zr6.l(sb, this.s0, "'}");
    }
}
