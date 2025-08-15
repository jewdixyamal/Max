package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: def  reason: default package */
public final class def implements Serializable {
    public final int X;
    public final long Y;
    public final long Z;
    public final wm3 a;
    public final String b;
    public final String c;
    public final String o;
    public final int s0;
    public final List t0;

    public def(cef cef) {
        this.a = cef.a;
        this.b = cef.b;
        this.o = cef.c;
        this.c = cef.d;
        this.X = cef.e;
        this.Y = cef.f;
        this.s0 = cef.h;
        this.Z = cef.i;
        this.t0 = cef.g;
    }

    public final String toString() {
        int o2 = s5c.o(this.t0);
        return "VideoConference{owner=" + this.a + ", joinLink='" + this.b + "', conversationId='" + this.c + "', callName='" + this.o + "', participantsCount=" + this.X + ", startedAt=" + this.Y + ", type=" + this.s0 + ", chatId=" + this.Z + ", previewParticipantIds=" + o2 + "}";
    }
}
