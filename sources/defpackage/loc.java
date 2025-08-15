package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: loc  reason: default package */
public final class loc {
    public final String a;
    public final a4c b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public loc(a4c a4c) {
        if (a4c != null) {
            this.a = "RtcCommands";
            this.b = a4c;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }
}
