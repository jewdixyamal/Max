package defpackage;

import android.os.RemoteException;

/* renamed from: geg  reason: default package */
public final class geg implements neg {
    public final /* synthetic */ int a;
    public final /* synthetic */ moa b;

    public /* synthetic */ geg(moa moa, int i) {
        this.a = i;
        this.b = moa;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                b9b b9b = (b9b) this.b.a;
                b9b.getClass();
                try {
                    yig yig = (yig) b9b.c;
                    yig.H0(yig.G0(), 15);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                b9b b9b2 = (b9b) this.b.a;
                b9b2.getClass();
                try {
                    yig yig2 = (yig) b9b2.c;
                    yig2.H0(yig2.G0(), 5);
                    return;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}
