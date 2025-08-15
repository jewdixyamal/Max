package defpackage;

/* renamed from: gkg  reason: default package */
public final class gkg extends pjg {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gkg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((ykg) this.c).f) {
                    try {
                        if (((ykg) this.c).k.get() > 0) {
                            if (((ykg) this.c).k.decrementAndGet() > 0) {
                                ((ykg) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                                return;
                            }
                        }
                        ykg ykg = (ykg) this.c;
                        if (ykg.m != null) {
                            ykg.b.b("Unbind from service.", new Object[0]);
                            ykg ykg2 = (ykg) this.c;
                            ykg2.a.unbindService(ykg2.l);
                            ykg ykg3 = (ykg) this.c;
                            ykg3.g = false;
                            ykg3.m = null;
                            ykg3.l = null;
                        }
                        ((ykg) this.c).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                hkg hkg = (hkg) this.c;
                ykg ykg4 = (ykg) hkg.b;
                ykg4.b.b("unlinkToDeath", new Object[0]);
                ykg4.m.asBinder().unlinkToDeath(ykg4.j, 0);
                ykg ykg5 = (ykg) hkg.b;
                ykg5.m = null;
                ykg5.g = false;
                return;
        }
    }
}
