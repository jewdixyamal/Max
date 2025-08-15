package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: i62  reason: default package */
public final class i62 extends pi0 {
    public final long b;
    public final List c;
    public final Map o;

    public i62(long j, long j2, List list, Map map) {
        super(j);
        this.b = j2;
        this.c = list;
        this.o = map;
    }

    public final String toString() {
        return "ChatBotCommandsEvent{chatId=" + this.b + ", botCommands count=" + this.c.size() + ", botsInfoMap count=" + this.o.size() + "} " + super.toString();
    }
}
