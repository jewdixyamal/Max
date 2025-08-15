package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: re9  reason: default package */
public final class re9 extends pi0 {
    public final List X;
    public final mg4 Y;
    public final long b;
    public final long c;
    public final long o;

    public re9(long j, List list, mg4 mg4) {
        this.b = j;
        this.Y = mg4;
        this.c = 0;
        this.o = 0;
        this.X = list;
    }

    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.o + ", messageIds=" + this.X.size() + ", itemType=" + this.Y + '}';
    }

    public re9(long j, long j2, long j3, mg4 mg4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = new ArrayList();
        this.Y = mg4;
    }
}
