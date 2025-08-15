package defpackage;

/* renamed from: ljg  reason: default package */
public final class ljg extends sig {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ljg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((mkg) this.c).f) {
                    try {
                        if (((mkg) this.c).k.get() <= 0 || ((mkg) this.c).k.decrementAndGet() <= 0) {
                            mkg mkg = (mkg) this.c;
                            if (mkg.m != null) {
                                mkg.b.b("Unbind from service.", new Object[0]);
                                mkg mkg2 = (mkg) this.c;
                                mkg2.a.unbindService(mkg2.l);
                                mkg mkg3 = (mkg) this.c;
                                mkg3.g = false;
                                mkg3.m = null;
                                mkg3.l = null;
                            }
                            ((mkg) this.c).c();
                            return;
                        }
                        ((mkg) this.c).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                hkg hkg = (hkg) this.c;
                mkg mkg4 = (mkg) hkg.b;
                mkg4.b.b("unlinkToDeath", new Object[0]);
                mkg4.m.asBinder().unlinkToDeath(mkg4.j, 0);
                mkg mkg5 = (mkg) hkg.b;
                mkg5.m = null;
                mkg5.g = false;
                return;
        }
    }
}
