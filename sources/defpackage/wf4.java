package defpackage;

/* renamed from: wf4  reason: default package */
public final /* synthetic */ class wf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf4 b;

    public /* synthetic */ wf4(xf4 xf4, int i) {
        this.a = i;
        this.b = xf4;
    }

    public final void run() {
        int i = this.a;
        xf4 xf4 = this.b;
        switch (i) {
            case 0:
                xf4.getClass();
                try {
                    xf4.e.get();
                    xf4.m.decrementAndGet();
                    xf4.l.get();
                    xf4.toString();
                    return;
                } catch (Exception e) {
                    xf4.toString();
                    synchronized (xf4.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{xf4, Boolean.valueOf(xf4.c), Integer.valueOf(xf4.b)}), e);
                    }
                }
            case 1:
                xf4.a();
                return;
            default:
                xf4.b();
                return;
        }
    }

    public /* synthetic */ wf4(xf4 xf4, String str) {
        this.a = 0;
        this.b = xf4;
    }
}
