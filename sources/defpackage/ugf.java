package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;

/* renamed from: ugf  reason: default package */
public final class ugf {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final kld c;
    public final zn5 d;

    /* JADX WARNING: type inference failed for: r0v5, types: [a66, ffe] */
    public ugf(je7 je7) {
        kld a2 = lld.a(1, 1, 2);
        this.c = a2;
        this.d = new zn5(new ovc(new j31(a2, new ovc(((wr1) ((kr1) je7.getValue())).I, 7), new xi1(3, (Continuation) null, 5), 4), 6), new ffe(2, (Continuation) null), 5);
    }

    public final void a(View view, llf llf) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            vl4 vl4 = null;
            if (view.isAttachedToWindow()) {
                if (llf != null) {
                    if (llf.a) {
                        if (view.getMeasuredWidth() != 0) {
                            if (view.getMeasuredHeight() != 0) {
                                vl4 = new vl4(llf.b, view.getMeasuredWidth(), view.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
            if (vl4 == null) {
                boolean c2 = c(view);
                int hashCode = hashCode();
                int hashCode2 = view.hashCode();
                int size = linkedHashMap.size();
                hm9.m("CallVideoDisplayLayoutUpdater", hashCode + " display layout " + hashCode2 + " is empty, skip. old value from cache was removed = " + c2 + ". total = " + size, new Object[0]);
                return;
            }
            boolean f = tpa.f(linkedHashMap.get(view), vl4);
            kld kld = this.c;
            if (f) {
                int hashCode3 = hashCode();
                int hashCode4 = view.hashCode();
                int size2 = linkedHashMap.size();
                hm9.m("CallVideoDisplayLayoutUpdater", hashCode3 + " display layout " + hashCode4 + ", already added with params = " + vl4 + ", simple update. total = " + size2, new Object[0]);
                kld.g(linkedHashMap);
                reentrantLock.unlock();
                return;
            }
            ky7 ky7 = new ky7();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!tpa.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ky7.putAll(linkedHashMap2);
            ky7.put(view, vl4);
            ky7 b2 = ky7.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(b2);
            int hashCode5 = hashCode();
            int hashCode6 = view.hashCode();
            int size3 = linkedHashMap.size();
            hm9.m("CallVideoDisplayLayoutUpdater", hashCode5 + " add display layout " + hashCode6 + ", params = " + vl4 + ", total = " + size3, new Object[0]);
            kld.g(b2);
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        int hashCode = hashCode();
        hm9.m("CallVideoDisplayLayoutUpdater", hashCode + " clear cached states", new Object[0]);
        this.b.clear();
        this.c.g(oz4.a);
    }

    public final boolean c(View view) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            if (!linkedHashMap.containsKey(view)) {
                reentrantLock.unlock();
                return false;
            }
            ky7 ky7 = new ky7();
            ky7.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (tpa.f(entry.getKey(), view)) {
                    obj = entry.getValue();
                }
                if (true ^ tpa.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ky7.putAll(linkedHashMap2);
            ky7 b2 = ky7.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(b2);
            this.c.g(b2);
            int hashCode = hashCode();
            int hashCode2 = view.hashCode();
            int size = linkedHashMap.size();
            hm9.m("CallVideoDisplayLayoutUpdater", hashCode + " remove display layout participantId=" + obj + " for " + hashCode2 + ", total = " + size, new Object[0]);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
