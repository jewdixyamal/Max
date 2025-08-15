package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;

/* renamed from: pi  reason: default package */
public final class pi {
    public final bi a;
    public final HandlerThread b;
    public final Handler c;
    public final HandlerThread d;
    public final HashMap e = new HashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final LinkedHashSet g;
    public final oe1 h;
    public volatile boolean i;

    public pi(bg4 bg4, qq9 qq9, bi biVar, EglBase eglBase, kad kad) {
        this.a = biVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.b = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.d = handlerThread2;
        new HashMap();
        this.g = new LinkedHashSet();
        new Point();
        this.h = new oe1((a4c) bg4.b, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }
}
