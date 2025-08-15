package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bk6  reason: default package */
public final class bk6 implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setName("CameraX-camerax_high_priority");
        return thread;
    }
}
