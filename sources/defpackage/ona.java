package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: ona  reason: default package */
public final /* synthetic */ class ona implements b66, qj3, grd {
    public final /* synthetic */ sna a;
    public final /* synthetic */ long b;

    public /* synthetic */ ona(sna sna, long j) {
        this.a = sna;
        this.b = j;
    }

    public void accept(Object obj) {
        sna sna = this.a;
        sna.getClass();
        hm9.p("sna", "handleMediaTypingError", (Throwable) obj);
        long j = this.b;
        LinkedBlockingDeque linkedBlockingDeque = sna.c(j).a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException unused) {
            }
        }
        if (!linkedBlockingDeque.isEmpty()) {
            sna.e(j);
        }
    }

    public Object apply(Object obj) {
        q1a q1a;
        Long l = (Long) obj;
        sna sna = this.a;
        sna.getClass();
        long j = this.b;
        if (j == 0) {
            q1a = iqd.g(0L);
        } else {
            hm9.m("sna", "sendMediaTyping %d", Long.valueOf(j));
            q1a = new q1a(1, new ona(sna, j));
        }
        return q1a.n();
    }

    public void j(nqd nqd) {
        pna pna;
        sna sna = this.a;
        sna.getClass();
        ConcurrentHashMap concurrentHashMap = sna.b;
        long j = this.b;
        qna qna = (qna) concurrentHashMap.get(Long.valueOf(j));
        if (qna == null || (pna = (pna) qna.a.peek()) == null) {
            nqd.onError(new Throwable("No media typing to send"));
            return;
        }
        sna.d(j, pna.a);
        nqd.a(Long.valueOf(pna.b));
    }
}
